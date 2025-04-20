package paso2_Avanzados.concepto09_POO.concepto03_Sobrecarga;

public class Concepto9 {

	public static void main(String[] args) {
		
		EjemploSobrecarga sobreCarga = new EjemploSobrecarga();
		
		System.out.println(sobreCarga.analizaNumero(4));
		
		System.out.println(sobreCarga.analizaNumero("4"));
		
		System.out.println(sobreCarga.analizaNumero(5, 2));
		
		System.out.println(sobreCarga.analizaNumero("5", 2));
	}
	
}
