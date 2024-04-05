package conceptos.paso1_Basicos.concepto09_POO.concepto03_Sobrecarga;

import java.util.Random;

public class EjemploSobrecarga {
	
	private int[] arrayNumero = new int[16];
	private Random num = new Random();
	
	public EjemploSobrecarga() {}
	
	/* 
	 * La sobrecarga de un metodo es cuando utilizas un metodo 
	 * con el mismo nombre y mismo dato a devolver pero eso si
	 * con diferentes tipos de dato a pasar por paramentros
	 * 
	*/
	
	public String analizaNumero(int numero) {
		
		for (int i = 0; i < arrayNumero.length; i++) {
			arrayNumero[i] = num.nextInt(1, 20);
		}
		
		return String.valueOf(arrayNumero[numero]);
		
	}

	public String analizaNumero(String numero) {
		
		for (int i = 0; i < arrayNumero.length; i++) {
			arrayNumero[i] = num.nextInt(1, 20);
		}
		
		return String.valueOf(arrayNumero[Integer.valueOf(numero)]);
		
	}

	public String analizaNumero(int numero, int resta) {
		
		for (int i = 0; i < arrayNumero.length; i++) {
			arrayNumero[i] = num.nextInt(1, 20);
		}
		
		if(numero - resta > 0) numero -= resta;
		
		return String.valueOf(arrayNumero[numero]);
		
	}

	public String analizaNumero(String numero, int resta) {
		
		for (int i = 0; i < arrayNumero.length; i++) {
			arrayNumero[i] = num.nextInt(1, 20);
		}
		
		if(Integer.parseInt(numero) - resta > 0) 
			numero = String.valueOf(
					Integer.parseInt(numero) - resta
					);
		
		return String.valueOf(arrayNumero[Integer.valueOf(numero)]);
		
	}
	
}
