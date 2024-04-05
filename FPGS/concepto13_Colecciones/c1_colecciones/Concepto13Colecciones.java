package conceptos.paso1_Basicos.concepto13_Colecciones.c1_colecciones;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Scanner;

public class Concepto13Colecciones {

	public static void main(String[] args) {
		
		// TODO Colecciones: List, ArrayList, Iterator, etc...
		
		/*
		 * Antes de empezar se tiene que aclarar dos definiciones
		 * 
		 * Las variables simples son contenedores donde puedes
		 * almacenar informacion: int, long, String, float, char
		 * 
		 * Las estructuras son "variables" donde caben mas de
		 * un dato especificado, y cada estructura, se pueden
		 * caracterizar por:
		 * 
		 * 		Donde guardan los datos, y dependiendo de donde
		 * 		se guarden los datos, podremos confirmar que se
		 * 		tratan de :
		 * 
		 * 			Estructuras internas: Sus datos estan guardados
		 * 			en memoria RAM, y por supuesto hay dos tipos de
		 * 			de estructuras internas:
		 * 				
		 * 				Estaticas: son las que conocemos como tablas
		 * 				o Arrays, se dicen que son estaticas porque,
		 * 				tienen un tamaño fijo y que no puede cambiar
		 * 
		 * 				Dinamicas: las conocidas tambien como Colecciones
		 * 				son estructuras que van creaciendo dinamicamente,
		 * 				es decir, no tienen tamaño fijo, su tamaño cambia
		 * 				constantemente a medida que eliminas o agregas de
		 * 				forma dinamica o manual, los valores u objetos de
		 * 				dicha estructra, a medida que se vaya ejecutando,
		 * 				el codigo fuente Java, dependiendo del espacio en
		 * 				tu RAM, y demas los recursos que tenga tu equipo,
		 * 				ademas de las necesidades que tenga el programa
		 *  
		 * 			Estructuras externas: Sus datos estan guardados
		 * 			en soportes externos permanentes, como los HDD,
		 * 			Pendrives, Ficheros o Bases de datos 
		 *
		 * 		La forma en que están organizados
		 * 
		 * 		Las operaciones que se pueden realizar
		 * 
		 * Una vez aclarado estas definiciones, pasamos a la definicion de lo que
		 * es una Coleccion en Java
		 * 
		 * Las Colecciones son estructuras internas de almacenamiento de Objectos dinamica, que
		 * valga la redundancia, a medida que se vaya agregando o quitando Nodos, ira cambiando
		 * de tamaño dinámicamente
		 * 
		 * NODO:
		 * 		En las Colecciones un Objecto almacenado en una de estas Colecciones 
		 * 		se le llama Nodo
		 * 
		 * Las Colecciones pueden ir o no con un orden de almacenamiento
		 * 
		 * Los datos no se localizan de forma contigua en memoria
		 * 
		 * Las colecciones segun como se organizen sus nodos, se pueden clasificar :
		 * 
		 * 			Lineales: 
		 * 				Listas
		 * 				Conjuntos
		 * 				Pilas
		 * 				Colas
		 * 
		 * 			No Lineales:
		 * 				Árboles
		 * 				Grafos
		 * 
		 * Las Colecciones son un conjunto de clases e interfaces que mejoran las
		 * estructuras de datos lo que ayuda a mejorar las capacidad del lenguaje
		 * 
		 * Todas las colecciones estan dentro de java.util, hay muchos tipos de colecciones
		 * 
		 * 		Estan las colecciones Lineales como :
		 * 			Iterable - Interfaz
		 * 				Collection - Interfaz
		 * 					List (o Lista en Ingles) - Interfaz
		 * 						ArrayList - Clase
		 * 						LinkedList - Clase
		 * 						Vector - Clase
		 * 							Stack - Clase
		 * 						CopyOnWriterArrayList
		 * 					Queue (o Cola en Ingles) - Interfaz
		 * 						PriorityQueue - Clase
		 * 						Deque - Interfaz
		 * 							ArrayDeque - Clase
		 * 					Set (o Conjunto en Ingles) - Interfaz
		 * 						HashSet - Clase
		 * 						LinkedHashSet - Clase
		 * 						SortedSet - Interfaz
		 * 							TreeSet - Clase
		 * 					Map (o Lista en Ingles) - Interfaz
		 * 						HashMap - Clase
		 * 						TreeMap - Clase
		 * 						LinkedHashMap - Clase
		 * 						SortedMap
		 * 
		 * 		Cabe recalcar que son contenedores de la clase Object, 
		 * 		y no permiten introduccir datos primitivos
		 * 
		 * 
		 */
		
		//_________________________________________________________________________________________
		System.out.println("_".repeat(110));
		
		/*
		 * COLECCION LIST (Listas;Lineales;Listas)
		 * 
		 * Una Lista o una LIST es una coleccion secuencial en las
		 * que los NODOS (o Objectos) tienen una posicion o indice
		 * 
		 * Tambien nos permite su acceso de manera aleatoria
		 * 
		 * Una LIST puede tener un orden o no, es lineal, y puede 
		 * a ver objetos repetidos o duplicados
		 * 
		 * Puedes insertar los nodos donde se quiera, y puedes 
		 * acceder a cualquier Nodo para trabajar con su 
		 * funcionalidad o informacion
		 * 
		 * Los nodos de List y las clases que poseen List como su 
		 * interfaz pueden tener en cada Nodo uno o dos campos de 
		 * enlace, con esto podemos encontrar :
		 * 
		 * 		las listas simplemente enlazadas, que son las que
		 * 		sus nodos estan enlazados con el siguiente
		 * 			
		 * 			Ejemplo:
		 * 
		 * 			--> Las flechas serian los enlaces de los nodos, 
		 * 				que apuntan al siguiente
		 * 
		 *  		Inicio NODO1 --> NODO2 --> NODO3 --> NODO4 Final
		 *  
		 * 		las listas doblemente enlazadas, que son las que cada
		 * 		nodo tienen dos enlaces, un enlace que apunta al nodo
		 * 		que va despues, y otro enlace que apunta al nodo
		 * 		anterior
		 * 
		 * 			Ejemplo:
		 * 
		 * 			--> Las flechas serian los enlaces de los nodos, 
		 * 			<--	que apuntan al siguiente o al anterior
		 * 
		 *  		Inicio Null <-- NODO1 --> NODO2 --> NODO3 --> NODO4 --> Null Final
		 * 								  <--		<--		  <--		
		 * 		
		 * 			El primer y ultimo nodo tambien tienen dos enlaces 
		 * 			pero en vez de apuntar a un objeto apuntan a un
		 * 			nodo NULL
		 * 
		 * 		las litas circulares, que son las que el ultimo nodo apunta al primero
		 * 
		 * 			Ejemplo:
		 * 
		 * 			--> Las flechas serian los enlaces de los nodos, 
		 * 			<--	que apuntan al siguiente o al anterior
		 * 
		 *  		Inicio NODO1 --> NODO2 --> NODO3 --> NODO4 Final
		 * 					 <------------------------------		
		 * 		
		 * 
		 * */

		
		
		
		
		// -------------------------------------------------------------------------------------------
		System.out.println("-".repeat(110));
		
		
		
		
		/*
		 * CLASE ARRAYLIST 
		 * 
		 * ArrayList es una clase que utiliza la interfaz list y por lo tanto es una clase
		 * que pertenece a la coleccion lineal en forma de lista.
		 * 
		 * Es una clase facil de utilizar y muy usada en desarrollo movil
		 * 
		 * Podemos utilizar todo tipo de objetos, pero como cualquier coleccion no admite
		 * datos de tipo prmitivo
		 * 
		 * ArrayList es un tipo de lista con simple enlazamiento, es decir, cada uno de los
		 * objetos que conforman a la coleccion estan enlazados al objeto posterior a este
		 * 
		 * */
		
		
		

		/* 
		 * Como no se pueden almancenar datos primitivos en las colecciones 
		 * se almacenaran dichos datos primitivos como objetos, abandonando
		 * la idea 
		 * 
		 * */ 
		
		
		
		
		// Esta es la estructura basica crear un objeto de tipo ArrayList
		ArrayList<Integer> numeros = new ArrayList<Integer>(); // <------- FIJATE AQUI
		/* 
		 * No podemos utilizar datos de tipo primitivo para rellenar un ArrayList,
		 * por lo tanto si hicieramos el ArrayList de la siguiente manera daria un
		 * error diciendo que no se pueden almacenar datos de tipo primitivo
		 *  
		 * */
		// ArrayList<int>  numeros2 = new ArrayList<int>();
		
		
		
		/* 
		 * En la interfaz List tenemos multiples metodos para el manejo de colecciones
		 * y ArrayList tiene acceso a dichos metodos porque este utiliza la interfaz
		 * List
		 * 
		 * */
		
		// add nos permite agregar OBJETOS al ArrayList
		numeros.add(4);  // Los numeros se almacenaran como objetos de tipo Integer
		numeros.add(15); // y no como un dato de tipo primitivo int (integer)
		numeros.add(8);
		numeros.add(78);
		numeros.add(230);
		numeros.add(410);
		numeros.add(null); // Podemos agregar valores null como Objeto
		numeros.add(120000000);
		numeros.add(null); // Podemos agregar valores null como Objeto
		numeros.add(12);
		numeros.add(4);
		numeros.add(65);
		numeros.add(410);
		numeros.add(23);
		numeros.add(58);
		
		// add retorna true o false si se a agregado o no el valor
		
		System.out.println("Se agrega el valor: " + numeros.add(58));
		
		/* 
		 * get nos permite pedir un Objeto del ArrayList mediante su indice, esto es posible
		 * dado que esta clase es una perteneciente a las colecciones lineales de tipo Lista
		 * 
		 * */
		System.out.println("Valor a pedir de la posicion 0: " + numeros.get(0));
		System.out.println("Valor a pedir de la posicion 6: " + numeros.get(6));
		System.out.println("Valor a pedir de la posicion 7: " + numeros.get(7));
		
		// size nos permite saber el tamaño actual del ArrayList
		System.out.println("Tamaño del ArrayList: " + numeros.size());
		
		// remove nos permite eliminar un Objeto en el ArrayList indicando su posicion
		numeros.remove(6);
		System.out.println("Tamaño del ArrayList: " + numeros.size());
		
		// remove nos permite eliminar un Objeto en el ArrayList indicando el Objeto
		numeros.remove((Integer) 23);
		System.out.println("Tamaño del ArrayList: " + numeros.size());

		// add con dos parametros nos permite intercambiar un objeto del ArrayList por otro
		System.out.println("Elemento actual: " + numeros.get(7));
		numeros.add(7, 20);
		System.out.println("Elemento actual: " + numeros.get(7));
		// numeros.add(7, 7); // Reporte de fallo en removeAll
		numeros.add(7, 8);
		System.out.println("Elemento actual: " + numeros.get(7));
		
		/* 
		 * set nos permite intercambiar un Objeto del ArrayList por otro, la diferencia con
		 * el add anterior es que nos permite saber el Objeto que habia anteriormente antes
		 * de intercambiarlo
		 *  
		 * */
		System.out.println("Elemento anterior: " + numeros.set(8, 21));
		System.out.println("Elemento actual: " + numeros.get(8));
		// numeros.set(8, 7); // Reporte de fallo en removeAll
		numeros.set(8, 115);
		System.out.println("Elemento actual: " +numeros.get(8));
		
		/* 
		 * contains nos permite saber si Objeto concreto esta en la lista, devolviendo 
		 * un valor true o false dependiendo de si esta o no el objeto en el ArrayList
		 * 
		 * */ 
		System.out.println("Saber si ArrayList contiene el Objeto 7: " + numeros.contains(7));
		System.out.println("Saber si ArrayList contiene el Objeto 498749184: " + numeros.contains(498749184));
		
		// Saber si un ArrayList esta vacio o no
		ArrayList<String> tex = new ArrayList<String>();
		System.out.println("Saber si un ArrayList esta o no vacio "
				+ "de objetos o que tenga 0 Objetos: " + numeros.isEmpty());
		System.out.println("Saber si un ArrayList esta o no vacio "
				+ "de objetos o que tenga 0 Objetos: " + tex.isEmpty());
		
		// Buscar un elemento desde la primera posicion
		System.out.println("Busca el objeto indicado desde la primera posicion: " + numeros.indexOf(4));
		System.out.println("Busca el objeto indicado desde la primera posicion: " + numeros.indexOf(15));
		System.out.println("Busca el objeto indicado desde la primera posicion: " + numeros.indexOf(480));
		System.out.println("Busca el objeto indicado desde la primera posicion: " + numeros.indexOf(410));
		
		// Buscar un elemento desde la ultima posicion
		System.out.println("Busca el objeto indicado desde la ultima posicion: " + numeros.lastIndexOf(4));
		System.out.println("Busca el objeto indicado desde la ultima posicion: " + numeros.lastIndexOf(15));
		System.out.println("Busca el objeto indicado desde la ultima posicion: " + numeros.lastIndexOf(480));
		System.out.println("Busca el objeto indicado desde la ultima posicion: " + numeros.lastIndexOf(410));
		
		
		/* 
		 * Ahora la clase ArrayList tiene varios constructores que podemos 
		 * utilizar para inicializar nuestro ArrayList
		 * 
		 * */
		
		ArrayList<Integer> oe;
		
		/* 
		 * Podemos iniciar un ArrayList con el constructor por defecto para hacer
		 * lo que se puede hacer normalmente con un ArrayList
		 * 
		 * */
		oe = new ArrayList<Integer>();

				/* 
				 * addAll
				 * 
				 * Funcion 1:
				 * 		addAll nos permite agregar todos los objetos de un ArrayList 
				 * 		en otro ArrayList
				 * 
				 * Funcion 2:
				 * 
				 * addAll nos permite agregar todos los objetos de un ArrayList en otro ArrayList
				 * sin borrar los objetos que estaban anteriormente
				 * 
				 * en caso de que se agregen varios ArrayList a un mismo ArrayList se clasificaran
				 * por grupos y en cada grupo estaran todos los objetos de cada ArrayList agregado
				 * correspondientemente, por ejemplo, si has agregado a un mismo ArrayList oe, los 
				 * ArrayList numeros y numeros2 los objetos que estuvieran en ambos ArrayList se 
				 * agregaran al ArrayList oe, tal que dentro del ArrayList estaran todos los 
				 * objetos de todos los ArrayList que agreges 
				 * 
				 * _____________________________________________________________
				 * |															|
				 * |						ArrayList oe						|
				 * |	____________________		____________________		|
				 * | 	|		Objetos		|		|		Objetos		|		|
				 * |	| ArrayList numeros	|		|ArrayList numeros2	|		|
				 * |	|___________________|		|___________________|		|
				 * |															|
				 * |____________________________________________________________|
				 * 
				 * */
			
					ArrayList<Integer> numeros2 = new ArrayList<Integer>();
					numeros2.add(7);
					numeros2.add(5);
				
				oe.addAll(numeros);
				oe.addAll(numeros2);
	
				System.out.println(oe.size());
				System.out.println(oe.get(0));
				System.out.println(oe.get(15));
				System.out.println(oe.get(16));
				System.out.println(oe.get(17));
				
				/*
				 * removeAll
				 * 
				 * Funcion 1:
				 * 		Cuando solo agregamos un solo ArrayList con addAll
				 * 		removeAll nos permite remover todos los objetos del ArrayList
				 * 
				 * Funcion 2:
				 * 
				 * 		Cuando agregamos dos o mas ArrayList con addAll
				 * 
				 * 		removeAll nos permite remover todos los objetos de un grupo de un 
				 * 		ArrayList
				 * 
				 * TEN CUIDADO PORQUE ESTE METODO NO BASTANTE FIABLE, DEBIDO A QUE SI TIENES
				 * VALORES REPETIDOS JUNTANDO TODOS GRUPOS DE OBJETOS DE CADA ARRAYLIST 
				 * INTRODUCCIDO EN EL ARRAYLIST POR ADDALL, ES DECIR, TODOS LOS VALORES DEL 
				 * ARRAYLIST, SE ELIMINARAN TODOS LOS VALORES REPETIDOS DE TODOS LOS GRUPOS
				 * INTRODUCCIDOS
				 * 
				 * */
				
				System.out.println(oe.toString());
				
				oe.removeAll(numeros);
	
				System.out.println(oe.toString());
				System.out.println("Tamaño ArrayList oe sin objetos del ArrayList numeros: " + oe.size());
				System.out.println("ArrayList oe sin objetos del ArrayList numeros: " + oe.get(0));
				
				oe.addAll(numeros);
				
				oe.removeAll(numeros2);
				
				System.out.println("Tamaño ArrayList oe sin objetos del ArrayList numeros2: " + oe.size());
				System.out.println("ArrayList oe sin objetos del ArrayList numeros2: " + oe.get(0));
				System.out.println("ArrayList oe sin objetos del ArrayList numeros2: " + oe.get(1));
				
				oe.addAll(numeros2);
				
				System.out.println(oe.toString());
			
		
		/* 
		 * Podemos iniciar un ArrayList con un constructor indicandole su capacidad inicial
		 *
		 * Pero no hay que confundir tamaño con capacidad
		 * 
		 * 		el tamaño es el numero de objetos que hay dentro de tu coleccion actualmente
		 * 		que se puede mirar con el metodo size
		 * 
		 * 		la capacidad es la cantidad de objetos que la coleccion podra registrar sin 
		 * 		tener que cambiar sus estructuras internas
		 * 
		 * Cuando nosotros llamamos a un ArrayList como el anterior este tendra un tamaño y una capacidad 
		 * de 0, pero a medida que nosotros vayamos agregando objetos al ArrayList cambiara su estructura 
		 * interna (cambiara la capacidad) para posteriori agregar el objeto u objetos (cambiara el 
		 * tamaño) de manera automatica, lo cualo hace muy pesado, porque tendra que hacer dos cosas
		 * 
		 * Cuando nosotros llamamos a un ArrayList con una capacidad incial, lo que haces es llamar a un
		 * ArrayList con una estrcutura preparada para guardar el numero de objetos que tu le indiques
		 * por paramentro, en ese parametro especificas la capacidad inicial del ArrayList
		 * 
		 * Como curiosidad puede pasar en otros tipos de colecciones
		 * 
		 * En caso de que el numero de objetos a registrar en la coleccion supere la capacidad inicial
		 * se hara una expansion de su extructura interna para aumentarla segun el resultado del siguiente
		 * calculo
		 * 
		 * (antiguaCapacidadInicial * 3) / 2 + 1 = nuevaCapacidadInicial
		 * 
		 * Ejemplo con 4 como antiguaCapacidadInicial  
		 * (4 * 3) / 2 + 1 = 7
		 * 
		 * Pero no es recomendable llegar a utilizar esta operacion de expansion por el alto consumo de 
		 * recursos por parte del ArrayList o la coleccion, asi que si evitas llegar a llenar un ArrayList
		 * o cualquier coleccion mas alla de su capacidad consumira muy pocos recursos
		 * 
		 *  	Si el numero de objetos a registrar es mayor a la capacidad inicial de un ArrayList
		 *  		se ejecutara la operacion de expansion
		 *  		consumira bastantes recursos
		 *  	si el numero de objetos a registrar es menor o igual a la capacidad inicial de un ArrayList
		 *  		seguiremos ejecutando
		 *  		no consumira bastantes recursos
		 * 
		 * https://qastack.mx/programming/15430247/why-start-an-arraylist-with-an-initial-capacity
		 * https://qastack.mx/programming/8896758/initial-size-for-the-arraylist
		 * 
		 * */
		oe = new ArrayList<Integer>(4); // Capacidad inicial de 4
		oe.add(4);
		oe.add(45);
		oe.add(24);
		System.out.println("Pidiendo oe con capacidad 4: " + oe.get(0));
		System.out.println("Pidiendo tamaño de oe: " + oe.size());
		
		/* 
		 * Para evitar la operacion de expansion, si tu quisieras en algun momento cambiar 
		 * la capacidad (inicial) del ArrayList se debe de utilizar ensureCapacity
		 * 
		 * despues de utilizar este metodo la capacidad sube a 7 objetos
		 *   
		 * */ 
		
		oe.ensureCapacity(7);
		
		/*
		 * Podemos iniciar un ArrayList con un contructor para inicializarlo con los valores de otro ArrayList
		 * teniendo en cuenta que los valores que tuviera anteriormente se borraran
		 * 
		 * */
		
		oe = new ArrayList<Integer>(numeros);
		
		// Este metodo nos sirve para 
		System.out.println("Borrar un ArrayList.");
		numeros.clear(); // Borrando numeros
		oe.clear();		 // Borrando oe
		
		
		
		
		/*
		 * TODOS LOS METODOS ANTERIORES DE ARRAYLIST PUEDEN SER UTILIZADOS 
		 * POR CUALQUIERA DE LOS TRES CONSTRUCTORES ANTERIORES
		 * */
		
		
		
		
		// Tambien podemos manejar objetos creados por nosotros mismos
		
		ArrayList<CalculosFechas> fechasDadas = new ArrayList<CalculosFechas>();

		CalculosFechas fecha = new CalculosFechas();
		
		fechasDadas.add(null); // Podemos agregar valores null como Objeto
		System.out.println(fechasDadas.get(0));
		
		fechasDadas.add(fecha); // Podemos agregar Objetos desde variables de tipo Objeto
		System.out.println(fechasDadas.get(1));
		
		// Podemos agregar Objetos instanciados directamente
		fecha = new CalculosFechas(new GregorianCalendar(2000, 12, 2));
		fechasDadas.add(fecha);
		System.out.println(fechasDadas.get(2));
		
		fecha = new CalculosFechas(new GregorianCalendar(2020, 11, 30));
		fechasDadas.add(fecha);
		System.out.println(fechasDadas.get(3));
		
		
		/* 
		 * Guardamos en una variable de tipo Objeto CalculosFechas el Objeto 
		 * devuelto por el ArrayList que tambien sera un Objeto de tipo 
		 * CalculosFechas
		 * 
		 * */
		CalculosFechas fechaEscogida = fechasDadas.get(1);
		System.out.println(fechaEscogida);
		fechaEscogida.CuantoFalta(new GregorianCalendar(2024, 12, 4));
		
		
		
		
		
		/* 
		 * Podemos agregar en un ArrayList, un Array basico pues
		 * son tambien Objetos de Java
		 * 
		 * */
		
		ArrayList<int[]> arraynumeros = new ArrayList<int[]>();
		
		int[] array_1 = new int[20];
		for (int i = 0; i < array_1.length; i++)
			array_1[i] = (int) Math.random()*10000;
		
		int[] array_2 = new int[34];
		for (int i = 0; i < array_2.length; i++)
			array_2[i] = (int) Math.random()*10000;
		
		int[] array_3 = new int[14];
		
		arraynumeros.add(array_1);
		arraynumeros.add(array_2);
		arraynumeros.add(array_3);
		
		
		
		
		// Permite almacenar Strings

		ArrayList<String> textos = new ArrayList<String>();
		
		String valor = "mi valor es una cadana";
		
		textos.add("Hola");
		textos.add("Es una prueba");
		textos.add("Quiero estudiar");
		textos.add("Debo decir que me esta resultando entretenido");
		textos.add(valor);
		
		
		
		
		// Permite almacenar todo tipo de objetos en un mismo ArrayList

		ArrayList<Object> generico = new ArrayList<Object>();
		int e = 5;
		
		generico.add(array_1);
		generico.add(valor);
		generico.add("Hola mundo");
		generico.add(fecha);
		generico.add(2);
		generico.add(e);
		generico.add(new GregorianCalendar(2001, 5, 20));
		generico.add(new Scanner(System.in));
		
		
		
		
		// ArrayList permite registrar otros ArrayList
		
		ArrayList<ArrayList<String>> almacenTextos = new ArrayList<ArrayList<String>>();
		almacenTextos.add(textos);
		almacenTextos.add(tex);
		
		almacenTextos.get(0).add("Buenas");
		String valorDevuelto = almacenTextos.get(0).get(almacenTextos.get(0).size() - 1);
		System.out.println(valorDevuelto);
		
		ArrayList<ArrayList<Integer>> almacenInteger = new ArrayList<ArrayList<Integer>>();
		almacenInteger.add(numeros);
		almacenInteger.add(oe);
		
		almacenInteger.get(0).add(4);
		almacenInteger.get(0).add(41);
		almacenInteger.get(0).add(42);
		int valorDevuelto2 = almacenInteger.get(0).get(almacenInteger.get(0).size() - 1);
		System.out.println(valorDevuelto2);
		
		ArrayList<ArrayList<ArrayList<Integer>>> almacenInteger2 = new ArrayList<ArrayList<ArrayList<Integer>>>();
		almacenInteger2.add(almacenInteger);
		
		int valorDevuelto3 = almacenInteger2
										.get(0)  // Pedimos el primer ArrayList - ArrayList<ArrayList<Integer>>
										.get(0)  // Pedimos el segundo ArrayList - ArrayList<Integer>
										.get(0);
		System.out.println(valorDevuelto3);
		
		// https://www.delftstack.com/es/howto/java/java-arraylist-of-ints/#:~:text=ArrayList%20de%20matrices%20int%20Podemos%20crear%20una%20ArrayList,y%20los%20corchetes%20para%20crear%20una%20nueva%20matriz.
		
		// Podemos guardar un ArrayList dentro de un Array Estatico
		
		CalculosFechas miarray[] = new CalculosFechas[fechasDadas.size()];
		fechasDadas.toArray(miarray);

		System.out.println(miarray[1]);
		System.out.println(miarray[3]);
		
		Integer miarray2[] = new Integer[numeros.size()];
		numeros.toArray(miarray2);

		System.out.println(miarray2[0]);
		System.out.println(miarray2[2]);
		
		// EN ARRAYLIST PODEIS GUARDAR CUALQUIER TIPO DE OBJETO
		

		// -------------------------------------------------------------------------------------------
		System.out.println("-".repeat(110));
		
		
		/*
		 * CLASE LINKEDLIST
		 * 
		 * La clase LinkedList es una clase muy parecida a la clase ArrayList vista 
		 * anteriormente pues
		 * 
		 * 		1º Permite el uso de datos repetidos
		 * 		2º Tiene un orden en los objetos registrados
		 * 
		 * salvo por varias difencias muy significativas
		 * 
		 * 		1º Es mas eficiente a la hora de insertar o eliminar 
		 * 		datos que un ArrayList - VENTAJA 
		 * 
		 * 		2º A la hora de desplazarse o leer el LinkedList,
		 * 		tardara bastante, y cuanto mas grande sea mas
		 * 		tardara - DESVENTAJA
		 * 
		 * 		3º LinkedList es una coleccion con doble enlazamiento
		 * 		es decir cada uno de sus objetos estan vinculados por
		 * 		un enlace, tanto al objeto anterior como al posterior
		 * 
		 * Digo que es parecida, porque
		 *  
		 * 		Ambas tienen metodos muy similares, con funciones similares, pero 
		 * 		sin embargo cada clase posee metodos propios que no posee la otra
		 * 		como por ejemplo removeAll, ese metodo no esta disponible para la
		 * 		clase ArrayList
		 * 		
		 * 		Ambas implementan la clase List
		 * 
		 * 		Sus objetos se indexan a partir del numero 0 
		 * 
		 * https://es.stackoverflow.com/questions/172954/cuando-es-mejor-usar-linkedlist-y-cuando-arraylist#:~:text=LinkedList%20y%20ArrayList%20son%20dos%20implementaciones%20diferentes%20de,lo%20implementa%20con%20una%20matriz%20de%20redimensionamiento%20din%C3%A1mico.
		 * https://stackoverflow.com/questions/322715/when-to-use-linkedlist-over-arraylist-in-java
		 * 
		 * */
		
		LinkedList<Integer> num = new LinkedList<Integer>(); 
		num.add(7); 
		num.add(2); 
		num.add(3); 
		num.add(null); 
		num.add(1); 
		num.add(2); 
		num.add(8);
		
		System.out.println(num.size());
		
		num.removeLast(); // EXCLUSIVO DE LINKEDLIST
		
		System.out.println(num.size());
		
		
		
		System.out.println(num.getLast()); // EXCLUSIVO DE LINKEDLIST
		
		num.add(8);
		
		System.out.println(num.getLast()); // EXCLUSIVO DE LINKEDLIST
		
		
		System.out.println(num.getFirst()); // EXCLUSIVO DE LINKEDLIST
		
		System.out.println(num.peek()); // EXCLUSIVO DE LINKEDLIST

		System.out.println(num.peekFirst()); // EXCLUSIVO DE LINKEDLIST
		
		System.out.println(num.peekLast()); // EXCLUSIVO DE LINKEDLIST
		
		
		
		System.out.println(num.toString());
		
		num.pollLast(); // EXCLUSIVO DE LINKEDLIST
		
		System.out.println(num.toString());
		
		num.pollFirst(); // EXCLUSIVO DE LINKEDLIST
		
		System.out.println(num.toString());
		
		num.poll(); // EXCLUSIVO DE LINKEDLIST
		
		System.out.println(num.toString());
		
		
		
		
		num.offerFirst(2); // EXCLUSIVO DE LINKEDLIST
		
		System.out.println(num.toString());
		
		num.offer(7); // EXCLUSIVO DE LINKEDLIST
		
		System.out.println(num.toString());
		
		num.offerLast(8); // EXCLUSIVO DE LINKEDLIST
		
		System.out.println(num.toString());
		
		
		num.addFirst(7); // EXCLUSIVO DE LINKEDLIST
		
		num.addLast(9); // EXCLUSIVO DE LINKEDLIST
		
		System.out.println(num.toString());
		
		num.pop(); // EXCLUSIVO DE LINKEDLIST
		
		System.out.println(num.toString());
		
		num.addLast(9); // EXCLUSIVO DE LINKEDLIST
		
		System.out.println(num.toString());
		
		num.push(7); // EXCLUSIVO DE LINKEDLIST
		
		System.out.println(num.toString());
		
		/*
		 * CON ARRAYLIST Y CON LINKENDLIST PUEDES PASAR YA A LOS ITERADORES, LO DE ABAJO ES OPCIONAL
		 * APRENDERLO, VIENE BIEN
		 * 
		 * */
		
		// -------------------------------------------------------------------------------------------
		System.out.println("-".repeat(110));
		

		// -------------------------------------------------------------------------------------------
		System.out.println("-".repeat(110));
		
		
		// -------------------------------------------------------------------------------------------
		System.out.println("-".repeat(110));

		//_________________________________________________________________________________________
		System.out.println("_".repeat(110));
		
		/*
		 * COLECCION SET (Listas;Lineales;Conjuntos)
		 * 
		 * Una Set, es un tipo de coleccion que no permite NODOS duplicados
		 * 
		 * */
		
		
		//_________________________________________________________________________________________
		System.out.println("_".repeat(110));
		
		
		
		/*
		 * COLECCION MAP (Listas;Lineales;Pilas)
		 * 
		 * 
		 * */
		
		
		//_________________________________________________________________________________________
		System.out.println("_".repeat(110));
		
		
		/*
		 * COLECCION QUEUE (Listas;Lineales;Colas)
		 * */
		
		//_________________________________________________________________________________________
		System.out.println("_".repeat(110));
		
	}

}
