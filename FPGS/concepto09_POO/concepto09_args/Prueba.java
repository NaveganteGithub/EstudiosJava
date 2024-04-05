package conceptos.paso1_Basicos.concepto09_POO.concepto09_args;

public class Prueba {

	/*
	 * En el metodo main hay un paramentro
	 * que hemos visto practicamente en
	 * todo el repaso y es el args, este
	 * es un array en el que podemos introducir
	 * los datos que queramos sin limites
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
	}

}
