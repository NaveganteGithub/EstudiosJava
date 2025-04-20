package paso2_Avanzados.concepto09_POO.concepto04_Recursion;

public class Concepto9 {

	public static void main(String[] args) {
		
		// TODO Recursion
		
		Recursion recursion = new Recursion();
		
		recursion.factorial(5, 1, 0);
		
		System.out.println(recursion.factorial(5));
		
		// System.out.println(recursion.factorial2(5));
		
		// Se inicializaria primero con un dato incial al arrancar el proceso
		System.out.println(recursion.comprobarEstado(0));
		
		int[] prueba = new int[50];
		
		for (int i = 0; i < prueba.length; i++)
			prueba[i] = i;
		
		Recursion.busquedaBinariaRecursiva(0, prueba.length - 1, 12, prueba);
		
	}

}
