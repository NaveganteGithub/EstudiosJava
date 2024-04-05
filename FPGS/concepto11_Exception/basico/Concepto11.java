package conceptos.paso1_Basicos.concepto11_Exception.basico;

import java.util.Scanner;

public class Concepto11 {

	public static void main(String[] args) throws MiExcepcion { // Ejemplo de excepcion personalizada
		
		/*
		 * TODO EXCEPCIONES Y TIPOS DE ERRORES
		 * 
		 * Un programador como cualquier humano comete defectos 
		 * y sus creaciones no van a ser diferentes
		 * 
		 * Todo programa puede tener un error que habria que solucinar
		 * para eso existen un tipo de objetos Java que se llaman
		 * Excepciones
		 * 
		 * Tenemos 3 tipos de errores en Java
		 * 
		 * */
		
		// TODO Error de sintaxis: cuando escribes mal las instrucciones de codigo
		// System.aut.print();
		
		// TODO Error logico: cuando escribes un codigo que no hace lo que se quiere o no tiene sentido
		/*int i = 1;
		
		if (i == 1 && i == 2) {
			System.out.println("Hola");
		} else {
			System.out.println("Error");
		}*/
		
		// TODO Error de excepcion o error en tiempo de ejecucion
		
		/*
		 * Los errores en tiempo de ejecucion son un tipo de errores 
		 * que surgen cuando un programa esta en ejecucion y el 
		 * usuario hace algo que provoque su interrupcion por ejemplo 
		 * que un programa pida un numero con readInt y el usuario 
		 * introduzca una letra, claro el readInt sirve para pedir 
		 * numeros no letras, y por lo tanto si pasas una letra 
		 * saltara la excepcion NoSuchElementException que es una
		 * Excepcion que indica que un elemento no esta permitido
		 * en el codigo que has creado hay muchos tipos de Excepciones
		 * 
		 * 
		 * Throwable - la clase Throwable es la clase padre de todos los errores en
		 * 			   Java
		 * 		Error - errores producidos por la MV Java no por el programa creado
		 * 				esto sucede debido al hardware, no podemos controlar esta 
		 * 				excepcion
		 * 		Exception - errores produccidos por la actividad del programa, 
		 * 					es un error generico, se utiliza para avisar que  
		 * 					la ejecucion del programa a fallado pero no se sabe
		 * 					cual es el error exactamente
		 * 			IOException - excepciones produccidas al realizar tareas de 
		 * 						  entrada/salida por el programa
		 * 				EOFException
		 * 				FileNotFoundException
		 * 				MalformedURLException
		 * 				UnknownHostException
		 * 			RuntimeException - Errores produccidos en tiempo en ejecucion
		 * 							   como las clases hijas a esta
		 * 				ArithmeticException - hacer un division por cero
		 * 				IllegalAccessException - se intenta acceder a una clase pero no 
		 * 										 puede porque no tiene permisos
		 * 				IllegalArgumentException
		 * 					NumberFormatException - capturar letras en vez de numeros
		 * 				IllegalStateException
		 * 				IndexOutOfBoundsException
		 * 					ArrayIndexOutOfBoundException - sobrepasamos el tamaño del array
		 * 				NoSuchElementException - no se encuentra un determinado atributo
		 * 					InputMismatchException - la captura de datos no es correcta
		 * 				NoSuchMethodException - no se encuentra un determinado método
		 * 				NullPointerException
		 * 				NoSuchFieldException - no se encuentra un determinado atributo
		 * 			ClassNotFoundException - error al tratar a una clase
		 * 			CloneNotSupportedException
		 * 			ClassCastException - 
		 * 
		 * */
		
		int d;
		
		// Ejemplo try catch
		
		try { // try nos permite revisar las instrucciones que debemos mantener bajo control 
			Scanner read = new Scanner(System.in);
			d = read.nextInt();	
			System.out.println(d);
			System.out.println(2 / d);
			// Consejo nunca dejes los recursos abiertos, cierralos siempre
			read.close();
		} catch(NumberFormatException n) { // catch nos permite mediante instrucciones gestionar la excepcion
			System.out.println("Introduzca un numero.");
		} catch (ArithmeticException a) {
			a.printStackTrace(); // Nos permite manifestar el log de un error
			System.out.println("Numero divisible por cero.");
		} catch (Exception e) {
			System.out.println("Error generico.");
		} finally { // finally nos permite ejecutar un codigo al salir del try-catch
			System.out.println("Try Catch acabado.");
		}
		
		/* 
		 * Ejemplo try catch con recursos
		 * 
		 * estos nos permiten manejar de manera 
		 * controlada recursos y utilizarlos
		 * dentro de el try-catch
		 * 
		 * */
		try (Scanner read = new Scanner(System.in)) {
			d = Integer.parseInt(read.next());	
			System.out.println(d);
			// Consejo nunca dejes los recursos abiertos, cierralos siempre
			read.close();
		} catch (NumberFormatException | ArithmeticException a) { // Puedes hacer que dos o mas excepciones tengan el mismo codigo control de Excepciones
			System.out.println("Introduzca un numero.");
		} catch (Exception e) {
			System.out.println("Error generico.");
		} finally {
			System.out.println("Try Catch acabado.");
		}
		
		/* 
		 * Si ocurriera una excepcion dentro de un try-catch el codigo del main continuaria 
		 * debido a que estamos controlando la excepcion y el codigo no parara 
		 * */
		
		// Ejemplo throws
		
		double e = Math.E;
		e = 1000;
		
		if (e != Math.E) {
			// throw nos permite llamar a una excepcion
			// throw new ArithmeticException();
			/* 
			 * Para llamar a una excepcion personalizada
			 * 		
			 * 		1º Hay que invocarla en el metodo mediante
			 * 		el metodo throws
			 * 		
			 * 		2º Ejecutarla mediante el metodo throw
			 * 
			 * */
			throw new MiExcepcion(); // Ejemplo de excepcion personalizada
		} 
		
		System.out.println(e + " es el numero de Euler");
		
		
	}
	
}
