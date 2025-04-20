package paso1_Basico;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Concepto07VariablesTiposDeDatos {
	public static void main(String[] args) {
		
		// Variables, tipos de variables
		// Formas de asignar datos
		
		// Los datos de tipo primitivo: son simplemente datos
		// Los datos de tipo clase: son objetos que nos permiten guardar informacion mas compleja u otros objetos
		
		boolean verdadero, falso;// Solo puedes introduccir dos valores: true y false - Dato de tipo primitivo
		verdadero = true;
		falso = false;
		
		System.out.println(verdadero);
		System.out.println(falso);
		
		short numero_pequeño = 17457;// Solo puedes introduccir numeros de entre -32768 a 32767 - Dato de tipo primitivo
		int numero_normal = 15489511;// Solo puedes introduccir numeros de entre -2147483648 a 2147483647 - Dato de tipo primitivo
		long numero_largo = 2075645684;// Solo puedes introduccir numeros de entre -9223372036854775808 a 9223372036854775807 - Dato de tipo primitivo
		
		System.out.println(numero_pequeño);
		System.out.println(numero_normal);
		System.out.println(numero_largo);
		
		float numero_con_coma_corto = 456464.321f;// Solo puedes introduccir numeros decimales - Dato de tipo primitivo
		double numero_con_coma_largo = 5456465441455.1551;// Solo puedes introduccir numeros decimales grandes - Dato de tipo primitivo
		
		System.out.println(numero_con_coma_corto);
		System.out.println(numero_con_coma_largo);
		
		byte caracteres = 'a';// Solo puedes introduccir numeros de entre -128 a 127 o un byte alfanumerico o metacaracteres - Dato de tipo primitivo
		byte caracteres_2 = 1;
		/* 
		 * Puedes introduccir cadenas de texto de todo tipo, alfanumericos con 
		 * metacaracteres - Dato guardado en un objeto de clase String
		 * 
		 * Como curiosidad Java no tiene una variable de tipo de dato primitivo para
		 * almacenar cadenas, pero, si que tiene una clase que permite el almacenaje
		 * de cadenas, String
		 * 
		 * */
		String cadenas = "Esto es una cadena";
		
		System.out.println(caracteres);
		System.out.println(caracteres_2);
		System.out.println(cadenas);
		
		byte[] array_bytes = new byte[4]; // Solo puedes introduccir un conjunto de bytes - Array
		
		array_bytes[0] = 'a';
		array_bytes[1] = '3';
		array_bytes[2] = '(';
		array_bytes[3] = '-';
		
		System.out.println(array_bytes[0]);
		System.out.println(array_bytes[1]);
		System.out.println(array_bytes[2]);
		System.out.println(array_bytes[3]);
		System.out.println(array_bytes);
		
		byte[] bytes = "hola".getBytes();
		
		System.out.println("Prueba de bytes");
		System.out.println(bytes[0]);
		System.out.println((char) bytes[0]);
		System.out.println(bytes[1]);
		System.out.println((char) bytes[1]);
		
		short[] numeros_cortos = new short[4];
		numeros_cortos[0] = 2010;
		numeros_cortos[1] = 2011;
		numeros_cortos[2] = 2012;
		numeros_cortos[3] = 2013;
		
		System.out.println("Numeros cortos");
		System.out.println(numeros_cortos[0]);
		System.out.println(numeros_cortos);
		
		short numeros_cortos_[] = {2010, 2011, 2012, 2013};

		System.out.println("Numeros cortos en llaves");
		System.out.println(numeros_cortos_[0]);
		numeros_cortos_[0] = 2011;
		
		System.out.println();
		
		// // Solo puedes introduccir numero enteros gigantes - Dato guardado en un objeto de clase BigInteger
		BigInteger numero_gigante = new BigInteger("777777777777777777777");
		System.out.println("Numero gigante\n" + numero_gigante);
		
		BigInteger numero_gigante_2 = new BigInteger("77777777777777777777745"
				+ "54676841564646789237"
				+ "42738947235893465365"
				+ "93645784678346578347"
				+ "85678346586376574537"
				+ "56868683274939729498"
				+ "93277389");
		System.out.println("Numero gigante\n" + numero_gigante_2);

		BigInteger numero_gigante_3 = new BigInteger("777777777777777777777459364578467834657834785678346586376574537");
		System.out.println("Numero gigante\n" + numero_gigante_3);
		
		// Solo puedes introduccir numero enteros con decimales gigantes - Dato guardado en un objeto de clase BigDecimal
		BigDecimal decimal_gigante = new BigDecimal("156484789489561"
				+ "44985456488945646"
				+ "54987897456479879"
				+ "8448987987.564464"
				+ "65456498489484848"
				+ "99856165498");
		
		System.out.println("Decimal gigante\n" + decimal_gigante);
			// Teoria: a mas grande el numero almacenado en la clase BigInteger
			// mas espacio ocupara
		
		System.out.println("Formas de asignar datos");
		
		int r1;
		int f1 = 23;
		f1 += 20;
		System.out.println(f1);
		f1 -= 10;
		System.out.println(f1);
		f1 *= 12;
		System.out.println(f1);
		f1 /= 12;
		System.out.println(f1);
		f1 %= 3;
		System.out.println(f1);
		r1 = f1; 
		System.out.println(r1);
		
		/* 
		 * Ambito de las variables: son bloques de codigo
		 * como condicionales o bucles
		 * 
		 * Como regla general las variables declaradas
		 * dentro de un ambito no son accesibles fuera
		 * de dicho ambito
		 * 
		 * Recordad que Java, es un lenguaje orientado a 
		 * objetos, pero cosas como variables, if, el if
		 * else o los bucles, hacen que Java tenga parte
		 * de programacion funcional, por lo que podemos
		 * decir, que Java, no es puro al 100%
		 * 
		 * */
		
		String v1 = "Variable fuera del ambito";
		
		if (v1 != "") { // Este es un ejemplo de ambito o bloque de codigo
			String v2 = "Variable dentro del ambito";
			/* 
			 * Este funciona porque v1 esta fuera del ambito, y 
			 * el System.out.println esta dentro del ambito
			 *  
			 * */
			System.out.println(v1);
			/* 
			 * Este funciona porque v2 esta dentro del ambito, y 
			 * el System.out.println esta dentro del ambito
			 *  
			 * */
			System.out.println(v2);
			
		}
		/* 
		 * Este funciona porque v1 esta fuera del ambito, y 
		 * el System.out.println esta fuera del ambito
		 *  
		 * */
		System.out.println(v1);
		/* 
		 * Este no funciona porque v2 esta dentro del ambito y 
		 * el System.out.println esta fuera del ambito
		 *  
		 * */
		// System.out.println(v2); // Da error
		
	}
}
