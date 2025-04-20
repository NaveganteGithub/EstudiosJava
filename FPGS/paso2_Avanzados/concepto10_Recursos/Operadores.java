package paso2_Avanzados.concepto10_Recursos;

public class Operadores {

	public static void main(String[] args) {

		// TODO Operadores

		int x, y;
		x = 2;
		
		// Operadores Prefix
		System.out.println("Operadores Prefix");
		y = ++x;
		System.out.println("x: " + x + "; y: " + y);
		y = --x;
		System.out.println("x: " + x + "; y: " + y);
		
		/*
		 * Primero cambiara el valor de x y guardara el valor
		 * en la variable y
		 * */
		
		// Operadores Postfix
		System.out.println("Operadores Postfix");
		y = x++;
		System.out.println("x: " + x + "; y: " + y);
		y = x--;
		System.out.println("x: " + x + "; y: " + y);
		
		/*
		 * Primero guardara el valor de la variable de x en y
		 * y luego x cambiara
		 * */
		
		// Operadores uninarios
		System.out.println("Operadores uninario");
		
		y = -x;
		
		System.out.println("Valor negativo: " + y);
		
		y = +x;
		
		System.out.println("Valor positivo: " + y);
		
		// https://www.manualweb.net/java/operadores-unarios-java/#:~:text=Los%20operadores%20unarios%20en%20Java%20son%20aquellos%20que,resta.%20Niega%20una%20expresi%C3%B3n.%20%2B%2B%20Operador%20de%20incremento.
		
		// Operadores matematicos
		
		System.out.println("Operadores matematicos");
		
		x = 20 + 2;
		System.out.println(x); // Suma
		x = 20 - 2;
		System.out.println(x); // Resta
		x = 20 * 2;
		System.out.println(x); // Multiplicacion
		x = 20 / 2;
		System.out.println(x); // Division
		x = 20 % 2;
		System.out.println(x); // Mod o Resto de una division
		
		// Operadores de asignacion
		System.out.println("Operadores de asignacion");
		x = 20;
		
		x += 2;
		System.out.println(x); // Suma
		x -= 2;
		System.out.println(x); // Resta
		x *= 2;
		System.out.println(x); // Multiplicacion
		x /= 2;
		System.out.println(x); // Division
		x %= 2;
		System.out.println(x); // Mod o Resto de una division
		
		// Operadores booleanos - Relacionales
		
		System.out.println("Operadores relacionales");
		x = 2;
		boolean resultado;
		
		resultado = x == 2;
		System.out.println(resultado);
		resultado = x == 3;
		System.out.println(resultado);
		
		resultado = x != 2;
		System.out.println(resultado);
		resultado = x != 3;
		System.out.println(resultado);

		resultado = x > 1;
		System.out.println(resultado);
		resultado = x > 2;
		System.out.println(resultado);
		resultado = x > 3;
		System.out.println(resultado);
		resultado = x > 4;
		System.out.println(resultado);

		resultado = x < 1;
		System.out.println(resultado);
		resultado = x < 2;
		System.out.println(resultado);
		resultado = x < 3;
		System.out.println(resultado);
		resultado = x < 4;
		System.out.println(resultado);

		resultado = x >= 1;
		System.out.println(resultado);
		resultado = x >= 2;
		System.out.println(resultado);
		resultado = x >= 3;
		System.out.println(resultado);
		resultado = x >= 4;
		System.out.println(resultado);

		resultado = x <= 1;
		System.out.println(resultado);
		resultado = x <= 2;
		System.out.println(resultado);
		resultado = x <= 3;
		System.out.println(resultado);
		resultado = x <= 4;
		System.out.println(resultado);
		
		/* 
		 * Ten cuidado con los operadores relacionales 
		 * porque para este tipo de operadores
		 * 
		 * - EL ORDEN DE LOS FACTORES ALTERA EL PRODUCTO -
		 *
		 * para este tipo de operadores no es lo mismo
		 * 
		 * x == y que y == x
		 * 
		 * Para simplificartelo este tipo de operadores
		 * son muy estrictos, y hay que tener bastante
		 * cuidado con lo que se escribe cuando estemos
		 * haciendo una operacion de calculo booleano
		 * pues como ya se ha dicho anteriormente como
		 * alteres una parte de la operacion alteras todo
		 * 
		 * */
		
		// Operadores booleanos - Logico
		
		String a1 = "a",
				b1 = "b";
		x = 20;
		y = 10;
		System.out.println("Operadores logicos\n");
		
		System.out.println("& - AND sin cortocircuito");
		
		System.out.println("& - 1");
		System.out.println(x == 20 & y == 10 & a1 == "a" & b1 == "b");
		System.out.println("& - 2");
		System.out.println(x == 20 & y == 10 & a1 == "a" & b1 == "a");
		System.out.println("& - 3");
		System.out.println(x == 20 & y == 10 & a1 == "2" & b1 == "b");
		System.out.println("& - 4");
		System.out.println(x == 20 & y == 10 & a1 == "a" & b1 == "b");
		System.out.println("& - 5");
		System.out.println(x == 10 & y == 10 & a1 == "a" & b1 == "b");
		System.out.println("& - 6");
		System.out.println(x == 20 & y == 30 & a1 == "a" & b1 == "b");
		System.out.println("& - 7");
		System.out.println(x == 30 & y == 30 & a1 == "a" & b1 == "b");

		System.out.println("& - 8");
		System.out.println(x != 20 & y != 10 & a1 != "a" & b1 != "b");
		System.out.println("& - 9");
		System.out.println(x != 20 & y != 10 & a1 != "a" & b1 != "a");
		System.out.println("& - 10");
		System.out.println(x != 20 & y != 10 & a1 != "2" & b1 != "b");
		System.out.println("& - 11");
		System.out.println(x != 20 & y != 10 & a1 != "a" & b1 != "b");
		System.out.println("& - 12");
		System.out.println(x != 10 & y != 10 & a1 != "a" & b1 != "b");
		System.out.println("& - 13");
		System.out.println(x != 20 & y != 30 & a1 != "a" & b1 != "b");
		System.out.println("& - 14");
		System.out.println(x != 30 & y != 30 & a1 != "a" & b1 != "b");

		System.out.println("& - 15");
		System.out.println(x > 20 & y > 10 & a1 == "a" & b1 == "b");
		System.out.println("& - 16");
		System.out.println(x > 20 & y > 10 & a1 == "a" & b1 == "a");
		System.out.println("& - 17");
		System.out.println(x > 20 & y > 10 & a1 == "2" & b1 == "b");
		System.out.println("& - 18");
		System.out.println(x > 20 & y > 10 & a1 == "a" & b1 == "b");
		System.out.println("& - 19");
		System.out.println(x > 10 & y > 10 & a1 == "a" & b1 == "b");
		System.out.println("& - 20");
		System.out.println(x > 20 & y > 30 & a1 == "a" & b1 == "b");
		System.out.println("& - 21");
		System.out.println(x > 30 & y > 30 & a1 == "a" & b1 == "b");

		System.out.println("& - 22");
		System.out.println(x < 20 & y < 10 & a1 == "a" & b1 == "b");
		System.out.println("& - 23");
		System.out.println(x < 20 & y < 10 & a1 == "a" & b1 == "a");
		System.out.println("& - 24");
		System.out.println(x < 20 & y < 10 & a1 == "2" & b1 == "b");
		System.out.println("& - 25");
		System.out.println(x < 20 & y < 10 & a1 == "a" & b1 == "b");
		System.out.println("& - 26");
		System.out.println(x < 10 & y < 10 & a1 == "a" & b1 == "b");
		System.out.println("& - 27");
		System.out.println(x < 20 & y < 30 & a1 == "a" & b1 == "b");
		System.out.println("& - 28");
		System.out.println(x < 30 & y < 30 & a1 == "a" & b1 == "b");

		System.out.println("& - 29");
		System.out.println(x >= 20 & y >= 10 & a1 == "a" & b1 == "b");
		System.out.println("& - 30");
		System.out.println(x >= 20 & y >= 10 & a1 == "a" & b1 == "a");
		System.out.println("& - 31");
		System.out.println(x >= 20 & y >= 10 & a1 == "2" & b1 == "b");
		System.out.println("& - 32");
		System.out.println(x >= 20 & y >= 10 & a1 == "a" & b1 == "b");
		System.out.println("& - 33");
		System.out.println(x >= 10 & y >= 10 & a1 == "a" & b1 == "b");
		System.out.println("& - 34");
		System.out.println(x >= 20 & y >= 30 & a1 == "a" & b1 == "b");
		System.out.println("& - 35");
		System.out.println(x >= 30 & y >= 30 & a1 == "a" & b1 == "b");
		
		System.out.println("& - 36");
		System.out.println(x <= 20 & y <= 10 & a1 == "a" & b1 == "b");
		System.out.println("& - 37");
		System.out.println(x <= 20 & y <= 10 & a1 == "a" & b1 == "a");
		System.out.println("& - 38");
		System.out.println(x <= 20 & y <= 10 & a1 == "2" & b1 == "b");
		System.out.println("& - 39");
		System.out.println(x <= 20 & y <= 10 & a1 == "a" & b1 == "b");
		System.out.println("& - 40");
		System.out.println(x <= 10 & y <= 10 & a1 == "a" & b1 == "b");
		System.out.println("& - 41");
		System.out.println(x <= 20 & y <= 30 & a1 == "a" & b1 == "b");
		System.out.println("& - 42");
		System.out.println(x <= 30 & y <= 30 & a1 == "a" & b1 == "b");

		System.out.println("& - 43");
		System.out.println(x > 20 & y > 10 & a1 != "a" & b1 != "b");
		System.out.println("& - 44");
		System.out.println(x > 20 & y > 10 & a1 != "a" & b1 != "a");
		System.out.println("& - 45");
		System.out.println(x > 20 & y > 10 & a1 != "2" & b1 != "b");
		System.out.println("& - 46");
		System.out.println(x > 20 & y > 10 & a1 != "a" & b1 != "b");
		System.out.println("& - 47");
		System.out.println(x > 10 & y > 10 & a1 != "a" & b1 != "b");
		System.out.println("& - 48");
		System.out.println(x > 20 & y > 30 & a1 != "a" & b1 != "b");
		System.out.println("& - 49");
		System.out.println(x > 30 & y > 30 & a1 != "a" & b1 != "b");

		System.out.println("& - 50");
		System.out.println(x < 20 & y < 10 & a1 != "a" & b1 != "b");
		System.out.println("& - 51");
		System.out.println(x < 20 & y < 10 & a1 != "a" & b1 != "a");
		System.out.println("& - 52");
		System.out.println(x < 20 & y < 10 & a1 != "2" & b1 != "b");
		System.out.println("& - 53");
		System.out.println(x < 20 & y < 10 & a1 != "a" & b1 != "b");
		System.out.println("& - 54");
		System.out.println(x < 10 & y < 10 & a1 != "a" & b1 != "b");
		System.out.println("& - 55");
		System.out.println(x < 20 & y < 30 & a1 != "a" & b1 != "b");
		System.out.println("& - 56");
		System.out.println(x < 30 & y < 30 & a1 != "a" & b1 != "b");

		System.out.println("& - 57");
		System.out.println(x >= 20 & y >= 10 & a1 != "a" & b1 != "b");
		System.out.println("& - 58");
		System.out.println(x >= 20 & y >= 10 & a1 != "a" & b1 != "a");
		System.out.println("& - 59");
		System.out.println(x >= 20 & y >= 10 & a1 != "2" & b1 != "b");
		System.out.println("& - 60");
		System.out.println(x >= 20 & y >= 10 & a1 != "a" & b1 != "b");
		System.out.println("& - 61");
		System.out.println(x >= 10 & y >= 10 & a1 != "a" & b1 != "b");
		System.out.println("& - 62");
		System.out.println(x >= 20 & y >= 30 & a1 != "a" & b1 != "b");
		System.out.println("& - 63");
		System.out.println(x >= 30 & y >= 30 & a1 != "a" & b1 != "b");

		System.out.println("& - 64");
		System.out.println(x <= 20 & y <= 10 & a1 != "a" & b1 != "b");
		System.out.println("& - 65");
		System.out.println(x <= 20 & y <= 10 & a1 != "a" & b1 != "a");
		System.out.println("& - 66");
		System.out.println(x <= 20 & y <= 10 & a1 != "2" & b1 != "b");
		System.out.println("& - 67");
		System.out.println(x <= 20 & y <= 10 & a1 != "a" & b1 != "b");
		System.out.println("& - 68");
		System.out.println(x <= 10 & y <= 10 & a1 != "a" & b1 != "b");
		System.out.println("& - 69");
		System.out.println(x <= 20 & y <= 30 & a1 != "a" & b1 != "b");
		System.out.println("& - 70");
		System.out.println(x <= 30 & y <= 30 & a1 != "a" & b1 != "b");

		System.out.println();
		System.out.println();
		
		System.out.println("| - OR sin cortocircuito");
		System.out.println("| - 1");
		System.out.println(x == 20 | y == 10 | a1 == "a" | b1 == "b");
		System.out.println("| - 2");
		System.out.println(x == 20 | y == 10 | a1 == "a" | b1 == "a");
		System.out.println("| - 3");
		System.out.println(x == 20 | y == 10 | a1 == "2" | b1 == "b");
		System.out.println("| - 4");
		System.out.println(x == 20 | y == 10 | a1 == "a" | b1 == "b");
		System.out.println("| - 5");
		System.out.println(x == 10 | y == 10 | a1 == "a" | b1 == "b");
		System.out.println("| - 6");
		System.out.println(x == 20 | y == 30 | a1 == "a" | b1 == "b");
		System.out.println("| - 7");
		System.out.println(x == 30 | y == 30 | a1 == "a" | b1 == "b");

		System.out.println("| - 8");
		System.out.println(x != 20 | y != 10 | a1 != "a" | b1 != "b");
		System.out.println("| - 9");
		System.out.println(x != 20 | y != 10 | a1 != "a" | b1 != "a");
		System.out.println("| - 10");
		System.out.println(x != 20 | y != 10 | a1 != "2" | b1 != "b");
		System.out.println("| - 11");
		System.out.println(x != 20 | y != 10 | a1 != "a" | b1 != "b");
		System.out.println("| - 12");
		System.out.println(x != 10 | y != 10 | a1 != "a" | b1 != "b");
		System.out.println("| - 13");
		System.out.println(x != 20 | y != 30 | a1 != "a" | b1 != "b");
		System.out.println("| - 14");
		System.out.println(x != 30 | y != 30 | a1 != "a" | b1 != "b");

		System.out.println("| - 15");
		System.out.println(x > 20 | y > 10 | a1 == "a" | b1 == "b");
		System.out.println("| - 16");
		System.out.println(x > 20 | y > 10 | a1 == "a" | b1 == "a");
		System.out.println("| - 17");
		System.out.println(x > 20 | y > 10 | a1 == "2" | b1 == "b");
		System.out.println("| - 18");
		System.out.println(x > 20 | y > 10 | a1 == "a" | b1 == "b");
		System.out.println("| - 19");
		System.out.println(x > 10 | y > 10 | a1 == "a" | b1 == "b");
		System.out.println("| - 20");
		System.out.println(x > 20 | y > 30 | a1 == "a" | b1 == "b");
		System.out.println("| - 21");
		System.out.println(x > 30 | y > 30 | a1 == "a" | b1 == "b");

		System.out.println("| - 22");
		System.out.println(x < 20 | y < 10 | a1 == "a" | b1 == "b");
		System.out.println("| - 23");
		System.out.println(x < 20 | y < 10 | a1 == "a" | b1 == "a");
		System.out.println("| - 24");
		System.out.println(x < 20 | y < 10 | a1 == "2" | b1 == "b");
		System.out.println("| - 25");
		System.out.println(x < 20 | y < 10 | a1 == "a" | b1 == "b");
		System.out.println("| - 26");
		System.out.println(x < 10 | y < 10 | a1 == "a" | b1 == "b");
		System.out.println("| - 27");
		System.out.println(x < 20 | y < 30 | a1 == "a" | b1 == "b");
		System.out.println("| - 28");
		System.out.println(x < 30 | y < 30 | a1 == "a" | b1 == "b");

		System.out.println("| - 29");
		System.out.println(x >= 20 | y >= 10 | a1 == "a" | b1 == "b");
		System.out.println("| - 30");
		System.out.println(x >= 20 | y >= 10 | a1 == "a" | b1 == "a");
		System.out.println("| - 31");
		System.out.println(x >= 20 | y >= 10 | a1 == "2" | b1 == "b");
		System.out.println("| - 32");
		System.out.println(x >= 20 | y >= 10 | a1 == "a" | b1 == "b");
		System.out.println("| - 33");
		System.out.println(x >= 10 | y >= 10 | a1 == "a" | b1 == "b");
		System.out.println("| - 34");
		System.out.println(x >= 20 | y >= 30 | a1 == "a" | b1 == "b");
		System.out.println("| - 35");
		System.out.println(x >= 30 | y >= 30 | a1 == "a" | b1 == "b");

		System.out.println("| - 36");
		System.out.println(x <= 20 | y <= 10 | a1 == "a" | b1 == "b");
		System.out.println("| - 37");
		System.out.println(x <= 20 | y <= 10 | a1 == "a" | b1 == "a");
		System.out.println("| - 38");
		System.out.println(x <= 20 | y <= 10 | a1 == "2" | b1 == "b");
		System.out.println("| - 39");
		System.out.println(x <= 20 | y <= 10 | a1 == "a" | b1 == "b");
		System.out.println("| - 40");
		System.out.println(x <= 10 | y <= 10 | a1 == "a" | b1 == "b");
		System.out.println("| - 41");
		System.out.println(x <= 20 | y <= 30 | a1 == "a" | b1 == "b");
		System.out.println("| - 42");
		System.out.println(x <= 30 | y <= 30 | a1 == "a" | b1 == "b");

		System.out.println("| - 43");
		System.out.println(x > 20 | y > 10 | a1 != "a" | b1 != "b");
		System.out.println("| - 44");
		System.out.println(x > 20 | y > 10 | a1 != "a" | b1 != "a");
		System.out.println("| - 45");
		System.out.println(x > 20 | y > 10 | a1 != "2" | b1 != "b");
		System.out.println("| - 46");
		System.out.println(x > 20 | y > 10 | a1 != "a" | b1 != "b");
		System.out.println("| - 47");
		System.out.println(x > 10 | y > 10 | a1 != "a" | b1 != "b");
		System.out.println("| - 48");
		System.out.println(x > 20 | y > 30 | a1 != "a" | b1 != "b");
		System.out.println("| - 49");
		System.out.println(x > 30 | y > 30 | a1 != "a" | b1 != "b");

		System.out.println("| - 50");		
		System.out.println(x < 20 | y < 10 | a1 != "a" | b1 != "b");
		System.out.println("| - 51");
		System.out.println(x < 20 | y < 10 | a1 != "a" | b1 != "a");
		System.out.println("| - 52");
		System.out.println(x < 20 | y < 10 | a1 != "2" | b1 != "b");
		System.out.println("| - 53");
		System.out.println(x < 20 | y < 10 | a1 != "a" | b1 != "b");
		System.out.println("| - 54");
		System.out.println(x < 10 | y < 10 | a1 != "a" | b1 != "b");
		System.out.println("| - 55");
		System.out.println(x < 20 | y < 30 | a1 != "a" | b1 != "b");
		System.out.println("| - 56");
		System.out.println(x < 30 | y < 30 | a1 != "a" | b1 != "b");

		System.out.println("| - 57");
		System.out.println(x >= 20 | y >= 10 | a1 != "a" | b1 != "b");
		System.out.println("| - 58");
		System.out.println(x >= 20 | y >= 10 | a1 != "a" | b1 != "a");
		System.out.println("| - 59");
		System.out.println(x >= 20 | y >= 10 | a1 != "2" | b1 != "b");
		System.out.println("| - 60");
		System.out.println(x >= 20 | y >= 10 | a1 != "a" | b1 != "b");
		System.out.println("| - 61");
		System.out.println(x >= 10 | y >= 10 | a1 != "a" | b1 != "b");
		System.out.println("| - 62");
		System.out.println(x >= 20 | y >= 30 | a1 != "a" | b1 != "b");
		System.out.println("| - 63");
		System.out.println(x >= 30 | y >= 30 | a1 != "a" | b1 != "b");

		System.out.println("| - 64");
		System.out.println(x <= 20 | y <= 10 | a1 != "a" | b1 != "b");
		System.out.println("| - 65");
		System.out.println(x <= 20 | y <= 10 | a1 != "a" | b1 != "a");
		System.out.println("| - 66");
		System.out.println(x <= 20 | y <= 10 | a1 != "2" | b1 != "b");
		System.out.println("| - 67");
		System.out.println(x <= 20 | y <= 10 | a1 != "a" | b1 != "b");
		System.out.println("| - 68");
		System.out.println(x <= 10 | y <= 10 | a1 != "a" | b1 != "b");
		System.out.println("| - 69");
		System.out.println(x <= 20 | y <= 30 | a1 != "a" | b1 != "b");
		System.out.println("| - 70");
		System.out.println(x <= 30 | y <= 30 | a1 != "a" | b1 != "b");

		System.out.println();
		System.out.println();
		
		System.out.println("^ - XOR sin cortocircuito");
		System.out.println("^ - 1");
		System.out.println(x == 20 ^ y == 10 ^ a1 == "a" ^ b1 == "b");
		System.out.println("^ - 2");
		System.out.println(x == 20 ^ y == 10 ^ a1 == "a" ^ b1 == "a");
		System.out.println("^ - 3");
		System.out.println(x == 20 ^ y == 10 ^ a1 == "2" ^ b1 == "b");
		System.out.println("^ - 4");
		System.out.println(x == 20 ^ y == 10 ^ a1 == "a" ^ b1 == "b");
		System.out.println("^ - 5");
		System.out.println(x == 10 ^ y == 10 ^ a1 == "a" ^ b1 == "b");
		System.out.println("^ - 6");
		System.out.println(x == 20 ^ y == 30 ^ a1 == "a" ^ b1 == "b");
		System.out.println("^ - 7");
		System.out.println(x == 30 ^ y == 30 ^ a1 == "a" ^ b1 == "b");

		System.out.println("^ - 8");
		System.out.println(x != 20 ^ y != 10 ^ a1 != "a" ^ b1 != "b");
		System.out.println("^ - 9");
		System.out.println(x != 20 ^ y != 10 ^ a1 != "a" ^ b1 != "a");
		System.out.println("^ - 10");
		System.out.println(x != 20 ^ y != 10 ^ a1 != "2" ^ b1 != "b");
		System.out.println("^ - 11");
		System.out.println(x != 20 ^ y != 10 ^ a1 != "a" ^ b1 != "b");
		System.out.println("^ - 12");
		System.out.println(x != 10 ^ y != 10 ^ a1 != "a" ^ b1 != "b");
		System.out.println("^ - 13");
		System.out.println(x != 20 ^ y != 30 ^ a1 != "a" ^ b1 != "b");
		System.out.println("^ - 14");
		System.out.println(x != 30 ^ y != 30 ^ a1 != "a" ^ b1 != "b");

		System.out.println("^ - 15");
		System.out.println(x > 20 ^ y > 10 ^ a1 == "a" ^ b1 == "b");
		System.out.println("^ - 16");
		System.out.println(x > 20 ^ y > 10 ^ a1 == "a" ^ b1 == "a");
		System.out.println("^ - 17");
		System.out.println(x > 20 ^ y > 10 ^ a1 == "2" ^ b1 == "b");
		System.out.println("^ - 18");
		System.out.println(x > 20 ^ y > 10 ^ a1 == "a" ^ b1 == "b");
		System.out.println("^ - 19");
		System.out.println(x > 10 ^ y > 10 ^ a1 == "a" ^ b1 == "b");
		System.out.println("^ - 20");
		System.out.println(x > 20 ^ y > 30 ^ a1 == "a" ^ b1 == "b");
		System.out.println("^ - 21");
		System.out.println(x > 30 ^ y > 30 ^ a1 == "a" ^ b1 == "b");

		System.out.println("^ - 22");
		System.out.println(x < 20 ^ y < 10 ^ a1 == "a" ^ b1 == "b");
		System.out.println("^ - 23");
		System.out.println(x < 20 ^ y < 10 ^ a1 == "a" ^ b1 == "a");
		System.out.println("^ - 24");
		System.out.println(x < 20 ^ y < 10 ^ a1 == "2" ^ b1 == "b");
		System.out.println("^ - 25");
		System.out.println(x < 20 ^ y < 10 ^ a1 == "a" ^ b1 == "b");
		System.out.println("^ - 26");
		System.out.println(x < 10 ^ y < 10 ^ a1 == "a" ^ b1 == "b");
		System.out.println("^ - 27");
		System.out.println(x < 20 ^ y < 30 ^ a1 == "a" ^ b1 == "b");
		System.out.println("^ - 28");
		System.out.println(x < 30 ^ y < 30 ^ a1 == "a" ^ b1 == "b");

		System.out.println("^ - 29");
		System.out.println(x >= 20 ^ y >= 10 ^ a1 == "a" ^ b1 == "b");
		System.out.println("^ - 30");
		System.out.println(x >= 20 ^ y >= 10 ^ a1 == "a" ^ b1 == "a");
		System.out.println("^ - 31");
		System.out.println(x >= 20 ^ y >= 10 ^ a1 == "2" ^ b1 == "b");
		System.out.println("^ - 32");
		System.out.println(x >= 20 ^ y >= 10 ^ a1 == "a" ^ b1 == "b");
		System.out.println("^ - 33");
		System.out.println(x >= 10 ^ y >= 10 ^ a1 == "a" ^ b1 == "b");
		System.out.println("^ - 34");
		System.out.println(x >= 20 ^ y >= 30 ^ a1 == "a" ^ b1 == "b");
		System.out.println("^ - 35");
		System.out.println(x >= 30 ^ y >= 30 ^ a1 == "a" ^ b1 == "b");

		System.out.println("^ - 36");
		System.out.println(x <= 20 ^ y <= 10 ^ a1 == "a" ^ b1 == "b");
		System.out.println("^ - 37");
		System.out.println(x <= 20 ^ y <= 10 ^ a1 == "a" ^ b1 == "a");
		System.out.println("^ - 38");
		System.out.println(x <= 20 ^ y <= 10 ^ a1 == "2" ^ b1 == "b");
		System.out.println("^ - 39");
		System.out.println(x <= 20 ^ y <= 10 ^ a1 == "a" ^ b1 == "b");
		System.out.println("^ - 40");
		System.out.println(x <= 10 ^ y <= 10 ^ a1 == "a" ^ b1 == "b");
		System.out.println("^ - 41");
		System.out.println(x <= 20 ^ y <= 30 ^ a1 == "a" ^ b1 == "b");
		System.out.println("^ - 42");
		System.out.println(x <= 30 ^ y <= 30 ^ a1 == "a" ^ b1 == "b");

		System.out.println("^ - 43");
		System.out.println(x > 20 ^ y > 10 ^ a1 != "a" ^ b1 != "b");
		System.out.println("^ - 44");
		System.out.println(x > 20 ^ y > 10 ^ a1 != "a" ^ b1 != "a");
		System.out.println("^ - 45");
		System.out.println(x > 20 ^ y > 10 ^ a1 != "2" ^ b1 != "b");
		System.out.println("^ - 46");
		System.out.println(x > 20 ^ y > 10 ^ a1 != "a" ^ b1 != "b");
		System.out.println("^ - 47");
		System.out.println(x > 10 ^ y > 10 ^ a1 != "a" ^ b1 != "b");
		System.out.println("^ - 48");
		System.out.println(x > 20 ^ y > 30 ^ a1 != "a" ^ b1 != "b");
		System.out.println("^ - 49");
		System.out.println(x > 30 ^ y > 30 ^ a1 != "a" ^ b1 != "b");

		System.out.println("^ - 50");
		System.out.println(x < 20 ^ y < 10 ^ a1 != "a" ^ b1 != "b");
		System.out.println("^ - 51");
		System.out.println(x < 20 ^ y < 10 ^ a1 != "a" ^ b1 != "a");
		System.out.println("^ - 52");
		System.out.println(x < 20 ^ y < 10 ^ a1 != "2" ^ b1 != "b");
		System.out.println("^ - 53");
		System.out.println(x < 20 ^ y < 10 ^ a1 != "a" ^ b1 != "b");
		System.out.println("^ - 54");
		System.out.println(x < 10 ^ y < 10 ^ a1 != "a" ^ b1 != "b");
		System.out.println("^ - 55");
		System.out.println(x < 20 ^ y < 30 ^ a1 != "a" ^ b1 != "b");
		System.out.println("^ - 56");
		System.out.println(x < 30 ^ y < 30 ^ a1 != "a" ^ b1 != "b");

		System.out.println("^ - 57");
		System.out.println(x >= 20 ^ y >= 10 ^ a1 != "a" ^ b1 != "b");
		System.out.println("^ - 58");
		System.out.println(x >= 20 ^ y >= 10 ^ a1 != "a" ^ b1 != "a");
		System.out.println("^ - 59");
		System.out.println(x >= 20 ^ y >= 10 ^ a1 != "2" ^ b1 != "b");
		System.out.println("^ - 60");
		System.out.println(x >= 20 ^ y >= 10 ^ a1 != "a" ^ b1 != "b");
		System.out.println("^ - 61");
		System.out.println(x >= 10 ^ y >= 10 ^ a1 != "a" ^ b1 != "b");
		System.out.println("^ - 62");
		System.out.println(x >= 20 ^ y >= 30 ^ a1 != "a" ^ b1 != "b");
		System.out.println("^ - 63");
		System.out.println(x >= 30 ^ y >= 30 ^ a1 != "a" ^ b1 != "b");

		System.out.println("^ - 64");
		System.out.println(x <= 20 ^ y <= 10 ^ a1 != "a" ^ b1 != "b");
		System.out.println("^ - 65");
		System.out.println(x <= 20 ^ y <= 10 ^ a1 != "a" ^ b1 != "a");
		System.out.println("^ - 66");
		System.out.println(x <= 20 ^ y <= 10 ^ a1 != "2" ^ b1 != "b");
		System.out.println("^ - 67");
		System.out.println(x <= 20 ^ y <= 10 ^ a1 != "a" ^ b1 != "b");
		System.out.println("^ - 68");
		System.out.println(x <= 10 ^ y <= 10 ^ a1 != "a" ^ b1 != "b");
		System.out.println("^ - 69");
		System.out.println(x <= 20 ^ y <= 30 ^ a1 != "a" ^ b1 != "b");
		System.out.println("^ - 70");
		System.out.println(x <= 30 ^ y <= 30 ^ a1 != "a" ^ b1 != "b");

		System.out.println();
		System.out.println();
		
		System.out.println("&& - AND con cortocircuito");
		System.out.println("&& - 1");
		System.out.println(x == 20 && y == 10 && a1 == "a" && b1 == "b");
		System.out.println("&& - 2");
		System.out.println(x == 20 && y == 10 && a1 == "a" && b1 == "a");
		System.out.println("&& - 3");
		System.out.println(x == 20 && y == 10 && a1 == "2" && b1 == "b");
		System.out.println("&& - 4");
		System.out.println(x == 20 && y == 10 && a1 == "a" && b1 == "b");
		System.out.println("&& - 5");
		System.out.println(x == 10 && y == 10 && a1 == "a" && b1 == "b");
		System.out.println("&& - 6");
		System.out.println(x == 20 && y == 30 && a1 == "a" && b1 == "b");
		System.out.println("&& - 7");
		System.out.println(x == 30 && y == 30 && a1 == "a" && b1 == "b");

		System.out.println("&& - 8");
		System.out.println(x != 20 && y != 10 && a1 != "a" && b1 != "b");
		System.out.println("&& - 9");
		System.out.println(x != 20 && y != 10 && a1 != "a" && b1 != "a");
		System.out.println("&& - 10");
		System.out.println(x != 20 && y != 10 && a1 != "2" && b1 != "b");
		System.out.println("&& - 11");
		System.out.println(x != 20 && y != 10 && a1 != "a" && b1 != "b");
		System.out.println("&& - 12");
		System.out.println(x != 10 && y != 10 && a1 != "a" && b1 != "b");
		System.out.println("&& - 13");
		System.out.println(x != 20 && y != 30 && a1 != "a" && b1 != "b");
		System.out.println("&& - 14");
		System.out.println(x != 30 && y != 30 && a1 != "a" && b1 != "b");

		System.out.println("&& - 15");
		System.out.println(x > 20 && y > 10 && a1 == "a" && b1 == "b");
		System.out.println("&& - 16");
		System.out.println(x > 20 && y > 10 && a1 == "a" && b1 == "a");
		System.out.println("&& - 17");
		System.out.println(x > 20 && y > 10 && a1 == "2" && b1 == "b");
		System.out.println("&& - 18");
		System.out.println(x > 20 && y > 10 && a1 == "a" && b1 == "b");
		System.out.println("&& - 19");
		System.out.println(x > 10 && y > 10 && a1 == "a" && b1 == "b");
		System.out.println("&& - 20");
		System.out.println(x > 20 && y > 30 && a1 == "a" && b1 == "b");
		System.out.println("&& - 21");
		System.out.println(x > 30 && y > 30 && a1 == "a" && b1 == "b");

		System.out.println("&& - 22");
		System.out.println(x < 20 && y < 10 && a1 == "a" && b1 == "b");
		System.out.println("&& - 23");
		System.out.println(x < 20 && y < 10 && a1 == "a" && b1 == "a");
		System.out.println("&& - 24");
		System.out.println(x < 20 && y < 10 && a1 == "2" && b1 == "b");
		System.out.println("&& - 25");
		System.out.println(x < 20 && y < 10 && a1 == "a" && b1 == "b");
		System.out.println("&& - 26");
		System.out.println(x < 10 && y < 10 && a1 == "a" && b1 == "b");
		System.out.println("&& - 27");
		System.out.println(x < 20 && y < 30 && a1 == "a" && b1 == "b");
		System.out.println("&& - 28");
		System.out.println(x < 30 && y < 30 && a1 == "a" && b1 == "b");

		System.out.println("&& - 29");
		System.out.println(x >= 20 && y >= 10 && a1 == "a" && b1 == "b");
		System.out.println("&& - 30");
		System.out.println(x >= 20 && y >= 10 && a1 == "a" && b1 == "a");
		System.out.println("&& - 31");
		System.out.println(x >= 20 && y >= 10 && a1 == "2" && b1 == "b");
		System.out.println("&& - 32");
		System.out.println(x >= 20 && y >= 10 && a1 == "a" && b1 == "b");
		System.out.println("&& - 33");
		System.out.println(x >= 10 && y >= 10 && a1 == "a" && b1 == "b");
		System.out.println("&& - 34");
		System.out.println(x >= 20 && y >= 30 && a1 == "a" && b1 == "b");
		System.out.println("&& - 35");
		System.out.println(x >= 30 && y >= 30 && a1 == "a" && b1 == "b");

		System.out.println("&& - 36");
		System.out.println(x <= 20 && y <= 10 && a1 == "a" && b1 == "b");
		System.out.println("&& - 37");
		System.out.println(x <= 20 && y <= 10 && a1 == "a" && b1 == "a");
		System.out.println("&& - 38");
		System.out.println(x <= 20 && y <= 10 && a1 == "2" && b1 == "b");
		System.out.println("&& - 39");
		System.out.println(x <= 20 && y <= 10 && a1 == "a" && b1 == "b");
		System.out.println("&& - 40");
		System.out.println(x <= 10 && y <= 10 && a1 == "a" && b1 == "b");
		System.out.println("&& - 41");
		System.out.println(x <= 20 && y <= 30 && a1 == "a" && b1 == "b");
		System.out.println("&& - 42");
		System.out.println(x <= 30 && y <= 30 && a1 == "a" && b1 == "b");

		System.out.println("&& - 43");
		System.out.println(x > 20 && y > 10 && a1 != "a" && b1 != "b");
		System.out.println("&& - 44");
		System.out.println(x > 20 && y > 10 && a1 != "a" && b1 != "a");
		System.out.println("&& - 45");
		System.out.println(x > 20 && y > 10 && a1 != "2" && b1 != "b");
		System.out.println("&& - 46");
		System.out.println(x > 20 && y > 10 && a1 != "a" && b1 != "b");
		System.out.println("&& - 47");
		System.out.println(x > 10 && y > 10 && a1 != "a" && b1 != "b");
		System.out.println("&& - 48");
		System.out.println(x > 20 && y > 30 && a1 != "a" && b1 != "b");
		System.out.println("&& - 49");
		System.out.println(x > 30 && y > 30 && a1 != "a" && b1 != "b");

		System.out.println("&& - 50");
		System.out.println(x < 20 && y < 10 && a1 != "a" && b1 != "b");
		System.out.println("&& - 51");
		System.out.println(x < 20 && y < 10 && a1 != "a" && b1 != "a");
		System.out.println("&& - 52");
		System.out.println(x < 20 && y < 10 && a1 != "2" && b1 != "b");
		System.out.println("&& - 53");
		System.out.println(x < 20 && y < 10 && a1 != "a" && b1 != "b");
		System.out.println("&& - 54");
		System.out.println(x < 10 && y < 10 && a1 != "a" && b1 != "b");
		System.out.println("&& - 55");
		System.out.println(x < 20 && y < 30 && a1 != "a" && b1 != "b");
		System.out.println("&& - 56");
		System.out.println(x < 30 && y < 30 && a1 != "a" && b1 != "b");

		System.out.println("&& - 57");
		System.out.println(x >= 20 && y >= 10 && a1 != "a" && b1 != "b");
		System.out.println("&& - 58");
		System.out.println(x >= 20 && y >= 10 && a1 != "a" && b1 != "a");
		System.out.println("&& - 59");
		System.out.println(x >= 20 && y >= 10 && a1 != "2" && b1 != "b");
		System.out.println("&& - 60");
		System.out.println(x >= 20 && y >= 10 && a1 != "a" && b1 != "b");
		System.out.println("&& - 61");
		System.out.println(x >= 10 && y >= 10 && a1 != "a" && b1 != "b");
		System.out.println("&& - 62");
		System.out.println(x >= 20 && y >= 30 && a1 != "a" && b1 != "b");
		System.out.println("&& - 63");
		System.out.println(x >= 30 && y >= 30 && a1 != "a" && b1 != "b");

		System.out.println("&& - 64");
		System.out.println(x <= 20 && y <= 10 && a1 != "a" && b1 != "b");
		System.out.println("&& - 65");
		System.out.println(x <= 20 && y <= 10 && a1 != "a" && b1 != "a");
		System.out.println("&& - 66");
		System.out.println(x <= 20 && y <= 10 && a1 != "2" && b1 != "b");
		System.out.println("&& - 67");
		System.out.println(x <= 20 && y <= 10 && a1 != "a" && b1 != "b");
		System.out.println("&& - 68");
		System.out.println(x <= 10 && y <= 10 && a1 != "a" && b1 != "b");
		System.out.println("&& - 69");
		System.out.println(x <= 20 && y <= 30 && a1 != "a" && b1 != "b");
		System.out.println("&& - 70");
		System.out.println(x <= 30 && y <= 30 && a1 != "a" && b1 != "b");

		System.out.println();
		System.out.println();
		
		System.out.println("|| - OR con cortocircuito");
		System.out.println("|| - 1");
		System.out.println(x == 20 || y == 10 || a1 == "a" || b1 == "b");
		System.out.println("|| - 2");
		System.out.println(x == 20 || y == 10 || a1 == "a" || b1 == "a");
		System.out.println("|| - 3");
		System.out.println(x == 20 || y == 10 || a1 == "2" || b1 == "b");
		System.out.println("|| - 4");
		System.out.println(x == 20 || y == 10 || a1 == "a" || b1 == "b");
		System.out.println("|| - 5");
		System.out.println(x == 10 || y == 10 || a1 == "a" || b1 == "b");
		System.out.println("|| - 6");
		System.out.println(x == 20 || y == 30 || a1 == "a" || b1 == "b");
		System.out.println("|| - 7");
		System.out.println(x == 30 || y == 30 || a1 == "a" || b1 == "b");

		System.out.println("|| - 8");
		System.out.println(x != 20 || y != 10 || a1 != "a" || b1 != "b");
		System.out.println("|| - 9");
		System.out.println(x != 20 || y != 10 || a1 != "a" || b1 != "a");
		System.out.println("|| - 10");
		System.out.println(x != 20 || y != 10 || a1 != "2" || b1 != "b");
		System.out.println("|| - 11");
		System.out.println(x != 20 || y != 10 || a1 != "a" || b1 != "b");
		System.out.println("|| - 12");
		System.out.println(x != 10 || y != 10 || a1 != "a" || b1 != "b");
		System.out.println("|| - 13");
		System.out.println(x != 20 || y != 30 || a1 != "a" || b1 != "b");
		System.out.println("|| - 14");
		System.out.println(x != 30 || y != 30 || a1 != "a" || b1 != "b");

		System.out.println("|| - 15");
		System.out.println(x > 20 || y > 10 || a1 == "a" || b1 == "b");
		System.out.println("|| - 16");
		System.out.println(x > 20 || y > 10 || a1 == "a" || b1 == "a");
		System.out.println("|| - 17");
		System.out.println(x > 20 || y > 10 || a1 == "2" || b1 == "b");
		System.out.println("|| - 18");
		System.out.println(x > 20 || y > 10 || a1 == "a" || b1 == "b");
		System.out.println("|| - 19");
		System.out.println(x > 10 || y > 10 || a1 == "a" || b1 == "b");
		System.out.println("|| - 20");
		System.out.println(x > 20 || y > 30 || a1 == "a" || b1 == "b");
		System.out.println("|| - 21");
		System.out.println(x > 30 || y > 30 || a1 == "a" || b1 == "b");

		System.out.println("|| - 22");
		System.out.println(x < 20 || y < 10 || a1 == "a" || b1 == "b");
		System.out.println("|| - 23");
		System.out.println(x < 20 || y < 10 || a1 == "a" || b1 == "a");
		System.out.println("|| - 24");
		System.out.println(x < 20 || y < 10 || a1 == "2" || b1 == "b");
		System.out.println("|| - 25");
		System.out.println(x < 20 || y < 10 || a1 == "a" || b1 == "b");
		System.out.println("|| - 26");
		System.out.println(x < 10 || y < 10 || a1 == "a" || b1 == "b");
		System.out.println("|| - 27");
		System.out.println(x < 20 || y < 30 || a1 == "a" || b1 == "b");
		System.out.println("|| - 28");
		System.out.println(x < 30 || y < 30 || a1 == "a" || b1 == "b");

		System.out.println("|| - 29");
		System.out.println(x >= 20 || y >= 10 || a1 == "a" || b1 == "b");
		System.out.println("|| - 30");
		System.out.println(x >= 20 || y >= 10 || a1 == "a" || b1 == "a");
		System.out.println("|| - 31");
		System.out.println(x >= 20 || y >= 10 || a1 == "2" || b1 == "b");
		System.out.println("|| - 32");
		System.out.println(x >= 203 || y >= 10 || a1 == "a" || b1 == "b");
		System.out.println("|| - 33");
		System.out.println(x >= 10 || y >= 10 || a1 == "a" || b1 == "b");
		System.out.println("|| - 34");
		System.out.println(x >= 20 || y >= 30 || a1 == "a" || b1 == "b");
		System.out.println("|| - 35");
		System.out.println(x >= 30 || y >= 30 || a1 == "a" || b1 == "b");

		System.out.println("|| - 36");		
		System.out.println(x <= 20 || y <= 10 || a1 == "a" || b1 == "b");
		System.out.println("|| - 37");
		System.out.println(x <= 20 || y <= 10 || a1 == "a" || b1 == "a");
		System.out.println("|| - 38");
		System.out.println(x <= 20 || y <= 10 || a1 == "2" || b1 == "b");
		System.out.println("|| - 39");
		System.out.println(x <= 20 || y <= 10 || a1 == "a" || b1 == "b");
		System.out.println("|| - 40");
		System.out.println(x <= 10 || y <= 10 || a1 == "a" || b1 == "b");
		System.out.println("|| - 41");
		System.out.println(x <= 20 || y <= 30 || a1 == "a" || b1 == "b");
		System.out.println("|| - 42");
		System.out.println(x <= 30 || y <= 30 || a1 == "a" || b1 == "b");

		System.out.println("|| - 43");
		System.out.println(x > 20 || y > 10 || a1 != "a" || b1 != "b");
		System.out.println("|| - 44");
		System.out.println(x > 20 || y > 10 || a1 != "a" || b1 != "a");
		System.out.println("|| - 45");
		System.out.println(x > 20 || y > 10 || a1 != "2" || b1 != "b");
		System.out.println("|| - 46");
		System.out.println(x > 20 || y > 10 || a1 != "a" || b1 != "b");
		System.out.println("|| - 47");
		System.out.println(x > 10 || y > 10 || a1 != "a" || b1 != "b");
		System.out.println("|| - 48");
		System.out.println(x > 20 || y > 30 || a1 != "a" || b1 != "b");
		System.out.println("|| - 49");
		System.out.println(x > 30 || y > 30 || a1 != "a" || b1 != "b");

		System.out.println("|| - 50");
		System.out.println(x < 20 || y < 10 || a1 != "a" || b1 != "b");
		System.out.println("|| - 51");
		System.out.println(x < 20 || y < 10 || a1 != "a" || b1 != "a");
		System.out.println("|| - 52");
		System.out.println(x < 20 || y < 10 || a1 != "2" || b1 != "b");
		System.out.println("|| - 53");
		System.out.println(x < 20 || y < 10 || a1 != "a" || b1 != "b");
		System.out.println("|| - 54");
		System.out.println(x < 10 || y < 10 || a1 != "a" || b1 != "b");
		System.out.println("|| - 55");
		System.out.println(x < 20 || y < 30 || a1 != "a" || b1 != "b");
		System.out.println("|| - 56");
		System.out.println(x < 30 || y < 30 || a1 != "a" || b1 != "b");

		System.out.println("|| - 57");
		System.out.println(x >= 20 || y >= 10 || a1 != "a" || b1 != "b");
		System.out.println("|| - 58");
		System.out.println(x >= 20 || y >= 10 || a1 != "a" || b1 != "a");
		System.out.println("|| - 59");
		System.out.println(x >= 20 || y >= 10 || a1 != "2" || b1 != "b");
		System.out.println("|| - 60");
		System.out.println(x >= 20 || y >= 10 || a1 != "a" || b1 != "b");
		System.out.println("|| - 61");
		System.out.println(x >= 10 || y >= 10 || a1 != "a" || b1 != "b");
		System.out.println("|| - 62");
		System.out.println(x >= 20 || y >= 30 || a1 != "a" || b1 != "b");
		System.out.println("|| - 63");
		System.out.println(x >= 30 || y >= 30 || a1 != "a" || b1 != "b");

		System.out.println("|| - 64");
		System.out.println(x <= 20 || y <= 10 || a1 != "a" || b1 != "b");
		System.out.println("|| - 65");
		System.out.println(x <= 20 || y <= 10 || a1 != "a" || b1 != "a");
		System.out.println("|| - 66");
		System.out.println(x <= 20 || y <= 10 || a1 != "2" || b1 != "b");
		System.out.println("|| - 67");
		System.out.println(x <= 20 || y <= 10 || a1 != "a" || b1 != "b");
		System.out.println("|| - 68");
		System.out.println(x <= 10 || y <= 10 || a1 != "a" || b1 != "b");
		System.out.println("|| - 69");
		System.out.println(x <= 20 || y <= 30 || a1 != "a" || b1 != "b");
		System.out.println("|| - 70");
		System.out.println(x <= 30 || y <= 30 || a1 != "a" || b1 != "b");

		System.out.println();
		System.out.println();
		
		System.out.println("! - NOT");
		System.out.println("! - 1");
		System.out.println(!(x == 20 & y == 10 & a1 == "a" & b1 == "b"));
		System.out.println("! - 2");
		System.out.println(!(x == 20 & y == 10 & a1 == "a" & b1 == "a"));
		System.out.println("! - 3");
		System.out.println(!(x == 20 & y == 10 & a1 == "2" & b1 == "b"));
		System.out.println("! - 4");
		System.out.println(!(x == 20 & y == 10 & a1 == "a" & b1 == "b"));
		System.out.println("! - 5");
		System.out.println(!(x == 10 & y == 10 & a1 == "a" & b1 == "b"));
		System.out.println("! - 6");
		System.out.println(!(x == 20 & y == 30 & a1 == "a" & b1 == "b"));
		System.out.println("! - 7");
		System.out.println(!(x == 30 & y == 30 & a1 == "a" & b1 == "b"));

		System.out.println("! - 8");
		System.out.println(!(x != 20 & y != 10 & a1 != "a" & b1 != "b"));
		System.out.println("! - 9");
		System.out.println(!(x != 20 & y != 10 & a1 != "a" & b1 != "a"));
		System.out.println("! - 10");
		System.out.println(!(x != 20 & y != 10 & a1 != "2" & b1 != "b"));
		System.out.println("! - 11");
		System.out.println(!(x != 20 & y != 10 & a1 != "a" & b1 != "b"));
		System.out.println("! - 12");
		System.out.println(!(x != 10 & y != 10 & a1 != "a" & b1 != "b"));
		System.out.println("! - 13");
		System.out.println(!(x != 20 & y != 30 & a1 != "a" & b1 != "b"));
		System.out.println("! - 14");
		System.out.println(!(x != 30 & y != 30 & a1 != "a" & b1 != "b"));

		System.out.println("! - 15");
		System.out.println(!(x > 20 & y > 10 & a1 == "a" & b1 == "b"));
		System.out.println("! - 16");
		System.out.println(!(x > 20 & y > 10 & a1 == "a" & b1 == "a"));
		System.out.println("! - 17");
		System.out.println(!(x > 20 & y > 10 & a1 == "2" & b1 == "b"));
		System.out.println("! - 18");
		System.out.println(!(x > 20 & y > 10 & a1 == "a" & b1 == "b"));
		System.out.println("! - 19");
		System.out.println(!(x > 10 & y > 10 & a1 == "a" & b1 == "b"));
		System.out.println("! - 20");
		System.out.println(!(x > 20 & y > 30 & a1 == "a" & b1 == "b"));
		System.out.println("! - 21");
		System.out.println(!(x > 30 & y > 30 & a1 == "a" & b1 == "b"));

		System.out.println("! - 22");
		System.out.println(!(x < 20 & y < 10 & a1 == "a" & b1 == "b"));
		System.out.println("! - 23");
		System.out.println(!(x < 20 & y < 10 & a1 == "a" & b1 == "a"));
		System.out.println("! - 24");
		System.out.println(!(x < 20 & y < 10 & a1 == "2" & b1 == "b"));
		System.out.println("! - 25");
		System.out.println(!(x < 20 & y < 10 & a1 == "a" & b1 == "b"));
		System.out.println("! - 26");
		System.out.println(!(x < 10 & y < 10 & a1 == "a" & b1 == "b"));
		System.out.println("! - 27");
		System.out.println(!(x < 20 & y < 30 & a1 == "a" & b1 == "b"));
		System.out.println("! - 28");
		System.out.println(!(x < 30 & y < 30 & a1 == "a" & b1 == "b"));

		System.out.println("! - 29");
		System.out.println(!(x >= 20 & y >= 10 & a1 == "a" & b1 == "b"));
		System.out.println("! - 30");
		System.out.println(!(x >= 20 & y >= 10 & a1 == "a" & b1 == "a"));
		System.out.println("! - 31");
		System.out.println(!(x >= 20 & y >= 10 & a1 == "2" & b1 == "b"));
		System.out.println("! - 32");
		System.out.println(!(x >= 20 & y >= 10 & a1 == "a" & b1 == "b"));
		System.out.println("! - 33");
		System.out.println(!(x >= 10 & y >= 10 & a1 == "a" & b1 == "b"));
		System.out.println("! - 34");
		System.out.println(!(x >= 20 & y >= 30 & a1 == "a" & b1 == "b"));
		System.out.println("! - 35");
		System.out.println(!(x >= 30 & y >= 30 & a1 == "a" & b1 == "b"));

		System.out.println("! - 36");
		System.out.println(!(x <= 20 & y <= 10 & a1 == "a" & b1 == "b"));
		System.out.println("! - 37");
		System.out.println(!(x <= 20 & y <= 10 & a1 == "a" & b1 == "a"));
		System.out.println("! - 38");
		System.out.println(!(x <= 20 & y <= 10 & a1 == "2" & b1 == "b"));
		System.out.println("! - 39");
		System.out.println(!(x <= 20 & y <= 10 & a1 == "a" & b1 == "b"));
		System.out.println("! - 40");
		System.out.println(!(x <= 10 & y <= 10 & a1 == "a" & b1 == "b"));
		System.out.println("! - 41");
		System.out.println(!(x <= 20 & y <= 30 & a1 == "a" & b1 == "b"));
		System.out.println("! - 42");
		System.out.println(!(x <= 30 & y <= 30 & a1 == "a" & b1 == "b"));

		System.out.println("! - 43");
		System.out.println(!(x > 20 & y > 10 & a1 != "a" & b1 != "b"));
		System.out.println("! - 44");
		System.out.println(!(x > 20 & y > 10 & a1 != "a" & b1 != "a"));
		System.out.println("! - 45");
		System.out.println(!(x > 20 & y > 10 & a1 != "2" & b1 != "b"));
		System.out.println("! - 46");
		System.out.println(!(x > 20 & y > 10 & a1 != "a" & b1 != "b"));
		System.out.println("! - 47");
		System.out.println(!(x > 10 & y > 10 & a1 != "a" & b1 != "b"));
		System.out.println("! - 48");
		System.out.println(!(x > 20 & y > 30 & a1 != "a" & b1 != "b"));
		System.out.println("! - 49");
		System.out.println(!(x > 30 & y > 30 & a1 != "a" & b1 != "b"));

		System.out.println("! - 50");
		System.out.println(!(x < 20 & y < 10 & a1 != "a" & b1 != "b"));
		System.out.println("! - 51");
		System.out.println(!(x < 20 & y < 10 & a1 != "a" & b1 != "a"));
		System.out.println("! - 52");
		System.out.println(!(x < 20 & y < 10 & a1 != "2" & b1 != "b"));
		System.out.println("! - 53");
		System.out.println(!(x < 20 & y < 10 & a1 != "a" & b1 != "b"));
		System.out.println("! - 54");
		System.out.println(!(x < 10 & y < 10 & a1 != "a" & b1 != "b"));
		System.out.println("! - 55");
		System.out.println(!(x < 20 & y < 30 & a1 != "a" & b1 != "b"));
		System.out.println("! - 56");
		System.out.println(!(x < 30 & y < 30 & a1 != "a" & b1 != "b"));

		System.out.println("! - 57");
		System.out.println(!(x >= 20 & y >= 10 & a1 != "a" & b1 != "b"));
		System.out.println("! - 58");
		System.out.println(!(x >= 20 & y >= 10 & a1 != "a" & b1 != "a"));
		System.out.println("! - 59");
		System.out.println(!(x >= 20 & y >= 10 & a1 != "2" & b1 != "b"));
		System.out.println("! - 60");
		System.out.println(!(x >= 20 & y >= 10 & a1 != "a" & b1 != "b"));
		System.out.println("! - 61");
		System.out.println(!(x >= 10 & y >= 10 & a1 != "a" & b1 != "b"));
		System.out.println("! - 62");
		System.out.println(!(x >= 20 & y >= 30 & a1 != "a" & b1 != "b"));
		System.out.println("! - 63");
		System.out.println(!(x >= 30 & y >= 30 & a1 != "a" & b1 != "b"));

		System.out.println("! - 64");
		System.out.println(!(x <= 20 & y <= 10 & a1 != "a" & b1 != "b"));
		System.out.println("! - 65");
		System.out.println(!(x <= 20 & y <= 10 & a1 != "a" & b1 != "a"));
		System.out.println("! - 66");
		System.out.println(!(x <= 20 & y <= 10 & a1 != "2" & b1 != "b"));
		System.out.println("! - 67");
		System.out.println(!(x <= 20 & y <= 10 & a1 != "a" & b1 != "b"));
		System.out.println("! - 68");
		System.out.println(!(x <= 10 & y <= 10 & a1 != "a" & b1 != "b"));
		System.out.println("! - 69");
		System.out.println(!(x <= 20 & y <= 30 & a1 != "a" & b1 != "b"));
		System.out.println("! - 70");
		System.out.println(!(x <= 30 & y <= 30 & a1 != "a" & b1 != "b"));

		/*
		 * Aqui la cosa cambia, los operadores logicos no tienen distincion
		 * a la hora de realizar una operacion booleana
		 * 
		 * Para que quede claro los operadores
		 * 
		 * 		relacionales     ==, !=, <, >, <=, >=
		 * 			- EL ORDEN DE LOS FACTORES ALTERA EL PRODUCTO -
		 * 
		 * 		logicos     &, |, ^, &&, ||, !
		 * 			- EL ORDEN DE LOS FACTORES NO ALTERA EL PRODUCTO-
		 *  
		 * */
		
		System.out.println();
		System.out.println();
		
		// Operador ternario
		
		System.out.println("Operador ternario");
		
		System.out.println(x == 20 ? "20 es el resultado" : "20 no es el resultado");
		System.out.println(x == 10 ? "20 es el resultado" : "20 no es el resultado");
		
		System.out.println(x == 20 && b1 == "b"? true : false);
		System.out.println(x == 10 && b1 == "b"? true : false);
		
		System.out.println(x == 20 || b1 == "b"? true : false);
		System.out.println(x == 10 || b1 == "a"? true : false);
		System.out.println(x == 20 || b1 == "b"? true : false);
		
		System.out.println(y == 10 && x == 20 || b1 == "a"? true : false);
		System.out.println(y == 20 && x == 20 || b1 == "b"? true : false);
		System.out.println(y == 20 && x == 10 || b1 == "b"? true : false);
		
		// Operador de prioridad
		
		System.out.println("Operador de prioridad");
		
		System.out.println(20 * 2 + 10);
		System.out.println(20 * (2 + 10));
		System.out.println(10 + 20 * (2 + 10));
		System.out.println((10 + 20) * (2 + 10));
		System.out.println((10 + 20) * 2 + 10);
		
		System.out.println(x != 10 || a1 == "a" && b1 == "a" && y == 10);
		System.out.println(((x != 10 || a1 == "a") && b1 == "a") && y == 10);
		System.out.println((x != 10 || a1 == "a" && b1 == "a") && y == 10);
		System.out.println(x != 10 || (a1 == "a" && b1 == "a" && y == 10));
		System.out.println(x != 10 || (a1 == "a" && (b1 == "a" && y == 10)));
		
		
	}

}
