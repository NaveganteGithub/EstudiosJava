package cifradoJava.cifrado_sincrono;

import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class Cifrado_Descifrado {

	private static final String AES_CIPHER_ALGORITHM = "AES/CBC/PKCS5PADDING"; 
	
	public Cifrado_Descifrado() {}
	
	public static byte[] crearInicializadorDeVector() {
		
		// Creamos un array de bytes de 16 posiciones
		byte[] vectorInicializado = new byte[16];
		
		// Creamos un numero aleatorio seguro
		SecureRandom secureRandom = new SecureRandom();
		
		// Introducimos en el array de bytes el numero creado 
		secureRandom.nextBytes(vectorInicializado);
		
		return vectorInicializado;
		
	}
	
	public static byte[] encriptacionAES(String texto_a_cifrar, SecretKey clave_secreta, byte[] vectorInicializado) throws Exception {
		
		// Cipher es una clase que nos permitira encriptar o desencriptar texto
		Cipher cifrado = Cipher.getInstance(AES_CIPHER_ALGORITHM);
		
		// IvParameterSpec nos permite inicializar un vector dentro del propio objeto,
		// es decir, mete el array de bytes dentro del IvParameterSpec
		IvParameterSpec ivParameterSpec = new IvParameterSpec(vectorInicializado);
		
		// Iniciaremos el cifrado
		cifrado.init(Cipher.ENCRYPT_MODE, clave_secreta, ivParameterSpec);
		
		// Convertiremos el texto a cifrar en bytes y despues con el objeto Cipher cifraremos el texto
		// y lo introducciremos en un array de bytes
		byte[] texto_cifrado = cifrado.doFinal(texto_a_cifrar.getBytes());
		
		return texto_cifrado;
		
	}
	
	public static String desencriptacionAES(byte[] texto_cifrado, SecretKey clave_secreta, byte[] vectorInicializado) throws Exception {
		
		// Cipher es una clase que nos permitira encriptar o desencriptar texto
		Cipher descifrado = Cipher.getInstance(AES_CIPHER_ALGORITHM);
		
		// IvParamenterSpec nos permite inicializar un vector dentro del propio objeto,
		// es decir, mete el array del bytes dentro del IvParameterSpec
		IvParameterSpec ivParameterSpec = new IvParameterSpec(vectorInicializado);
		
		// Iniciaremos el descifrado
		descifrado.init(Cipher.DECRYPT_MODE, clave_secreta, ivParameterSpec);
		
		// Descifraremos el texto cifrado del array con el objeto Cypher
		byte[] texto_descifrado = descifrado.doFinal(texto_cifrado);
		
		return new String(texto_descifrado);
		
	}
	
}
