package conceptos.paso1_Basicos.concepto11_Exception.basico;

public class MiExcepcion extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 526682073089135114L;

	public MiExcepcion() {
		super();
	}
	
	@Override
	public String getMessage() {
		return "Mi Excepcion personalizada.";
	}
	
}
