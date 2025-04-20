package paso2_Avanzados.concepto09_POO.concepto06_clasesAbstractas;

public abstract class ClaseAbstractaParaProbar {

	private int cantidad;
	private int numero_cuenta;
	private String cliente;
	
	/* 
	 * Una clase abstracta no puede tener constructor
	 * recuerda que no se puede instanciar objetos de
	 * una clase abstracta, poder puede tenerlos pero
	 * no los podrias invocar
	 * 
	 * */
	
	// ClaseAbstractaParaProbar() {}
	
	void setCantidad(int c) {
		cantidad = c;
	}

	void setNumero_cuenta(int numero_c) {
		numero_cuenta = numero_c;
	}

	void setCliente(String c) {
		cliente = c;
	}

	int contabilizar() {
		return cantidad;
	}
	
	public void imprimirCantidad() {
		System.out.println("Tienes " + cantidad + " euros.");
	}
	
	public void imprimirDatos() {
		System.out.println("Nombre " + cliente + "; Cuenta " + numero_cuenta);
	}
	
	// Una clase abstracta puede tener metodos y propiedades
	// pero debe de tener al menos un metodo abstracto
	public abstract void sacarDinero(int cantidad);
	
	public abstract void meterDinero(int cantidad);
	
}
