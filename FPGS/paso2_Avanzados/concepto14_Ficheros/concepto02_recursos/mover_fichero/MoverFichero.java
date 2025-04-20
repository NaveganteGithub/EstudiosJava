package conceptos.paso2_Avanzados.concepto01_Ficheros.concepto02_recursos.mover_fichero;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MoverFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ruta_origen = null, ruta_destino = null;
		FileInputStream archivo_origen = null;
		FileOutputStream archivo_destino = null;
		File archivo = null;
		byte[] buffer = null;
		
		ruta_origen = "C:/Users/navegante/eclipse-workspace/RepasoInvestacion/"
				+ "src/conceptos/paso2_Avanzados/concepto01_Ficheros/"
				+ "concepto02_recursos/mover_fichero/origen/amarillo.png";
		
		ruta_destino = "C:/Users/navegante/eclipse-workspace/RepasoInvestacion/"
				+ "src/conceptos/paso2_Avanzados/concepto01_Ficheros/"
				+ "concepto02_recursos/mover_fichero/destino/amarillo.png";
		
		try {
			
			/*
			 * Primero lees el archivo de origen
			 * 
			 * */
			
			archivo_origen = new FileInputStream(ruta_origen);
			
			buffer = archivo_origen.readAllBytes();
			
			archivo_origen.close();
			
			/*
			 * Segundo copias el archivo de origen
			 * en una copia en el destino que se
			 * indiques 
			 *  
			 * */
			
			archivo_destino = new FileOutputStream(ruta_destino);
			
			archivo_destino.write(buffer);
			
			archivo_destino.close();
			
			/*
			 * Eliminas el archivo de origen
			 * 
			 * */
			
			archivo = new File(ruta_origen);
			
			archivo.delete();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
