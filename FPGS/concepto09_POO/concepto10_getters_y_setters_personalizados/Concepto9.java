package conceptos.paso1_Basicos.concepto09_POO.concepto10_getters_y_setters_personalizados;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Concepto9 {
	
	private static Concepto9 clase = new Concepto9();
	
	public static void main(String[] args) {
		
		Getterts_y_Setters_Personalizados calculosFechas = new Getterts_y_Setters_Personalizados(new GregorianCalendar(2000, Calendar.APRIL, 12), new GregorianCalendar(2020, Calendar.APRIL, 12));// Esto es un objeto
		
		System.out.println(calculosFechas);
		System.out.println();
		
		calculosFechas.EntreFechas();
		System.out.println();
		
		System.out.println("-".repeat(110).concat("\n"));
		
		Getterts_y_Setters_Personalizados calculosFechas2 = new Getterts_y_Setters_Personalizados(); // Esto es un objeto
		System.out.println(calculosFechas2);
		System.out.println();
		
		System.out.println("-".repeat(110).concat("\n"));
		
		calculosFechas = new Getterts_y_Setters_Personalizados(new GregorianCalendar(2022, Calendar.OCTOBER, 1), new GregorianCalendar(2023, Calendar.OCTOBER, 1));
		calculosFechas.EntreFechas();
		calculosFechas = new Getterts_y_Setters_Personalizados(new GregorianCalendar(2022, Calendar.OCTOBER, 1), new GregorianCalendar(2023, Calendar.OCTOBER, 30)); // Tenemos que tener en cuenta los 29 dias del ultimo mes
		calculosFechas.EntreFechas();
		calculosFechas = new Getterts_y_Setters_Personalizados(new GregorianCalendar(2024, Calendar.OCTOBER, 1), new GregorianCalendar(2025, Calendar.OCTOBER, 30));
		calculosFechas.EntreFechas();
		calculosFechas = new Getterts_y_Setters_Personalizados(new GregorianCalendar(2024, Calendar.OCTOBER, 1), new GregorianCalendar(2025, Calendar.OCTOBER, 15));
		calculosFechas.EntreFechas();
		calculosFechas = new Getterts_y_Setters_Personalizados(new GregorianCalendar(2023, Calendar.OCTOBER, 1), new GregorianCalendar(2024, Calendar.OCTOBER, 30)); // Aqui sale 395 en vez de 394 porque 2024 es bisiesto
		calculosFechas.EntreFechas();
		System.out.println();
		
		System.out.println("-".repeat(110));
		
		System.out.println();
		
		// System.out.println(1);
		calculosFechas2.CuantoFalta(new GregorianCalendar(2022, Calendar.DECEMBER, 29));
		// System.out.println(2);
		calculosFechas2.CuantoFalta(new GregorianCalendar(2022, Calendar.OCTOBER, 29));
		// System.out.println(3);
		calculosFechas2.CuantoFalta(new GregorianCalendar(2022, Calendar.SEPTEMBER, 29)); // Fecha de hoy
		// System.out.println(4);
		calculosFechas2.CuantoFalta(new GregorianCalendar(2022, Calendar.OCTOBER, 24));
		
		System.out.println();
		
		System.out.println("-".repeat(110));
		
		System.out.println();
		
		
		calculosFechas2.setDia(25);
		
		
		// System.out.println(clase.getClass().getName());
		System.out.println(calculosFechas2.getDia(clase));
		
		
		
		
	}
	
}
