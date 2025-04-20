package paso2_Avanzados.concepto13_Colecciones.c2_manejo_iterador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class ManejoIterador {

	public static void main(String[] args) {
		
		// TODO Iterador y Manejo de iteradores
		
		ArrayList<String> mi_coleccion_1 = new ArrayList<String>();
		mi_coleccion_1.add("dasdasdsad");
		mi_coleccion_1.add("dasdadasd");
		mi_coleccion_1.add("gthhvtfdsag");
		mi_coleccion_1.add("Buenas");
		mi_coleccion_1.add("Jota");
		mi_coleccion_1.add("Dado");
		mi_coleccion_1.add("Mi descanso");
		
		ArrayList<Integer> mi_coleccion_1_1 = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++)
			mi_coleccion_1_1.add(i);
		
		/*
		 * Recuerda que "A la hora de desplazarse o leer el LinkedList,
		 * tardara bastante, y cuanto mas grande sea mas tardara - 
		 * DESVENTAJA", así que a la hora de iterar con LinkedList
		 * sera mas lento que con ArrayList
		 * 
		 * */
		LinkedList<String> mi_coleccion_2 = new LinkedList<String>();
		mi_coleccion_2.add("hola");
		mi_coleccion_2.add("45");

		System.out.println("-".repeat(110));
		
		/*
		 * Iterador es una clase que nos permite Iterar una coleccion, es decir,
		 * nos permite recorrer (o leer) una coleccion, pidiendo cada uno de sus
		 * objetos
		 * 		
		 * 		1º Devolveremos la coleccion como un objeto de tipo Iterador, es decir,
		 * 		convertiremos la coleccion en un iterador
		 * 
		 * 		2º Almacenaremos el iterador creado a partir de la coleccion en un objeto
		 * 
		 * 		3º Utilizamos next para movernos por el Iterador
		 * 
		 * */
		Iterator<String> iteratorEjem = mi_coleccion_1.iterator();
		
		System.out.println(iteratorEjem.next());
		System.out.println(iteratorEjem.next());
		System.out.println(iteratorEjem.next());

		System.out.println("-".repeat(110));
		
		/*
		 * Para reiniciar un iterador solo hay que invocar la misma coleccion
		 * utilizada anteriormente para hacer el iterador
		 * 
		 * */
		
		iteratorEjem = mi_coleccion_1.iterator();
		try {
			/* 
			 * hasNext nos permite saber si hay un elemento en 
			 * la siguiente posicion del iterador
			 *  
			 * */
			System.out.println(iteratorEjem.hasNext());
			/*
			 * Nos permite movernos al siguiente Objeto del Iterador
			 * */
			System.out.println(iteratorEjem.next());
			System.out.println(iteratorEjem.hasNext());
			System.out.println(iteratorEjem.next());
			System.out.println(iteratorEjem.hasNext());
			System.out.println(iteratorEjem.next());
			System.out.println(iteratorEjem.hasNext());
			System.out.println(iteratorEjem.next());
			System.out.println(iteratorEjem.hasNext());
			System.out.println(iteratorEjem.next());
			System.out.println(iteratorEjem.hasNext());
			System.out.println(iteratorEjem.next());
			System.out.println(iteratorEjem.hasNext());
			System.out.println(iteratorEjem.next());
			System.out.println(iteratorEjem.hasNext());
			// System.out.println(iteratorEjem.next());
			System.out.println(iteratorEjem.hasNext());
			System.out.println(iteratorEjem.next());
			System.out.println(iteratorEjem.hasNext());
			System.out.println(iteratorEjem.next());
			System.out.println(iteratorEjem.hasNext());
			System.out.println(iteratorEjem.next());
			System.out.println(iteratorEjem.hasNext());
			System.out.println(iteratorEjem.next());
		} catch (NoSuchElementException e) {
			System.out.println("Has llegado al final");
		}

		System.out.println("-".repeat(110));
		
		/*
		 * ListIterator es una clase hija de la clase Iterador, hace lo mismo que su clase padre
		 * pero tiene muchos mas  
		 * */
		
		ListIterator<String> lista_iteradores;
		lista_iteradores = mi_coleccion_1.listIterator();

		// next nos moviliza al siguiente Objeto en el iterador y luego lo devuelve
		System.out.println("Movernos al siguiente objeto: " + lista_iteradores.next());
		// hasNext nos retorna true si hay un Objeto en la siguiente posicion desde la actual posicion del Iterador
		System.out.println("¿Tenemos un objeto actual? " + lista_iteradores.hasNext());
		// nextIndex nos retorna el index del siguiente Objeto
		System.out.println("Index del objeto actual: " + lista_iteradores.nextIndex());
		// previousIndex nos retorna el index del siguiente Objeto
		System.out.println("Index del objeto anterior: " + lista_iteradores.previousIndex());
		// hasPrevious nos retorna true si hay un Objeto en la siguiente posicion desde la actual posicion del Iterador
		System.out.println("¿Tenemos un objeto antes que este? " + lista_iteradores.hasPrevious());
		// previous nos moviliza al anterior Objeto en el iterador y luego lo devuelve
		System.out.println("Movernos al anterior objeto: " + lista_iteradores.previous());
		System.out.println();
		
		System.out.println("Avanzando por el iterador");
		System.out.println(lista_iteradores.next());
		System.out.println(lista_iteradores.next());
		System.out.println(lista_iteradores.next());
		System.out.println(lista_iteradores.next());
		System.out.println(lista_iteradores.next());
		lista_iteradores.add("kdjsafndsnjof");
		System.out.println(lista_iteradores.next());
		System.out.println(lista_iteradores.next());
		
		System.out.println("\nRetrocediendo por el iterador");
		System.out.println(lista_iteradores.previous());
		System.out.println(lista_iteradores.previous());
		System.out.println(lista_iteradores.previous());
		System.out.println(lista_iteradores.previous());
		System.out.println(lista_iteradores.previous());
		System.out.println(lista_iteradores.previous());
		System.out.println(lista_iteradores.previous());
		System.out.println(lista_iteradores.previous());
		
		System.out.println("-".repeat(110));
		
		System.out.println("Recorrer un interador con for y Iterator");
		for (Iterator<String> iterator = mi_coleccion_1.iterator(); // Inicializador del for 
				iterator.hasNext();									// Condicional del for
				) {
			String string = (String) iterator.next();
			System.out.println(string);
		}

		System.out.println("\nRecorrer un iterador con while y Iterator");
		while (lista_iteradores.hasNext()) {
			String string = (String) lista_iteradores.next();
			System.out.println(string);
		}
		
		System.out.println("-".repeat(110));
		
		ListIterator<String> iterator = mi_coleccion_1.listIterator();
		
		System.out.println("Recorrer un iterador mediante while y ListIterator hacia adelante.\n");
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		System.out.println("\n\nRecorrer un iterador mediante while y ListIterator hacia atras.\n"
				+ "Solo funciona si en el iterador estamos en una posicion avanzada.\n");
		while (iterator.hasPrevious()) {
			String string = (String) iterator.previous();
			System.out.println(string);
		}
		
	}

}
