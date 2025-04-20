package conceptos.paso1_Basicos.concepto09_POO.concepto01_Basico.explicacion_grabada;

public class ClaseNoControladora {

	// Para que no accedan a tus atributos de clases es necesario cambiar el modificador de acceso a private
	private int factor1;
	private int factor2;
	private int resultado;
	
	// Ahora para acceder a las variables de forma correcta pues se tiene que utilizar los metodos getters y setters
	
	// set es un metodo que nos permite introduccir cambios puedes ponerle el nombre que tu quieras
	// este es el nombre estandar
	public void setFactor1(int f1) {
		factor1 = f1;
	}
	
	// get es un metodo que nos permite pedir datos a una variable de clase
	// este es el nombre estandar, pero pon el que tu prefieras
	/*public int getFactor1() {
		return factor1;
	}*/
	// No siempre vas a requerir de estos dos tipos de metodos siempre para cada variable de clase
	// por ejemplo, en la variable factor1 no quiero pedir datos solo quiero insertalos, as� que
	// utiliza solo lo que necesites para controlar como se debe de acceder a tus variables
	
	public void setFactor2(int f2) {
		factor2 = f2;
	}
	
	public int getResultado() {
		return resultado;
	}
	
	// Esto es un contructor necesario para crear la clase no controladora
	ClaseNoControladora() {}
	
	// Podemos instanciar tambien otros constructores, cada uno con sus parametros
	// Los contructores y los metodos no pueden tener los mismos parametros
	ClaseNoControladora(int f1, // Esto es un parametro
						int f2
						) {
		factor1 = f1;
		factor2 = f2;
	}
	
	// Aqui iran los metodos, que seran los que ejecuten acciones cuando los llames desde un objeto
	
	int suma() {
		resultado = factor1 + factor2;
		return resultado;
	}
	
	void sumaImprimida() {
		System.out.println(factor1 + factor2);
	}
	
}
