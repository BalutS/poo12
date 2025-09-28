package org.unimag.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.unimag.api.ApiOperacionBD;
import org.unimag.dto.GeneroDto;
import org.unimag.modelo.Genero;

public class GeneroServicio implements ApiOperacionBD<GeneroDto, Integer> {

    private static final List<Genero> generos = new ArrayList<>();
    private static int nextId = 1;

    @Override
    public int getSerial() {
        return nextId++;
    }

    @Override
    public GeneroDto insertInto(GeneroDto dto, String ruta) {
        Genero objGenero = new Genero();
        
        int newId = getSerial();
        objGenero.setIdGenero(newId);
        objGenero.setNombreGenero(dto.getNombreGenero());
        objGenero.setEstadoGenero(dto.getEstadoGenero());
        
        generos.add(objGenero);

        dto.setIdGenero(newId);
        System.out.println("Género creado: " + objGenero);
        return dto;
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