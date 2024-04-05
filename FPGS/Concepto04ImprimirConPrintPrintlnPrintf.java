package conceptos.paso1_Basicos;

public class Concepto04ImprimirConPrintPrintlnPrintf {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		// println, print, printf
		// "\t", "\n", y otras funciones de este tipo
		// Manejo de cadenas y subcadenas
		// Objetos hijos de la clase String como StringBuilder o StringBuffer
		// Metodos para los objetos String y sus hijos
		
		// Print y Println, y sus diferencias 
		
		System.out.print("Hola"); // Imprime texto por pantalla  
		
		System.out.println();
		
		System.out.println("Hola"); // Texto con salto de linea
		System.out.print("Hola");
		System.out.print("Hola"); // Texto sin salto de linea
		
		// Funciones de texto
		
		System.out.println();
		System.out.println();
		
		System.out.print("Hola\n");
		System.out.print("Hola\n\n\n\n");
		System.out.println("\tHola");
		System.out.println("\t\tHola");
		System.out.println("Buenas tardes este texto no "
				+ "salta de linea si no agregas una '\\n'");
		System.out.println("La contrabarra '\' evita que se produzca "
				+ "el efecto de funciones como \\n o \\t");
		System.out.println("\\");
		System.out.println("\'");
		System.out.println("\"");
		
		// Printf
		
		System.out.println();
		System.out.println();

			// Imprime texto con un formato personalizado
			System.out.printf("Hola buenas, me llamo %s, tengo %d,\n"
					+ "y consegui en grado medio %1.2f de puntuacion", 
					"Ismael Montoro Peñasco", 21, 6.73);
			
			// Ten cuidado que los printf no tienen salto de linea como
			// los println
			
			System.out.println();
			
			// Imprimir texto personalizado
			
			System.out.printf("\nSoy un usuario %s\n", "Particular");
			
			String usuario = "Particular";
			usuario = "Empresarial";
			
			System.out.printf("Soy un usuario %s\n", usuario);
			
			// Imprimir numeros enteros del tipo double
			
			System.out.printf("\nEste número es %d\n", 20120);
			
			short numero = 12547;
			
			System.out.printf("Este número es %d\n", numero);
			
			System.out.printf("Este número es %010d\n", numero);
			
			System.out.printf("Este número es %+d\n", numero);
			
			numero = -124;
			
			System.out.printf("Este número es %+d\n", numero);
			
			// System.out.printf("Este número es %-d\n", numero);
			
			// Imprimir numero decimal
			
			System.out.printf("Este número es %.5f\n", 20.24565);
			
			double numero_real = 20.24565;
			
			System.out.printf("Este número es %1.7f", numero_real);
			
			// Otras cosas que se pueden hacer con printf
			
			System.out.println();
			System.out.println();
			
			// Imprimir %
			System.out.printf("Imprimiendo %%");
		
			System.out.println();
			System.out.println();
			
			// Imprimir un numero en octal
			System.out.printf("Numero octal %o \n", 12);
			System.out.printf("Numero octal %o \n", 14);
			System.out.printf("Numero octal %o \n", 16);
			System.out.printf("Numero octal %o \n", 18);
			System.out.printf("Numero octal %o \n", 22);
			System.out.printf("Numero octal %o \n", 24);
			System.out.printf("Numero octal %o \n\n", 26);
			
			// Imprimir un numero en hexadecimal
			System.out.printf("Numero hexadecimal %x \n", 12);
			System.out.printf("Numero hexadecimal %x \n", 14);
			System.out.printf("Numero hexadecimal %x \n", 16);
			System.out.printf("Numero hexadecimal %x \n", 18);
			System.out.printf("Numero hexadecimal %x \n", 22);
			System.out.printf("Numero hexadecimal %x \n", 24);
			System.out.printf("Numero hexadecimal %x \n\n", 26);
			
			// Imprimir caracter en ascii
			
			char caracter = 'p';
			
			System.out.printf("Caracter en ascii %c \n", caracter);
			
			caracter = 44;
			
			System.out.printf("Caracter en ascii %c \n", caracter);
			
			caracter = 57;
			
			System.out.printf("Caracter en ascii %c", caracter);
			
			System.out.println();
			System.out.println();
		
			
		// Manejar cadenas
		
		String cadena = "mi cadena de ejemplo";
		
		// Este metodo muestra el caracter que yo elijo de la cadena
		System.out.println("Extraccion con charAt");
		System.out.println(cadena.charAt(0));
		System.out.println(cadena.charAt(4));
		System.out.println(cadena.charAt(10));
		System.out.println(cadena.charAt(11));
		
		System.out.println();
		
		System.out.println("Contar cadenas con length");
		System.out.println(cadena.length());
		
		System.out.println();
		
		//
		System.out.println("Extraccion con substring");
		System.out.println(cadena.substring(0, 8));
		System.out.println(cadena.substring(0, 1));
		System.out.println(cadena.substring(0, 4));
		System.out.println(cadena.substring(13, cadena.length()));
		
		System.out.println();
		
		System.out.println("Condicionales con startWith");
		System.out.println(cadena.startsWith("m"));
		System.out.println(cadena.startsWith("l"));
		
		System.out.println();
		
		System.out.println("Condicionales con endsWith");
		System.out.println(cadena.endsWith("o"));
		System.out.println(cadena.endsWith("j"));
		
		System.out.println();
		
		// Compara el contenido de un String
		System.out.println("Condicionales con contentsEquals");
		System.out.println(cadena.contentEquals("mi cadena de ejemplo"));
		System.out.println(cadena.contentEquals("mi cadena"));
		System.out.println(cadena.contentEquals("mi"));
		System.out.println(cadena.contentEquals("mi ejemplo"));
		
		System.out.println();
		
		// Compara si un objeto String y su contenido es igual o no 
		System.out.println("Condicionales con equals");
		System.out.println(cadena.equals("mi cadena de ejemplo"));
		System.out.println(cadena.equals("mi cadena"));
		System.out.println(cadena.equals("mi"));
		System.out.println(cadena.equals("mi ejemplo"));
		
		System.out.println();
		
		// Compara si un objeto String y su contenido es igual o no
		// ignorando si las letras del contenido son mayusculas o
		// minusculas
		System.out.println("Condicionales con equalsIgnoreCase");
		System.out.println(cadena.equalsIgnoreCase("mI cAdEna de EJEMplo"));
		System.out.println(cadena.equalsIgnoreCase("mI cAdEna"));
		System.out.println(cadena.equalsIgnoreCase("mI"));
		System.out.println(cadena.equalsIgnoreCase("mi EJEMplo"));
		
		System.out.println();
		
		System.out.println("Concatenar cadenas");
		System.out.println(cadena.concat(", sera mas larga con esta instruccion"));
		
		System.out.println();
		
		System.out.println("Buscar las primeras letras y subcadenas dentro de una cadena "
				+ "desde el inicio");
		System.out.println(cadena.indexOf("i"));
		System.out.println(cadena.indexOf("a"));
		System.out.println(cadena.indexOf("z")); // Sino encuentra dara -1
		
		System.out.println("Buscar las primeras letras y subcadenas dentro de una cadena "
				+ "desde el inicio hasta donde le indiquemos");
		System.out.println(cadena.indexOf("i", 7));
		System.out.println(cadena.indexOf("a", 2));
		System.out.println(cadena.indexOf("z", 3)); // Sino encuentra dara -1
		
		System.out.println();
		
		System.out.println("Buscar las ultimas letras y subcadenas dentro de una cadena "
				+ "desde el final");
		System.out.println(cadena.lastIndexOf("i"));
		System.out.println(cadena.lastIndexOf("a"));
		System.out.println(cadena.lastIndexOf("z")); // Sino encuentra dara -1
		
		System.out.println("Buscar las ultimas letras y subcadenas dentro de una cadena "
				+ "desde la posicion que indicamos hasta el final");
		System.out.println(cadena.lastIndexOf("i", 7));
		System.out.println(cadena.lastIndexOf("a", 2));
		System.out.println(cadena.lastIndexOf("z", 3)); // Sino encuentra dara -1
		
		System.out.println();
		
		System.out.println("Comprobar si falta contenido en la cadena");
		// En caso de que la cadena este entera y no le falte contenido saldra 0
		// por letras
		System.out.println(cadena.compareTo("mi cadena de ejemplo"));
		// En caso de que la cadena le falte contenido, pues saldra un numero
		// que indica cuantos caracteres se han perdido, por letras
		System.out.println(cadena.compareTo("mi cadena de "));
		System.out.println(cadena.compareTo("mi cadena"));
		
		System.out.println();
		
		System.out.println("Comprobar si un String esta blanco");
		System.out.println(cadena.isBlank());
		System.out.println("".isBlank());
		
		System.out.println();
		
		System.out.println("Comprobar si una cadena String esta vacia"
				+ ",\nes más recomendable utilizar este que isBlack()");
		System.out.println(cadena.isEmpty());
		System.out.println("".isEmpty());
		
		System.out.println();
		
		System.out.println("Comprobar si una cadena de caracteres "
				+ "cumple unos requisitos");
		System.out.println(cadena.matches("[a-z]"));
		System.out.println(cadena.matches("[a-z]+"));
		System.out.println(cadena.matches("[a-z\' \']+"));
		System.out.println(cadena.matches("[A-Z\' \']+"));
		
		System.out.println();
		
		// Repite cadenas
		System.out.println("Repetir cadenas");
		System.out.println("hola\n".repeat(5));
		
		System.out.println();
		
		// Averigua si una cadena tiene o no tiene cierto contenido
		System.out.println("Averiguar si una cadena "
				+ "contiene algo en concreto");
		System.out.println(cadena.contains("mi"));
		System.out.println(cadena.contains("ejemplo"));
		System.out.println(cadena.contains("naranja"));
		
		System.out.println();
		
		// Convertir un String en un Array de Char
		
		System.out.println();
		System.out.println(cadena.toCharArray()[0]);
		System.out.println(cadena.toCharArray()[8]);
		System.out.println(cadena.toCharArray()[15]);
		System.out.println(cadena.toCharArray()[14]);
		
		System.out.println();
		System.out.println("Convertir una cadena a Mayusculas");
		System.out.println(cadena.toUpperCase());
		
		System.out.println();
		System.out.println("Convertir una cadena a minusculas");
		System.out.println("CADENA DE EJEMPLO".toLowerCase());
		
		System.out.println();
		
		System.out.println("Remplazar parte de la cadena:\n" + cadena + "\n");
		System.out.println(cadena.replace("mi", "la"));
		
		System.out.println();
		
		System.out.println("Remplazar las partes repetidas de la cadena");
		System.out.println("hola buenas, hola tardes, hola buenas noches"
				.replaceAll("buenas", "buenisimas"));
		
		System.out.println();

		System.out.println("Remplazar la primera repeticion de la cadena");
		System.out.println("hola buenas, hola tardes, hola buenas noches"
				.replaceFirst("buenas", "buenisimas"));
		
		System.out.println();
		
		// Alternativa a substring
		System.out.println("Alternativa a substring");
		System.out.println(cadena.subSequence(5, 7));
		
		String objeto = new String("Hola");
		String objeto_texto = "Hola";
		String objeto_vacio = "";
		
		System.out.println(objeto);
		System.out.println(objeto_texto);
		System.out.println(objeto_vacio);
		
	}

}
