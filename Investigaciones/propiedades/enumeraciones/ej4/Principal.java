package propiedades.enumeraciones.ej4;

public class Principal {

    public static void main(String[] args) {
        operacionesConArchivos miOperacion = operacionesConArchivos.CREAR_ARCHIVO;
        System.out.println(miOperacion);
        System.out.println(miOperacion.getNombre());
        System.out.println(miOperacion.getDescripcion());
        System.out.println(miOperacion.getCodigoComando());
        System.out.println(miOperacion.getComando());
    }
}
