package conceptos.paso1_Basicos.concepto10_Recursos;

import java.util.Arrays;

public class Ascii_ClaseCharater {

	public static void main(String[] args) {

		String teclas[] = {"NULL", "START OF HEADING", "START OF TEXT", "END OF TEXT",
						"END OF TRANSMISSION", "ENQUIRY", "ACKNOWLEDGE", "BELL", 
						"BACKSPACE", "HORIZONTAL TAB", "LINE FEED", "VERTICAL TAB", 
						"FORM FEED", "CARRIGE RETURN", "SHIFT OUT", "SHIFT IN", 
						"DATA LINK ESCAPE", "DEVICE CONTROL 1", "DEVICE CONTROL 2", "DEVICE CONTROL 3", 
						"DEVICE CONTROL 4", "NEGATIVE ACKNOWLEDGE", "SYNCHRONOUS IDLE", "ENG OF TRANS. BLOCK", 
						"CANCEL", "END OF MEDIUM", "SUBSTITUTE", "ESCAPE", 
						"FILE SEPARATOR", "GROUP SEPARATOR", "RECORD SEPARATOR", "UNIT SEPARATOR"};
		
		int valores_permitidos[] = {21, 23};
		
		System.out.println("Tabla ascii");
		for (int i = 0; i < 32; i++) {
			
			System.out.println(" " + "-".repeat(111));
			
			if(Arrays.binarySearch(valores_permitidos, i) >= 0)
				System.out.println(
						"|	" + teclas[i] + " - " + i +  
				"\t|\t" + (char) (i + 32) + " - " + (i + 32) +
				"\t\t|\t" + (char) (i + 64) + " - " + (i + 64) + 
				"\t\t|\t" + (char) (i + 96) + " - " + (i + 96) + 
				"		|"
				);
			else
				System.out.println(
								"|	" + teclas[i] + " - " + i +  
						(teclas[i].concat(" - " + i).length() < 16 ? "\t\t\t|\t":"\t\t|\t") + (char) (i + 32) + " - " + (i + 32) +
						"\t\t|\t" + (char) (i + 64) + " - " + (i + 64) + 
						"\t\t|\t" + (char) (i + 96) + " - " + (i + 96) + 
						"		|"
						);
		}
		System.out.println(" " + "-".repeat(111));
		
		System.out.println();
		System.out.println();
		
		System.out.println("Estamos utilizando isDigit sirve para saber si es un numero");
		System.out.println(Character.isDigit('A'));
		System.out.println(Character.isDigit('a'));
		System.out.println(Character.isDigit('À'));
		System.out.println(Character.isDigit('敵'));
		System.out.println(Character.isDigit('1'));
		System.out.println(Character.isDigit('!'));
		System.out.println(Character.isDigit(' '));

		System.out.println();
		System.out.println();
		
		System.out.println("Estamos utilizando isLetter sirve para saber si es una letra");
		System.out.println(Character.isLetter('A'));
		System.out.println(Character.isLetter('a'));
		System.out.println(Character.isLetter('À'));
		System.out.println(Character.isLetter('敵'));
		System.out.println(Character.isLetter('1'));
		System.out.println(Character.isLetter('!'));
		System.out.println(Character.isLetter(' '));

		System.out.println();
		System.out.println();
		
		System.out.println("Estamos utilizando isLetter y sirve para saber si es una letra o un numero");
		System.out.println(Character.isLetterOrDigit('A'));
		System.out.println(Character.isLetterOrDigit('a'));
		System.out.println(Character.isLetterOrDigit('À'));
		System.out.println(Character.isLetterOrDigit('敵'));
		System.out.println(Character.isLetterOrDigit('1'));
		System.out.println(Character.isLetterOrDigit('!'));
		System.out.println(Character.isLetterOrDigit(' '));

		System.out.println();
		System.out.println();
		
		System.out.println("Estamos utilizando isLowerCase y sirve para saber si el caracter que pasamos es una letra en minuscula");
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.isLowerCase('À'));
		System.out.println(Character.isLowerCase('敵'));
		System.out.println(Character.isLowerCase('1'));
		System.out.println(Character.isLowerCase('!'));
		System.out.println(Character.isLowerCase(' '));

		System.out.println();
		System.out.println();
		
		System.out.println("Estamos utilizando isUpperCase y sirve para saber si el caracter que pasamos es una letra en mayuscula");
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isUpperCase('a'));
		System.out.println(Character.isUpperCase('À'));
		System.out.println(Character.isUpperCase('敵'));
		System.out.println(Character.isUpperCase('1'));
		System.out.println(Character.isUpperCase('!'));
		System.out.println(Character.isUpperCase(' '));

		System.out.println();
		System.out.println();
		
		System.out.println("Estamos utilizando isSpaceChar y sirve para saber si el caracter que pasamos es un espacio en blanco");
		System.out.println(Character.isSpaceChar('A'));
		System.out.println(Character.isSpaceChar('a'));
		System.out.println(Character.isSpaceChar('À'));
		System.out.println(Character.isSpaceChar('敵'));
		System.out.println(Character.isSpaceChar('1'));
		System.out.println(Character.isSpaceChar('!'));
		System.out.println(Character.isSpaceChar(' '));

		System.out.println();
		System.out.println();
		
		System.out.println("Estamos utilizando isWhitespace y sirve para saber si el caracter que pasamos es un espacio en blanco");
		System.out.println(Character.isWhitespace('A'));
		System.out.println(Character.isWhitespace('a'));
		System.out.println(Character.isWhitespace('À'));
		System.out.println(Character.isWhitespace('敵'));
		System.out.println(Character.isWhitespace('1'));
		System.out.println(Character.isWhitespace('!'));
		System.out.println(Character.isWhitespace(' '));

		System.out.println();
		System.out.println();
		
		System.out.println("Estamos utilizando isAlphabetic sirve para saber si es una letra del abecedario");
		System.out.println(Character.isAlphabetic('A'));
		System.out.println(Character.isAlphabetic('a'));
		System.out.println(Character.isAlphabetic('À'));
		System.out.println(Character.isAlphabetic('敵'));
		System.out.println(Character.isAlphabetic('1'));
		System.out.println(Character.isAlphabetic('!'));
		System.out.println(Character.isAlphabetic(' '));

		System.out.println();
		System.out.println();
		
		System.out.println("Estamos utilizando isDefined sirve para saber si el caracter esta tambien en unicode");
		System.out.println(Character.isDefined('A'));
		System.out.println(Character.isDefined('a'));
		System.out.println(Character.isDefined('À'));
		System.out.println(Character.isDefined('敵'));
		System.out.println(Character.isDefined('1'));
		System.out.println(Character.isDefined('!'));
		System.out.println(Character.isDefined(' '));

		System.out.println();
		System.out.println();
		
		/*
		 * Los caracteres no solamente estan clasificados en la tabla ascii, 
		 * con un numero decimal y hexadecimal cada uno, sino que tambien
		 * estan clasificados segun su tipo
		 * 
		 * Para saber de que tipo es un caracter en concreto utilizamos el
		 * metodo getType
		 * 
		 * Este metodo dependiendo del caracter que se pase por parametro
		 * devolvera de que tipo es mediante un numero
		 *  
		 * */
		System.out.println("Estamos utilizando getType sirve para saber que tipo de letra estamos empleando");
		System.out.println(Character.getType('A'));
		System.out.println(Character.getType('a'));
		System.out.println(Character.getType('À'));
		System.out.println(Character.getType('敵'));
		System.out.println(Character.getType('1'));
		System.out.println(Character.getType('!'));
		System.out.println(Character.getType(' '));
		System.out.println(
							("Tipos de caracteres en representacion decimal:\n" + 
								("" + Character.COMBINING_SPACING_MARK + "\n" +
								"" + Character.CONNECTOR_PUNCTUATION + "\n" +
								"" + Character.CONTROL + "\n" +
								"" + Character.CURRENCY_SYMBOL + "\n" +
								"" + Character.DASH_PUNCTUATION + "\n" +
								"los digitos numericos tienen el numero: " + Character.DECIMAL_DIGIT_NUMBER + "\n" +
								"" + Character.ENCLOSING_MARK + "\n" +
								"" + Character.END_PUNCTUATION + "\n" +
								"" + Character.FINAL_QUOTE_PUNCTUATION + "\n" +
								"" + Character.FORMAT + "\n" +
								"" + Character.INITIAL_QUOTE_PUNCTUATION + "\n" +
								"" + Character.LETTER_NUMBER + "\n" +
								"" + Character.LINE_SEPARATOR + "\n" +
								"las letras minusculas tienen el numero: " + Character.LOWERCASE_LETTER + "\n" +
								"los simbolos matematicos tienen el numero: " + Character.MATH_SYMBOL + "\n" +
								"" + Character.MODIFIER_LETTER + "\n" +
								"" + Character.MODIFIER_SYMBOL + "\n" +
								"" + Character.NON_SPACING_MARK + "\n" +
								"las letras de paises de oriente (China, Japon, Corea) tienen el numero: " + Character.OTHER_LETTER + "\n" +
								"" + Character.OTHER_NUMBER + "\n" +
								"los metacaracteres y otros caracteres similares tienen el numero: " + Character.OTHER_PUNCTUATION + "\n" +
								"" + Character.OTHER_SYMBOL + "\n" +
								"" + Character.PARAGRAPH_SEPARATOR + "\n" +
								"" + Character.PRIVATE_USE + "\n" +
								"los espacios en blanco se representan con el numero: " + Character.SPACE_SEPARATOR + "\n" +
								"" + Character.START_PUNCTUATION + "\n" +
								"" + Character.SURROGATE + "\n" +
								"" + Character.TITLECASE_LETTER + "\n" +
								"" + Character.UNASSIGNED + "\n" +
								"las letras mayusculas tienen el numero : " + Character.UPPERCASE_LETTER
								).indent(5)
							).indent(5)
						);
		
		/*
		System.out.println("Tabla ascii extensa");
		for (int i = -0xffffff; i < 0xffffff; i++)
			System.out.println((char) i + " - " + i);
		 */
	}

}
