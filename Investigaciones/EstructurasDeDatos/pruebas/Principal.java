package EstructurasDeDatos.pruebas;

public class Principal {

    public static void main(String[] args) {

        System.out.println("Prueba 1");
        String[] repetidos = {"Hola", "Hola", "Hola", "Hola",
                "Adios", "Adios", "Adios",
                "1", "1", "1", "1"
        };

        Object[] objeto = Reducion.eliminarRedundaciasArrays(repetidos);
        for (Object o : objeto) {
            System.out.println(o);
        }

        System.out.println("Prueba 2");
        String[] repetidos2 = {"Hola", "Hola", "Hola", "Hola",
                "Adios", "Adios", "Adios",
                "1", "1", "1", "1", "2"
        };

        objeto = Reducion.eliminarRedundaciasArrays(repetidos2);
        for (Object o : objeto) {
            System.out.println(o);
        }

        System.out.println("Prueba 3");
        String[] repetidos3 = {"Hola", "Hola", "Hola",
                "Adios", "Adios", "Hola", "Adios",
                "1", "1", "1", "1", "2"
        };

        objeto = Reducion.eliminarRedundaciasArrays(repetidos3);
        for (Object o : objeto) {
            System.out.println(o);
        }

        System.out.println("Prueba 4");
        String[] repetidos4 = {"Hola", "Hola", "Adios", "Hola",
                "Adios", "1", "Adios", "1", "1", "Hola", "1", "2"
        };

        objeto = Reducion.eliminarRedundaciasArrays(repetidos4);
        for (Object o : objeto) {
            System.out.println(o);
        }

    }

}
