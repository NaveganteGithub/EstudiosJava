package conceptos.paso2_Avanzados.concepto01_Ficheros.concepto01_CRUD;

import java.io.File;

public class Delete {

	public Delete() {}
	
	public static void eliminarTXT(String ruta) {
		
		boolean archivo_eliminado;
		File archivoEliminar = new File(ruta);
		
		archivo_eliminado = archivoEliminar.delete();
		
		if(archivo_eliminado) System.out.println("Archivo eliminado con exito");
		else System.out.println("Archivo no encontrado");
		
	}
	
}
