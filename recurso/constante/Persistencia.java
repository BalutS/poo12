package org.unimag.recurso.constante;

import java.io.File;

public class Persistencia {
    public static final String RUTA_PROYECTO = System.getProperty("user.dir");
    public static final String NOMBRE_CARPETA = "miBaseDeDatos";
    public static final String SEPARADOR_CARPETAS = File.separator;

    public static final String RUTA_BASE_DATOS = RUTA_PROYECTO + SEPARADOR_CARPETAS + NOMBRE_CARPETA + SEPARADOR_CARPETAS;

    public static final String NOMBRE_BASE_DATOS_GENERO = "Genero.txt";
    public static final String NOMBRE_BASE_DATOS_PELICULA = "Pelicula.txt";

    public static final String RUTA_GENERO_TXT = RUTA_BASE_DATOS + NOMBRE_BASE_DATOS_GENERO;
    public static final String RUTA_PELICULA_TXT = RUTA_BASE_DATOS + NOMBRE_BASE_DATOS_PELICULA;

    public static final String SEPARADOR_COLUMNAS = ";";
}