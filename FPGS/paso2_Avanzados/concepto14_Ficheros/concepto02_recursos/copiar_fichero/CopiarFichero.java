package conceptos.paso2_Avanzados.concepto01_Ficheros.concepto02_recursos.copiar_fichero;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiarFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte[] bytes = null;
		
		try {
			
			FileInputStream archivo_origen = new FileInputStream("C:/Users/navegante/eclipse-workspace/"
					+ "RepasoInvestacion/src/conceptos/paso2_Avanzados/concepto01_Ficheros/"
					+ "concepto02_recursos/copiar_fichero/origen/dog-g281ad3d51_1920.jpg");
			
			bytes = archivo_origen.readAllBytes();
			
			archivo_origen.close();
			
			FileOutputStream archivo_destino = new FileOutputStream("C:/Users/navegante/eclipse-workspace/"
					+ "RepasoInvestacion/src/conceptos/paso2_Avanzados/concepto01_Ficheros/"
					+ "concepto02_recursos/copiar_fichero/destino/dog-g281ad3d51_1920.jpg");
			
			archivo_destino.write(bytes);
			
			archivo_destino.close();
			
			
		} catch (IOException e) {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
