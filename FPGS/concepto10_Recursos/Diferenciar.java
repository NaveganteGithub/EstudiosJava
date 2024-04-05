package conceptos.paso1_Basicos.concepto10_Recursos;

import java.util.Random;

import conceptos.paso1_Basicos.concepto09_POO.concepto01_Basico.explicacion_documentada.CalculosFechas;

public class Diferenciar {

	public static void main(String[] args) {
		
		// Diferenciar entre un clase y array
		
		Random random = new Random();
		CalculosFechas calculosFechas = new CalculosFechas();
		short[] ui = new short[4];
		int[] ui2 = new int[5];
		
		System.out.println(random.getClass());
		System.out.println(calculosFechas.getClass());
		System.out.println(ui.getClass());
		System.out.println(ui2.getClass());
		
		ui[0] = 7;
		ui[1] = 5;
		ui[2] = 8;
		ui[3] = 9;
		
		ui2[0] = 8;
		ui2[1] = 7;
		ui2[2] = 4;
		ui2[3] = 10;
		
		System.out.println(ui.getClass());
		System.out.println(ui2.getClass());
		
		System.out.println();
		
		// Diferenciar entre una clase y otra
		
		CalculosFechas cf1 = new CalculosFechas();
		CalculosFechas cf2 = new CalculosFechas();
		System.out.println(cf1.hashCode() == cf2.hashCode());
		cf1 = cf2;
		System.out.println(cf1.hashCode() == cf2.hashCode());
		
	}

}
