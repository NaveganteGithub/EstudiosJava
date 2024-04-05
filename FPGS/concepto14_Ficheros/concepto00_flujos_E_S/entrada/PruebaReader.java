package conceptos.paso2_Avanzados.concepto01_Ficheros.concepto00_flujos_E_S.entrada;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PruebaReader {

	public static void main(String[] args) {
		
		/*
		 * Los ficheros son bytes que se almacenan en un 
		 * dispositivo de almacenamiento persistente
		 * como USB, discos duros internos, etc ...
		 * 
		 * Para acceder a dichos ficheros se pueden utilizar
		 * dos clases de acceso
		 * 
		 * 		Acceso secuencial : que se tiene que recorrer
		 * 		el largo registro de caracteres hasta llegar
		 * 		al caracter deseado
		 * 
		 * 		Acceso directo : que se accedera al caracter
		 * 		en cuestion con una clave de acceso
		 * 
		 * Para utilizar los flujos de entradas de java se 
		 * tiene que utilizar la libreria java.io
		 * 
		 * Hay dos formas de recibir datos
		 * 
		 * 		Mediante caracteres, es decir. que mediante
		 * 		el uso de flujos de datos, podemos leer
		 * 		ficheros de texto escritos en UNICODE
		 * 
		 * 		Mediante bytes, que nos servira para leer
		 * 
		 * 			Datos en binario, por ejemplo, 
		 * 			archivos ejecutable o imagenes
		 * 			
		 * 			Enviar datos a traves de la red
		 * 			
		 * 		 	Trabajar con ficheros, como copiarlos o moverlos
		 * 
		 * Las librerias que se utilizan para recibir datos
		 * son
		 * 
		 *  	FileReader - Caracteres
		 *  
		 *  	FileInputStream - Bytes
		 * 
		 * */
		
		
		// Ejemplo 1 de recibir datos por caracteres
			try {
				
				FileReader entrada = new FileReader("C:/Users/navegante/eclipse-workspace/RepasoInvestigacion/src/conceptos/paso2_Avanzados/concepto01_Ficheros/concepto00_flujos_E_S/entrada/prueba.txt");
				
				int caracteres = entrada.read();
				
				do {
					System.out.print((char) caracteres);
					caracteres = entrada.read();
				} while(caracteres != -1);
				
				entrada.close();
				
				
			} catch (FileNotFoundException e) {
				// TODO: handle exception
				System.out.println("Fichero no encontrado");
			} catch (IOException e) {
				// TODO: handle exception
				System.out.println("Error en el flujo de datos");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error");
			}
		
		System.out.println();
			
		// Ejemplo 2 de recibir datos por caracteres
			try {
				
				FileReader entrada = new FileReader("C:/Users/navegante/eclipse-workspace/RepasoInvestigacion"
						+ "/src/conceptos/paso2_Avanzados/concepto01_Ficheros/concepto00_flujos_E_S/entrada/prueba.txt");
				
				int caracteres = entrada.read();
				
				while(caracteres != -1) {
					System.out.print((char) caracteres);
					caracteres = entrada.read();
				}
				
				entrada.close();
				
				
			} catch (FileNotFoundException e) {
				// TODO: handle exception
				System.out.println("Fichero no encontrado");
			} catch (IOException e) {
				// TODO: handle exception
				System.out.println("Error en el flujo de datos");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error");
			}
			
		System.out.println();
		
		// Ejemplo 1 de recibir datos por bytes
		
			try {

				FileInputStream entrada = new FileInputStream(
						"C:/Users/navegante/eclipse-workspace/RepasoInvestigacion"
						+ "/src/conceptos/paso2_Avanzados/concepto01_Ficheros/"
						+ "concepto00_flujos_E_S/entrada/prueba.txt");
				
				int caracteres = entrada.read();
				
				while(caracteres != -1) {
					System.out.print(caracteres);
					caracteres = entrada.read();
				}
				
				entrada.close();
				
				
			} catch (FileNotFoundException e) {
				// TODO: handle exception
				System.out.println("Fichero no encontrado");
			} catch (IOException e) {
				// TODO: handle exception
				System.out.println("Error en el flujo de datos");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error");
			}
			
		System.out.println();
		
		// Ejemplo 2 de recibir datos por bytes
					
		FileInputStream entrada = null;
		int caracteres, caracter = 0;
		String imagen = null;
			
			try {

				/*imagen = "C:/Users/navegante/eclipse-workspace/RepasoInvestigacion"
						+ "/src/conceptos/paso2_Avanzados/concepto01_Ficheros/"
						+ "concepto00_flujos_E_S/entrada/dog-g281ad3d51_1920.jpg";
				*/
				imagen = "C:/Users/navegante/eclipse-workspace/RepasoInvestigacion"
						+ "/src/conceptos/paso2_Avanzados/concepto01_Ficheros/"
						+ "concepto00_flujos_E_S/entrada/rojo.png";
				
				entrada = new FileInputStream(imagen);
				
				caracteres = entrada.read();
				
				while(caracteres != -1) {
					caracter++;
					System.out.println("Estas leyendo el caracter " + caracter + ": " + caracteres);
					caracteres = entrada.read();
				}
				
				entrada.close();
				
				
			} catch (FileNotFoundException e) {
				// TODO: handle exception
				System.out.println("Fichero no encontrado");
			} catch (IOException e) {
				// TODO: handle exception
				System.out.println("Error en el flujo de datos");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error");
			}
			
		System.out.println();
		
	}
	
}
