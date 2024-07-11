package concepto09_POO.concepto01_Basico.explicacion_documentada;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Concepto9 {

	/* 
	 * Concepto 0
	 * 
	 * POO - Programming Oriented Objects - Programación orientada a objetos
	 * 
	 * Un objeto a todo aquello a lo que podemos 
	 * asociar a un concepto
	 * 
	 * Los sustantivos que se estudian en lengua 
	 * en la parte de gramatica, es lo que viene 
	 * siendo un objeto en informatica o en POO.
	 * 
	 * Todo puede ser un objeto, animales, plantas, 
	 * humanos, llaves incluso, todo objeto puede 
	 * ser tangible (como una llave) e intangible 
	 * (como la temperatura), animado e inanimado, 
	 * tambien toda entidad tanto fisica como
	 * abstracta, es representada mediante un
	 * objeto, tanto en la informatica como en la
	 * programacion POO:
	 * 
	 * Ya sea un perro, un gato, un balon, un PC,
	 * la temperatura, la luz, el viento, los 
	 * vecinos
	 * 
	 * Para que algo se considere un objeto tiene
	 * que tener los siguiente elementos :
	 * 
	 * 		Un comportamiento o varios comportamientos - 
	 * 		En java seria un metodo o varios metodos
	 * 
	 * 		Un estado o varios estados - 
	 * 		En Java seria un atributo o 
	 * 		varios atributos
	 * 
	 * 		Una identidad (un identificador o un nombre) -
	 * 		En Java seria el nombre del objeto, ya sea
	 * 		una clase, o un objeto instanciado
	 * 
	 * ----------- En POO todo es un objeto --------------
	 * 
	 * Diferencia entre clase y objeto 
	 * 
	 * 		Objeto : elemento que va a tener propiedades 
	 * 		(o atributos), y comportamiento (o metodos)
	 * 		ya definidos
	 * 
	 * 		Clase :
	 * 			Definicion 1: un tipo de dato que 
	 * 			por ser ese tipo de dato podra 
	 * 			hacer unas cosas u otras;
	 * 			Definicion 2: es una plantilla o prototipo 
	 * 			de objeto, es decir, una clase es 
	 * 			una plantilla para crear (o definir)
	 * 			un objeto; 
	 * 
	 * https://filosofia.co/preguntas/diferencia-entre-clase-y-objeto-en-java/
	 *   
	 * */

	/* 
	 * Por cada programa escrito en Java, hay un solo metodo main 
	 * por programa java que va a lo basico, por lo tanto si 
	 * quieres leer un programa escrito en Java empieza por el 
	 * metodo main de clase controladora
	 * 
	 * Divide y venceras
	 * 
	 * A la hora de escribir un programa muy grande para solucionar
	 * un problema gordo, tienes que quedarte con el concepto y por
	 * supuesto con la situacion del problema, despues divide el 
	 * problema en partes mas pequeñas, y da solucion a cada una de
	 * las partes del problema mediante la programacion POO
	 * 
	 * */
	public static void main(String[] args) {
		
		/* 
		 * Sexto concepto:
		 * 
		 * Como podemos observar a si se instancia una clase
		 *  
		 * */
		CalculosFechas calculosFechas = new CalculosFechas(new GregorianCalendar(2000, Calendar.APRIL, 12), new GregorianCalendar(2020, Calendar.APRIL, 12));// Esto es un objeto
		/*
		 * 
		 * Podemos comprobar que se crean dos objetos nuevos diferentes,
		 * aislados y separados a partir del objeto CalculosFechas, lo
		 * puede ver con System.out.println
		 * 
		 * */
		System.out.println(calculosFechas);
		System.out.println();
		
		/*
		 * Septimo concepto:
		 * Si una variable de clase o atributo tiene un 
		 * modificador de acceso permisimo como public
		 * puedes leerlo o modificarlo de la siguiente 
		 * manera 
		 * 
		 * NO RECOMENDABLE UTILIZAR ESTE RECURSO SOLO
		 * ESTA AQUI PARA PURO ENTENDIENTO DEL LENGUAJE
		 * JAVA, EL MOTIVO ESTA EXPUESTO EN EL SEGUNDO
		 * CONCEPTO DENTRO DE LA CLASE CalculosFechas
		
		System.out.println(calculosFechas.dia); // Para leer una variable de clase 
		calculosFechas.dia = 12; // Para modificar una variable de clase
		
		
		*
		*
		*/
		
		calculosFechas.EntreFechas();
		System.out.println();
		
		System.out.println("-".repeat(110).concat("\n"));
		
		CalculosFechas calculosFechas2 = new CalculosFechas(); // Esto es un objeto
		System.out.println(calculosFechas2);
		System.out.println();
		
		System.out.println("-".repeat(110).concat("\n"));
		
		calculosFechas.EntreFechas();
		calculosFechas = new CalculosFechas(new GregorianCalendar(2022, Calendar.SEPTEMBER, 29), new GregorianCalendar(2023, Calendar.APRIL, 20)); // Esto es un objeto
		calculosFechas.EntreFechas();
		calculosFechas = new CalculosFechas(new GregorianCalendar(2022, Calendar.SEPTEMBER, 29), new GregorianCalendar(2022, Calendar.OCTOBER, 29)); // Esto es un objeto
		calculosFechas.EntreFechas();
		calculosFechas = new CalculosFechas(new GregorianCalendar(2022, Calendar.OCTOBER, 29), new GregorianCalendar(2022, Calendar.OCTOBER, 29)); // Esto es un objeto
		calculosFechas.EntreFechas();
		calculosFechas = new CalculosFechas(new GregorianCalendar(2022, Calendar.OCTOBER, 29), new GregorianCalendar(2023, Calendar.OCTOBER, 29)); // Esto es un objeto
		calculosFechas.EntreFechas();
		calculosFechas = new CalculosFechas(new GregorianCalendar(2022, Calendar.OCTOBER, 29), new GregorianCalendar(2023, Calendar.OCTOBER, 28)); // Esto es un objeto
		calculosFechas.EntreFechas();
		calculosFechas = new CalculosFechas(new GregorianCalendar(2022, Calendar.OCTOBER, 29), new GregorianCalendar(2022, Calendar.DECEMBER, 1)); // Esto es un objeto
		calculosFechas.EntreFechas();
		calculosFechas = new CalculosFechas(new GregorianCalendar(2022, Calendar.OCTOBER, 29), new GregorianCalendar(2022, Calendar.DECEMBER, 5)); // Esto es un objeto
		calculosFechas.EntreFechas();
		calculosFechas = new CalculosFechas(new GregorianCalendar(2022, Calendar.OCTOBER, 28), new GregorianCalendar(2022, Calendar.DECEMBER, 5)); // Esto es un objeto
		calculosFechas.EntreFechas();
		calculosFechas = new CalculosFechas(new GregorianCalendar(2022, Calendar.OCTOBER, 1), new GregorianCalendar(2023, Calendar.OCTOBER, 1)); // Esto es un objeto
		calculosFechas.EntreFechas();
		calculosFechas = new CalculosFechas(new GregorianCalendar(2022, Calendar.OCTOBER, 1), new GregorianCalendar(2023, Calendar.OCTOBER, 30)); // Tenemos que tener en cuenta los 29 dias del ultimo mes
		calculosFechas.EntreFechas();
		calculosFechas = new CalculosFechas(new GregorianCalendar(2024, Calendar.OCTOBER, 1), new GregorianCalendar(2025, Calendar.OCTOBER, 30));
		calculosFechas.EntreFechas();
		calculosFechas = new CalculosFechas(new GregorianCalendar(2024, Calendar.OCTOBER, 1), new GregorianCalendar(2025, Calendar.OCTOBER, 15));
		calculosFechas.EntreFechas();
		calculosFechas = new CalculosFechas(new GregorianCalendar(2023, Calendar.OCTOBER, 1), new GregorianCalendar(2024, Calendar.OCTOBER, 30)); // Aqui sale 395 en vez de 394 porque 2024 es bisiesto
		calculosFechas.EntreFechas();
		System.out.println();
		
		System.out.println("-".repeat(110));
		
		System.out.println();
		
		// System.out.println(1);
		calculosFechas2.CuantoFalta(new GregorianCalendar(2022, Calendar.DECEMBER, 29));
		// System.out.println(2);
		calculosFechas2.CuantoFalta(new GregorianCalendar(2022, Calendar.OCTOBER, 29));
		// System.out.println(3);
		calculosFechas2.CuantoFalta(new GregorianCalendar(2022, Calendar.SEPTEMBER, 29)); // Fecha de hoy
		// System.out.println(4);
		calculosFechas2.CuantoFalta(new GregorianCalendar(2022, Calendar.OCTOBER, 24));
		// System.out.println(5);
		calculosFechas2.CuantoFalta(new GregorianCalendar(2022, Calendar.APRIL, 24));
		// System.out.println(6);
		calculosFechas2.CuantoFalta(new GregorianCalendar(2023, Calendar.APRIL, 24));
		calculosFechas2.CuantoFalta(new GregorianCalendar(2023, Calendar.SEPTEMBER, 29));
		calculosFechas2.CuantoFalta(new GregorianCalendar(2023, Calendar.SEPTEMBER, 28));
		// System.out.println(7);
		calculosFechas2.CuantoFalta(new GregorianCalendar(2024, Calendar.APRIL, 24));
		// System.out.println(8);
		calculosFechas2.CuantoFalta(new GregorianCalendar(2029, Calendar.APRIL, 24));
		calculosFechas2.CuantoFalta(new GregorianCalendar(2025, Calendar.SEPTEMBER, 29));
		calculosFechas2.CuantoFalta(new GregorianCalendar(2026, Calendar.SEPTEMBER, 29));
		
	}
	
}
