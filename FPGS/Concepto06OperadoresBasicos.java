package conceptos.paso1_Basicos;

public class Concepto06OperadoresBasicos {

	public static void main(String[] args) {
		
		// TODO Operadores, ejemplos de condiciones if
		
		short i = 1, k = 1;
		float j = 1.2f;
		
		// Operador que nos permite saber si un dato x es igual a un dato y
		System.out.printf("Operador igual - %s\n", "hola" == "hola");
		System.out.printf("Operador igual - %s\n", "hola" == "adios");
		System.out.printf("Operador igual - %s\n", i == 1);
		System.out.printf("Operador igual - %s\n", j == 1.2);
		System.out.printf("Operador igual - %s\n", i == 2);
		System.out.printf("Operador igual - %s\n", j == 2.2);
		System.out.printf("Operador igual - %s\n", i == k);

		System.out.println();
		
		// Operador que nos permite saber si un dato x no es igual a un dato y
		System.out.printf("Operador no igual - %s\n", "hola" != "hola");
		System.out.printf("Operador no igual - %s\n", "hola" != "adios");
		System.out.printf("Operador no igual - %s\n", i != 1);
		System.out.printf("Operador no igual - %s\n", j != 1.2);
		System.out.printf("Operador no igual - %s\n", i != 2);
		System.out.printf("Operador no igual - %s\n", j != 2.2);
		System.out.printf("Operador no igual - %s\n", i != k);

		System.out.println();
		
		// Operador que nos permite saber si un dato x es menor a un dato y
		System.out.printf("Operador menor que - %s\n", i < 1);
		// Operador que nos permite saber si un dato x es mayor a un dato y
		System.out.printf("Operador mayor que - %s\n", i > 1);
		// Operador que nos permite saber si un dato x es menor o igual a un dato y
		System.out.printf("Operador menor o igual que - %s\n", i <= 1);
		// Operador que nos permite saber si un dato x es mayor o igual a un dato y
		System.out.printf("Operador mayor o igual que - %s\n", i >= 1);
		System.out.printf("Operador menor que - %s\n", j < 1.2);
		System.out.printf("Operador mayor que - %s\n", j > 1.2);
		System.out.printf("Operador menor o igual que - %s\n", j <= 1.2);
		System.out.printf("Operador mayor o igual que - %s\n", j >= 1.2);
		System.out.printf("Operador menor que - %s\n", i < 2);
		System.out.printf("Operador mayor que - %s\n", i > 2);
		System.out.printf("Operador menor o igual que - %s\n", i <= 2);
		System.out.printf("Operador mayor o igual que - %s\n", i >= 2);
		System.out.printf("Operador menor que - %s\n", j < 2.2);
		System.out.printf("Operador mayor que - %s\n", j > 2.2);
		System.out.printf("Operador menor o igual que - %s\n", j <= 2.2);
		System.out.printf("Operador mayor o igual que - %s\n", j >= 2.2);
		System.out.printf("Operador menor que - %s\n", i < k);
		System.out.printf("Operador mayor que - %s\n", i > k);
		System.out.printf("Operador menor o igual que - %s\n", i <= k);
		System.out.printf("Operador mayor o igual que - %s\n", i >= k);

		System.out.println();
		
		System.out.println("Condicional 1");
		if(j > 1.2 && i >= k) {
			System.out.println("Numeros altos");
		} else {
			System.out.println("Numeros bajos");
		}
		
		System.out.println();
		
		String valor = "hola";
		
		System.out.println("Condicional 2");
		if(valor == "adios" && valor == "hola") {
			System.out.println("Valores correctos");
		} else {
			System.out.println("Valores incorrectos");
		}
		
		System.out.println();
		
		System.out.println("Condicional 3");
		if(valor != "adios" && valor != "hola") {
			System.out.println("Valores correctos");
		} else {
			System.out.println("Valores incorrectos");
		}
		
		System.out.println();
		
		System.out.println("Condicional 4");
		if(j > 1.2 || i >= k) {
			System.out.println("Numeros altos");
		} else {
			System.out.println("Numeros bajos");
		}
		
		System.out.println();
		
		System.out.println("Condicional 5");
		if(valor == "adios" || valor == "hola") {
			System.out.println("Valores correctos");
		} else {
			System.out.println("Valores incorrectos");
		}
		
		System.out.println();
		
		System.out.println("Condicional 6");
		if(valor != "adios" || valor != "hola") {
			System.out.println("Valores correctos");
		} else {
			System.out.println("Valores incorrectos");
		}
		
		System.out.println();
		
		System.out.println("Condicional 7");
		if(j > 1.2 & i >= k) {
			System.out.println("Numeros altos");
		} else {
			System.out.println("Numeros bajos");
		}
		
		System.out.println();
		
		System.out.println("Condicional 8");
		if(valor == "adios" & valor == "hola") {
			System.out.println("Valores correctos");
		} else {
			System.out.println("Valores incorrectos");
		}
		
		System.out.println();
		
		System.out.println("Condicional 9");
		if(valor != "adios" & valor != "hola") {
			System.out.println("Valores correctos");
		} else {
			System.out.println("Valores incorrectos");
		}
		
		System.out.println();
		
		System.out.println("Condicional 10");
		if(j > 1.2 | i >= k) {
			System.out.println("Numeros altos");
		} else {
			System.out.println("Numeros bajos");
		}
		
		System.out.println();
		
		System.out.println("Condicional 11");
		if(valor == "adios" | valor == "hola") {
			System.out.println("Valores correctos");
		} else {
			System.out.println("Valores incorrectos");
		}
		
		System.out.println();
		
		System.out.println("Condicional 12");
		if(valor != "adios" | valor != "hola") {
			System.out.println("Valores correctos");
		} else {
			System.out.println("Valores incorrectos");
		}
		
		System.out.println();
		
		System.out.println("Condicional 13");
		if(j <= 2.2 & i < k) {
			System.out.println("Valores correctos");
		} else {
			System.out.println("Valores incorrectos");
		}
		
		System.out.println();

		System.out.println("Condicional 14");
		if(j <= 2.2 | i < k) {
			System.out.println("Valores correctos");
		} else {
			System.out.println("Valores incorrectos");
		}
		
		System.out.println();
		
		System.out.println("Condicional 15");
		if(j <= 2.2 & !(i < k)) {
			System.out.println("Valores correctos");
		} else {
			System.out.println("Valores incorrectos");
		}
		
		System.out.println();
	}

}
