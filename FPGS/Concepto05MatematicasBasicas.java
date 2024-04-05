package conceptos.paso1_Basicos;

public class Concepto05MatematicasBasicas {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		// Tipos de calculos matematicos en Java, 
		// desde el mas sencillo has el mas complejo
		
		System.out.printf("Suma - %s\n", (20 + 12));
		System.out.printf("Resta - %s\n", (20 - 12));
		System.out.printf("Multiplicar - %s\n", (20 * 2));
		System.out.printf("Dividir - %s\n", (20 / 2));
		System.out.printf("Resto - %s\n", (20 % 2));
		
		// Math es una clase que nos da una cantidad de metodos
		// para realizar calculos
		System.out.printf("Potencia - %.0f\n", Math.pow(20, 2));
		System.out.printf("Raiz cuadrada - %s\n", Math.sqrt(20));
		System.out.printf("Raiz al cubo - %s\n", Math.cbrt(20));
		
		System.out.printf("Redondear - %s\n", Math.round(10.2));
		System.out.printf("Redondear - %s\n", Math.round(10.7));
		System.out.printf("Redondear - %s\n", Math.round(10.5));
		
		System.out.printf("Redondear al valor maximo - %s\n", Math.ceil(10.2));
		System.out.printf("Redondear al valor maximo - %s\n", Math.ceil(10.7));
		System.out.printf("Redondear al valor maximo - %s\n", Math.ceil(10.5));
		
		System.out.printf("Redondear al valor minimo - %s\n", Math.floor(10.2));
		System.out.printf("Redondear al valor minimo - %s\n", Math.floor(10.7));
		System.out.printf("Redondear al valor minimo - %s\n", Math.floor(10.5));
		
		/* Para truncar 
		 * 		primero utilizaremos la operacion floor
		 * 		para redondear al valor decimal minimo,
		 * 		que es el actual 
		 * 		segundo convertiremos es valor en un string
		 * 		tercero crearemos una subcadena que vaya desde
		 * 		el primer numero desde la izquierda del numero
		 * 		entero hasta el punto de su decimal
		 * 		opcionalmente se puede pasar de integer a entero
		 * */
		System.out.printf("Truncar - %s\n",
				Integer.valueOf(
						String.valueOf(Math.floor(10.2124))
							.substring(
								0, 
								String.valueOf(Math.floor(10.2124)).indexOf(".")
							)
						)
				);
		System.out.printf("Truncar - %s\n", 
				Integer.valueOf(
						String.valueOf(Math.floor(10.7757))
							.substring(
								0, 
								String.valueOf(Math.floor(10.7757)).indexOf(".")
							)
						)
				);
		System.out.printf("Truncar - %s\n",
				String.valueOf(Math.floor(10.557))
					.substring(
							0, 
							String.valueOf(Math.floor(10.557)).indexOf(".")
						)
				);
		
		System.out.printf("Absoluto - %s\n", Math.abs(-10.2));
		System.out.printf("Absoluto - %s\n", Math.abs(-10.7));
		System.out.printf("Absoluto - %s\n", Math.abs(-10.5));
		
		System.out.printf("Minimo - %s\n", Math.min(20, 10));
		System.out.printf("Minimo - %s\n", Math.min(10, 20));
		
		System.out.printf("Maximo - %s\n", Math.max(20, 10));
		System.out.printf("Maximo - %s\n", Math.max(10, 20));
		
		System.out.printf("Logaritmo - %s\n", Math.log(50));
		System.out.printf("Logaritmo base 10 - %s\n", Math.log10(50));
		System.out.printf("Logaritmo de la suma del argumnto y 1 - %s\n", Math.log1p(50));
		
	}

}
