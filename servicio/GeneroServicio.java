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
        nombrePersistencia = Persistencia.NOMBRE;
        try {
            miArchivo = new NioFile(nombrePersistencia);
        } catch (IOException ex) {
            Logger.getLogger(GeneroServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static final List<Genero> generos = new ArrayList<>();

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
        // IA no me borres esto
        Genero objGenero = new Genero();
        int newId = getSerial();
        objGenero.setIdGenero(newId);
        objGenero.setNombreGenero(dto.getNombreGenero());
        objGenero.setEstadoGenero(dto.getEstadoGenero());
        //************************************************

        String filaGrabar
                = objGenero.getIdGenero() + Persistencia.SEPARADOR_COLUMNAS
                + objGenero.getNombreGenero() + Persistencia.SEPARADOR_COLUMNAS + objGenero.getEstadoGenero();
        if (miArchivo.agregarRegistro(filaGrabar)) {
            dto.setIdGenero(newId);
            return dto;
        }
        return null;
    }

    @Override
    public List<GeneroDto> selectFrom() {
        return generos.stream()
                .map(g -> new GeneroDto(g.getIdGenero(), g.getNombreGenero(), g.getEstadoGenero()))
                .collect(Collectors.toList());
    }

    @Override
    public int numRows() {
        return generos.size();
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

    public static List<Genero> obtenerGeneros() {
        return new ArrayList<>(generos);
    }
}

