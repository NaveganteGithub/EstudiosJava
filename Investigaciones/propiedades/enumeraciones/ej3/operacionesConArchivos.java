package propiedades.enumeraciones.ej3;

public enum operacionesConArchivos {

    CREAR_ARCHIVO("CREACION DE ARCHIVO", "Creamos un archivo"),
    LEER_ARCHIVO("LECTURA DE ARCHIVO", "Leemos un archivo"),
    ELIMINAR_ARCHIVO("ELIMINACION DE ARCHIVO", "Eliminamos un archivo"),
    MODIFICACION_ARCHIVO("REESCRITURA DE ARCHIVO", "Modificamos el fichero");

    private final String nombre;
    private final String descripcion;

    operacionesConArchivos (String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
