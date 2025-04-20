package paso2_Avanzados.concepto09_POO.concepto06_clasesAbstractas;

public class Normal extends ClaseAbstractaParaProbar {

	public Normal() {
		
	}
	
	@Override
	public void sacarDinero(int cantidad) {
		// TODO Auto-generated method stub
		
		int resultado;
		resultado = contabilizar() - cantidad;
		
		if (resultado > -1)
			setCantidad(resultado);
		else
			setCantidad(0);
		
	}

	@Override
	public void meterDinero(int cantidad) {
		// TODO Auto-generated method stub
		setCantidad(contabilizar() + cantidad);
	}

}
