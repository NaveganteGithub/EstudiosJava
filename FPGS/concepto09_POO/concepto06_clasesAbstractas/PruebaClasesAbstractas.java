package conceptos.paso1_Basicos.concepto09_POO.concepto06_clasesAbstractas;

public class PruebaClasesAbstractas {

	public static void main(String[] args) {
		
		/* Primero probaremos el punto que dice 
		 * que las clases abstractas no se 
		 * pueden utilizar para instanciar 
		 * objetos
		 * 
		 * */
		// ClaseAbstractaParaProbar abstracta = new ClaseAbstractaParaProbar();
		
		Normal mirecurso = new Normal();
		
		mirecurso.setCliente("Avigail");
		mirecurso.setNumero_cuenta(7895);
		mirecurso.setCantidad(200);
		
		mirecurso.imprimirCantidad();
		
		mirecurso.sacarDinero(100);
		
		mirecurso.imprimirCantidad();

		mirecurso.sacarDinero(100);
		
		mirecurso.imprimirCantidad();

		mirecurso.sacarDinero(100);
		
		mirecurso.imprimirCantidad();

		mirecurso.sacarDinero(100);
		
		mirecurso.imprimirCantidad();
		
		mirecurso.meterDinero(1000);
		mirecurso.imprimirCantidad();
		
		mirecurso.meterDinero(1000);
		mirecurso.imprimirCantidad();
		
		mirecurso.meterDinero(1000);
		mirecurso.imprimirCantidad();
		
		mirecurso.meterDinero(1000);
		mirecurso.imprimirCantidad();
	}
	
}
