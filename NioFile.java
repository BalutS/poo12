package com.poo.persistence;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class NioFile {

    private Path miArchivo;
    private List<String> filas;
    private final String separadorFila;
    private final String separadorColumna;
    private final String finLinea;

    public NioFile(String nombreArchivo) throws IOException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         * 4: aload_0
         * 5: ldc           #7                  // String line.separator
         * 7: invokestatic  #9                  // Method java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
         * 10: putfield      #15                 // Field finLinea:Ljava/lang/String;
         * 13: aload_0
         * 14: ldc           #21                 // String @
         * 16: putfield      #23                 // Field separadorFila:Ljava/lang/String;
         * 19: aload_0
         * 20: ldc           #26                 // String ;
         * 22: putfield      #28                 // Field separadorColumna:Ljava/lang/String;
         * 25: aload_0
         * 26: aload_1
         * 27: invokevirtual #31                 // Method verificarArchivo:(Ljava/lang/String;)V
         * 30: return
         *  */
        // </editor-fold>
    }

    public NioFile(String nombreArchivo, String sepaFila, String sepaColumna) throws IOException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         * 4: aload_0
         * 5: ldc           #7                  // String line.separator
         * 7: invokestatic  #9                  // Method java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
         * 10: putfield      #15                 // Field finLinea:Ljava/lang/String;
         * 13: aload_0
         * 14: aload_2
         * 15: putfield      #23                 // Field separadorFila:Ljava/lang/String;
         * 18: aload_0
         * 19: aload_3
         * 20: putfield      #28                 // Field separadorColumna:Ljava/lang/String;
         * 23: aload_0
         * 24: aload_1
         * 25: invokevirtual #31                 // Method verificarArchivo:(Ljava/lang/String;)V
         * 28: return
         *  */
        // </editor-fold>
    }

    public List<String> obtenerDatos() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_0
         * 2: invokevirtual #35                 // Method obtenerContenidoArchivo:()Ljava/util/List;
         * 5: putfield      #39                 // Field filas:Ljava/util/List;
         * 8: aload_0
         * 9: getfield      #39                 // Field filas:Ljava/util/List;
         * 12: areturn
         *  */
        // </editor-fold>
    }

    public boolean agregarRegistro(String fila) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iconst_0
         * 1: istore_2
         * 2: new           #43                 // class java/util/ArrayList
         * 5: dup
         * 6: invokespecial #45                 // Method java/util/ArrayList."<init>":()V
         * 9: astore_3
         * 10: aload_3
         * 11: aload_1
         * 12: aload_0
         * 13: getfield      #23                 // Field separadorFila:Ljava/lang/String;
         * 16: invokedynamic #46,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
         * 21: invokeinterface #50,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
         * 26: pop
         * 27: aload_0
         * 28: getfield      #56                 // Field miArchivo:Ljava/nio/file/Path;
         * 31: aload_3
         * 32: iconst_1
         * 33: anewarray     #60                 // class java/nio/file/OpenOption
         * 36: dup
         * 37: iconst_0
         * 38: getstatic     #62                 // Field java/nio/file/StandardOpenOption.APPEND:Ljava/nio/file/StandardOpenOption;
         * 41: aastore
         * 42: invokestatic  #68                 // Method java/nio/file/Files.write:(Ljava/nio/file/Path;Ljava/lang/Iterable;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
         * 45: pop
         * 46: iconst_1
         * 47: istore_2
         * 48: goto          68
         * 51: astore_3
         * 52: ldc           #16                 // class com/poo/persistence/NioFile
         * 54: invokevirtual #76                 // Method java/lang/Class.getName:()Ljava/lang/String;
         * 57: invokestatic  #82                 // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
         * 60: getstatic     #88                 // Field java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
         * 63: aconst_null
         * 64: aload_3
         * 65: invokevirtual #94                 // Method java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
         * 68: aload_0
         * 69: aload_0
         * 70: invokevirtual #35                 // Method obtenerContenidoArchivo:()Ljava/util/List;
         * 73: putfield      #39                 // Field filas:Ljava/util/List;
         * 76: iload_2
         * 77: ireturn
         * Exception table:
         * from    to  target type
         * 2    48    51   Class java/io/IOException
         *  */
        // </editor-fold>
    }

    public boolean resetar() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iconst_0
         * 1: istore_1
         * 2: aload_0
         * 3: getfield      #56                 // Field miArchivo:Ljava/nio/file/Path;
         * 6: invokestatic  #98                 // Method java/nio/file/Files.delete:(Ljava/nio/file/Path;)V
         * 9: aload_0
         * 10: getfield      #56                 // Field miArchivo:Ljava/nio/file/Path;
         * 13: iconst_0
         * 14: anewarray     #102                // class java/nio/file/attribute/FileAttribute
         * 17: invokestatic  #104                // Method java/nio/file/Files.createFile:(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
         * 20: pop
         * 21: iconst_1
         * 22: istore_1
         * 23: goto          43
         * 26: astore_2
         * 27: ldc           #16                 // class com/poo/persistence/NioFile
         * 29: invokevirtual #76                 // Method java/lang/Class.getName:()Ljava/lang/String;
         * 32: invokestatic  #82                 // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
         * 35: getstatic     #88                 // Field java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
         * 38: aconst_null
         * 39: aload_2
         * 40: invokevirtual #94                 // Method java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
         * 43: iload_1
         * 44: ireturn
         * Exception table:
         * from    to  target type
         * 2    23    26   Class java/io/IOException
         *  */
        // </editor-fold>
    }

    public List<String> borrarFilaPosicion(int posicion) throws IOException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           #43                 // class java/util/ArrayList
         * 3: dup
         * 4: invokespecial #45                 // Method java/util/ArrayList."<init>":()V
         * 7: astore        5
         * 9: new           #43                 // class java/util/ArrayList
         * 12: dup
         * 13: invokespecial #45                 // Method java/util/ArrayList."<init>":()V
         * 16: astore        6
         * 18: aload_0
         * 19: getfield      #39                 // Field filas:Ljava/util/List;
         * 22: invokeinterface #108,  1          // InterfaceMethod java/util/List.size:()I
         * 27: istore        4
         * 29: iconst_0
         * 30: istore_3
         * 31: iload_3
         * 32: iload         4
         * 34: if_icmpge     81
         * 37: aload_0
         * 38: getfield      #39                 // Field filas:Ljava/util/List;
         * 41: iload_3
         * 42: invokeinterface #112,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
         * 47: checkcast     #116                // class java/lang/String
         * 50: astore_2
         * 51: iload_1
         * 52: iload_3
         * 53: if_icmpeq     68
         * 56: aload         6
         * 58: aload_2
         * 59: invokeinterface #50,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
         * 64: pop
         * 65: goto          75
         * 68: aload_0
         * 69: aload_2
         * 70: invokevirtual #118                // Method filaToLista:(Ljava/lang/String;)Ljava/util/List;
         * 73: astore        5
         * 75: iinc          3, 1
         * 78: goto          31
         * 81: aload_0
         * 82: invokevirtual #122                // Method resetar:()Z
         * 85: pop
         * 86: aload_0
         * 87: getfield      #56                 // Field miArchivo:Ljava/nio/file/Path;
         * 90: aload         6
         * 92: iconst_1
         * 93: anewarray     #60                 // class java/nio/file/OpenOption
         * 96: dup
         * 97: iconst_0
         * 98: getstatic     #62                 // Field java/nio/file/StandardOpenOption.APPEND:Ljava/nio/file/StandardOpenOption;
         * 101: aastore
         * 102: invokestatic  #68                 // Method java/nio/file/Files.write:(Ljava/nio/file/Path;Ljava/lang/Iterable;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
         * 105: pop
         * 106: aload         5
         * 108: areturn
         *  */
        // </editor-fold>
    }

    public boolean actualizaFilaPosicion(int posicion, String infoNueva) throws IOException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iconst_0
         * 1: istore        6
         * 3: new           #43                 // class java/util/ArrayList
         * 6: dup
         * 7: invokespecial #45                 // Method java/util/ArrayList."<init>":()V
         * 10: astore        7
         * 12: aload_0
         * 13: getfield      #39                 // Field filas:Ljava/util/List;
         * 16: invokeinterface #108,  1          // InterfaceMethod java/util/List.size:()I
         * 21: istore        5
         * 23: iconst_0
         * 24: istore        4
         * 26: iload         4
         * 28: iload         5
         * 30: if_icmpge     93
         * 33: aload_0
         * 34: getfield      #39                 // Field filas:Ljava/util/List;
         * 37: iload         4
         * 39: invokeinterface #112,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
         * 44: checkcast     #116                // class java/lang/String
         * 47: astore_3
         * 48: iload_1
         * 49: iload         4
         * 51: if_icmpeq     66
         * 54: aload         7
         * 56: aload_3
         * 57: invokeinterface #50,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
         * 62: pop
         * 63: goto          87
         * 66: aload         7
         * 68: aload_2
         * 69: aload_0
         * 70: getfield      #23                 // Field separadorFila:Ljava/lang/String;
         * 73: invokedynamic #46,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
         * 78: invokeinterface #50,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
         * 83: pop
         * 84: iconst_1
         * 85: istore        6
         * 87: iinc          4, 1
         * 90: goto          26
         * 93: aload_0
         * 94: invokevirtual #122                // Method resetar:()Z
         * 97: pop
         * 98: aload_0
         * 99: getfield      #56                 // Field miArchivo:Ljava/nio/file/Path;
         * 102: aload         7
         * 104: iconst_1
         * 105: anewarray     #60                 // class java/nio/file/OpenOption
         * 108: dup
         * 109: iconst_0
         * 110: getstatic     #62                 // Field java/nio/file/StandardOpenOption.APPEND:Ljava/nio/file/StandardOpenOption;
         * 113: aastore
         * 114: invokestatic  #68                 // Method java/nio/file/Files.write:(Ljava/nio/file/Path;Ljava/lang/Iterable;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
         * 117: pop
         * 118: iload         6
         * 120: ireturn
         *  */
        // </editor-fold>
    }

    public int ultimoCodigo() throws IOException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iconst_0
         * 1: istore_2
         * 2: aload_0
         * 3: getfield      #39                 // Field filas:Ljava/util/List;
         * 6: invokeinterface #126,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         * 11: astore        4
         * 13: aload         4
         * 15: invokeinterface #130,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
         * 20: ifeq          65
         * 23: aload         4
         * 25: invokeinterface #135,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
         * 30: checkcast     #116                // class java/lang/String
         * 33: astore        5
         * 35: iconst_0
         * 36: istore_1
         * 37: aload         5
         * 39: aload_0
         * 40: getfield      #28                 // Field separadorColumna:Ljava/lang/String;
         * 43: iload_1
         * 44: invokevirtual #139                // Method java/lang/String.indexOf:(Ljava/lang/String;I)I
         * 47: istore_3
         * 48: aload         5
         * 50: iload_1
         * 51: iload_3
         * 52: invokevirtual #143                // Method java/lang/String.substring:(II)Ljava/lang/String;
         * 55: invokevirtual #147                // Method java/lang/String.trim:()Ljava/lang/String;
         * 58: invokestatic  #150                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
         * 61: istore_2
         * 62: goto          13
         * 65: iload_2
         * 66: ireturn
         *  */
        // </editor-fold>
    }

    public List<String> obtenerFila(int indice) throws IOException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iconst_0
         * 1: istore_2
         * 2: ldc           #156                // String
         * 4: astore_3
         * 5: aload_0
         * 6: getfield      #39                 // Field filas:Ljava/util/List;
         * 9: invokeinterface #126,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         * 14: astore        5
         * 16: aload         5
         * 18: invokeinterface #130,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
         * 23: ifeq          52
         * 26: aload         5
         * 28: invokeinterface #135,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
         * 33: checkcast     #116                // class java/lang/String
         * 36: astore        6
         * 38: iload_2
         * 39: iload_1
         * 40: if_icmpne     46
         * 43: aload         6
         * 45: astore_3
         * 46: iinc          2, 1
         * 49: goto          16
         * 52: aload_0
         * 53: aload_3
         * 54: invokevirtual #118                // Method filaToLista:(Ljava/lang/String;)Ljava/util/List;
         * 57: astore        4
         * 59: aload         4
         * 61: areturn
         *  */
        // </editor-fold>
    }

    public int cantidadFilas() throws IOException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #39                 // Field filas:Ljava/util/List;
         * 4: invokeinterface #108,  1          // InterfaceMethod java/util/List.size:()I
         * 9: ireturn
         *  */
        // </editor-fold>
    }

    public static List<String> listaArchivos(String directorio) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           #43                 // class java/util/ArrayList
         * 3: dup
         * 4: invokespecial #45                 // Method java/util/ArrayList."<init>":()V
         * 7: astore_1
         * 8: aload_0
         * 9: iconst_0
         * 10: anewarray     #116                // class java/lang/String
         * 13: invokestatic  #158                // Method java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
         * 16: invokestatic  #163                // Method java/nio/file/Files.newDirectoryStream:(Ljava/nio/file/Path;)Ljava/nio/file/DirectoryStream;
         * 19: astore_2
         * 20: aload_2
         * 21: invokeinterface #167,  1          // InterfaceMethod java/nio/file/DirectoryStream.iterator:()Ljava/util/Iterator;
         * 26: astore_3
         * 27: aload_3
         * 28: invokeinterface #130,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
         * 33: ifeq          64
         * 36: aload_3
         * 37: invokeinterface #135,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
         * 42: checkcast     #170                // class java/nio/file/Path
         * 45: astore        4
         * 47: aload_1
         * 48: aload         4
         * 50: invokeinterface #172,  1          // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
         * 55: invokeinterface #50,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
         * 60: pop
         * 61: goto          27
         * 64: aload_2
         * 65: ifnull        101
         * 68: aload_2
         * 69: invokeinterface #175,  1          // InterfaceMethod java/nio/file/DirectoryStream.close:()V
         * 74: goto          101
         * 77: astore_3
         * 78: aload_2
         * 79: ifnull        99
         * 82: aload_2
         * 83: invokeinterface #175,  1          // InterfaceMethod java/nio/file/DirectoryStream.close:()V
         * 88: goto          99
         * 91: astore        4
         * 93: aload_3
         * 94: aload         4
         * 96: invokevirtual #180                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
         * 99: aload_3
         * 100: athrow
         * 101: goto          105
         * 104: astore_2
         * 105: aload_1
         * 106: areturn
         * Exception table:
         * from    to  target type
         * 20    64    77   Class java/lang/Throwable
         * 82    88    91   Class java/lang/Throwable
         * 8   101   104   Class java/io/IOException
         *  */
        // </editor-fold>
    }

    private void verificarArchivo(String nombreArchivo) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: new           #43                 // class java/util/ArrayList
         * 4: dup
         * 5: invokespecial #45                 // Method java/util/ArrayList."<init>":()V
         * 8: putfield      #39                 // Field filas:Ljava/util/List;
         * 11: aload_0
         * 12: aload_1
         * 13: iconst_0
         * 14: anewarray     #116                // class java/lang/String
         * 17: invokestatic  #158                // Method java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
         * 20: putfield      #56                 // Field miArchivo:Ljava/nio/file/Path;
         * 23: aload_0
         * 24: getfield      #56                 // Field miArchivo:Ljava/nio/file/Path;
         * 27: iconst_0
         * 28: anewarray     #184                // class java/nio/file/LinkOption
         * 31: invokestatic  #186                // Method java/nio/file/Files.exists:(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
         * 34: ifeq          48
         * 37: aload_0
         * 38: aload_0
         * 39: invokevirtual #35                 // Method obtenerContenidoArchivo:()Ljava/util/List;
         * 42: putfield      #39                 // Field filas:Ljava/util/List;
         * 45: goto          76
         * 48: aload_0
         * 49: getfield      #56                 // Field miArchivo:Ljava/nio/file/Path;
         * 52: invokeinterface #190,  1          // InterfaceMethod java/nio/file/Path.getParent:()Ljava/nio/file/Path;
         * 57: iconst_0
         * 58: anewarray     #184                // class java/nio/file/LinkOption
         * 61: invokestatic  #194                // Method java/nio/file/Files.isDirectory:(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
         * 64: ifne          71
         * 67: aload_0
         * 68: invokevirtual #197                // Method crearCarpetaVacia:()V
         * 71: aload_0
         * 72: aload_1
         * 73: invokevirtual #200                // Method crearArchivoVacio:(Ljava/lang/String;)V
         * 76: return
         *  */
        // </editor-fold>
    }

    private void crearCarpetaVacia() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #56                 // Field miArchivo:Ljava/nio/file/Path;
         * 4: invokeinterface #190,  1          // InterfaceMethod java/nio/file/Path.getParent:()Ljava/nio/file/Path;
         * 9: astore_1
         * 10: aload_1
         * 11: iconst_0
         * 12: anewarray     #102                // class java/nio/file/attribute/FileAttribute
         * 15: invokestatic  #203                // Method java/nio/file/Files.createDirectories:(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
         * 18: pop
         * 19: getstatic     #206                // Field java/lang/System.out:Ljava/io/PrintStream;
         * 22: ldc           #210                // String ***********************************************
         * 24: invokevirtual #212                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         * 27: getstatic     #206                // Field java/lang/System.out:Ljava/io/PrintStream;
         * 30: aload_1
         * 31: invokeinterface #172,  1          // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
         * 36: invokedynamic #217,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
         * 41: invokevirtual #212                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         * 44: getstatic     #206                // Field java/lang/System.out:Ljava/io/PrintStream;
         * 47: ldc           #210                // String ***********************************************
         * 49: invokevirtual #212                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         * 52: getstatic     #206                // Field java/lang/System.out:Ljava/io/PrintStream;
         * 55: ldc           #156                // String
         * 57: invokevirtual #212                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         * 60: goto          121
         * 63: astore_2
         * 64: getstatic     #206                // Field java/lang/System.out:Ljava/io/PrintStream;
         * 67: ldc           #210                // String ***********************************************
         * 69: invokevirtual #212                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         * 72: getstatic     #206                // Field java/lang/System.out:Ljava/io/PrintStream;
         * 75: aload_1
         * 76: invokeinterface #172,  1          // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
         * 81: invokedynamic #219,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
         * 86: invokevirtual #212                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         * 89: getstatic     #206                // Field java/lang/System.out:Ljava/io/PrintStream;
         * 92: ldc           #210                // String ***********************************************
         * 94: invokevirtual #212                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         * 97: getstatic     #206                // Field java/lang/System.out:Ljava/io/PrintStream;
         * 100: ldc           #156                // String
         * 102: invokevirtual #212                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         * 105: ldc           #16                 // class com/poo/persistence/NioFile
         * 107: invokevirtual #76                 // Method java/lang/Class.getName:()Ljava/lang/String;
         * 110: invokestatic  #82                 // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
         * 113: getstatic     #88                 // Field java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
         * 116: aconst_null
         * 117: aload_2
         * 118: invokevirtual #94                 // Method java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
         * 121: return
         * Exception table:
         * from    to  target type
         * 10    60    63   Class java/io/IOException
         *  */
        // </editor-fold>
    }

    private void crearArchivoVacio(String nombreArchivo) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #56                 // Field miArchivo:Ljava/nio/file/Path;
         * 4: iconst_0
         * 5: anewarray     #102                // class java/nio/file/attribute/FileAttribute
         * 8: invokestatic  #104                // Method java/nio/file/Files.createFile:(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
         * 11: pop
         * 12: getstatic     #206                // Field java/lang/System.out:Ljava/io/PrintStream;
         * 15: ldc           #210                // String ***********************************************
         * 17: invokevirtual #212                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         * 20: getstatic     #206                // Field java/lang/System.out:Ljava/io/PrintStream;
         * 23: aload_1
         * 24: invokedynamic #220,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
         * 29: invokevirtual #212                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         * 32: getstatic     #206                // Field java/lang/System.out:Ljava/io/PrintStream;
         * 35: ldc           #210                // String ***********************************************
         * 37: invokevirtual #212                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         * 40: getstatic     #206                // Field java/lang/System.out:Ljava/io/PrintStream;
         * 43: ldc           #156                // String
         * 45: invokevirtual #212                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         * 48: goto          104
         * 51: astore_2
         * 52: getstatic     #206                // Field java/lang/System.out:Ljava/io/PrintStream;
         * 55: ldc           #210                // String ***********************************************
         * 57: invokevirtual #212                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         * 60: getstatic     #206                // Field java/lang/System.out:Ljava/io/PrintStream;
         * 63: aload_1
         * 64: invokedynamic #221,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
         * 69: invokevirtual #212                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         * 72: getstatic     #206                // Field java/lang/System.out:Ljava/io/PrintStream;
         * 75: ldc           #210                // String ***********************************************
         * 77: invokevirtual #212                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         * 80: getstatic     #206                // Field java/lang/System.out:Ljava/io/PrintStream;
         * 83: ldc           #156                // String
         * 85: invokevirtual #212                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         * 88: ldc           #16                 // class com/poo/persistence/NioFile
         * 90: invokevirtual #76                 // Method java/lang/Class.getName:()Ljava/lang/String;
         * 93: invokestatic  #82                 // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
         * 96: getstatic     #88                 // Field java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
         * 99: aconst_null
         * 100: aload_2
         * 101: invokevirtual #94                 // Method java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
         * 104: return
         * Exception table:
         * from    to  target type
         * 0    48    51   Class java/io/IOException
         *  */
        // </editor-fold>
    }

    private List<String> obtenerContenidoArchivo() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           #43                 // class java/util/ArrayList
         * 3: dup
         * 4: invokespecial #45                 // Method java/util/ArrayList."<init>":()V
         * 7: astore_3
         * 8: aload_0
         * 9: getfield      #56                 // Field miArchivo:Ljava/nio/file/Path;
         * 12: invokestatic  #222                // Method java/nio/file/Files.size:(Ljava/nio/file/Path;)J
         * 15: lconst_0
         * 16: lcmp
         * 17: ifle          46
         * 20: aload_0
         * 21: getfield      #56                 // Field miArchivo:Ljava/nio/file/Path;
         * 24: getstatic     #225                // Field java/nio/charset/StandardCharsets.UTF_8:Ljava/nio/charset/Charset;
         * 27: invokestatic  #231                // Method java/nio/file/Files.readString:(Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/lang/String;
         * 30: astore_1
         * 31: aload_1
         * 32: aload_0
         * 33: getfield      #23                 // Field separadorFila:Ljava/lang/String;
         * 36: invokevirtual #235                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
         * 39: astore_2
         * 40: aload_0
         * 41: aload_2
         * 42: invokevirtual #239                // Method quitarFilasVacias:([Ljava/lang/String;)Ljava/util/List;
         * 45: astore_3
         * 46: goto          68
         * 49: astore        4
         * 51: ldc           #16                 // class com/poo/persistence/NioFile
         * 53: invokevirtual #76                 // Method java/lang/Class.getName:()Ljava/lang/String;
         * 56: invokestatic  #82                 // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
         * 59: getstatic     #88                 // Field java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
         * 62: aconst_null
         * 63: aload         4
         * 65: invokevirtual #94                 // Method java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
         * 68: aload_3
         * 69: areturn
         * Exception table:
         * from    to  target type
         * 8    46    49   Class java/io/IOException
         *  */
        // </editor-fold>
    }

    private List<String> quitarFilasVacias(String[] filasTotales) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: arraylength
         * 2: istore_3
         * 3: new           #43                 // class java/util/ArrayList
         * 6: dup
         * 7: invokespecial #45                 // Method java/util/ArrayList."<init>":()V
         * 10: astore        6
         * 12: iconst_0
         * 13: istore_2
         * 14: iload_2
         * 15: iload_3
         * 16: if_icmpge     96
         * 19: aload_1
         * 20: iload_2
         * 21: aaload
         * 22: aload_0
         * 23: getfield      #15                 // Field finLinea:Ljava/lang/String;
         * 26: invokevirtual #243                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         * 29: ifne          90
         * 32: aload_1
         * 33: iload_2
         * 34: aaload
         * 35: astore        5
         * 37: aload         5
         * 39: iconst_0
         * 40: iconst_2
         * 41: invokevirtual #143                // Method java/lang/String.substring:(II)Ljava/lang/String;
         * 44: astore        4
         * 46: aload         4
         * 48: aload_0
         * 49: getfield      #15                 // Field finLinea:Ljava/lang/String;
         * 52: invokevirtual #243                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         * 55: ifeq          71
         * 58: aload         5
         * 60: iconst_2
         * 61: aload         5
         * 63: invokevirtual #246                // Method java/lang/String.length:()I
         * 66: invokevirtual #143                // Method java/lang/String.substring:(II)Ljava/lang/String;
         * 69: astore        5
         * 71: aload         6
         * 73: aload         5
         * 75: aload_0
         * 76: getfield      #23                 // Field separadorFila:Ljava/lang/String;
         * 79: invokedynamic #46,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
         * 84: invokeinterface #50,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
         * 89: pop
         * 90: iinc          2, 1
         * 93: goto          14
         * 96: aload         6
         * 98: areturn
         *  */
        // </editor-fold>
    }

    private List<String> filaToLista(String cadena) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iconst_0
         * 1: istore        6
         * 3: iconst_0
         * 4: istore        8
         * 6: aload_1
         * 7: aload_0
         * 8: getfield      #28                 // Field separadorColumna:Ljava/lang/String;
         * 11: iload         6
         * 13: invokevirtual #139                // Method java/lang/String.indexOf:(Ljava/lang/String;I)I
         * 16: istore        7
         * 18: new           #43                 // class java/util/ArrayList
         * 21: dup
         * 22: invokespecial #45                 // Method java/util/ArrayList."<init>":()V
         * 25: astore        5
         * 27: aload_1
         * 28: invokevirtual #249                // Method java/lang/String.chars:()Ljava/util/stream/IntStream;
         * 31: aload_0
         * 32: invokedynamic #253,  0            // InvokeDynamic #5:test:(Lcom/poo/persistence/NioFile;)Ljava/util/function/IntPredicate;
         * 37: invokeinterface #257,  2          // InterfaceMethod java/util/stream/IntStream.filter:(Ljava/util/function/IntPredicate;)Ljava/util/stream/IntStream;
         * 42: invokeinterface #263,  1          // InterfaceMethod java/util/stream/IntStream.count:()J
         * 47: lstore_3
         * 48: lload_3
         * 49: iload         8
         * 51: i2l
         * 52: lcmp
         * 53: ifle          101
         * 56: aload_1
         * 57: iload         6
         * 59: iload         7
         * 61: invokevirtual #143                // Method java/lang/String.substring:(II)Ljava/lang/String;
         * 64: invokevirtual #147                // Method java/lang/String.trim:()Ljava/lang/String;
         * 67: astore_2
         * 68: aload         5
         * 70: aload_2
         * 71: invokeinterface #50,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
         * 76: pop
         * 77: iload         7
         * 79: iconst_1
         * 80: iadd
         * 81: istore        6
         * 83: aload_1
         * 84: aload_0
         * 85: getfield      #28                 // Field separadorColumna:Ljava/lang/String;
         * 88: iload         6
         * 90: invokevirtual #139                // Method java/lang/String.indexOf:(Ljava/lang/String;I)I
         * 93: istore        7
         * 95: iinc          8, 1
         * 98: goto          48
         * 101: aload_1
         * 102: invokevirtual #246                // Method java/lang/String.length:()I
         * 105: iconst_1
         * 106: isub
         * 107: istore        7
         * 109: aload_1
         * 110: iload         6
         * 112: iload         7
         * 114: invokevirtual #143                // Method java/lang/String.substring:(II)Ljava/lang/String;
         * 117: invokevirtual #147                // Method java/lang/String.trim:()Ljava/lang/String;
         * 120: astore_2
         * 121: aload         5
         * 123: aload_2
         * 124: invokeinterface #50,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
         * 129: pop
         * 130: aload         5
         * 132: areturn
         *  */
        // </editor-fold>
    }
}

