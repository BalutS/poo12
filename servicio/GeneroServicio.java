package org.unimag.servicio;

import com.poo.persistence.NioFile;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import org.unimag.api.ApiOperacionBD;
import org.unimag.dto.GeneroDto;
import org.unimag.modelo.Genero;
import org.unimag.recurso.constante.Persistencia;

public class GeneroServicio implements ApiOperacionBD<GeneroDto, Integer> {

    private NioFile miArchivo;
    private String nombrePersistencia;

    public GeneroServicio() {
        nombrePersistencia = Persistencia.RUTA_GENERO_TXT;
        try {
            miArchivo = new NioFile(nombrePersistencia);
        } catch (IOException ex) {
            Logger.getLogger(GeneroServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getSerial() {
        int id = 0;
        try {
            id = miArchivo.ultimoCodigo() + 1;
        } catch (IOException ex) {
            Logger.getLogger(GeneroServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    @Override
    public GeneroDto insertInto(GeneroDto dto, String ruta) {
        Genero objGenero = new Genero();
        int newId = getSerial();
        objGenero.setIdGenero(newId);
        objGenero.setNombreGenero(dto.getNombreGenero());
        objGenero.setEstadoGenero(dto.getEstadoGenero());

        String filaGrabar =
                objGenero.getIdGenero() + Persistencia.SEPARADOR_COLUMNAS
                + objGenero.getNombreGenero() + Persistencia.SEPARADOR_COLUMNAS + objGenero.getEstadoGenero();
        if (miArchivo.agregarRegistro(filaGrabar)) {
            dto.setIdGenero(newId);
            return dto;
        }
        return null;
    }

    @Override
    public List<GeneroDto> selectFrom() {
        List<GeneroDto> generos = new ArrayList<>();
        try {
            List<String> lineas = miArchivo.leer();
            for (String linea : lineas) {
                String[] campos = linea.split(Persistencia.SEPARADOR_COLUMNAS);
                if (campos.length == 3) {
                    Integer id = Integer.parseInt(campos[0]);
                    String nombre = campos[1];
                    Boolean estado = Boolean.parseBoolean(campos[2]);
                    generos.add(new GeneroDto(id, nombre, estado));
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(GeneroServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return generos;
    }

    @Override
    public int numRows() {
        try {
            return miArchivo.leer().size();
        } catch (IOException ex) {
            Logger.getLogger(GeneroServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public Boolean deleteFrom(Integer codigo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public GeneroDto updateSet(Integer codigo, GeneroDto objeto, String ruta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public GeneroDto getOne(Integer codigo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}