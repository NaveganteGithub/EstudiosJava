package paso2_Avanzados.concepto12_Arrays_Busqueda_Ordenacion;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Concepto12ArraysBusquedaOrdenacion {

	public static void main(String[] args) {
		
		// TODO Arrays y metodos de busqueda y ordenacion de arrays
		
		// ________________________ Arrays_________________________
		
		int[] numeros = new int[4];
		numeros[0] = 57;
		numeros[1] = 4;
		numeros[2] = 1;
		numeros[3] = 3;
		
		System.out.println(numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros[2]);
		System.out.println(numeros[3]);
		
		int numeros_objeto[] = {57, 4, 7, 6};
		
		System.out.println(numeros_objeto[1]);
		System.out.println(numeros_objeto[3]);
		
		String[] textos = new String[8];
		textos[0] = "Hola Dios";
		textos[1] = "Paz, amor, paciencia y misedicorida";
		textos[2] = "Hola pepe";
		textos[3] = "! /";
		textos[4] = "4qt34bg6234v34 +4+25+9+9t4+";
		textos[5] = "Hola ññññññññññññññññññññ";
		textos[6] = "Hola Daniel";
		textos[7] = "Hola David";
		
		System.out.println(textos[1]);
		
		byte[] bytes_rellenados = new byte[7];
		bytes_rellenados[0] = -119;
		bytes_rellenados[1] = -128;
		bytes_rellenados[2] = 79;
		bytes_rellenados[3] = 127;
		bytes_rellenados[4] = 47;
		bytes_rellenados[5] = -1;
		bytes_rellenados[6] = -11;
		
		System.out.println(bytes_rellenados[4] + " - " + (char) bytes_rellenados[4]);
		

		System.out.println("Array unidimensional");
		short[] unidimensional = new short[10];
		
		for (int i = 0; i < unidimensional.length; i++)
			unidimensional[i] = (short) ((Math.random() * 10000) + 1);
		
		for (short s : unidimensional)
			System.out.print(s + " ");
		
		System.out.println();
		System.out.println("Array bidimensional");
		// En un array bidimensional se interactua con cada una 
		// de las casillas a traves de acceder a cada fila de
		// arriba a abajo navegando por la columna
		short[][] bidimensional = new short[10][2];
		//							     Filas  Columnas
		
		for (int columnas = 0; columnas < bidimensional[0].length; columnas++)
			for (int filas = 0; filas < bidimensional.length; filas++)
				bidimensional[filas][columnas] = (short) ((Math.random() * 10000) + 1);
		
		/*for (short[] s : bidimensional) {
			for (short ts : s) {
				System.out.println(ts);
			}
		}*/ 
		
		
		for (int columnas = 0; columnas < bidimensional[0].length; columnas++) {
			for (int filas = 0; filas < bidimensional.length; filas++) {
				System.out.print(bidimensional[filas][columnas] + " | ");
				
			}
			System.out.println();
		}
		
		System.out.println("Array tridimensional");
		short[][][] tridimensional = new short[10][5][3];
		
		for (int profundidad = 0; profundidad < tridimensional[0][0].length; profundidad++)
			for (int columnas = 0; columnas < tridimensional[0].length; columnas++)
				for (int filas = 0; filas < tridimensional.length; filas++)
					tridimensional[filas][columnas][profundidad] = (short) ((Math.random() * 10000) + 1);
		
		for (int profundidad = 0; profundidad < tridimensional[0][0].length; profundidad++) {
			for (int columnas = 0; columnas < tridimensional[0].length; columnas++) {
				for (int filas = 0; filas < tridimensional.length; filas++) {
					System.out.print(tridimensional[filas][columnas][profundidad] + " | ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		// Y no solo existen estos tipos de arrays tambien existen
		
		// short[][][][] cuartadimensionales = new short[20][10][5][2];
		// short[][][][][] quintadimensionales = new short[50][20][10][4][3];
		// short[][][][][][] sextadimensionales = new short[100][50][30][20][10][5];
		// short[][][][][][][] septimadimensionales = new short[412][125][12][100][21][12][47];
		
		// como apunte cabe recalcar que cada vez que aumentes mas el numero de dimensiones que
		// puede tener el array, mas complejo y dificil sera el leerlo o utilizarlo, así pues
		// te recomiento que dividas todas las dimensiones del array en arrays bidimensionales
		// y uno unidimensional en caso de que quedara una ultima dimension, recuerda divide
		// y venceras
		
		// _____________________ Tecnicas de busqueda en arrays ___________________________________
		
		// ---------------------------- Busqueda lineal -------------------------------------------
		
		int posicion = 0, elemento_a_buscar;
		boolean elemento_encontrado = false;
		Scanner buscamos = new Scanner(System.in);
		
		System.out.print("Elemento a buscar en forma lineal: ");
		elemento_a_buscar = buscamos.nextInt();
		
		while(!elemento_encontrado && posicion < numeros.length) {
			if (numeros[posicion] == elemento_a_buscar) {
				System.out.println("Elemento encontrado en la posicion " + posicion);
				elemento_encontrado = true;
			}
			posicion++;
		}
		
		// ----------------------------- Busqueda binario ---------------------------------
		
		int[] numeros_prueba = new int[50];
		
		// Consejo: si tu intencion es rellenar un array con 
		// varios numeros de forma ordenada utiliza for para
		// rellenar el array en vez de hacerlo manualmente
		for (int i = 0; i < numeros_prueba.length; i++)
			numeros_prueba[i] = i + 1;
		
		int minimo_array = 0, // Minimo del array
				maximo_array = numeros_prueba.length - 1, // Longitud del array
				centro_array_actual // Variable para señalar el principio del subarray
				;
		posicion = 0;
		elemento_encontrado = false;
		System.out.print("Elemento a buscar en forma binaria: ");
		elemento_a_buscar = buscamos.nextInt();
		
		while (!elemento_encontrado && minimo_array <= maximo_array) {
			
			// Se calculara cual sera el minimo del proximo subarray a 
			// analizar en el ciclo actual del bucle
			centro_array_actual = (maximo_array + minimo_array) / 2;
			
			// En caso de a ver encontrado el valor en el array terminaremos 
			// el bucle con un mensaje de salida incluido
			if(numeros_prueba[centro_array_actual] == elemento_a_buscar) {
				
				elemento_encontrado = true;
				posicion = centro_array_actual;
				System.out.println("Elemento encontrado en la posicion " + posicion);
				
			} 
			// En caso de que el elemento a buscar resulta que es menor al elemento del
			// array que estamos analizando en el ciclo actual del bucle entonces 
			// reduciremos el rango maximo del array, convirtiendo el array en subarray
			// más pequeño
			else if(elemento_a_buscar < numeros_prueba[centro_array_actual])
				maximo_array = centro_array_actual - 1;
			// En caso de que el elemento a buscar resulta ser mayor al elemento de la
			// posicion del array analizada en cada ciclo, reduciremos el array cambiando
			// el valor minimo del array a un valor superior para reducir el array
			else
				minimo_array = centro_array_actual + 1;
			
		}
		
		// ----------------------- Busqueda binaria recursiva ---------------------------------

		// Iniciaremos de nuevo las variables del minimo y el maximo para que no den problemas
		// a la hora de hacer la suma y division del subarrray
		minimo_array = 0;
		maximo_array = numeros_prueba.length - 1;
		
		System.out.print("Elemento a buscar en forma binaria recursiva: ");
		elemento_a_buscar = buscamos.nextInt();
		
		busquedaBinariaRecursiva(minimo_array, maximo_array, elemento_a_buscar, numeros_prueba);
		
		buscamos.close();
		
		// ____________________ Tecnicas de ordenacion de arrays __________________________________
		
		int[] numeros_aleatorios = new int[50];
		
		for (int i = 0; i < numeros_aleatorios.length; i++)
			numeros_aleatorios[i] = (int) ((Math.random() * 10000) + 1);
		
		// ----------------- Metodo burbuja o metodos de intercambio ------------------
		
		int aux;

		System.out.println("Metodo burbuja");
		for (int i = 0; i < numeros_aleatorios.length; i++)
			for (int j = 0; j < numeros_aleatorios.length - 1; j++)
				if(numeros_aleatorios[j] > numeros_aleatorios[j + 1]) {
					aux = numeros_aleatorios[j + 1];
					numeros_aleatorios[j + 1] = numeros_aleatorios[j];
					numeros_aleatorios[j] = aux;
				}
		
		for (int i = 0; i < numeros_aleatorios.length; i++)
			System.out.println(numeros_aleatorios[i]);
		
		for (int i = 0; i < numeros_aleatorios.length; i++)
			numeros_aleatorios[i] = (int) ((Math.random() * 10000) + 1);

		// ----------- Metodo burbuja o metodos de intercambio version mejorada ----------------
		
		aux = 0;
		boolean cambio = true;

		// El truco esta en poner la variable booleana en el bucle externo
		// para detener completamento los dos bucles cuando termina 
		System.out.println("Metodo burbuja mejorado");
		for (int i = 0; i < numeros_aleatorios.length && cambio; i++) {
			// System.out.println("Ciclo: " + i);
			cambio = false;
			
			for (int j = 0; j < numeros_aleatorios.length - 1; j++)
				if(numeros_aleatorios[j] > numeros_aleatorios[j + 1]) {
					aux = numeros_aleatorios[j + 1];
					numeros_aleatorios[j + 1] = numeros_aleatorios[j];
					numeros_aleatorios[j] = aux;
					cambio = true;
				}
			
		}
		
		for (int i = 0; i < numeros_aleatorios.length; i++)
			System.out.println(numeros_aleatorios[i]);
		
		for (int i = 0; i < numeros_aleatorios.length; i++)
			numeros_aleatorios[i] = (int) ((Math.random() * 10000) + 1);
		
		// --------------------- Metodo de ordenacion por seleccion --------------------------
		
		aux = 0;
		
		System.out.println("Metodo de ordenacion por seleccion.");
		for (int i = 0; i < numeros_aleatorios.length; i++) {
			for (int j = 0; j < numeros_aleatorios.length; j++) {
				// Con esta condicional podemos el array en orden invertido
				// if(numeros_aleatorios[i] > numeros_aleatorios[j])
				
				// Con esta condicional podemos poner en order directo
				// el array
				if(numeros_aleatorios[j] > numeros_aleatorios[i]) {
					aux = numeros_aleatorios[j];
					numeros_aleatorios[j] = numeros_aleatorios[i];
					numeros_aleatorios[i] = aux;
				}
				
			}
		}
		
		for (int i : numeros_aleatorios) {
			System.out.println(i);
		}

		for (int i = 0; i < numeros_aleatorios.length; i++)
			numeros_aleatorios[i] = (int) ((Math.random() * 10000) + 1);
		
		// --------------------- Metodo de inserccion directa --------------------------------
		
		aux = 0;
		int resultado = 0, apaño = 0;
		
		System.out.println("Metodo de inserccion directa");
		for (int i = 2; i < numeros_aleatorios.length; i++) {
			
			aux = numeros_aleatorios[i];
			resultado = i - 1;
			
			while(numeros_aleatorios[resultado] > aux && resultado > 1) {
				
				numeros_aleatorios[resultado + 1] = numeros_aleatorios[resultado];
				resultado = resultado - 1;
				
			}
			
			if(numeros_aleatorios[resultado] > aux) {
				
				numeros_aleatorios[resultado + 1] = numeros_aleatorios[resultado];
				numeros_aleatorios[resultado] = aux;
				
			} else {
				
				numeros_aleatorios[resultado + 1] = aux;
				
			}
		
		}
		
		// Arreglo de metodo de inserccion directa, pues parece ser que no ordena
		// el primer numero del array, el de la posicion 0 no lo ordena.
		
		aux = 0;
		
		for (int k = 1; k < numeros_aleatorios.length; k++)
			if(numeros_aleatorios[k] < numeros_aleatorios[apaño]) {
				aux = numeros_aleatorios[apaño];
				numeros_aleatorios[apaño] = numeros_aleatorios[k];
				numeros_aleatorios[k] = aux;
				apaño++;
			} else break;
					
		
		for (int i : numeros_aleatorios) {
			System.out.println(i);
		}

		for (int i = 0; i < numeros_aleatorios.length; i++)
			numeros_aleatorios[i] = (int) ((Math.random() * 10000) + 1);
		
		// -------------------------------- Metodo Shell -----------------------------------------
		
		int distancia, resultado2;
		
		distancia = numeros_aleatorios.length / 2;
		
		apaño = aux = resultado = 0;
		
		System.out.println("Metodo de la Shell");
		while (distancia > 0) {
			
			for (int i = distancia + 1; i < numeros_aleatorios.length; i++) {
				
				resultado = i - distancia;
				
				while(resultado > 0) {
					
					resultado2 = resultado + distancia;
					
					if(numeros_aleatorios[resultado] <= numeros_aleatorios[resultado2]) {
						resultado = 0;
					} else {
						aux = numeros_aleatorios[resultado];
						numeros_aleatorios[resultado] = numeros_aleatorios[resultado2];
						numeros_aleatorios[resultado2] = aux;
						resultado -= distancia;
					}
					
				}
				
			}
			
			distancia /= 2;
			
			
		}
		// Arreglo de metodo de inserccion directa, pues parece ser que no ordena
		// el primer numero del array, el de la posicion 0 no lo ordena.
		
		aux = 0;
			
		for (int k = 1; k < numeros_aleatorios.length; k++)
			if(numeros_aleatorios[k] < numeros_aleatorios[apaño]) {
				aux = numeros_aleatorios[apaño];
				numeros_aleatorios[apaño] = numeros_aleatorios[k];
				numeros_aleatorios[k] = aux;
				apaño++;
			} else break;
		
		for (int i : numeros_aleatorios) {
			System.out.println(i);
		}
		
		// -------------------- Metodo de ordenacion rápida o Quick Sort ---------------------------
		
		
		
		// _____________________ Medotos del objeto Arrays de java.util ____________________________
		
		Arrays.fill(numeros_aleatorios, 57);
		
		System.out.println(Arrays.toString(numeros_aleatorios));

		for (int i = 0; i < numeros_aleatorios.length; i++)
			numeros_aleatorios[i] = (int) ((Math.random() * 10000) + 1);
		
		System.out.println(Arrays.toString(numeros_aleatorios));
		
		Arrays.sort(numeros_aleatorios);
		System.out.println(Arrays.toString(numeros_aleatorios));
		
		// Alternativa a la busqueda binaria y a la busqueda binaria recursiva
		System.out.println(Arrays.binarySearch(numeros_prueba, 30)); 
		
		System.out.println();
		
		int valores_permitidos[] = {23, 24, 25};
		
		for (int i = 0; i <= 100; i++) 
			// Solo los valores que hayan sido registrados en el array estaran permitidos
			if(Arrays.binarySearch(valores_permitidos, i) >= 0) 
				System.out.println(i + " - Valor permitido");
			else // Los que no esten permitidos pasaran por el else
				System.out.println(i + " - Valor no permitido");
		
		System.out.println();
		
		// _________________ Metodos del objeto Array de java.lang.Reflect _______________________
		
		System.out.println(Array.get(numeros_prueba, 0));
		System.out.println(Array.get(numeros_prueba, 2));
		System.out.println(Array.get(numeros_prueba, numeros_prueba.length - 1));
		
		
	}
	
	public static void busquedaBinariaRecursiva(int minimo_array, int maximo_array, int elemento_a_buscar, int[] array_analizar) {
		
		int centro_array_actual_recursivo; // Se creara una variable
		// Se realizara el calculo para determinar cual sera el subarray (o parte del array) a analizar,
		// recuerda que no se crea un subarray literalmente, sino que, se analiza la parte que determina
		// este calculo, así que "se crea", un subarray mas bien, conceptual, esto aplica tambien lo que
		// viene a siendo la busqueda binaria sin recursion, es decir, la anterior busqeuda hecha.
		centro_array_actual_recursivo = (maximo_array + minimo_array) / 2;
		
		// En caso de que se encuentre el valor finalizara la recursion, y mostrara un mensaje por pantalla
		if(array_analizar[centro_array_actual_recursivo] == elemento_a_buscar)
			 System.out.println("Valor encontrado en la posicion " + centro_array_actual_recursivo);
		else { // Si ese no fuera el caso
			
			// Se determinara si el elemento a buscar, es menor que el elemento del array analizado,
			// en caso de que el elemento a buscar es menor que el elemento array analizado, pues se
			// acortara por el valor maximo, que no fuera ese el caso se reducira el valor minimo de
			// este subarray
			if(elemento_a_buscar < array_analizar[centro_array_actual_recursivo])
				maximo_array = centro_array_actual_recursivo - 1;
			else
				minimo_array = centro_array_actual_recursivo + 1;
			
			// Para que continue el metodo haremos que se llame a si mismo, es decir, que se aplicara
			// una Recursion, este metodo se llamara a si mismo cuando no sea encontrado el elemento,
			// para ello se aplicara una condicional, que determina que si el calculo del subarray de
			// este actual ciclo de Recursion, no es igual, al calculo de ciclo anterior del subarray
			// pues que continue la Recursion, o una explicacio mas simple es que en caso de que este
			// subarray no tenga solo una posicion o espacio, pues que continue la Recursion hasta el
			// momento en el que el ultimo subarray resultante solo tenga un espacio (o una posicion)
			if((maximo_array + minimo_array) / 2 != centro_array_actual_recursivo)
				busquedaBinariaRecursiva(minimo_array, maximo_array, elemento_a_buscar, array_analizar);
			
		}
		
	}
	
	public static void ordenacionRapida(int[] array) {
		
	}

}
