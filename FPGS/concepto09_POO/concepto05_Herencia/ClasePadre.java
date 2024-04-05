package conceptos.paso1_Basicos.concepto09_POO.concepto05_Herencia;

public class ClasePadre {

	// No es por el modificador de acceso
	private String nombre;
	private int Edad;
	private String Genero;
	private int NivelFuerza;
	private boolean LeGustanLosPistos;
	
	// No es por el modificador public
	
	String getNombre() {
		return nombre;
	}

	int getEdad() {
		return Edad;
	}

	String getGenero() {
		return Genero;
	}

	int getNivelFuerza() {
		return NivelFuerza;
	}

	boolean isLeGustanLosPistos() {
		return LeGustanLosPistos;
	}

	ClasePadre(String nomb, int edad, String genero, int nivel, boolean lglp) {
		nombre = nomb;
		Edad = edad;
		Genero = genero;
		NivelFuerza = nivel;
		LeGustanLosPistos = lglp;
	}
	
	void datosGenerales() {
		System.out.println("Nombre " + nombre 
				+ "; Edad " + Edad + " a�os"
				+ "; genero " + Genero 
				+ "; nivel de fuerza " + NivelFuerza 
				+ "; �le gustan los pistos? " + 
				(LeGustanLosPistos ? "Si" : "No")
				);
	}
	
}
