package conceptos.paso1_Basicos.concepto09_POO.concepto01_Basico.explicacion_grabada;

public class ClaseControladora {

	public static void main(String[] args) {
		
		// TODO Poo - Clase Controladora

		System.out.println("Parte 1");
		
		// Una vez preparados los constructores y los metodos de tu clase no controladora ya podras utilizarla
		
		ClaseNoControladora clase = new ClaseNoControladora(4,3); 
		/* 
		 * Instanciando un objeto de la clase ClaseNoControladora o 
		 * el nombre que le des a tu clase recuerda que las clases 
		 * que tu crees pueden ir con el nombre que tu quieras
		 * 
		 * Recuerda siempre utilizar new para instanciar la clase no
		 * te olvides
		 * 
		 * */
		
		clase.suma(); // Esta no imprime porque devuelve un resultado mediante return pero no lo imprimimos
		
		clase.sumaImprimida(); // Esta si imprime porque imprime el resultado directamente desde el metodo
		
		System.out.println(clase.suma()); // ESta si imprime porque a parte de devolver datos a traves de suma lo imprimimos
		
		System.out.println("Parte 2");
		
		ClaseNoControladora clase2 = new ClaseNoControladora(5,2);
		
		clase2.sumaImprimida(); // Esta esta bien
		
		// Da fallo porque hemos cambiado el modificador de acceso a private
		// clase2.factor1 = 7; // <----- Aqui esta el fallo, no se debe de acceder a las variables de clase directamente porque 
		// puede llegar a ser manipulada para que de un valor distinto y eso de como resultado un fallo en el programa
		
		clase2.sumaImprimida(); // Esta no esta bien
		
		System.out.println("Parte 3");
		
		// Podemos reutilizar las variables de los objetos instanciando otra nueva clase en la variable
		
		clase2 = new ClaseNoControladora();
		
		clase2.sumaImprimida(); // No devuelve nada porque no hemos insertado un valor
		
		clase2.setFactor1(4);
		clase2.setFactor2(8);
		
		clase2.sumaImprimida();
		
	}

}
