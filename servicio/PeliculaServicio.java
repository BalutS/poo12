package org.unimag.servicio;

import com.poo.persistence.NioFile;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.unimag.api.ApiOperacionBD;
import org.unimag.dto.GeneroDto;
import org.unimag.dto.PeliculaDto;
import org.unimag.modelo.Genero;
import org.unimag.modelo.Pelicula;
import org.unimag.recurso.constante.Persistencia;

public class PeliculaServicio implements ApiOperacionBD<PeliculaDto, Integer> {

    private NioFile miArchivo;
    private String nombrePersistencia;
    private GeneroServicio generoServicio;

    public PeliculaServicio() {
        nombrePersistencia = Persistencia.NOMBRE_PELICULA;
        generoServicio = new GeneroServicio();
        try {
            miArchivo = new NioFile(nombrePersistencia);
        } catch (IOException ex) {
            Logger.getLogger(PeliculaServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getSerial() {
        int id = 0;
        try {
            id = miArchivo.ultimoCodigo() + 1;
        } catch (IOException ex) {
            Logger.getLogger(PeliculaServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    @Override
    public PeliculaDto insertInto(PeliculaDto dto, String ruta) {
        Pelicula objPelicula = new Pelicula();
        int newId = getSerial();
        objPelicula.setCodigoPelicula(newId);
        objPelicula.setNombrePelicula(dto.getNombrePelicula());
        objPelicula.setProtagonistaPelicula(dto.getProtagonistaPelicula());
        objPelicula.setPresupuestoPelicula(dto.getPresupuestoPelicula());
        objPelicula.setGeneroPelicula(dto.getGeneroPelicula());
        objPelicula.setMayoriaEdad(dto.getMayoriaEdad());

        String filaGrabar =
                objPelicula.getCodigoPelicula() + Persistencia.SEPARADOR_COLUMNAS
                + objPelicula.getNombrePelicula() + Persistencia.SEPARADOR_COLUMNAS
                + objPelicula.getProtagonistaPelicula() + Persistencia.SEPARADOR_COLUMNAS
                + String.format("%.0f", objPelicula.getPresupuestoPelicula()) + Persistencia.SEPARADOR_COLUMNAS
                + objPelicula.getGeneroPelicula().getIdGenero() + Persistencia.SEPARADOR_COLUMNAS
                + objPelicula.getMayoriaEdad();

        if (miArchivo.agregarRegistro(filaGrabar)) {
            dto.setCodigoPelicula(newId);
            return dto;
        }
        return null;
    }

    @Override
    public List<PeliculaDto> selectFrom() {
        List<PeliculaDto> peliculas = new ArrayList<>();
        List<GeneroDto> generos = generoServicio.selectFrom();

        try {
            List<String> lineas = miArchivo.leer();
            for (String linea : lineas) {
                String[] campos = linea.split(Persistencia.SEPARADOR_COLUMNAS);
                if (campos.length == 6) {
                    Integer codigo = Integer.parseInt(campos[0]);
                    String nombre = campos[1];
                    String protagonista = campos[2];
                    Double presupuesto = Double.parseDouble(campos[3]);
                    Integer idGenero = Integer.parseInt(campos[4]);
                    Boolean mayoriaEdad = Boolean.parseBoolean(campos[5]);

                    Genero genero = null;
                    for (GeneroDto g : generos) {
                        if (g.getIdGenero().equals(idGenero)) {
                            genero = new Genero(g.getIdGenero(), g.getNombreGenero(), g.getEstadoGenero());
                            break;
                        }
                    }

                    if (genero == null) {
                        Logger.getLogger(PeliculaServicio.class.getName()).log(Level.WARNING, "No se encontró el género con ID: " + idGenero);
                        continue; // Skip this movie if genre not found
                    }

                    peliculas.add(new PeliculaDto(codigo, nombre, protagonista, genero, presupuesto, mayoriaEdad));
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(PeliculaServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return peliculas;
    }

    @Override
    public int numRows() {
        try {
            return miArchivo.leer().size();
        } catch (IOException ex) {
            Logger.getLogger(PeliculaServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public Boolean deleteFrom(Integer codigo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PeliculaDto updateSet(Integer codigo, PeliculaDto objeto, String ruta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PeliculaDto getOne(Integer codigo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}