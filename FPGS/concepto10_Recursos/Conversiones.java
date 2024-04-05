package conceptos.paso1_Basicos.concepto10_Recursos;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Conversiones {

	public static void main(String[] args) {
		
		// TODO Conversiones

		char[] caracteres; 
		byte[] valor;
		String texto;
		byte numero_cortisimo;
		short numero_corto;
		int numero_normal;
		long numero_largo;
		float decimal_corto;
		double decimal_largo;
		
		// Convertiremos el valor mas pequeño al mas grande
		
		numero_cortisimo = 7; // Inicializacion
		numero_corto = numero_cortisimo; // Pasar de un valor byte a short
		numero_normal = numero_corto; // Pasar de un valor short a int
		numero_largo = numero_normal; // Pasar de un valor int a long
		decimal_corto = numero_largo; // Pasar de un valor long a float
		decimal_largo = decimal_corto; // Pasar de un valor float a double
		
		/* 
		 * Cosas a tener en cuenta
		 * 
		 * 1º Puedes saltarte algunos pasos directamente como 
		 * por ejemplo convertir un tipo short en un tipo float
		 * 
		 * 2º El paso de un tipo valor pequeño a un tipo de
		 * valor grande es mas permisivo que cambiar a un
		 * pequeño, debido a que las variables de un tipo
		 * de dato muy grandes pueden sorportar los datos
		 * de una variable con un tipo de dato mas pequeño 
		 * 
		 * */
		
		numero_corto = 8;
		decimal_corto = numero_corto;
		
		// Convertiremos el valor mas grande al mas pequeño
		
		decimal_largo = 73;
		decimal_corto = (float) decimal_largo; // Pasar de un valor double a float
		numero_largo = (long) decimal_corto; // Pasar de un valor float a long 
		numero_normal = (int) numero_largo; // Pasar de un valor long a int
		numero_corto = (short) numero_normal; // Pasar de un valor int a short 
		numero_cortisimo = (byte) numero_corto; // Pasar de un valor short a byte 
		
		/*
		 * Cosas a tener en cuenta
		 * 
		 * A la hora de pasar un valor a una variable de tipo de dato grande
		 * a una variable con un tipo de dato pequeño, tienes que tener cuidado
		 * de no pasar un dato demasiado grande como para ser soportado por una
		 * variable de tipo de dato mas pequeño
		 * 
		 * */
		
		/* 
		 * Podemos pasarlo sin problema porque el dato que hay en la variable de tipo
		 * de dato grande 73 es lo suficientemente pequeño como para su conversion 
		 * */
		
		numero_cortisimo = (byte) decimal_largo; 
		
		/* 
		 * Aqui podemos observar que aqui daria error porque estamos transfiriendo un 
		 * demasiado grande como para transferirlo a una variable dato pequeño
		 * */
		decimal_largo = 2147400000;
		numero_corto = (short) decimal_largo;
		System.out.println("Numero falso: " + numero_corto);
		
		// Convertiremos el byte a String
		
		valor = new byte[4];
		valor[0] = 97;
		valor[1] = 98;
		valor[2] = 99;
		valor[3] = 100;
		
		texto = new String(valor);
		System.out.println(texto);
		
		// Convertiremos el String en byte
		
		valor = texto.getBytes();
		
		// Convertiremos el char a String
		
		caracteres = new char[4];
		caracteres[0] = 97;
		caracteres[1] = 98;
		caracteres[2] = 99;
		caracteres[3] = 100;
		
		texto = new String(caracteres);
		System.out.println(texto);
		
		// Convertiremos el String en char
		
		caracteres = texto.toCharArray();
		
		// Convertir String a valor numerico
		
		String minimo = "1", 
				corto = "2500", 
				normal = "14001452", 
				largo = "15614564545456448", 
				flotante = "565464.55", 
				doble = "4354564646546.51465145646";
		
		numero_cortisimo = Byte.parseByte(minimo);
		numero_corto = Short.parseShort(corto);
		numero_normal = Integer.parseInt(normal);
		numero_largo = Long.parseLong(largo);
		decimal_corto = Float.parseFloat(flotante);
		decimal_largo = Double.parseDouble(doble);
		
		// Convertir valor numerico en String
		
		texto = String.valueOf(decimal_largo);
		System.out.println(texto);
		// Si utilizamos String.valueOf pasaremos el valor decimal
		// de la variable, pero si utilizamos new String podemos
		// decir que
		texto = String.valueOf(numero_cortisimo); 
		System.out.println(texto);
		
		// https://www.w3schools.com/java/java_type_casting.asp
		
		// Conversiones de numeros a BigInteger o BigDecimal
		
		BigInteger numero_1 = new BigInteger(String.valueOf(numero_corto));
		BigInteger numero_2 = new BigInteger(String.valueOf(numero_normal));
		BigInteger numero_3 = new BigInteger(String.valueOf(numero_largo));
		
		BigDecimal decimal_1 = new BigDecimal(String.valueOf(decimal_corto));
		BigDecimal decimal_2 = new BigDecimal(String.valueOf(decimal_largo));
		
		System.out.println(numero_1);
		System.out.println(numero_2);
		System.out.println(numero_3);

		System.out.println(decimal_1);
		System.out.println(decimal_2);
	}

}
