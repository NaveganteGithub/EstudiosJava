package EstructurasDeDatos.pruebas;

import java.util.*;

public class Reducion {

    static Object[] eliminarRedundaciasArrays(final Object[] array) {

        // Convertimos el Array a una Lista
        List<Object> objetos = new ArrayList<>(Arrays.stream(array).toList());
        // Creamos un ArrayList vacio para listar los objetos
        ArrayList<Object> objetosListados = new ArrayList<>();

        do {

            // Pedimos de la Lista entre los objetos repetidos la primera
            // occurencia de cada grupo de repeticiones
            Object miObjeto = objetos.getFirst();

            // Agregamos el objeto pedido anteriormente al ArrayList
            objetosListados.add(miObjeto);

            // Instanciamos una Coleccion de Objetos para almacenar el objeto
            // que se ha pedido anteriormente
            Collection<Object> objetoRepetido = new ArrayList<>();
            objetoRepetido.add(miObjeto);

            // Utilizamos la coleccion instanciada con el objeto para eliminar
            // todos los objetos de la Lista que sean iguales al objeto pedido
            // anteriormente
            objetos.removeAll(objetoRepetido);

        } while (!objetos.isEmpty()); // Este bucle do-while se ejecutara mientras haya objetos en la Lista

        return objetosListados.toArray(); // Devolveremos la Lista convertida en un Array

    }
}
