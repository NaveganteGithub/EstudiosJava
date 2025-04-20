package paso1_Basico;

import java.util.Scanner;

public class Concepto03Bucles {

	public static void main(String[] args) {
		
		// Tipos de bucle for
		
		// Estructuras que nos permiten repetir una porcion de codigo concreta
		// cuando la condicion sea verdadera
		System.out.println("Bucle normal");
		
		/*
		 * for (int i = 0; // inicializador 
		 * 			i < 10; // condicion
		 * 			i++ // interaccion
		 * 		) {
		 * 		System.out.println(i);
		 * }
		 * 
		 * */
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		for (int i = 0; i < 10; i=i+1) {
			System.out.println(i);
		}
		
		for (int i = 0; i < 10; i=i+2) {
			System.out.println(i);
		}
		
		for (int i = 0; i < 10; i+=2) {
			System.out.println(i);
		}
		
		System.out.println("Bucle anidado");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			for(int j = 0; j < 10; j++) {
				System.out.println("\t" + j);
			}
		}
		
		System.out.println("Bucle con condicional multiple");
		
		boolean parar = false;
		
		for (int i = 0; i < 10 && !parar ; i++) {
			System.out.println(i);
			if (i == 4) parar = true;
		}
		
		System.out.println("Bucle de una linea");

		for (int i = 0; i < 10; i++)
			System.out.println(i);
		
		/*System.out.println("Bucle infinito - "
				+ "NO EJECUTAR, SIRVE PARA CREAR SERVICIOS, PROGRAMACION AVANZADA");
		
		for(;;) {
			System.out.println("Infinito");
		}*/
		
		System.out.println("Bucle for hexadecimal");
		
		for (int i = 0; i < 0x057; i++) { // Un valor maximo recomendable es 0xfffffff
			System.out.println(i);
		}
		
		System.out.println("Bucle for hexadecimal, parte 2");
		
		for (int i = 0x000; i < 0x057; i++) { // Un valor maximo recomendable es 0xfffffff
			System.out.println(i);
		}
		
		System.out.println("Bucle for-each");
		
		String intelectuales[] = {"Jesus de Nazaret", "Diogenes", "Aristoteles", "Platon"}; 
		
		for (String string : intelectuales) {
			System.out.println(string);
		}
		
		System.out.println("Bucle for para cadenas y subcadenas");
		
		String cadena = "M1cad3n@";
		
		for (int i = 0; i < cadena.length(); i++) {
			System.out.println(cadena.charAt(i));
		}
		
		// Bucle while
		
		System.out.println("Bucle while");
		
		short indice_ = 0;
		
		while (indice_ < 20) {
			System.out.println(indice_);
			indice_++;
		}
		
		/*short indice_infinito = 0;
		System.out.println("Bucle while infinito, NO UTILIZAR, AVANZADO");
		
		while (indice_infinito < 1) {
			System.out.println("INFINITO");
		}*/
		
		System.out.println("While con condicional multilple");
		
		boolean seguir = true;
		indice_ = 0;
		
		while (indice_ < 20 && seguir) {
			System.out.println(indice_);
			if (indice_ == 10) seguir = false;
			indice_++;
		}
		
		// Bucle do-while
		
		System.out.println("Bucle do-while");
		short limit = 0;
		
		do {
			System.out.println(limit);
			limit++;
		} while(limit < 20);
		
		System.out.println("Bucle do-while, con contador en primera linea");
		limit = 0;
		
		do {
			limit++;
			System.out.println(limit);
		} while(limit < 20);
		
		// Bucle con salto
		
		System.out.println("Bucle con break");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 4) break;
			System.out.println("Hola");
		}
		
		System.out.println("Bucle con continue");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if ((i % 2) == 0) continue;
			System.out.println("Hola");
		}
		
		// Prevenir error
		
		boolean prevenir = false;
		int evaluar;
		Scanner read = new Scanner(System.in);
		
		for (int i = 0; i < 10 && !prevenir; i++) {
			System.out.print("Introduce 2: ");
			evaluar = read.nextInt();
			if(evaluar == 2) prevenir = true;
		}
		
		System.out.println(prevenir ? "El valor es 2" : "No se a introduccido 2");
		
		read.close();
		
	}

}
