package cifradoJava.cifrado_asincrono;

import java.math.BigInteger;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Scanner;

public class Cifrado_Asincrono {

	public static void main(String[] args) {
		
		// TODO Cifrado Asincrono
		
		/*
		 * Es un tipo de cifrado en el que se generan una :
		 * 		clave Publica : es una clave que nos ayuda a cifrar texto,
		 * 		esta tiene que ser enviada a la persona con la que quieres
		 * 		escribirte por internet
		 * 		clave Privada : es una clave que nos ayuda a cifrar y descifrar texto,
		 * 		está no tiene que ser enviada, ni publicada, en internet, ya que, esta
		 * 		es un clave secreta, que no debe de saber nadie mas que el usuario
		 * 
		 * Este tipo de cifrado se utiliza cuando queremos proteger datos que esten
		 * en movimiento, como por ejemplo en un chat o una VPN, para entender esto
		 * diremos que este cifrado se utiliza cuando queremos enviar datos a algun
		 * lugar en la red.
		 * 
		 * */
		
		String texto = "Este texto es una prueba";
		System.out.println("Texto a encriptar: " + texto + "\n");
		
		try(Scanner read = new Scanner(System.in)) {
			
			// 1º Generamos un clave publica y privada
			
			System.out.println("1º Generamos una clave publica y privada.");
			
			// ---------------- Generamos las claves ---------------------------
			
			KeyPair keypair = GeneradorClaves.generadorRSAclavePar();
			PrivateKey clave_Privada = keypair.getPrivate();
			PublicKey clave_Publica = keypair.getPublic();
			
			byte[] clave_publica = clave_Publica.getEncoded();
			byte[] clave_privada = clave_Privada.getEncoded();
			
			// clave_publica = keypair.getPublic().getEncoded();
			// clave_privada = keypair.getPrivate().getEncoded();
			
			// --------------- Codificamos a hexadecimal ----------------------
			
			BigInteger codificacion;
			
			codificacion = new BigInteger(1, clave_publica);
			
			System.out.println("\tClave Publica: " + codificacion.toString(16));
			
			codificacion = new BigInteger(1, clave_privada);
			
			System.out.println("\tClave Privada: " + codificacion.toString(16));
			
			// System.out.println(codificacion.toString(16).length());
			// System.out.println(new BigInteger(1, clave_Privada.getEncoded()).toString(16));
			
			// 2º Encriptamos el texto
			
			System.out.println("2º Encriptar el texto.");
			
			// ---------------------- Ciframos el texto --------------------------
			
			byte[] textoCifrado = Cifrado_Descifrado.encriptacionRSA(texto, clave_Publica);
			
			// ---------------- Codificamos a hexadecimal ------------------------
			
			BigInteger codificacion2 = new BigInteger(1, textoCifrado);
			
			System.out.println("\tTexto encriptado: " + codificacion2.toString(16));
			
			// 3º Desencriptamos el texto
			
			System.out.println("3º Desencriptar el texto.");
			
			String textoDescifrado = Cifrado_Descifrado.desencriptacionRSA(textoCifrado, clave_Privada);
			
			System.out.println("\tTexto desencriptado: " + textoDescifrado);
			
			read.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// https://www.geeksforgeeks.org/asymmetric-encryption-cryptography-in-java/
		// https://ciberseguridad.com/servicios/algoritmos-cifrado/
		
	}

}
