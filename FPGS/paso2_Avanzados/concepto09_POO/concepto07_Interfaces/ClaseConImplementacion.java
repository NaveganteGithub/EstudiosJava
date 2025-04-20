package paso2_Avanzados.concepto09_POO.concepto07_Interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ClaseConImplementacion implements LaInterfazCrear {

	private ArrayList<String> tareas = new ArrayList<String>();
	private int sueldo;
	private String nombre;
	private short edad;
	
	public void insertarDatos() {
		
		Scanner capturaDatos = new Scanner(System.in);
		
		System.out.println("Cual es el nombre del empleado? ");
		nombre = capturaDatos.nextLine();
		System.out.println("Cual es su edad? ");
		edad = capturaDatos.nextShort();
		System.out.println("Cual es su sueldo? ");
		sueldo = capturaDatos.nextInt();
		
		capturaDatos.close();
		
	}
	
	@Override
	public void imprimirDatos() {
		// TODO Auto-generated method stub
		System.out.println("El empleado " + nombre + ", su edad es de " + edad +
				" a�os, su sueldo es de " + sueldo + " euros, y sus tareas son ");
		
		for (Iterator<String> iterator = tareas.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			if (iterator.hasNext())
				System.out.print(string + ", ");
			else
				System.out.println(string);
		}
	}

	@Override
	public void imprimirSueldo() {
		// TODO Auto-generated method stub
		System.out.println("El sueldo de " + nombre + " es de " + sueldo);
	}

	@Override
	public void agregarTarea(String tarea) {
		// TODO Auto-generated method stub
		tareas.add(tarea);
	}

	@Override
	public String pedirTarea(int id) {
		// TODO Auto-generated method stub
		
		if (id < tareas.size())
			return tareas.get(id);
		
		return "No hay tareas";
		
	}

	@Override
	public int numeroDeTareas() {
		// TODO Auto-generated method stub
		return tareas.size();
	}

}
