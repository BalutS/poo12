
package org.unimag.recurso.constante;

import java.io.File;


public class Persistencia {
    public static final String RUTA_PROYECTO = System.clearProperty("user.dir");
    public static final String NOMBRE_BASE_DATOS_GENERO = "Genero.txt";
     public static final String NOMBRE_BASE_DATOS_PELICULA = "Pelicula.txt";
     
    public static final String NOMBRE_CARPETA = "miBaseDeDatos";
    
    public static final String SEPARADOR_COLUMNAS = ";";
    public static final String SEPARADOR_CARPTEAS = File.separator;
    
    public static final String NOMBRE = RUTA_PROYECTO + SEPARADOR_CARPTEAS + NOMBRE_CARPETA + SEPARADOR_CARPTEAS + NOMBRE_BASE_DATOS_GENERO
            + SEPARADOR_CARPTEAS + NOMBRE_BASE_DATOS_PELICULA;
    
    
}

