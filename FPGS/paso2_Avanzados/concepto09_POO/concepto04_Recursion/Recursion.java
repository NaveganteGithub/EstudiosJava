package paso2_Avanzados.concepto09_POO.concepto04_Recursion;

import java.util.Scanner;

public class Recursion {
	
	private String[] estados = {"Inicializado", "Ejecucion", "Supendido o Espera", "Tiempo finalizado", "Finalizado"};
	private Scanner dato_recibido = new Scanner(System.in);
	private String dato;
	private int estado;
	
	Recursion() {}
	
	// Un factorial es un metodo que se llama a si mismo
	public void factorial(int factorial, int contador, int resultado) {
		
		if(contador <= factorial)
			factorial(factorial, 
						contador + 1, 
						resultado != 0 ? resultado *= contador : 1
						);
		else
			System.out.println(factorial + " es " + resultado);
			
	}
	
	/* 
	 * Al parecer la recursion continua en este caso, pues return deberia de
	 * parar la recursion, pero parece ser, que si poner el metodo recursivo
	 * en el return la recursion continuara a pesar de que retornamos, pero,
	 * eso si, porque estamos diciendo que nos devuelva el valor final de la
	 * recursion que estamos haciendo
	 * 
	 * */
	public int factorial(int factorial) {
		
		if(factorial <= 1)
			return 1;
		else
			return factorial*factorial(factorial - 1);
			
	}

	/* 
	 * Debemos siempre ser precaviados con la recursion porque posiblemente
	 * hagamos un metodo infinito que nunca pare, y eso se ve reflejado, en
	 * la exception StackOverflowError
	 * 
	 * */
	public int factorial2(int factorial) {
		
		if(factorial == 100)
			return 1;
		else
			return factorial*factorial2(factorial - 1);
			
	}
	
	// Si utilizamos bien la recursion podemos hacer cosas interesantes
	public String comprobarEstado(int entrada_final) {
		
		System.out.print("El estado a cambiado: ");
		dato = dato_recibido.next();
		
		if(dato.equals("Si")) {
			System.out.print("Cual es el nuevo estado: ");
			estado = dato_recibido.nextInt();
			/* 
			 * Si haces return con solamente el metodo recursivo no devolvera 
			 * nada solamente utilizalo cuando en el metodo haya que devolver
			 * un dato
			 * 
			 * */
			// return comprobarEstado(entrada_final); 
			/*
			 * Utiliza este metodo de llamada a la recursion cuando no haya que devolver nada (void)
			 * */
			// comprobarEstado(entrada_final);
			/*
			 * Si quisieramos devolver un valor y al mismo tiempo utilizar la recursion en un metodo
			 * que pide que devuelva un dato en concreto utilizariamos, pero eso si, devolvera todos 
			 * concatenados una vez termine la recursion  y ten en cuenta que se concatenara primero
			 * el valor devuelto cuando se ejecuto el metodo, es decir :
			 *  		Primero iria inicializado, puesto que ese el primer valor que concatena al
			 *  		invocar el metodo en el main
			 *  		Segundo invocara todos los valores devueltos durante la recursion
			 * 
			 * */
			return estados[entrada_final] + "\n" + comprobarEstado(estado);
		}
		
		dato_recibido.close();
		return estados[entrada_final];
		
		// Se tendria que probar este metodo con un registro a un fichero a ver que ocurre
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
	
}
