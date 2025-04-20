package paso2_Avanzados.concepto11_Exception.try_catch.concepto_completo;

public class ExcepcionPersonalizadaCompleta {

	public static void main(String[] args) {
		
		// Decimo: Utilizaremos el metodo dentro de un TryCatch
		
		try {
			System.out.println(
					Recursos.sumaPersonalizada("2", "4", "7", "3")
					);
			System.out.println(
					Recursos.sumaPersonalizada("a", "4", "7", "3")
					);
		} catch (MiExcepcion e) {
			// TODO Mi Excepcion
			e.printStackTrace();
			System.out.println("Mensaje que se vera por pantalla desde el TryCatch");
			System.out.println(e + " <- este texto log,\nes necesario ponerlo en un fichero o en una base de datos,\n"
					+ "nunca lo pongas al descubierto, es por temas de ciberseguridad.\n"
					+ "Puesto que si se ve la ruta de tus clases\n"
					+ "un atacante puede hacerte ingeneria inversa mas facil.");
		}

		/* 
		 * Si utilizas este metodo fuera del TryCatch dara un error, debido 
		 * a que hemos declarado en susodicho metodo que es necesario un
		 * TryCatch con la excepcion MiExcepcion, lo cualo se puede ver
		 * en el octavo paso, del archivo Recursos de este paquete
		 * 
		 * */
		
		/*
		   System.out.println(
				Recursos.sumaPersonalizada("2", "4", "7", "3")
				);
		*/
	}
	
}
