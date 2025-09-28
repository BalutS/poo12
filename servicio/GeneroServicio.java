package org.unimag.servicio;

import java.util.List;
import org.unimag.api.ApiOperacionBD;
import org.unimag.dto.GeneroDto;
import org.unimag.modelo.Genero;

public class GeneroServicio implements ApiOperacionBD<GeneroDto, Integer>{

    @Override
    public int getSerial() {
        return 999;
    }

    @Override
    public GeneroDto insertInto(GeneroDto dto, String ruta) {
        Genero objGenero = new Genero();
        
        objGenero.setIdGenero(getSerial());
        objGenero.setNombreGenero(dto.getNombreGenero());
        objGenero.setEstadoGenero(dto.getEstadoGenero());
        
        dto.setIdGenero(objGenero.getIdGenero());
        System.out.println(objGenero);
        return dto;
    }

    @Override
    public List<GeneroDto> selectFrom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int numRows() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean deleteFrom(Integer codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public GeneroDto updateSet(Integer codigo, GeneroDto objeto, String ruta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public GeneroDto getOne(Integer codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

