package paso2_Avanzados.concepto10_Recursos;

public class Texto {

	public static void main(String[] args) {
		
		// TODO Clases relacionadas con String
		
		String texto_normal;
		
		texto_normal = new String();
		System.out.println(texto_normal);
		
		texto_normal = "Hola";
		System.out.println(texto_normal);
		
		texto_normal = new String("Hola");
		System.out.println(texto_normal);
		
		texto_normal = "Buenas tardes mi nombre es Ismael Montoro Peñasco";
		
		System.out.println("Mostrar texto - " + texto_normal);
		System.out.println();
		
		System.out.println("Mostrar un caracter en concreto\n"
				+ "de la cadena de texto - " + texto_normal.charAt(2));
		System.out.println();
		
		System.out.println("Mostrar el ultimo caracter\n"
				+ "de la cadena de texto - " + texto_normal.charAt(texto_normal.length() - 1));
		System.out.println();
		
		// Of para un int sirve para determinar donde esta el caracter a buscar 
		
		System.out.println("Buscar la primera letra indicada\n"
				+ "en el metodo en la cadena de texto - " + texto_normal.indexOf("I"));
		System.out.println();
		
		System.out.println("Buscar la primera letra indicada\n"
				+ "en el metodo desde una posicion en\n"
				+ "la cadena de texto - " + texto_normal.indexOf("I", 8));
		System.out.println();
		
		System.out.println("Buscar la primera letra indicada en el metodo\n"
				+ "en la cadena de texto desde\n"
				+ "su ultima posicion - " + texto_normal.lastIndexOf("o"));
		System.out.println();
		
		System.out.println("Buscar la primera letra indicada en el metodo\n"
				+ "en la cadena de texto desde\n"
				+ "la posicion indicada empezando desde\n"
				+ "la ultima posicion de la cadena - " + texto_normal.lastIndexOf("o", 5));
		System.out.println();
		
		System.out.println("Mostrar longitud de la cadena - " + texto_normal.length());
		System.out.println();
		
		System.out.println("Concatenar una cadena - " + texto_normal.concat(" soy programador. :)"));
		System.out.println();
		
		System.out.println("Concatenar una cadena - " + texto_normal + " soy programador. :)");
		System.out.println();
		
		System.out.println("Averiguar si exite un texto en concreto en alguna parte de una cadena - " + texto_normal.contains("Ismael"));
		System.out.println();
		
		System.out.println("Averiguar si exite un texto en concreto en alguna parte de una cadena - " + texto_normal.contains("aguacate"));
		System.out.println();
		
		System.out.println("Averiguar si una cadena es igual a otra - " + texto_normal.contentEquals("Buenas tardes mi nombre es Ismael Montoro Peñasco"));
		System.out.println();
		
		System.out.println("Averiguar si una cadena es igual a otra - " + texto_normal.contentEquals("Buenas tardes mi nombre es Ismael Montoro"));
		System.out.println();
		
		System.out.println("Averiguar si al principio de una cadena empieza con cierta subcadena - " + texto_normal.startsWith("Bue"));
		System.out.println();
		
		System.out.println("Averiguar si al principio de una cadena empieza con cierta subcadena - " + texto_normal.startsWith("bue"));
		System.out.println();
		
		System.out.println("Averiguar si al principio de una cadena empieza con cierta subcadena - " + texto_normal.startsWith("Asc"));
		System.out.println();
		
		System.out.println("Averiguar si al principio de una cadena empieza con cierta subcadena - " + texto_normal.startsWith("Bue "));
		System.out.println();
		
		System.out.println("Averiguar si al final de una cadena termina con cierta subcadena - " + texto_normal.endsWith("sco"));
		System.out.println();
		
		System.out.println("Averiguar si al final de una cadena termina con cierta subcadena - " + texto_normal.endsWith("Peñasco"));
		System.out.println();
		
		System.out.println("Averiguar si al final de una cadena termina con cierta subcadena - " + texto_normal.endsWith(" Peñasco"));
		System.out.println();
		
		System.out.println("Averiguar si al final de una cadena termina con cierta subcadena - " + texto_normal.endsWith("pep"));
		System.out.println();
		
		System.out.println("Averiguar si al final de una cadena termina con cierta subcadena - " + texto_normal.endsWith(".Peñasco"));
		System.out.println();
		
		System.out.println("Averiguar si una cadena esta en vacia teniendo en cuenta los espacios en blanco - " + texto_normal.isBlank());
		System.out.println();
		
		System.out.println("Averiguar si una cadena esta en vacia teniendo en cuenta los espacios en blanco - " + "".isBlank());
		System.out.println();
		
		System.out.println("Averiguar si una cadena esta en vacia teniendo en cuenta los espacios en blanco - " + " ".isBlank()); // Aqui esta en false, porque hay un espacio que lo tiene en cuenta, por lo tanto no esta en blanco
		System.out.println();
		
		System.out.println("Averiguar si una cadena esta en vacia sin tener en cuenta los espacios en blanco - " + texto_normal.isEmpty());
		System.out.println();
		
		System.out.println("Averiguar si una cadena esta en vacia sin tener en cuenta los espacios en blanco - " + " ".isEmpty()); // Aqui esta en true, porque no tiene en cuenta los espacios en blanco
		System.out.println();
		 
		System.out.println("Averiguar si una cadena esta en vacia sin tener en cuenta los espacios en blanco - " + "".isEmpty());
		System.out.println();
		
		System.out.println("Mostrar una cadena repetida varias veces indicando el numero de veces que tiene que repetirse\n" + texto_normal.repeat(4));
		System.out.println();
		
		System.out.println("Mostrar una cadena repetida varias veces indicando el numero de veces que tiene que repetirse\n" + texto_normal.concat("\n").repeat(7));
		System.out.println();
		
		System.out.println("Remplazar de una cadena todo caracter o subcadena igual "
				+ "a la señalada en el primer paramentro por el caracter del segundo paramentro - " + texto_normal.replace("I", "4"));
		System.out.println();
		
		System.out.println("Remplazar de una cadena todo caracter o subcadena igual "
				+ "a la señalada en el primer paramentro por el caracter del segundo paramentro - " + texto_normal.replace("a", "p"));
		System.out.println();
		
		System.out.println("Remplazar de una cadena todo caracter o subcadena igual "
				+ "a la señalada en el primer paramentro por el caracter del segundo paramentro - " + texto_normal.replace("e", "U"));
		System.out.println();
		
		System.out.println("Remplazar de una cadena todos caracteres o subcadenas iguales a la señalada\n"
				+ "en el primer paramentro en toda la cadena "
				+ "por el caracter del segundo paramentro -\n" + texto_normal.replaceAll("as", "yas"));
		System.out.println();
		
		System.out.println("Remplazar de una cadena todos caracteres o subcadenas iguales a la señalada\n"
				+ "en el primer paramentro en toda la cadena "
				+ "por el caracter del segundo paramentro -\n" + texto_normal.replaceAll("es", "yas"));
		System.out.println();
		
		System.out.println("Remplazar de una cadena el primer caracter o subcadena igual a la señalada\n"
				+ "en el primer paramentro en toda la cadena "
				+ "por el caracter del segundo paramentro -\n" + texto_normal.replaceFirst("as", "yas"));
		System.out.println();
		
		System.out.println("Remplazar de una cadena el primer caracter o subcadena igual a la señalada\n"
				+ "en el primer paramentro en toda la cadena "
				+ "por el caracter del segundo paramentro -\n" + texto_normal.replaceFirst("es", "yas"));
		System.out.println();
		
		System.out.println("Realizar una subcadena, "
				+ "por defecto si no indicas el final de la subcadena te mostrara\n"
				+ "una subcadena desde el indice declarado hasta el final de la cadena -\n" + texto_normal.substring(0));
		System.out.println();
		
		System.out.println("Realizar una subcadena, "
				+ "por defecto si no indicas el final de la subcadena te mostrara\n"
				+ "una subcadena desde el indice declarado hasta el final de la cadena -\n" + texto_normal.substring(12));
		System.out.println();
		
		System.out.println("Realizar una subcadena con un rango - " + texto_normal.substring(0, 12));
		System.out.println();
		
		System.out.println("Realizar una subcadena con un rango - " + texto_normal.substring(20, 22));
		System.out.println();
		
		System.out.println("Realizar una subcadena con un rango desde el inicio hasta un caracter indicado - " +
						String.valueOf(Math.floor(10.2124))
							.substring(
								0, 
								String.valueOf(Math.floor(10.2124)).indexOf(".")
							)
				);
		System.out.println();
		
		System.out.println("Poner cadena con todas las letras en minusculas " + texto_normal.toLowerCase());
		System.out.println("Poner cadena con todas las letras en MAYUSCULAS " + texto_normal.toUpperCase());
		System.out.println();
		
		System.out.println("Saber si una cadena es igual teniendo en cuenta las mayusculas y minusculas - " + texto_normal.equals("Buenas tardes mi nombre es Ismael Montoro Peñasco"));
		System.out.println("Saber si una cadena es igual teniendo en cuenta las mayusculas y minusculas - " + texto_normal.equals("Buenas tardes mi nombrE es Ismael Montoro Peñasco"));
		System.out.println("Saber si una cadena es igual teniendo en cuenta las mayusculas y minusculas - " + texto_normal.equals("Buenas tardes mi nombre es ismael Montoro Peñasco"));
		System.out.println("Saber si una cadena es igual teniendo en cuenta las mayusculas y minusculas - " + texto_normal.equals("Buenas tardes mi nombre es ismael Montoro Pe!asco"));
		System.out.println("Saber si una cadena es igual ignorando las mayusculas y minusculas - " + texto_normal.equalsIgnoreCase("Buenas tardes mi nombre es Ismael Montoro Peñasco"));
		System.out.println("Saber si una cadena es igual ignorando las mayusculas y minusculas - " + texto_normal.equalsIgnoreCase("Buenas tardes mi nombrE es Ismael Montoro Peñasco"));
		System.out.println("Saber si una cadena es igual ignorando las mayusculas y minusculas - " + texto_normal.equalsIgnoreCase("Buenas tardes mi nombre es ismael Montoro Peñasco"));
		System.out.println("Saber si una cadena es igual ignorando las mayusculas y minusculas - " + texto_normal.equalsIgnoreCase("Buenas tardes mi nombre es ismael Montoro Pe!asco"));
		
		char[] array = texto_normal.toCharArray();
		System.out.println("" + array[0]);
		System.out.println("" + array[7]);
		//for (int i = 0; i < array.length; i++) {
		//	System.out.println(array[i]);
		//}
		System.out.println("Convertir un array char en un String - " + String.valueOf(array));
		System.out.println("Array char convertido a String " + String.copyValueOf(array));
		
		byte[] array2 = texto_normal.getBytes();
		System.out.println("Convertir un String en un array byte - ");
		for (int i = 0; i < array2.length; i++) {	
			System.out.println(array2[i]);
		}
		
		String conversion = new String(array);
		System.out.println("Convertir array de char en un String - " + conversion);
		
		conversion = new String(array2);
		System.out.println("Convertir array de bytes en un String - " + conversion);
		
		System.out.println("Compara el texto y averigua cuantos caracteres de una cadena de texto han sido modificados - " + texto_normal.compareTo("Buenas tardes mi nombre es Ismael Montoro Peñasco"));
		System.out.println("Compara el texto y averigua cuantos caracteres de una cadena de texto han sido modificados - " + texto_normal.compareTo("Buenas tardes mi nombre es Ismael Montoro"));
		System.out.println("Compara el texto y averigua cuantos caracteres de una cadena de texto han sido modificados - " + texto_normal.compareTo("Buenas tardes mi nombre es Ismael Montoro "));
		System.out.println("Compara el texto y averigua cuantos caracteres de una cadena de texto han sido modificados,\n"
				+ "en caso de ser uno te mostrar la posicion del caracter modificado - " + texto_normal.compareTo("Buenas tardas mi nombre es Ismael Montoro Peñasco"));
		System.out.println("Compara el texto y averigua cuantos caracteres de una cadena de texto han sido modificados ignorando MAYUSCULAS y minusculas - " + texto_normal.compareToIgnoreCase("Buenas tardes mi nombre es Ismael Montoro Peñasco"));
		System.out.println("Compara el texto y averigua cuantos caracteres de una cadena de texto han sido modificados ignorando MAYUSCULAS y minusculas - " + texto_normal.compareToIgnoreCase("Buenas tardes mi nombre Es ismael Montoro Peñasco"));
		System.out.println("Compara el texto y averigua cuantos caracteres de una cadena de texto han sido modificados ignorando MAYUSCULAS y minusculas - " + texto_normal.compareToIgnoreCase("Buenas tardas mi nombre es Ismael Montoro Peñasco"));
		System.out.println("Compara el texto y averigua cuantos caracteres de una cadena de texto han sido modificados ignorando MAYUSCULAS y minusculas - " + texto_normal.compareToIgnoreCase("Buenas tardes mi nombre es Ismael Montoro"));
		System.out.println("Tabular un texto -" + texto_normal.indent(10));
		System.out.println("Tabular un texto -" + texto_normal.indent(20));
		System.out.println("Devuelve el valor ascii del caracter de la cadena que le indiquemos - " + texto_normal.codePointAt(15));
		System.out.println("Devuelve el valor ascii del caracter de la cadena que le indiquemos - " + texto_normal.codePointAt(35));
		System.out.println("Devuelve el valor ascii del caracter anterior al que le indiquemos de la cadena - " + texto_normal.codePointBefore(2) + " - " + texto_normal.codePointAt(1));
		System.out.println("Devuelve el valor ascii del caracter anterior al que le indiquemos de la cadena - " + (char) texto_normal.codePointBefore(2) + " - " + (char) texto_normal.codePointAt(1));
		System.out.println("Devuelve el valor ascii del caracter anterior al que le indiquemos de la cadena - " + texto_normal.codePointBefore(2) + " - " + texto_normal.codePointAt(2));
		System.out.println("Devuelve el valor ascii del caracter anterior al que le indiquemos de la cadena - " + (char) texto_normal.codePointBefore(2) + " - " + (char) texto_normal.codePointAt(2));
		System.out.println("Devuelve el numero de caracteres señalados en cierto rango - " + texto_normal.codePointCount(5, 7));
		System.out.println();
		
		System.out.println("Devuelve el texto con la tabulacion quitada -\n" + "\ta".stripLeading());
		System.out.println("Devuelve el texto con la tabulacion quitada -\n" + "".stripLeading());
		System.out.println("Devuelve el texto con la tabulacion quitada -\n" + "\ta".strip());
		System.out.println("Devuelve el texto con la tabulacion quitada -\n" + "".strip());
		System.out.println("Devuelve el texto con la tabulacion quitada -\n" + "\ta".stripIndent());
		System.out.println("Devuelve el texto con una tabulacion -\n" + "\ta".stripTrailing());
		System.out.println("Devuelve el texto con la tabulacion quitada -\n" + "".stripTrailing());
		System.out.println("Devuelve el texto con la tabulacion de inicio y final quitada -\n" + "\t".concat(texto_normal).concat("\t").trim());
		System.out.println("Convertir un numero en un String - " + String.valueOf(2));
		
		System.out.println("Convertir un texto en un array de textos dividiendo cada subtexto, utilizando el caracter pasado por parametro como delimitador");
		
		String[] array3 = texto_normal.split(" ");
		for (String string : array3) {
			System.out.println(string);
		}
		System.out.println();
		
		System.out.println("Convertir un texto en un array de textos dividiendo cada subtexto, utilizando el caracter pasado por parametro como delimitador");
		
		array3 = texto_normal.split("a");
		for (String string : array3) {
			System.out.println(string);
		}
		System.out.println();
		
		System.out.println("Convertir un texto en un array de textos dividiendo cada subtexto, utilizando el caracter pasado por parametro como delimitador");
		
		array3 = "1;a;3;4;-".split(";");
		for (String string : array3) {
			System.out.println(string);
		}
		System.out.println();
		
		System.out.println("Convertir un texto en un array de textos dividiendo cada subtexto, utilizando el caracter pasado por parametro como delimitador");
		
		array3 = " . q;e:;-:e . :;- . ;[{} . ".split(" . ");
		for (String string : array3) {
			System.out.println(string);
		}
		System.out.println();
		
		System.out.println("Convertir un texto en un array de textos dividiendo cada subtexto, utilizando el caracter pasado por parametro como delimitador");
		
		array3 = " . q;e:;-:e . :;- . ;[{} . ".split(";");
		for (String string : array3) {
			System.out.println(string);
		}
		System.out.println();
		
		System.out.println("Convertir un texto en un array de textos dividiendo cada subtexto, utilizando el caracter pasado por parametro como delimitador");
		
		array3 = " . q;e:;-:e . :;- . ;[{} . ".split(":");
		for (String string : array3) {
			System.out.println(string);
		}
		System.out.println();
		
		System.out.println("Convertir un texto en un array de textos dividiendo cada subtexto, utilizando el caracter pasado por parametro como delimitador");
		
		array3 = " . q;e:;-:e . :;- . ;[{} . ".split("e");
		for (String string : array3) {
			System.out.println(string);
		}
		System.out.println();
		
		System.out.println("Convertir un texto en un array de textos dividiendo cada subtexto, utilizando el caracter pasado por parametro como delimitador,"
				+ "pero con una limitante, y es que solamente separara el texto mediante los primeros 4 delimitadores");
		
		array3 = texto_normal.split(" ", 4);
		for (String string : array3) {
			System.out.println(string);
		}
		System.out.println();
		
		System.out.println("Convertir un texto en un array de textos dividiendo cada subtexto, utilizando el caracter pasado por parametro como delimitador,"
				+ "pero con una limitante, y es que solamente separara el texto mediante los primeros 2 delimitadores");
		
		array3 = texto_normal.split(" ", 2);
		for (String string : array3) {
			System.out.println(string);
		}
		System.out.println();
		
		System.out.println("Convertir un texto en un array de textos dividiendo cada subtexto, utilizando el caracter pasado por parametro como delimitador,"
				+ "pero con una limitante, y es que solamente separara el texto mediante los primeros 5 delimitadores");
		
		array3 = texto_normal.split(" ", 5);
		for (String string : array3) {
			System.out.println(string);
		}
		System.out.println();
		
		
	}

}
