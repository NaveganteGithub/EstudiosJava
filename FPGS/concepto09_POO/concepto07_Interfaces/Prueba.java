package conceptos.paso1_Basicos.concepto09_POO.concepto07_Interfaces;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		 * Recuerda que una interfaz es 
		 * como una clase abstracta, no
		 * se puede instanciar directamente
		 * 
		 * */
		
		// LaInterfazCrear interfaz = new LaInterfazCrear();
		
		ClaseConImplementacion miclase = new ClaseConImplementacion();
		
		miclase.agregarTarea("Desarrollar pagina web");
		miclase.agregarTarea("Gestionar BD");
		miclase.agregarTarea("Desarrollar actualizacion");
		
		System.out.println(miclase.pedirTarea(0));
		System.out.println(miclase.pedirTarea(7));
	}

}
