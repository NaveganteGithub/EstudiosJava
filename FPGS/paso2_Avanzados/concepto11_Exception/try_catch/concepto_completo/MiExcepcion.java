package paso2_Avanzados.concepto11_Exception.try_catch.concepto_completo;

// Primero: crearamos la clase que será nuestra Excepcion

// Segundo: haremos que la clase sea una extension de Exception

public class MiExcepcion extends Exception {

	// Tercero: señalaremos que la clase tenga un serial que es un atributo de clase como el siguiente
	// salvo que tendra un valor diferente al que ves
	private static final long serialVersionUID = -8668760645012233874L;

	// Cuarto: crearemos los siguientes constructores
		// El constructor por defecto
	public MiExcepcion() {
        super();
    }
		// El constrctor con paso de mensaje incluido
    public MiExcepcion(String mensage) {
        super(mensage);
    }
    
	    /* 
		 * El constructor en el cual se pase la clase Throwable que es la clase padre, de 
		 * todas las excepciones y errores en Java, de hecho, Exception procede de este 
		 * clase, si miras la documentacion de tu IDE de lo dice en este caso este codigo 
		 * se hizo con Eclipse
		 * 
		 * */
    public MiExcepcion(Throwable errores_detectados) {
        super(errores_detectados);
    }
    
    	// El constructor con paso de mensaje en el cual se pase la clase Throwable incluido
    public MiExcepcion(String mensage, Throwable errores_detectados) {
        super(mensage, errores_detectados);
    }
	
    /* 
     * Quinto: sobreescribiremos el metodo getMessage() de la clase Throwable que es la
     * clase padre de la clase Exception, lo cualo hace que la clase Exception tenga 
     * tambien ese mismo metodo, y asi tengas la clase 
     * 
     * */
    
    @Override
    public String getMessage() {
    	// Aqui declaras el texto que tu querrias que se viera en la pantalla de comandos
    	return "Mi mensaje para la pantalla de comandos."; 
    }
    
}
