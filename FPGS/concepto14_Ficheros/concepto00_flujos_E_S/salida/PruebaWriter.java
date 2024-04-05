package conceptos.paso2_Avanzados.concepto01_Ficheros.concepto00_flujos_E_S.salida;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class PruebaWriter {

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
		 * Para utilizar los flujos de salida de java se 
		 * tiene que utilizar la libreria java.io
		 * 
		 * Hay dos formas de recibir datos
		 * 
		 * 		Mediante caracteres, es decir. que mediante
		 * 		el uso de flujos de datos, podemos leer
		 * 		ficheros de texto escritos en UNICODE
		 * 
		 * 		Mediante bytes, que nos servira para escribir
		 * 
		 * 			Datos en binario, por ejemplo, 
		 * 			archivos ejecutable o imagenes
		 * 			
		 * 			Enviar datos a traves de la red
		 * 			
		 * 		 	Trabajar con ficheros, como copiarlos
		 * 			o moverlos
		 * 
		 * Las librerias que se utilizan para enviar datos son
		 * 
		 *  	FileWriter - Caracteres
		 *  
		 *  	FileOutputStream - Bytes
		 * 
		 * */
		
		// Ejemplo de flujo de dato de salida con FileWriter
		
		try {
			
			// Si haces write para crear un archivo pero sin la ruta, te creara el archivo en la carpeta root de tu proyecto java donde cuelga src
			FileWriter fichero = new FileWriter("prueba.txt");
			
			fichero.write("Hola");
			
			fichero.close();
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Error en el flujo de datos");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		// Ejemplo de flujo de dato de salida con FileOutputWriter
		
		try {

			byte[] caracteres = new byte[1024];
			
			for (int i = 0; i < caracteres.length; i++)
				caracteres[i] = (byte) ((int) (Math.random() * 25) + 97);
				// System.out.println((char)caracteres[i]);
			
			FileOutputStream escribir = new FileOutputStream("C:/Users/navegante/Pictures/prueba.txt");
			
			escribir.write(caracteres);
			
			escribir.close();
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("Fichero no encontrado");
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Error en el flujo de datos");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
