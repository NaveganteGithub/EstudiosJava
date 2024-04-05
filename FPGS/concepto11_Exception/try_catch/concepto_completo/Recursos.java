package conceptos.paso1_Basicos.concepto11_Exception.try_catch.concepto_completo;

// Sexto: crearemos la clase o clases que van a tener nuestros metodos, con su constructor o constructores

public class Recursos {
	
	public Recursos() {}
	
	// Septimo: Creamos nuestro metodo de manera habitual
	/*
	 * public static int sumaPersonalizada(int factorial1, int factorial2, int factorial3, int factorial4) { 
	 * 		return factorial1 + ((factorial2 + factorial3) + factorial4); 
	 * }
	 * 
	 */
	
	/* 
	 * Octavo: declaramos que en el metodo, que se utilizara la excepcion creada MiExcepcion, con la declaracion throws
	 * que nos permite definir que el metodo va a utilizar una excepcion obligatoriamente, y a la hora de utilizarlo en
	 * el main te pedira un TryCatch de forma obligatoria con susodicha Excepcion
	 * */
	public static int sumaPersonalizada(String factorial1, String factorial2, String factorial3, String factorial4) throws MiExcepcion {
		
		/* 
		 * Noveno: se empezara a utilizar la excepcion creada MiExcepcion dentro del metodo, ¿como se utilizara?,
		 * pues diremos que en caso de que el dato pasado por parametro no cumple con lo que queremos hacer, entonces
		 * haremos que salte la excepcion MiExcepcion con la declaracion throw y la instancia de tu clase :
		 * 
		 * 		estructura :
		 * 			throw new [elNombreDeTuClaseExcepcionPersonalizada]();
		 * 		
		 * 		ejemplos :
		 * 			throw new MiExcepcion(); // Que es la que utilizamos
		 * 			throw new PatenteInvalida();
		 * 			throw new EcuacionIncompleta();
		 * 
		 * */
		if(!factorial1.matches("[0-9]+")) throw new MiExcepcion();
		
		if(!factorial2.matches("[0-9]+")) throw new MiExcepcion();
		
		if(!factorial3.matches("[0-9]+")) throw new MiExcepcion();
		
		if(!factorial4.matches("[0-9]+")) throw new MiExcepcion();
		
		return Integer.valueOf(factorial1) + ((Integer.valueOf(factorial2) + Integer.valueOf(factorial3)) + Integer.valueOf(factorial4));
	}
	
}
