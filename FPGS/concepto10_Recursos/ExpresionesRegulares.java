package conceptos.paso1_Basicos.concepto10_Recursos;

public class ExpresionesRegulares {

	public static void expresionesRegulares(String texto) {

		/* 
		 * EXPRESIONES REGULARES 
		 * 
		 * Las expresiones regulares son patrones que se utilizan para hacer coincidir
		 * conbinaciones de caracteres en cadenas.
		 * 
		 * https://developer.mozilla.org/es/docs/Web/JavaScript/Guide/Regular_Expressions
		 * 
		 * En Java para analizar una cadena con una expresion regular se utiliza el 
		 * metodo matches, y entre sus parentesis la expresion regular con la que 
		 * analizaremos el texto, para ver si cumple con los patrones que especificamos
		 * o no, si los cumple devolvera true, sino devolvera false
		 * 
		 * */
		System.out.println("Expresiones regulares del texto - " + texto);
		System.out.println("Expresion regular 1 - " + texto.matches("[A-Z]"));
		System.out.println("Expresion regular 2 - " + texto.matches("[A-Z]+"));
		System.out.println("Expresion regular 3 - " + texto.matches("[A-Z]*"));
		System.out.println("Expresion regular 4 - " + texto.matches("[A-Z]?"));
		
		System.out.println("Expresion regular 5 - " + texto.matches("[a-z]"));
		System.out.println("Expresion regular 6 - " + texto.matches("[a-z]+"));
		System.out.println("Expresion regular 7 - " + texto.matches("[a-z]*"));
		System.out.println("Expresion regular 8 - " + texto.matches("[a-z]?"));
		
		System.out.println("Expresion regular 9 - " + texto.matches("[0-9]"));
		System.out.println("Expresion regular 10 - " + texto.matches("[0-9]+"));
		System.out.println("Expresion regular 11 - " + texto.matches("[0-9]*"));
		System.out.println("Expresion regular 12 - " + texto.matches("[0-9]?"));
		
		System.out.println("Expresion regular 13 - " + texto.matches("[A-Za-z]"));
		System.out.println("Expresion regular 14 - " + texto.matches("[A-Za-z]+"));
		System.out.println("Expresion regular 15 - " + texto.matches("[A-Za-z]*"));
		System.out.println("Expresion regular 16 - " + texto.matches("[A-Za-z]?"));
		
		System.out.println("Expresion regular 17 - " + texto.matches("[A-Za-z' ']"));
		System.out.println("Expresion regular 18 - " + texto.matches("[A-Za-z' ']+"));
		System.out.println("Expresion regular 19 - " + texto.matches("[A-Za-z' ']*"));
		System.out.println("Expresion regular 20 - " + texto.matches("[A-Za-z' ']?"));
		
		System.out.println("Expresion regular 21 - " + texto.matches("[A-Za-z0-9' ']"));
		System.out.println("Expresion regular 22 - " + texto.matches("[A-Za-z0-9' ']+"));
		System.out.println("Expresion regular 23 - " + texto.matches("[A-Za-z0-9' ']*"));
		System.out.println("Expresion regular 24 - " + texto.matches("[A-Za-z0-9' ']?"));
		
		System.out.println("Expresion regular 25 - " + texto.matches("[a-z0-9' ']"));
		System.out.println("Expresion regular 26 - " + texto.matches("[a-z0-9' ']+"));
		System.out.println("Expresion regular 27 - " + texto.matches("[a-z0-9' ']*"));
		System.out.println("Expresion regular 28 - " + texto.matches("[a-z0-9' ']?"));
		
		System.out.println("Expresion regular 29 - " + texto.matches("[A-Z0-9' ']"));
		System.out.println("Expresion regular 30 - " + texto.matches("[A-Z0-9' ']+"));
		System.out.println("Expresion regular 31 - " + texto.matches("[A-Z0-9' ']*"));
		System.out.println("Expresion regular 32 - " + texto.matches("[A-Z0-9' ']?"));
		
		System.out.println("Expresion regular 33 - " + texto.matches("[0-9' ']"));
		System.out.println("Expresion regular 34 - " + texto.matches("[0-9' ']+"));
		System.out.println("Expresion regular 35 - " + texto.matches("[0-9' ']*"));
		System.out.println("Expresion regular 36 - " + texto.matches("[0-9' ']?"));
		
		System.out.println("Expresion regular 33 - " + texto.matches("['!@?¿^*´ ']"));
		System.out.println("Expresion regular 34 - " + texto.matches("['!@?¿^*´ ']+"));
		System.out.println("Expresion regular 35 - " + texto.matches("['!@?¿^*´ ']*"));
		System.out.println("Expresion regular 36 - " + texto.matches("['!@?¿^*´ ']?"));
		
		System.out.println("Expresion regular 37 - " + texto.matches("[A-Za-z ]"));
		System.out.println("Expresion regular 38 - " + texto.matches("[A-Za-z ]+"));
		System.out.println("Expresion regular 39 - " + texto.matches("[A-Za-z ]*"));
		System.out.println("Expresion regular 40 - " + texto.matches("[A-Za-z ]?"));
		
		System.out.println("Expresion regular 41 - " + texto.matches("[A-Za-z0-9 ]"));
		System.out.println("Expresion regular 42 - " + texto.matches("[A-Za-z0-9 ]+"));
		System.out.println("Expresion regular 43 - " + texto.matches("[A-Za-z0-9 ]*"));
		System.out.println("Expresion regular 44 - " + texto.matches("[A-Za-z0-9 ]?"));
		
		System.out.println("Expresion regular 45 - " + texto.matches("[a-z0-9 ]"));
		System.out.println("Expresion regular 46 - " + texto.matches("[a-z0-9 ]+"));
		System.out.println("Expresion regular 47 - " + texto.matches("[a-z0-9 ]*"));
		System.out.println("Expresion regular 48 - " + texto.matches("[a-z0-9 ]?"));
		
		System.out.println("Expresion regular 49 - " + texto.matches("[A-Z0-9 ]"));
		System.out.println("Expresion regular 50 - " + texto.matches("[A-Z0-9 ]+"));
		System.out.println("Expresion regular 51 - " + texto.matches("[A-Z0-9 ]*"));
		System.out.println("Expresion regular 52 - " + texto.matches("[A-Z0-9 ]?"));
		
		System.out.println("\n");
		
	}
	
	public static void main(String[] args) {
		
		// TODO Mathces, expresiones regulares
		
		System.out.println();
		
		ExpresionesRegulares.expresionesRegulares("Hola buenas tardes");
		ExpresionesRegulares.expresionesRegulares("Holabuenastardes");
		ExpresionesRegulares.expresionesRegulares("0521515");
		ExpresionesRegulares.expresionesRegulares("0521 515");
		ExpresionesRegulares.expresionesRegulares("4");
		ExpresionesRegulares.expresionesRegulares(" 90ury9g0u ut90");
		ExpresionesRegulares.expresionesRegulares(" 90ury9g0u UT90");
		ExpresionesRegulares.expresionesRegulares("     ");
		ExpresionesRegulares.expresionesRegulares(" ");
		ExpresionesRegulares.expresionesRegulares("");
		
		String texto;
		
		texto = "Buenas tardes";
		
		if(texto.matches("[A-Za-z' ']+")) System.out.println("Expresion valida");
		else System.out.println("Expresion no valida");
		
	}

}
