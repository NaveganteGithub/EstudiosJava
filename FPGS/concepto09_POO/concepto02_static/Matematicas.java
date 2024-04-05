package conceptos.paso1_Basicos.concepto09_POO.concepto02_static;

public class Matematicas {

	/*
	 * EL MODIFICADOR STATIC
	 * 
	 * Un elemento estático es un elemento que se puede acceder sin 
	 * tener que instanciar la clase
	 * 
	 * Con static estamos declarando que un elemento (metodo o atributo)
	 * sea estatico, es decir, que cuando se invoque no haya necesidad 
	 * de instanciar una clase, ya sea un metodo o un atributo, podemos
	 * invocarlo sin la necesidad de instanciar la clase solamente 
	 * 
	 * Con static estamos declarando que el objeto no se copie, es decir,
	 * normalmente cuando utilizamos un metodo o una instancia de una
	 * clase lo que pasa es que esta se hace una copia y luego se ejecuta
	 * pero para los metodos static el procedimiento es totalmente distinto
	 * 
	 * Un elemento estático no puede acceder a un elemento que no es estático; 
	 * pero puede acceder un elemento estático a otro elemento que sea estático; 
	 * un elemento que no es estático puede acceder a un elemento que 
	 * si sea estático o que no sea estático.
	 * 
	 * Los campos de una clase declarados cómo static son inicializados en 
	 * el momento en que se carga la clase en memoria, respetando el orden
	 * de declaración, ejemplo, los campos declarados cómo estáticos 
	 * podemos ponerlos fuera de los métodos
	 * 
	 * 
	 * */
	
	static int resultado;
	
	public static int getResultado() {
		return resultado;
	}

	Matematicas() {}
	
	public static void suma(int factorial1, int factorial2) {
		resultado = factorial1 + factorial2;
	}
	
}
