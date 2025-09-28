package org.unimag.dto;

import org.unimag.modelo.Genero;

public class PeliculaDto {
    private Integer codigo;
    private String nombre;
    private String protagonista;
    private Genero genero;

    public PeliculaDto() {
    }

    public PeliculaDto(Integer codigo, String nombre, String protagonista, Genero genero) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.protagonista = protagonista;
        this.genero = genero;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}