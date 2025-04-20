package conceptos.paso2_Avanzados.concepto01_Ficheros.concepto01_CRUD;

import java.io.FileWriter;
import java.io.IOException;

public class Create {

	public Create() {}
	
	public static void crearTXT(String ruta_nombre, String texto) throws IOException {
		
		FileWriter archivo = new FileWriter(ruta_nombre);
		
		archivo.write(texto);
		
		archivo.close();
		
	}
	
}
