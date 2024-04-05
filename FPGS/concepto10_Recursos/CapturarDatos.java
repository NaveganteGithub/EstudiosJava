package conceptos.paso1_Basicos.concepto10_Recursos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class CapturarDatos {

	public static void main(String[] args) {
		
		// TODO Capturar Datos
		
		boolean verdadero; // Solo puedes introduccir dos valores: true y false - Dato de tipo primitivo
		byte n1; // Solo puedes introduccir numeros de entre -128 a 127 o un byte alfanumerico o metacaracteres - Dato de tipo primitivo
		short n2; // Solo puedes introduccir numeros de entre -32768 a 32767 - Dato de tipo primitivo
		int n3; // Solo puedes introduccir numeros de entre -2147483648 a 2147483647 - Dato de tipo primitivo
		long n4; // Solo puedes introduccir numeros de entre -9223372036854775808 a 9223372036854775807 - Dato de tipo primitivo
		float n5; // Solo puedes introduccir numeros decimales - Dato de tipo primitivo
		double n6; // Solo puedes introduccir numeros decimales grandes - Dato de tipo primitivo
		BigInteger n7; // Solo puedes introduccir numero enteros gigantes - Dato guardado en un objeto de clase BigInteger
		BigDecimal n8; // Solo puedes introduccir numero enteros con decimales gigantes - Dato guardado en un objeto de clase BigDecimal
		String n9; // Solo puedes introduccir cadenas de texto - Dato guardado en un objeto de clase String
		char n10; // Solo puedes introduccir un caracter - Dato de tipo primitivo
		byte[] n11; // Solo puedes introduccir un conjunto de bytes - Array
		char[] n12; // Solo puedes introduccir un conjunto de caracteres alfanumericos y/o metacaracteres - Array
		
		// Con Scanner
		Scanner read = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		n1 = read.nextByte(); // Para introduccir un tipo de dato
		System.out.println("Devuelve: " + n1);
		System.out.print("Introduce un numero: ");
		// Cuando utilizas un metodo hasNext lo que haces es hacer que el usuario introduce un dato
		// y cuando lo introduce averigua si el usuario realmente a introducido o no el valor que 
		// has pedido
		verdadero = read.hasNextByte();
		System.out.println("El usuario a introducido byte en buffer por el objeto Scanner? " + verdadero);
		
		System.out.print("Introduce un numero: ");
		n2 = read.nextShort(); // Para introduccir un tipo de dato
		System.out.println("Devuelve: " + n2);
		System.out.print("Introduce un numero: ");
		// Cuando utilizas un metodo hasNext lo que haces es hacer que el usuario introduce un dato
		// y cuando lo introduce averigua si el usuario realmente a introducido o no el valor que 
		// has pedido
		verdadero = read.hasNextShort();
		System.out.println("El usuario a introducido short en buffer por el objeto Scanner? " + verdadero);
		System.out.print("Introduce un numero del 0 al 7: ");
		// Al indicar un numero por parametro, en un metodo next 
		// numerico le indicas que el numero maximo que se puede
		// introduccir es el numero indicado por paramentro para
		// este caso es 7
		n2 = read.nextShort(7); 
		System.out.println("Devuelve: " + n2);
		System.out.print("Introduce un numero: ");
		// Cuando utilizas un metodo hasNext lo que haces es hacer que el usuario introduce un dato
		// y cuando lo introduce averigua si el usuario realmente a introducido o no el valor que 
		// has pedido
		verdadero = read.hasNextShort();
		System.out.println("El usuario a introducido short en buffer por el objeto Scanner? " + verdadero);
		
		System.out.print("Introduce un numero: ");
		n3 = read.nextInt();// Para introduccir un tipo de dato
		System.out.println("Devuelve: " + n3);
		System.out.print("Introduce un numero: ");
		// Cuando utilizas un metodo hasNext lo que haces es hacer que el usuario introduce un dato
		// y cuando lo introduce averigua si el usuario realmente a introducido o no el valor que 
		// has pedido
		verdadero = read.hasNextInt();
		System.out.println("El usuario a introducido int en buffer por el objeto Scanner? " + verdadero);
		System.out.print("Introduce un numero del 0 al 4: ");
		// Al indicar un numero por parametro, en un metodo next 
		// numerico le indicas que el numero maximo que se puede
		// introduccir es el numero indicado por paramentro para
		// este caso es 4
		n3 = read.nextInt(4);
		System.out.println("Devuelve: " + n3);
		System.out.print("Introduce un numero: ");
		// Cuando utilizas un metodo hasNext lo que haces es hacer que el usuario introduce un dato
		// y cuando lo introduce averigua si el usuario realmente a introducido o no el valor que 
		// has pedido
		verdadero = read.hasNextInt();
		System.out.println("El usuario a introducido int en buffer por el objeto Scanner? " + verdadero);
		
		System.out.print("Introduce un numero: ");
		n4 = read.nextLong();// Para introduccir un tipo de dato
		System.out.println("Devuelve: " + n4);
		System.out.print("Introduce un numero: ");
		verdadero = read.hasNextLong();
		System.out.println("El usuario a introducido long en buffer por el objeto Scanner? " + verdadero);
		System.out.print("Introduce un numero: ");
		// Al indicar un numero por parametro, en un metodo next 
		// numerico le indicas que el numero maximo que se puede
		// introduccir es el numero indicado por paramentro para
		// este caso es 3
		n4 = read.nextLong(3);
		System.out.println("Devuelve: " + n4);
		System.out.print("Introduce un numero: ");
		verdadero = read.hasNextLong();
		System.out.println("El usuario a introducido long en buffer por el objeto Scanner? " + verdadero);
		
		System.out.print("Introduce un numero con decimal: ");
		n5 = read.nextFloat();// Para introduccir un tipo de dato
		System.out.println("Devuelve: " + n5);
		System.out.print("Introduce un numero con decimal: ");
		// Cuando utilizas un metodo hasNext lo que haces es hacer que el usuario introduce un dato
		// y cuando lo introduce averigua si el usuario realmente a introducido o no el valor que 
		// has pedido
		verdadero = read.hasNextFloat();
		System.out.println("El usuario a introducido float en buffer por el objeto Scanner? " + verdadero);
		
		System.out.print("Introduce un numero con decimal: ");
		n6 = read.nextDouble();// Para introduccir un tipo de dato
		System.out.println("Devuelve: " + n6);
		System.out.print("Introduce un numero con decimal: ");
		// Cuando utilizas un metodo hasNext lo que haces es hacer que el usuario introduce un dato
		// y cuando lo introduce averigua si el usuario realmente a introducido o no el valor que 
		// has pedido
		verdadero = read.hasNextDouble();
		System.out.println("El usuario a introducido double en buffer por el objeto Scanner? " + verdadero);
		
		System.out.print("Introduce un numero: ");
		n7 = read.nextBigInteger();// Para introduccir un tipo de dato
		System.out.println("Devuelve: " + n7);
		System.out.print("Introduce un numero: ");
		// Cuando utilizas un metodo hasNext lo que haces es hacer que el usuario introduce un dato
		// y cuando lo introduce averigua si el usuario realmente a introducido o no el valor que 
		// has pedido
		verdadero = read.hasNextBigInteger();
		System.out.println("El usuario a introducido BigInteger en buffer por el objeto Scanner? " + verdadero);
		
		System.out.print("Introduce un numero con decimal: ");
		n8 = read.nextBigDecimal();// Para introduccir un tipo de dato
		System.out.println("Devuelve: " + n8);
		System.out.print("Introduce un numero con decimal: ");
		// Cuando utilizas un metodo hasNext lo que haces es hacer que el usuario introduce un dato
		// y cuando lo introduce averigua si el usuario realmente a introducido o no el valor que 
		// has pedido
		verdadero = read.hasNextBigDecimal();
		System.out.println("El usuario a introducido BigDecimal en buffer por el objeto Scanner? " + verdadero);
		
		System.out.print("Introduce un texto sin espacios en blanco: ");
		n9 = read.next();// Para introduccir un tipo de dato
		System.out.println("Devuelve: " + n9);
		System.out.print("Introduce un texto sin espacios en blanco: ");
		// Cuando utilizas un metodo hasNext lo que haces es hacer que el usuario introduce un dato
		// y cuando lo introduce averigua si el usuario realmente a introducido o no el valor que 
		// has pedido
		verdadero = read.hasNext();
		System.out.println("El usuario a introducido texto sin espacios en blanco en buffer por el objeto Scanner? " + verdadero);
		System.out.print("Introduce un texto con espacios en blanco: ");
		n9 = read.nextLine();// Para introduccir un tipo de dato
		System.out.println("Devuelve: " + n9);
		System.out.print("Introduce un texto sin espacios en blanco: ");
		// Cuando utilizas un metodo hasNext lo que haces es hacer que el usuario introduce un dato
		// y cuando lo introduce averigua si el usuario realmente a introducido o no el valor que 
		// has pedido
		verdadero = read.hasNext();
		System.out.println("El usuario a introducido texto sin espacios en blanco en buffer por el objeto Scanner? " + verdadero);
		
		System.out.print("Introduce un caracter: ");
		n10 = (char) read.nextByte();// Para introduccir un tipo de dato
		System.out.println("Devuelve: " + n10);
		// Cuando utilizas un metodo hasNext lo que haces es hacer que el usuario introduce un dato
		// y cuando lo introduce averigua si el usuario realmente a introducido o no el valor que 
		// has pedido
		verdadero = read.hasNextByte();
		System.out.println("El usuario a introducido char en buffer por el objeto Scanner? " + verdadero);
		
		System.out.print("Introduce un texto sin espacios en blanco: ");
		n11 = read.next().getBytes();
		System.out.println("Devuelve: " + n11);
		// Cuando utilizas un metodo hasNext lo que haces es hacer que el usuario introduce un dato
		// y cuando lo introduce averigua si el usuario realmente a introducido o no el valor que 
		// has pedido
		verdadero = read.hasNextByte();
		System.out.println("El usuario a introducido byte en buffer por el objeto Scanner? " + verdadero);
		System.out.println("Introduce un texto con espacios en blanco: ");
		n11 = read.nextLine().getBytes();
		System.out.println("Devuelve: " + n11);
		// Cuando utilizas un metodo hasNext lo que haces es hacer que el usuario introduce un dato
		// y cuando lo introduce averigua si el usuario realmente a introducido o no el valor que 
		// has pedido
		verdadero = read.hasNextByte();
		System.out.println("El usuario a introducido byte en buffer por el objeto Scanner? " + verdadero);
		
		System.out.print("Introduce un texto sin espacios en blanco: ");
		n12 = read.next().toCharArray();
		System.out.println("Devuelve: " + String.valueOf(n12));
		// Cuando utilizas un metodo hasNext lo que haces es hacer que el usuario introduce un dato
		// y cuando lo introduce averigua si el usuario realmente a introducido o no el valor que 
		// has pedido
		verdadero = read.hasNextByte();
		System.out.println("El usuario a introducido byte en buffer por el objeto Scanner? " + verdadero);
		System.out.println("Introduce un texto con espacios en blanco: ");
		n12 = read.nextLine().toCharArray();
		System.out.println("Devuelve: " + String.valueOf(n12));
		// Cuando utilizas un metodo hasNext lo que haces es hacer que el usuario introduce un dato
		// y cuando lo introduce averigua si el usuario realmente a introducido o no el valor que 
		// has pedido
		verdadero = read.hasNextByte();
		System.out.println("El usuario a introducido byte en buffer por el objeto Scanner? " + verdadero);
		
		System.out.print("Escribe un valor booleano (true o false): ");
		verdadero = read.nextBoolean();
		
		read.close();

		/* 
		 * Con BufferedReader y InputStreamReader
		 * 
		 * BufferedReader es un objeto que nos permite guardar datos de
		 * una entrada de flujo de datos dentro del buffer
		 * 
		 * InputStreamReader es un objeto que nos permite crear un
		 * flujo de entrada para lectura o captura de los datos 
		 * 
		 * System.in : es la entrada estandar, con System.in le estamos 
		 * diciendo a la api de Java que se va a introduccir o capturar
		 * datos dentro mediante un objeto
		 * 
		 * */
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			System.out.print("Introduzca un texto: ");
			n9 = buffer.readLine();
			System.out.println(n9);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Con System.in.read
		try {
			System.out.println("Introduzca un caracter en formato decimal ASCII: ");
			n1 = (byte) System.in.read();
			System.out.println(n1 +  " - " + (char) n1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
