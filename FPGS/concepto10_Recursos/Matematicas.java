package conceptos.paso1_Basicos.concepto10_Recursos;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Random;

public class Matematicas {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		// Clases relacionadas con las Matematicas
		
		// java.lang
		
		System.out.println("Muestra el numero PI " + Math.PI);
		System.out.println("Muestra el numero de Euler " + Math.E);
		System.out.println();
		
		System.out.println("Sacar el mayor absoluto a un entero " + Math.absExact(9));
		System.out.println("Sacar el mayor absoluto a un entero " + Math.absExact(-7));
		System.out.println("Sacar el mayor absoluto a un entero " + Math.absExact(2100000000));
		System.out.println("Sacar el mayor absoluto a un entero " + Math.absExact(-1700000000));
		System.out.println();
		
		System.out.println("Sacar el mayor absoluto a un entero o decimal " + Math.abs(7));
		System.out.println("Sacar el mayor absoluto a un entero o decimal " + Math.abs(-9));
		System.out.println("Sacar el mayor absoluto a un entero o decimal " + Math.abs(9.2));
		System.out.println("Sacar el mayor absoluto a un entero o decimal " + Math.abs(-8.2));
		System.out.println();
		
		System.out.println("Redondear al numero mas pequeño " + Math.floor(5.5));
		System.out.println("Redondear al numero mas grande " + Math.ceil(5.5));
		System.out.println("Redondear al numero mas pequeño " + Math.floor(5.7));
		System.out.println("Redondear al numero mas grande " + Math.ceil(5.4));
		System.out.println("Redondear al numero mas cercano " + Math.rint(2.7));
		System.out.println("Redondear al numero mas cercano " + Math.rint(2.2));
		System.out.println();
		
		System.out.println("La raiz cuadrada de 20 " + Math.sqrt(20));
		System.out.println("La raiz cuadrada de 12 " + Math.sqrt(12));
		System.out.println();
		
		System.out.println("Calcular exponente " + Math.pow(4, 3));
		System.out.println("Calcular exponente " + Math.pow(4, 4));
		System.out.println("Calcular exponente " + Math.pow(5, 2));
		System.out.println();
		
		System.out.println("El numero de Euler elevado al exponente de 2 " + Math.exp(2));
		System.out.println("El numero de Euler elevado al exponente de 20 " + Math.exp(20));
		System.out.println();
		
		System.out.println("Numero aleatorio puro " + Math.random());
		System.out.println("Numero aleatorio con rango en decimal " + Math.random()* 7 + 1);
		System.out.println("Numero aleatorio con rango en entero " + (int) (Math.random()* 7 + 1));
		System.out.println();

		System.out.println("Muestra el numero anterior por parte decimal " + Math.nextDown(7));
		System.out.println("Muestra el numero anterior por parte decimal " + Math.nextDown(7.1));
		System.out.println("Muestra el numero anterior por parte decimal " + Math.nextDown(7.2));
		System.out.println("Muestra el numero anterior por parte decimal " + Math.nextDown(7.3));
		System.out.println("Muestra el numero siguiente por parte decimal " + Math.nextAfter(7, 5));
		System.out.println("Muestra el numero siguiente por parte decimal " + Math.nextAfter(7, 10));
		System.out.println("Muestra el numero siguiente por parte decimal " + Math.nextAfter(7, 12));
		System.out.println();
		
		System.out.println("Muestra el máximo de un numero " + Math.max(7, 2));
		System.out.println("Muestra el máximo de un numero " + Math.max(2, 7));
		System.out.println("Muestra el mínimo de un numero " + Math.min(7, 2));
		System.out.println("Muestra el mínimo de un numero " + Math.min(2, 7));
		System.out.println();
		
		System.out.println("Muestra el seno del ángulo en radientes " + Math.sin(20));
		System.out.println("Muestra el coseno del ángulo en radientes" + Math.cos(20));
		System.out.println("Muestra el tangente del ángulo en radientes " + Math.tan(20));
		System.out.println("Muestra el ángulo cuyo seno es el\nque se pasa por parametro " + Math.asin(20));
		System.out.println("Muestra el ángulo cuyo coseno es el\nque se pasa por parametro " + Math.acos(20));
		System.out.println("Muestra el ángulo cuyo tagente es el\nque se pasa por parametro " + Math.atan(20));
		System.out.println("Muestra el ángulo theta desde la conversion de las coordenadas\ndel rectangulo pasadas por paramentro " + Math.atan2(20, 20));
		System.out.println();
		
		System.out.println("Prueba 1" + Math.acos(0.1));
		System.out.println("Prueba 2" + Math.acos(0));
		System.out.println("Prueba 3" + Math.acos(1.2));
		System.out.println("Prueba 4" + Math.acos(0.9));
		System.out.println("Prueba 5" + Math.acos(1));
		System.out.println("Prueba 6" + Math.acos(9));
		System.out.println("Prueba 7" + Math.acos(9.5));
		System.out.println();
		
		System.out.println("Prueba 1" + Math.cosh(1));
		System.out.println("Prueba 2" + Math.cosh(2));
		System.out.println("Prueba 3" + Math.cosh(3));
		System.out.println();
		
		System.out.println("Calcula el logaritmo de 2 " + Math.log(2));
		System.out.println();
		
		// java.util
		
		Random ramdom = new Random();
		
		System.out.println("Mostrar número Double aleatorio " + ramdom.nextDouble());
		System.out.println("Mostrar número Double aleatorio " + ramdom.nextDouble(20));
		System.out.println("Mostrar número Double aleatorio " + ramdom.nextDouble(1, 20));
		System.out.println("Mostrar número Entero aleatorio " + ramdom.nextInt());
		System.out.println("Mostrar número Entero aleatorio " + ramdom.nextInt(20));
		System.out.println("Mostrar número Entero aleatorio " + ramdom.nextInt(1, 20));
		System.out.println("Mostrar número Float aleatorio " + ramdom.nextFloat());
		System.out.println("Mostrar número Float aleatorio " + ramdom.nextFloat(20));
		System.out.println("Mostrar número Float aleatorio " + ramdom.nextFloat(1, 20));
		System.out.println("Mostrar número Long aleatorio " + ramdom.nextLong());
		System.out.println("Mostrar número Long aleatorio " + ramdom.nextLong(20));
		System.out.println("Mostrar número Long aleatorio " + ramdom.nextLong(1, 20));
		System.out.println("Mostrar número Exponencial aleatorio " + ramdom.nextExponential());
		System.out.println("Mostrar un valor booleano aleatorio " + ramdom.nextBoolean());
		System.out.println("Mostrar número pesudo-aleatorio " + ramdom.nextGaussian());
		System.out.println("Mostrar número pesudo-aleatorio con cierto rango " + ramdom.nextGaussian(1, 30));
		
		System.out.println("Bytes aleatorios en un array ");
		byte[] bytes = new byte[4];
		/*bytes[0] = 0;
		bytes[1] = 2;
		bytes[2] = 5;
		bytes[3] = 7;*/
		ramdom.nextBytes(bytes);
		
		for (byte b : bytes) {
			System.out.println("\tCaracter " + b + " - " + (char) b);
		}
		
		System.out.println();
		
		// java.math
		
		BigInteger numero_entero = new BigInteger("700000000000000000000000000000000000000000000000");
		System.out.println("Mostrar el numero del BigInteger " + numero_entero);
		System.out.println("Sumar el numero del BigInteger " + numero_entero.add(new BigInteger("7487894619846516144496144984968")));
		System.out.println("Mostrar el numero de digitos del numero del BigInteger " + numero_entero.bitLength());
		numero_entero = new BigInteger("70000");
		System.out.println("Convertir BigInteger en float " + numero_entero.floatValue());
		numero_entero = new BigInteger("7000000000000000");
		System.out.println("Convertir BigInteger en long " + numero_entero.longValue());
		numero_entero = new BigInteger("700000000000000000000000000000000000000000000000");
		System.out.println("Mostrar el numero del hash del numero del interger " + numero_entero.hashCode());
		System.out.println("Retorna 1 si es positivo, -1 si es negativo o 0 si es cero | " + numero_entero.signum());
		numero_entero = new BigInteger("-700000000000000000000000000000000000000000000000");
		System.out.println("Retorna 1 si es positivo, -1 si es negativo o 0 si es cero | " + numero_entero.signum());
		numero_entero = new BigInteger("0");
		System.out.println("Retorna 1 si es positivo, -1 si es negativo o 0 si es cero | " + numero_entero.signum());
		numero_entero = new BigInteger("4878355568564295125279589782398");
		System.out.println("Retorna el numero en valor de bytes " + numero_entero.byteValue());
		System.out.println();
		
		// BigDecimal y BigInteger tienen casi los mismos metodos
		BigDecimal numero_decimal = new BigDecimal("4878355568564295125279589782398.15645845615135156564546");
		System.out.println();
		
		MathContext mathcontext = new MathContext(2147457455);
		System.out.println("Pedir el numero de MathContext " + mathcontext.getPrecision());
		
		/*
		 * La clase MathContext provee de un objeto inmutable
		 * que encapsula el contexto de una configuracion 
		 * y definicion en las reglas en las operaciones numericas
		 * Los parametros son los siguientes
		 * 		Precisión : El numero de digitos a ser usados
		 * 		en una operacion, esta precision redondea los
		 * 		resultados
		 * 		RoundingMode : un objeto de modo de redondeo
		 * 		que determina el algoritmo de redondeado a ser
		 * 		usado
		 * El numero de digitos es especificado por la precisión,
		 * el modo por defecto esta en redondeo apagado o no redondeo
		 * este es el modo HALF_UP 
		 * 
		 * En pocas palabras esta clase vuelve numeros en un formato de
		 * notacion cientifica y hacer un redondeo significativo, puede
		 * verlo en la documentacion presente
		 * */
		System.out.println("Numeros en notacion cientifica en modo HALF_UP");
		// https://www.geeksforgeeks.org/java-math-mathcontext-class-in-java/
		// https://es.acervolima.com/clase-java-math-mathcontext-en-java/#:~:text=La%20clase%20java.,que%20implementa%20la%20clase%20BigDecimal.
		numero_decimal = new BigDecimal("700500000.12", new MathContext(1, RoundingMode.HALF_UP));
		//								______________					_	___________________
		//							   Numero a operar		 La precision	 Modo de redondeo
		// "Numero a operar" es el "contexto"
		// El primer parametro de MathContext es la precision, es decir, el numero de digitos
		// que habra en la noracion cientifica
		// Segundo paramentro expecifica como se debe de manejar la perdida de precisión
		System.out.println(numero_decimal);
		numero_decimal = new BigDecimal("700500000.12", new MathContext(7, RoundingMode.HALF_UP));
		System.out.println(numero_decimal);
		numero_decimal = new BigDecimal("700500000.12", new MathContext(4, RoundingMode.HALF_UP));
		System.out.println(numero_decimal);
		numero_decimal = new BigDecimal("700500000.12", new MathContext(5, RoundingMode.HALF_UP));
		System.out.println(numero_decimal);
		
		System.out.println("Numeros en notacion cientifica en modo CEILING");
		numero_decimal = new BigDecimal("700500000.12", new MathContext(1, RoundingMode.CEILING));
		System.out.println(numero_decimal);
		numero_decimal = new BigDecimal("700500000.12", new MathContext(7, RoundingMode.CEILING));
		System.out.println(numero_decimal);
		numero_decimal = new BigDecimal("700500000.12", new MathContext(4, RoundingMode.CEILING));
		System.out.println(numero_decimal);
		numero_decimal = new BigDecimal("700500000.12", new MathContext(5, RoundingMode.CEILING));
		System.out.println(numero_decimal);
		
		System.out.println("Numeros en notacion cientifica en modo HALF_DOWN");
		numero_decimal = new BigDecimal("700500000.12", new MathContext(1, RoundingMode.HALF_DOWN));
		System.out.println(numero_decimal);
		numero_decimal = new BigDecimal("700500000.12", new MathContext(7, RoundingMode.HALF_DOWN));
		System.out.println(numero_decimal);
		numero_decimal = new BigDecimal("700500000.12", new MathContext(4, RoundingMode.HALF_DOWN));
		System.out.println(numero_decimal);
		numero_decimal = new BigDecimal("700500000.12", new MathContext(5, RoundingMode.HALF_DOWN));
		System.out.println(numero_decimal);
		
		System.out.println("Numeros en notacion cientifica en modo FLOOR");
		numero_decimal = new BigDecimal("700500000.12", new MathContext(1, RoundingMode.FLOOR));
		System.out.println(numero_decimal);
		numero_decimal = new BigDecimal("700500000.12", new MathContext(7, RoundingMode.FLOOR));
		System.out.println(numero_decimal);
		numero_decimal = new BigDecimal("700500000.12", new MathContext(4, RoundingMode.FLOOR));
		System.out.println(numero_decimal);
		numero_decimal = new BigDecimal("700500000.12", new MathContext(5, RoundingMode.FLOOR));
		System.out.println(numero_decimal);
		
		System.out.println("\nPrueba 1");
		System.out.println("Numeros en notacion cientifica en modo HALF_UP");
		numero_decimal = new BigDecimal("700500000.07", new MathContext(1, RoundingMode.HALF_UP));
		System.out.println(numero_decimal);
		numero_decimal = new BigDecimal("700500000.07", new MathContext(7, RoundingMode.HALF_UP));
		System.out.println(numero_decimal);
		numero_decimal = new BigDecimal("700500000.07", new MathContext(4, RoundingMode.HALF_UP));
		System.out.println(numero_decimal);
		numero_decimal = new BigDecimal("700500000.07", new MathContext(5, RoundingMode.HALF_UP));
		System.out.println(numero_decimal);
		
		System.out.println("Numeros en notacion cientifica en modo CEILING");
		numero_decimal = new BigDecimal("700500000.07", new MathContext(1, RoundingMode.CEILING));
		System.out.println(numero_decimal);
		numero_decimal = new BigDecimal("700500000.07", new MathContext(7, RoundingMode.CEILING));
		System.out.println(numero_decimal);
		numero_decimal = new BigDecimal("700500000.07", new MathContext(4, RoundingMode.CEILING));
		System.out.println(numero_decimal);
		numero_decimal = new BigDecimal("700500000.07", new MathContext(5, RoundingMode.CEILING));
		System.out.println(numero_decimal);
		
		System.out.println("Numeros en notacion cientifica en modo HALF_DOWN");
		numero_decimal = new BigDecimal("700500000.07", new MathContext(1, RoundingMode.HALF_DOWN));
		System.out.println(numero_decimal);
		numero_decimal = new BigDecimal("700500000.07", new MathContext(7, RoundingMode.HALF_DOWN));
		System.out.println(numero_decimal);
		numero_decimal = new BigDecimal("700500000.07", new MathContext(4, RoundingMode.HALF_DOWN));
		System.out.println(numero_decimal);
		numero_decimal = new BigDecimal("700500000.07", new MathContext(5, RoundingMode.HALF_DOWN));
		System.out.println(numero_decimal);
		
		System.out.println("Numeros en notacion cientifica en modo FLOOR");
		numero_decimal = new BigDecimal("700500000.07", new MathContext(1, RoundingMode.FLOOR));
		System.out.println(numero_decimal);
		numero_decimal = new BigDecimal("700500000.07", new MathContext(7, RoundingMode.FLOOR));
		System.out.println(numero_decimal);
		numero_decimal = new BigDecimal("700500000.07", new MathContext(4, RoundingMode.FLOOR));
		System.out.println(numero_decimal);
		numero_decimal = new BigDecimal("700500000.07", new MathContext(5, RoundingMode.FLOOR));
		System.out.println(numero_decimal);
		
	}

}
