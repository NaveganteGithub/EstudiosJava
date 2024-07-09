package propiedades.enumeraciones.ej4;

public enum operacionesConArchivos {

    CREAR_ARCHIVO("CREACION DE ARCHIVO", "Creamos un archivo", 52185, "MF"),
    LEER_ARCHIVO("LECTURA DE ARCHIVO", "Leemos un archivo", 52162, "RF"),
    ELIMINAR_ARCHIVO("ELIMINACION DE ARCHIVO", "Eliminamos un archivo", 54612, "DELF"),
    MODIFICACION_ARCHIVO("REESCRITURA DE ARCHIVO", "Modificamos el fichero", 41564, "UF");

    private final String nombre;
    private final String descripcion;
    private final int codigoComando;
    private final String comando;

    operacionesConArchivos (String nombre, String descripcion, int codigoComando, String comando) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigoComando = codigoComando;
        this.comando = comando;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCodigoComando() {
        return codigoComando;
    }

    public String getComando() {
        return comando;
    }

}
