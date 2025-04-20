package conceptos.paso2_Avanzados.concepto01_Ficheros.concepto01_CRUD;

import java.io.IOException;

public class Llamada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Create.crearTXT(
					"C:/Users/Navegante/Pictures/jk/archivoparaprobar.txt", 
					"Hola bienvenido");
			
			System.out.println(
					Read.leerTXT("C:/Users/Navegante/Pictures/jk/archivoparaprobar.txt")
					);
			
			Update.modificarTXT("C:/Users/Navegante/Pictures/jk/archivoparaprobar.txt", ", ¿que tal?");

			System.out.println(
					Read.leerTXT("C:/Users/Navegante/Pictures/jk/archivoparaprobar.txt")
					);
			
			Delete.eliminarTXT("C:/Users/Navegante/Pictures/jk/archivoparaprobar.txt");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
