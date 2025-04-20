package paso2_Avanzados.concepto09_POO.concepto08_this;

public class ClaseHijo extends ClasePadre {
	
	private boolean LeEncantanLasTortillas;

	/* 
	 * this lo que hace es hacer una referencia asi mismo
	 * 
	 * para el caso de las variables de clase cuando nos
	 * encontramos con una paramentro que se llama exactamente
	 * igual a esta variable puede surgir el problema visto
	 * ahora, que los confunde entre si, para solucionarlo
	 * existe this que hace referencia a la propia variable
	 * 
	 */
	public void setLeEncantanLasTortillas(boolean LeEncantanLasTortillas) {
		this.LeEncantanLasTortillas = LeEncantanLasTortillas;
	}
	
	/* Pero no solamente sirve para las variables de entorno
	 * de una clase, tambien sirven para que una clase pueda
	 * referirse a si misma
	 * 
	 * */
	
	public ClaseHijo referenciaALaClasePropia() {
		return this;
	}
	

	/*
	 * Por si no a quedado claro
	 * 
	 * lo que hay que hacer es basicamente crear el constructor de la clase
	 * hijo ClaseHijo despues de extender la clase Hijo de la clase Padre
	 * ClasePadre, pero, con varias modificaciones mas y es que tenemos que a�adir
	 * la instruccion super que lo que hace es invocar a la ClasePadre para que
	 * herere su constructor, no basta solo con la instruccion extends, ademas
	 * la clase hijo debe de tener los mismos parametros de la clase padre.
	 * 
	 * Como dato curioso podemos agregar a la clase hijo a parte de los parametros
	 * de clase padre, sus propios parametros
	 * 
	 * */
	ClaseHijo(String nomb, int edad, String genero, int nivel, boolean lglp, boolean tortillas) {
		super(nomb, edad, genero, nivel, lglp);
		LeEncantanLasTortillas = tortillas;
	}
	
	public void gustoPorLasTortillas() {
		System.out.println(LeEncantanLasTortillas ? "Le encantan las tortillas" : "No le gustan las tortillas");
	}
	
	// La herencia no aplica a los atributos de clase solo a los metodos
	public void datosHeredados() {
		System.out.println("La clase hijo a heredado las siguientas caracteristicas \"" + 
							getNombre() + "; " +
							getEdad() + "; " +
							getGenero() + "; " +
							getNivelFuerza() + "; " +
							(isLeGustanLosPistos() ? "Si" : "No") +
							"\"");
	}
	
}
