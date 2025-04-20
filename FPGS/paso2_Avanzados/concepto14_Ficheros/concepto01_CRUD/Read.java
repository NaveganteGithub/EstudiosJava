package conceptos.paso2_Avanzados.concepto01_Ficheros.concepto01_CRUD;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public Read() {}
	
	public static String leerTXT(String ruta) throws FileNotFoundException, IOException {
		
		String texto = null;
		FileReader leer = new FileReader(ruta);
		
		int caracter;
		
		caracter = leer.read();
		if(caracter != -1) texto = String.valueOf((char) caracter);
		
		while(caracter != -1) {
			caracter = leer.read();
			if(caracter != -1) texto += String.valueOf((char) caracter);
		}
		
		leer.close();
		
		return texto;
		
	}
	
}
