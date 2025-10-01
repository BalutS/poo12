package org.unimag.dto;

import org.unimag.modelo.Genero;

public class PeliculaDto {
    private Integer codigoPelicula;
    private String nombrePelicula;
    private String protagonistaPelicula;
    private Genero generoPelicula;
    private Double presupuestoPelicula;
    private Boolean mayoriaEdad;

    public PeliculaDto() {
    }

    public PeliculaDto(Integer codigoPelicula, String nombrePelicula, String protagonistaPelicula, Genero generoPelicula, Double presupuestoPelicula, Boolean mayoriaEdad) {
        this.codigoPelicula = codigoPelicula;
        this.nombrePelicula = nombrePelicula;
        this.protagonistaPelicula = protagonistaPelicula;
        this.generoPelicula = generoPelicula;
        this.presupuestoPelicula = presupuestoPelicula;
        this.mayoriaEdad = mayoriaEdad;
    }

    public Integer getCodigoPelicula() {
        return codigoPelicula;
    }

    public void setCodigoPelicula(Integer codigoPelicula) {
        this.codigoPelicula = codigoPelicula;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getProtagonistaPelicula() {
        return protagonistaPelicula;
    }

    public void setProtagonistaPelicula(String protagonistaPelicula) {
        this.protagonistaPelicula = protagonistaPelicula;
    }

    public Genero getGeneroPelicula() {
        return generoPelicula;
    }

    public void setGeneroPelicula(Genero generoPelicula) {
        this.generoPelicula = generoPelicula;
    }

    public Double getPresupuestoPelicula() {
        return presupuestoPelicula;
    }

    public void setPresupuestoPelicula(Double presupuestoPelicula) {
        this.presupuestoPelicula = presupuestoPelicula;
    }

    public Boolean getMayoriaEdad() {
        return mayoriaEdad;
    }

    public void setMayoriaEdad(Boolean mayoriaEdad) {
        this.mayoriaEdad = mayoriaEdad;
    }
}