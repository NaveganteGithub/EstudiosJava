package conceptos.paso1_Basicos;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Concepto08Conversiones {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		// Conversiones de tipos de datos
		
		// Convertir de 
		
		// boolean a String
		
		String verdad, falacia;
		verdad = String.valueOf(true);
		falacia = String.valueOf(false);
		
		// String a boolean
		boolean $verdad, $falso;
		$verdad = Boolean.valueOf(verdad);
		$falso = Boolean.valueOf(falacia);
		
		System.out.println($verdad);
		System.out.println($falso);
		
		// String a byte
			System.out.println("De String a Bytes");
			String cadena = "mi cadena 15746";
			byte[] bytes_recogidos = cadena.getBytes();
			
				// Para visualizar el array
				System.out.println("Bytes recogidos");
				for (byte b : bytes_recogidos) {
					System.out.println(b + " - " + (char) b);
				}
			
			// byte a String
			
			// Metodo 1
			System.out.println("De Bytes a String");
			String convertida = "";
			/*
			 * Se utliza un for-each para recorrer el array
			 * despues para convertir un char en un String,
			 * ponemos la variable String del for-each "+="
			 * para ir concatenando el texto, que debera de
			 * ser convertido con (char) de la variable b y
			 * por ultimo se debe de concatenarlo todo, con
			 * una cadena vacia que se debe pondra al final
			 * 
			 * */
			for (byte b : bytes_recogidos) {
				convertida += (char) b + "";
			}
			
			System.out.println("Metodo 1 - " + convertida);
			
			// Metodo 2
			// https://www.techiedelight.com/es/convert-char-string-java-5-different-ways/#:~:text=Convertir%20un%20char%20en%20una%20string%20de%20Java,strings%20...%205%205.%20Uso%20String.format%20%28%29%20m%C3%A9todo
			// Tambien vale si instancias un objeto de tipo String
			String convertida_2 = new String(bytes_recogidos);
			System.out.println("Metodo 2 - " + convertida_2);
			
			/* 
			 * El metodo 1 es mas versatil, debido a que le 
			 * puedes agregar mas funcionalidad a la conversion.
			 * 
			 * El metodo 2 es mas ligero, debido a que solo es instanciar
			 * un objeto de Java, es un codigo mas limpio para leer, debido
			 * a que solo es una instruccion a leer.
			 * 
			 * */
			
			// String a long, int, short, double, float
			
			String numero = "7000";
			
			short corto;
			int normal;
			long largo;
			float corto_coma;
			double largo_coma;
			
			corto = Short.valueOf(numero);
			normal = Integer.valueOf(numero);
			largo = Long.valueOf(numero);
			corto_coma = Float.valueOf(numero);
			largo_coma = Double.valueOf(numero);
			
			System.out.println("Short - " + corto);
			System.out.println("Integer - " + normal);
			System.out.println("Long - " + largo);
			System.out.println("Float - " + corto_coma);
			System.out.println("Long - " + largo_coma);
			
			// Long, int, short, double, float a String
			
			String num1, num2, num3, num4, num5;
			num1 = String.valueOf(corto);
			num2 = String.valueOf(normal);
			num3 = String.valueOf(largo);
			num4 = String.valueOf(corto_coma);
			num5 = String.valueOf(largo_coma);
			
			System.out.println("Short convertido a String - " + num1);
			System.out.println("Integer convertido a String - " + num2);
			System.out.println("Long convertido a String - " + num3);
			System.out.println("Double convertido a String - " + num4);
			System.out.println("Float convertido a String - " + num5);
			
			// Conversion entre tipos de numeros
			
			int convertido_1;
			long convertido_2;
			double convertido_3;
			short convertido_4;
			float convertido_5;
			
			convertido_1 = corto;
			convertido_2 = corto;
			convertido_3 = corto;
			convertido_4 = corto;
			convertido_5 = corto;
			
			convertido_2 = normal;
			convertido_3 = normal;
			convertido_5 = normal;
			
			convertido_2 = largo;
			convertido_3 = largo;
			convertido_5 = largo;

			convertido_3 = corto_coma;
			
			convertido_3 = largo_coma;
			
			System.out.println(convertido_1);
			System.out.println(convertido_2);
			System.out.println(convertido_3);
			System.out.println(convertido_4);
			System.out.println(convertido_5);
			
				// Nota: no puedes convertir un tipo de dato 
				// grande a un tipo de dato mas pequeño, por
				// ejemplo de un long a un short
			
			// Conversiones de numeros a BigInteger o BigDecimal
			
			BigInteger numero_grande_1 = new BigInteger(String.valueOf(convertido_1));
			BigInteger numero_grande_2 = new BigInteger(String.valueOf(convertido_2));
			BigInteger numero_grande_3 = new BigInteger(String.valueOf(convertido_4));
			
			BigDecimal decimal_grande_1 = new BigDecimal(String.valueOf(convertido_3));
			BigDecimal decimal_grande_2 = new BigDecimal(String.valueOf(convertido_5));
			
			System.out.println(numero_grande_1);
			System.out.println(numero_grande_2);
			System.out.println(numero_grande_3);

			System.out.println(decimal_grande_1);
			System.out.println(decimal_grande_2);
			
	}

}
