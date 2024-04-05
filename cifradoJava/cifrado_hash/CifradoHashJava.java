package conceptos.paso2_Avanzados.concepto03_Seguridad_Cifrados.cifrar_texto.cifrado_hash;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class CifradoHashJava {

	public static void main(String[] args) {
		
		// TODO Cifrado Hash
		
		/*
		 * Nos permite cifrar unidireccionalmente un texto, es decir, cifras y ya no puedes 
		 * descifrar de nuevo el texto
		 * 
		 * */

		System.out.println("Cifrar textos y que sea compatible con PHP");
		// Cifrado de texto, compatible con PHP
		// PHP tiene una funcion de encriptado llamada hash que nos permite cifrar texto,
		// pues el formato de cifrado son con caracteres UTF-8 y en formato hexadecimal 
		System.out.println("1º Haremos try-catch con la excepcion NoSuchAlgorithmException.");
		System.out.println();
		try {

			String contraseña = "Pepito23!\"";
			// contraseña = "hello";
			System.out.println("2º Capturas el texto -\n" + contraseña);
			System.out.println();
			
			// ---------------------------------------------------------
			
			// Cada numerito mostrado en el array es un caracter de la cadena representado en UTF-8,
			// si quisieramos pasarlo a ASCII solo se pondria getbytes() sin StandardCharsets.UTF-8.
			byte[] paso_a_byte = contraseña.getBytes(StandardCharsets.UTF_8); // UTF-8
			// paso_a_byte = contraseña.getBytes(); // ASCII
			System.out.println("3º Ese texto lo transformamos a bytes con una condificacion estandar UTF-8 -\n" + Arrays.toString(paso_a_byte));
			System.out.println();
			
			// ---------------------------------------------------------
			
			MessageDigest tipo_cifrado_elegido;
			// tipo_cifrado_elegido = MessageDigest.getInstance("SHA-512");
			// tipo_cifrado_elegido = MessageDigest.getInstance("SHA-384");
			tipo_cifrado_elegido = MessageDigest.getInstance("SHA-256");
			// tipo_cifrado_elegido = MessageDigest.getInstance("SHA-1");
			// tipo_cifrado_elegido = MessageDigest.getInstance("MD5");
			// tipo_cifrado_elegido = MessageDigest.getInstance("MD4");
			// tipo_cifrado_elegido = MessageDigest.getInstance("MD2");
			System.out.println("4º Eliges el tipo del cifrado que se va emplear en este caso SHA-256.");
			System.out.println();
			
			// ---------------------------------------------------------
			
			byte[] cifrado = tipo_cifrado_elegido.digest(paso_a_byte);
			System.out.println("5º Aplicar el cifrado -\n" + Arrays.toString(cifrado));
			System.out.println();
			
			// ---------------------------------------------------------
			
			// Los parametros del constructor del BigInteger son
			// 	 El signo de numero donde 
			//		1 indicas que es un numero positivo
			//		0 indicas que es un cero
			//		-1 indicas que es un numero negativo
			//   El array de bytes resultante del cifrado
			// Recuerda que cada byte del array de bytes se representa mediante 
			// un numero segun el estandar UTF-8 (alternativa a ASCII) y que podemos pasarlo directamente
			// a un numero decimal con BigInteger
			BigInteger codificacion = new BigInteger(1, cifrado);
			System.out.println("6º Pasar el array de bytes resultante del cifrado a un numero decimal -\n" + codificacion);
			System.out.println();
			
			// ---------------------------------------------------------
			
			// Para pasar un numero a formato hexadecimal, hay que indicar en el metodo toString que
			// queremos el formato hexadecimal lo cualo se indica mediente el numero 16 representando
			// los dieciseis digitos de la codificacion hexadecimal
			String formato = new String(codificacion.toString(16));
			
			System.out.println("7º Pasar el numero decimal del cifrado a un formato hexadecimal, "
					+ "y para ello diremos -\n" + formato);
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
			// https://www.php.net/manual/en/function.hash.php
			// https://www.baeldung.com/sha-256-hashing-java
			// https://www.varsitytutors.com/hotmath/hotmath_help/spanish/topics/hexadecimal-numbers
			// https://www.geeksforgeeks.org/sha-256-hash-in-java/
		
		
	}

}
