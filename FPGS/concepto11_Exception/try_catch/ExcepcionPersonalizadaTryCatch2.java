package conceptos.paso1_Basicos.concepto11_Exception.try_catch;

// https://parzibyte.me/blog/2021/04/14/excepcion-personalizada-java/

// Primero crearias la clase que extienda de exception
class ProductoSinExistenciaException2 extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5256072798444363443L;

	public ProductoSinExistenciaException2() {
        super("El producto 123 no tiene existencia");
    }
}

class ExcepcionPersonalizadaTryCatch2 {

    public static void venderProducto() throws ProductoSinExistenciaException2 {
        // Aquí el código...
        // Lanzamos una excepción
        throw new ProductoSinExistenciaException2();
    }

    public static void main(String[] args) {
        try {
            venderProducto();
        } catch (ProductoSinExistenciaException2 e) {
            // Aquí manejar la excepción
            System.out.println("Se lanzó la excepción");
            System.out.println(e);
        }
    }
}