package conceptos.paso2_Avanzados.concepto03_Seguridad_Cifrados.cifrar_texto.cifrado_sincrono;

import java.security.SecureRandom;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class GeneradorClaves {

	private static final String AES = "AES";
	
	GeneradorClaves() {}
	
	public static SecretKey crearClaveAES() throws Exception {
		
		/* 
		 * Esta clase sirve para pedir un generador 
		 * de numero aleatorio o RNG fuerte criptograficamente
		 * 
		 * Un Numero Aleatorio fuerte criptograficamente
		 * es un numero generado aleatoriamente y que 
		 * cumple minimo las pruebas especificadas en
		 * los estandares de Generador de Numero Aleatorio :
		 * 			FIPS 140-2
		 * 			Security Requirements for Cryptographic Modules
		 * que son estandares para comprobar si el Generador de Numero 
		 * Aleatorio a generado un numero que sea fuerte Criptograficamente
		 * 
		 * Para mi sintetización personal digo que SecureRandom es como el
		 * Random pero para generar numeros aleatorios decimales para la
		 * Criptografia, pues si miramos la clase SecureRandom podemos
		 * comprobar que SecureRandom es una clase "hijo" de la clase
		 * java.util.Random, o sea de la clase Random.
		 * 
		 * */
		SecureRandom secureRandom = new SecureRandom();
		
		// Este sirve para generar una clave de cifrado 
		// (Para generar una clave publica y otra privada 
		// se necesita la clase KeyPairGenerator)
		KeyGenerator keyGenerador = KeyGenerator.getInstance(AES);
		
		// Inicializamos el generador de claves indicando que la clave
		// AES tendra 256 bits de longitud
		keyGenerador.init(256, secureRandom);
		
		// Generamos la clave
		SecretKey secretKey = keyGenerador.generateKey();
		
		return secretKey;
		
	}
	
	
	
}
