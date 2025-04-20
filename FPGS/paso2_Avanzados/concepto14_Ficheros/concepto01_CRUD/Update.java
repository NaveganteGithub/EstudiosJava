package conceptos.paso2_Avanzados.concepto01_Ficheros.concepto01_CRUD;

import java.io.IOException;

public class Update {

	public Update() {}
	
	public static void modificarTXT(String ruta, String texto_modificacion) {
		
		String texto_original, texto_modificado;
		
		try {
			
			texto_original = Read.leerTXT(ruta);
			texto_modificado = texto_original + texto_modificacion;
			
			Create.crearTXT(ruta, texto_modificado);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
