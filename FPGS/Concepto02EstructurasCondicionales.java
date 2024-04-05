package conceptos.paso1_Basicos;

public class Concepto02EstructurasCondicionales {

	public static void main(String[] args) {

		// TODO Estructuras condicionales

		// Una estructura condicional es una estructura que nos permite
		// ejecutar o no codigo dependiendo de si se dan o no las condicionales
		// necesarias para ejecutarlo o no
		short valor = 2564, resta;
		final short resultado;
		
		// valor = 2562;
		// valor = 2568;
		
		resta = 25 - 5;
		resultado = (short) ((resta == 20) ? 2564 : 2000); // Operador ternario
		
		// Condicional simple
		
		if (valor == 2564) {
			System.out.println("El valor es " + valor);
			System.out.println("Condicion cumplida");
			System.out.println("");
		}
		
		if(valor == 2564) System.out.print("El valor es " + valor + ", condicion cumplida"); 
		
		/* 
		 * Recuerda que no es lo mismo
		 * 
		 * valor == resultado
		 * resultado == valor
		 * 
		 * el orden de los operadores importa
		 * 
		 * recuerda que una condicion se estructura de la siguiente manera
		 * 
		 * [dato a poner a prueba] condicion [condicional]
		 * 
		 * valor == resultado
		 * 	 ^
		 * Este es el dato que se va a examinar para ver si concuerda con el otro mediante su condicional
		 * 
		 * */
		
		// Condicional if else
		
		if(valor == 2564) {
			System.out.println("");
			System.out.println("");
			System.out.print("El valor es " + valor + ", condicion cumplida");
		} else {
			System.out.println("El valor no es " + valor);
			System.out.print("Cambiar valor.");
		}
		
		System.out.println();
		System.out.println();
		
		if(valor == 2564)
			System.out.print("El valor es " + valor + ", condicion cumplida");
		else
			System.out.print("El valor no es " + valor + ", condicion cumplida");
		
		System.out.println();
		System.out.println();
		
		if(valor == 2564) System.out.print("El valor es " + valor + ", condicion cumplida");
		else System.out.print("El valor no es " + valor + ", condicion cumplida");
		
		System.out.println();
		System.out.println();
		
		// Condicional multiple
		
		if (valor > 2564) {
			System.out.println("Valor por encima de lo habitual");
		} else if(valor < 2564) {
			System.out.println("Valor por debajo de lo habitual");
		} else if (valor == (2564 - 2)) {
			System.out.println("Valor con calculo");
		} else {
			System.out.println("Valor habitual");
			System.out.println("Todo correcto.");
		}
		
		System.out.println();
		System.out.println();
		
		if (valor > 2564)
			System.out.println("Valor por encima de lo habitual");
		else if(valor < 2564)
			System.out.println("Valor por debajo de lo habitual");
		else if (valor == (2564 - 2))
			System.out.println("Valor con calculo");
		else 
			System.out.println("Valor habitual");
		
		System.out.println();
		
		if (valor > 2564) System.out.println("Valor por encima de lo habitual");
		else if(valor < 2564) System.out.println("Valor por debajo de lo habitual");
		else if (valor == (2564 - 2)) System.out.println("Valor con calculo");
		else System.out.println("Valor habitual");
		
		System.out.println();
		
		if (valor == 2564) {
			System.out.println("Valor habitual");
			System.out.println("Todo correcto.");
		} else if(valor < 2564) {
			System.out.println("Valor por debajo de lo habitual");
		} else if(valor > 2564) {
			System.out.println("Valor por encima de lo habitual");
		} else if (valor == (2564 - 2)) {
			System.out.println("Valor con calculo");
		} else if (resultado == 2564) {
			System.out.println("Valor con calculo ternario");
		}
		
		System.out.println();
		
		if(String.valueOf(valor).matches("[0-9]+")) {
			if (valor == 2564) {
				System.out.println("Valor habitual");
				System.out.println("Todo correcto.");
			} else if(valor < 2564) {
				System.out.println("Valor por debajo de lo habitual");
			} else if(valor > 2564) {
				System.out.println("Valor por encima de lo habitual");
			} else if (valor == (2564 - 2)) {
				System.out.println("Valor con calculo");
			} else if (resultado == 2564) {
				System.out.println("Valor con calculo ternario");
			}
		} else
			System.out.println("No es un numero");
		
		System.out.println();
		
		// Condicional multiple con Switch
		
		switch (valor) {
		case 2564:
			System.out.println("Valor aceptado");
			System.out.println("Todo correcto.");
			break;
		case 2564 - 4:
			System.out.println("Resultado calculado " + valor);
			break;
		case 2568:
			System.out.println("Resultado mayor a lo habitual");
			break;
		default:
			System.out.println("Valor erroneo");
		}
		
		System.out.println();

		valor = 2564 - 4;
		
		switch (valor) {
		case 2564:
			System.out.println("Valor aceptado");
			System.out.println("Todo correcto.");
			break;
		case 2564 - 4:
			System.out.println("Resultado calculado " + valor);
			// Si no pones break el switch pasara a ejecutar el codigo de las condiciones
			// posteriores y no mirara sus operadores logicos en los CASE, porque una vez
			// que un case del switch se cumple, se cumple ese y los que son siguientes a
			// ese case, hasta que encuentre uno que tenga un break y finalize el switch
		case 2568:
			System.out.println("Resultado mayor a lo habitual");
			break;
		default:
			System.out.println("Valor erroneo");
		}
		
	}

}
