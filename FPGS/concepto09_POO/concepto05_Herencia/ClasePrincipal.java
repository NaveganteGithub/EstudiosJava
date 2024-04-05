package conceptos.paso1_Basicos.concepto09_POO.concepto05_Herencia;

public class ClasePrincipal {

	public static void main(String[] args) {
		
	/* 
	 * Java puesto que una de sus caracteristicas 
	 * es tener una sintexis neutra en su lenguaje
	 * no permite tener la herencia multiple de
	 * manera directa, es decir no puedes hacer
	 * que una clase herere las caracteristicas
	 * de mas de una clase en Java
	 * 
	 * */
		
		ClasePadre padre = new ClasePadre("Lorenzo", 55, "Hombre", 21, true);
		
		padre.datosGenerales();
		
		// padre.gustoPorLasTortillas(); 
		// No funciona aqui este metodo porque no existe en la clase padre sino en la clase hijo
		
		ClaseHijo hijo = new ClaseHijo("Daniel", 27, "Hombre", 29, true, true);
		
		/* El metodo que es de la clase Padre, puede ser utilizados si llamas a la clase hijo
		 * debido a que el hijo puede utilizar a la clase padre */
		
		hijo.datosGenerales();
		
		hijo.gustoPorLasTortillas();
		
		hijo.datosHeredados();
		
	}
	
}
