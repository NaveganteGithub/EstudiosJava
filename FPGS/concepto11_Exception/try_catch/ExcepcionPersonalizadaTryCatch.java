package conceptos.paso1_Basicos.concepto11_Exception.try_catch;

// https://parzibyte.me/blog/2021/04/14/excepcion-personalizada-java/

// Primero crearias la clase que extienda de exception
class ProductoSinExistenciaException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = -8534081289230537345L;

	public ProductoSinExistenciaException(String mensaje) {
        super(mensaje);
    }
}

// Segundo creas la clase controladora
public class ExcepcionPersonalizadaTryCatch {

	// Tercero creas un metodo para invocar la exception
    public static void venderProducto() throws ProductoSinExistenciaException {
        // Aquí el código...
        // Lanzamos una excepción
        throw new ProductoSinExistenciaException("El producto 123 no tiene existencia");
    }

    public static void main(String[] args) {
        try {
            venderProducto();
        } catch (ProductoSinExistenciaException e) {
            // Aquí manejar la excepción
            System.out.println("Se lanzó la excepción");
            System.out.println(e);
        }
    }
}