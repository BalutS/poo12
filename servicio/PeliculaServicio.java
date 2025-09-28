package org.unimag.servicio;

import java.util.List;
import org.unimag.api.ApiOperacionBD;
import org.unimag.dto.PeliculaDto;
import org.unimag.modelo.Pelicula;

public class PeliculaServicio implements ApiOperacionBD<PeliculaDto, Integer> {

    @Override
    public int getSerial() {
        // For now, returning a dummy serial
        return 1000;
    }

    @Override
    public PeliculaDto insertInto(PeliculaDto dto, String ruta) {
        Pelicula objPelicula = new Pelicula();

        objPelicula.setCodigoPelicula(dto.getCodigoPelicula());
        objPelicula.setNombrePelicula(dto.getNombrePelicula());
        objPelicula.setProtagonistaPelicula(dto.getProtagonistaPelicula());
        objPelicula.setGeneroPelicula(dto.getGeneroPelicula());

        System.out.println(objPelicula);
        return dto;
    }

    @Override
    public List<PeliculaDto> selectFrom() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numRows() {
        throw new UnsupportedOperationException("Not supported yet.");
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