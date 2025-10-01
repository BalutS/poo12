package org.unimag.vista.pelicula;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.unimag.controlador.PeliculaControladorGrabar;
import org.unimag.dto.GeneroDto;
import org.unimag.dto.PeliculaDto;
import org.unimag.modelo.Genero;
import org.unimag.recurso.constante.Configuracion;
import org.unimag.recurso.utilidad.Marco;
import org.unimag.recurso.utilidad.Mensaje;
import org.unimag.servicio.GeneroServicio;
import org.unimag.servicio.PeliculaServicio;

import java.util.List;
import java.util.stream.Collectors;

public class VistaPeliculaCrear extends StackPane {

    private static final int H_GAP = 10;
    private static final int V_GAP = 20;
    private static final int ALTO_FILA = 40;
    private static final int TAMANIO_FUENTE = 20;
    private static final int ALTO_CAJA = 35;

    private static final double AJUSTE_TITULO = 0.1;

    private final GridPane miGrilla;
    private final Rectangle miMarco;

    private TextField txtCodigo;
    private TextField txtNombre;
    private TextField txtProtagonista;
    private TextField txtPresupuesto;
    private ComboBox<Genero> cbmGenero;
    private ToggleGroup groupMayoriaEdad;
    private RadioButton rbSi;
    private RadioButton rbNo;

    private PeliculaServicio peliculaServicio;

    public VistaPeliculaCrear(Stage esce, double ancho, double alto) {
        setAlignment(Pos.CENTER);
        miGrilla = new GridPane();
        miMarco = Marco.crear(esce, Configuracion.MARCO_ANCHO_PORCENTAJE, Configuracion.MARCO_ALTO_PORCENTAJE,
                Configuracion.DEGRADE_ARREGLO, Configuracion.DEGRADDE_BORDE);
        getChildren().add(miMarco);
        peliculaServicio = new PeliculaServicio();
        configurarMiGrilla(ancho, alto);
        crearTitulo();
        crearFormulario();
        colocarFrmElegante();
        getChildren().add(miGrilla);
    }

    private void configurarMiGrilla(double ancho, double alto) {
        double miAnchoGrilla = ancho * Configuracion.GRILLA_ANCHO_PORCENTAJE;
        miGrilla.setHgap(H_GAP);
        miGrilla.setVgap(V_GAP);
        miGrilla.setPrefSize(miAnchoGrilla, alto);
        miGrilla.setMinSize(miAnchoGrilla, alto);
        miGrilla.setMaxSize(Region.USE_PREF_SIZE, Region.USE_PREF_SIZE);

        ColumnConstraints col0 = new ColumnConstraints();
        ColumnConstraints col1 = new ColumnConstraints();

        col0.setPrefWidth(250);
        col1.setPrefWidth(400);
        col1.setHgrow(Priority.ALWAYS);

        miGrilla.getColumnConstraints().addAll(col0, col1);

        for (int i = 0; i < 10; i++) { // Increased rows for new fields
            RowConstraints fila = new RowConstraints();
            fila.setMinHeight(ALTO_FILA);
            fila.setMaxHeight(ALTO_FILA);
            miGrilla.getRowConstraints().add(fila);
        }
    }

    private void crearTitulo() {
        Text miTitulo = new Text("Formulario crear película");
        miTitulo.setFill(Color.web(Configuracion.BLANCO));
        miTitulo.setFont(Font.font("Verdana", FontWeight.BOLD, 28));
        GridPane.setHalignment(miTitulo, HPos.CENTER);
        GridPane.setMargin(miTitulo, new Insets(30, 0, 0, 0));
        miGrilla.add(miTitulo, 0, 0, 2, 1);
    }

    private void crearFormulario() {
        // Codigo
        Label lblCodigo = new Label("Código:");
        lblCodigo.setFont(Font.font("Arial", FontPosture.ITALIC, TAMANIO_FUENTE));
        miGrilla.add(lblCodigo, 0, 2);
        txtCodigo = new TextField();
        txtCodigo.setPromptText("Código autogenerado");
        txtCodigo.setPrefHeight(ALTO_CAJA);
        txtCodigo.setDisable(true);
        miGrilla.add(txtCodigo, 1, 2);
        actualizarCodigoPelicula();

        // Nombre
        Label lblNombre = new Label("Nombre:");
        lblNombre.setFont(Font.font("Arial", FontPosture.ITALIC, TAMANIO_FUENTE));
        miGrilla.add(lblNombre, 0, 3);
        txtNombre = new TextField();
        txtNombre.setPromptText("Digita el nombre");
        txtNombre.setPrefHeight(ALTO_CAJA);
        miGrilla.add(txtNombre, 1, 3);

        // Protagonista
        Label lblProtagonista = new Label("Protagonista:");
        lblProtagonista.setFont(Font.font("Arial", FontPosture.ITALIC, TAMANIO_FUENTE));
        miGrilla.add(lblProtagonista, 0, 4);
        txtProtagonista = new TextField();
        txtProtagonista.setPromptText("Digita el protagonista");
        txtProtagonista.setPrefHeight(ALTO_CAJA);
        miGrilla.add(txtProtagonista, 1, 4);

        // Presupuesto
        Label lblPresupuesto = new Label("Presupuesto:");
        lblPresupuesto.setFont(Font.font("Arial", FontPosture.ITALIC, TAMANIO_FUENTE));
        miGrilla.add(lblPresupuesto, 0, 5);
        txtPresupuesto = new TextField();
        txtPresupuesto.setPromptText("Digita el presupuesto");
        txtPresupuesto.setPrefHeight(ALTO_CAJA);
        miGrilla.add(txtPresupuesto, 1, 5);

        // Genero
        Label lblGenero = new Label("Género:");
        lblGenero.setFont(Font.font("Arial", FontPosture.ITALIC, TAMANIO_FUENTE));
        miGrilla.add(lblGenero, 0, 6);
        cbmGenero = new ComboBox<>();
        cbmGenero.setMaxWidth(Double.MAX_VALUE);
        cbmGenero.setPrefHeight(ALTO_CAJA);

        // Populate ComboBox from service
        GeneroServicio generoServicio = new GeneroServicio();
        List<GeneroDto> generoDtos = generoServicio.selectFrom();
        List<Genero> generos = generoDtos.stream()
            .map(dto -> new Genero(dto.getIdGenero(), dto.getNombreGenero(), dto.getEstadoGenero()))
            .collect(Collectors.toList());

        cbmGenero.getItems().addAll(generos);
        if (!generos.isEmpty()) {
            cbmGenero.getSelectionModel().selectFirst();
        }
        miGrilla.add(cbmGenero, 1, 6);

        // Mayoria de Edad
        Label lblMayoriaEdad = new Label("Para mayores de edad?");
        lblMayoriaEdad.setFont(Font.font("Arial", FontPosture.ITALIC, TAMANIO_FUENTE));
        miGrilla.add(lblMayoriaEdad, 0, 7);

        groupMayoriaEdad = new ToggleGroup();
        rbSi = new RadioButton("Sí");
        rbSi.setToggleGroup(groupMayoriaEdad);
        rbNo = new RadioButton("No");
        rbNo.setToggleGroup(groupMayoriaEdad);
        rbNo.setSelected(true);
        HBox hboxMayoria = new HBox(10, rbSi, rbNo);
        miGrilla.add(hboxMayoria, 1, 7);

        // Boton Grabar
        Button btnGrabar = new Button("Grabar película");
        btnGrabar.setTextFill(Color.RED);
        btnGrabar.setMaxWidth(Double.MAX_VALUE);
        btnGrabar.setFont(Font.font("Verdana", TAMANIO_FUENTE));
        btnGrabar.setOnAction((e) -> guardarLaPelicula());
        miGrilla.add(btnGrabar, 1, 8);
    }

    private void actualizarCodigoPelicula() {
        txtCodigo.setText(String.valueOf(peliculaServicio.getSerial()));
    }

    private void limpiarFormulario() {
        actualizarCodigoPelicula();
        txtNombre.setText("");
        txtProtagonista.setText("");
        txtPresupuesto.setText("");
        if (!cbmGenero.getItems().isEmpty()) {
            cbmGenero.getSelectionModel().selectFirst();
        }
        rbNo.setSelected(true);
        txtNombre.requestFocus();
    }

    private Boolean formularioCompleto() {
        if (txtNombre.getText().isBlank()) {
            Mensaje.mostrar(Alert.AlertType.WARNING, this.getScene().getWindow(), "Atención", "Por favor ingresa un nombre.");
            txtNombre.requestFocus();
            return false;
        }
        if (txtProtagonista.getText().isBlank()) {
            Mensaje.mostrar(Alert.AlertType.WARNING, this.getScene().getWindow(), "Atención", "Por favor ingresa un protagonista.");
            txtProtagonista.requestFocus();
            return false;
        }
        if (txtPresupuesto.getText().isBlank()) {
            Mensaje.mostrar(Alert.AlertType.WARNING, this.getScene().getWindow(), "Atención", "Por favor ingresa un presupuesto.");
            txtPresupuesto.requestFocus();
            return false;
        }
        try {
            Double.parseDouble(txtPresupuesto.getText());
        } catch (NumberFormatException e) {
            Mensaje.mostrar(Alert.AlertType.WARNING, this.getScene().getWindow(), "Atención", "El presupuesto debe ser un número válido.");
            txtPresupuesto.requestFocus();
            return false;
        }
        if (cbmGenero.getSelectionModel().getSelectedItem() == null) {
            Mensaje.mostrar(Alert.AlertType.WARNING, this.getScene().getWindow(), "Atención", "Por favor selecciona un género.");
            cbmGenero.requestFocus();
            return false;
        }
        return true;
    }

    private void guardarLaPelicula() {
        if (formularioCompleto()) {
            PeliculaDto dto = new PeliculaDto();
            dto.setNombrePelicula(txtNombre.getText());
            dto.setProtagonistaPelicula(txtProtagonista.getText());
            dto.setPresupuestoPelicula(Double.parseDouble(txtPresupuesto.getText()));
            dto.setGeneroPelicula(cbmGenero.getValue());
            dto.setMayoriaEdad(rbSi.isSelected());

            if (PeliculaControladorGrabar.crearPelicula(dto)) {
                Mensaje.mostrar(Alert.AlertType.INFORMATION, null, "Éxito", "La película se ha guardado correctamente.");
                limpiarFormulario();
            } else {
                Mensaje.mostrar(Alert.AlertType.ERROR, null, "Error", "No se pudo guardar la película.");
            }
        }
    }

    private void colocarFrmElegante() {
        Runnable calcular = () -> {
            double alturaMarco = miMarco.getHeight();
            if (alturaMarco > 0) {
                double desplazamiento = alturaMarco * AJUSTE_TITULO;
                miGrilla.setTranslateY(-alturaMarco / 2 + desplazamiento);
            }
        };
        calcular.run();
        miMarco.heightProperty().addListener((obs, antes, despues) -> calcular.run());
    }
}