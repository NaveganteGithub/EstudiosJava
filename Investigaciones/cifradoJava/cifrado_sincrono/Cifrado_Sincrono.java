package cifradoJava.cifrado_sincrono;

import java.math.BigInteger;

import javax.crypto.SecretKey;

public class Cifrado_Sincrono {

	public static void main(String[] args) {
		
		// TODO Cifrado Sincrono
		
		/*
		 * Para empezar diremos que la criptografia es el estudio de las diferentes tecnicas que nos permite
		 * asegurar datos a una entidad inautorizada. En ciencias de la computación, nosotros comprobamos el 
		 * desarrollo de estrategias y practicas para proteger datos sensibles. 
		 * 
		 * Mucha de la criptografia incluye el uso de funciones matematicas muy avanzadas, para proteccion de
		 * los datos.
		 * 
		 * El proposito de los algoritmos desarrollados para la criptografia es la ocultación de datos de los
		 * ataques de middleman (o hombre del medio)
		 * 
		 * Despues de conseguir introduccinos al concepto, seguiremos primeramente entendiendo unos pocos 
		 * terminos clave (o puntos clave) incluidos en la criptografia. Son :
		 * 
		 * 		Texto plano: El texto plano es el mensaje original o dato que esta oculto hacia la vista a 
		 * 		traves de un algoritmo de encriptacion criptografico
		 * 		
		 * 		Cipher Text o texto Cifrado: Esta es la salida de la opracion de Encriptación cuando se administra da la 
		 * 		clave y el texto plano. Tambien son datos alimentando a una funcion criptografica.
		 * 
		 * 		Key o Clave: La clave es una trozo de dato o un par de datos correlacionada que cuando se introduce 
		 * 		con texto plano dentro de una funcion criptografica cifrara el texto.
		 * 
		 * 		Salt: Un Salt es un trozo aleatorio de dato, que cuando es agregando a la funcion hashing, provee incluso
		 * 		la entropia (fiabilidad) en la salida, hacer que los ataques sean menos frecuentes.
		 * 
		 * */
		
		/*
		 * Las claves de cifrado Simetricas sirve para cifrar datos, 
		 * que se almacenara en algun dispositivo de almacenamiento,
		 * base de datos, o la nube
		 * */
		
		String texto = "Bienvenido a casa";
		System.out.println("1º Capturamos el texto a cifrar");
		System.out.println("\tTexto a cifrar: " + texto);
		
		try {
			
			System.out.println("2º Generamos la clave de cifrado.");
			// --------------------- Generamos la clave ------------------------------------
			
			SecretKey claveSimetrica = GeneradorClaves.crearClaveAES();
			
			// Convertiremos el objeto SecretKey en bytes que guardaran en un array de bytes
			byte[] clave = claveSimetrica.getEncoded();
			
			// Podemos ver la clave si la pasamos a traves de un BigInteger para convertir los
			// bytes en un decimal
			BigInteger codificacion = new BigInteger(1, clave);
			
			// Y luego la pasamos a un toString para pasarla a hexadecimal
			System.out.println("\tClave creada: " + codificacion.toString(16));
			
			// ------------ Inicializamos la generacion de una clave -------------------------
			
			byte[] inicializarVector = Cifrado_Descifrado.crearInicializadorDeVector();
			
			System.out.println("3º Encriptaremos el texto.");
			// ---------------------- Encriptamos el texto ------------------------------------
			
			byte[] texto_cifrado = Cifrado_Descifrado.encriptacionAES(texto, claveSimetrica, inicializarVector);
			
			// Podemos ver el texto encriptado convirtiendo los bytes a un numero decimal 
			// con el objeto BigInteger
			codificacion = new BigInteger(1, texto_cifrado);
			
			// Convertiremos el Decimal del BigInteger en un numero hexadecimal
			System.out.println("\tTexto encriptado: " + codificacion.toString(16));
			
			System.out.println("4º Desencriptaremos el texto.");
			// ---------------------- Desciframos el texto ------------------------------------
			
			String texto_descifrado = Cifrado_Descifrado.desencriptacionAES(texto_cifrado, claveSimetrica, inicializarVector);
			
			System.out.println("\tTexto descifrado: " + texto_descifrado);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// https://www.geeksforgeeks.org/symmetric-encryption-cryptography-in-java/?ref=lbp

	}

}
