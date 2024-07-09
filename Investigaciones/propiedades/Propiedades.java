package propiedades;

import java.util.ArrayList;
import java.util.Properties;

public class Propiedades {

    public static void main(String[] args) {

        // https://www.geeksforgeeks.org/getproperty-and-getproperties-methods-of-system-class-in-java/

        Properties propiedades = System.getProperties();
        propiedades.list(System.out);

        System.out.println();

        ArrayList<String> listaPropiedades = new ArrayList<>();

        listaPropiedades.add(System.getProperty("user.name"));

        listaPropiedades.add(System.getProperty("user.dir"));

        listaPropiedades.add(System.getProperty("os.name"));

        listaPropiedades.add(System.getProperty("os.version"));

        listaPropiedades.add(System.getProperty("os.arch"));

        listaPropiedades.add(System.getProperty("java.runtime.version"));

        listaPropiedades.add(System.getProperty("java.home"));

        listaPropiedades.add(System.getProperty("java.vm.name"));

        listaPropiedades.add(System.getProperty("java.vm.version"));
        listaPropiedades.add("###################");
        listaPropiedades.add(System.getProperty("java.compiler"));

        listaPropiedades.add(System.getProperty("java.ext.dirs"));

        listaPropiedades.add(System.getProperty("java.library.path"));

        listaPropiedades.add(System.getProperty("path.separator"));

        listaPropiedades.add(System.getProperty("file.separator"));

        listaPropiedades.add(System.getProperty("name")); // null

        listaPropiedades.add(System.getProperty("home")); // null

        for (String propiedad: listaPropiedades) {
            System.out.println(propiedad);
        }

    }

}