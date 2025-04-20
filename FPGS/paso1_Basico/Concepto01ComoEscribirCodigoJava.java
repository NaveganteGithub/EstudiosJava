package paso1_Basico;

// Para utilizar un clase en Java 1º Paso
import java.util.Scanner;
// import java.util.*;

public class Concepto01ComoEscribirCodigoJava {

	public static void main(String[] args) {
		
		// TODO Como escribir codigo java - LEER A PARTIR DE AQUI
		
		// recuerda que al principio tendras que dar un "salto de fe"
		// tienes que confiar ciegamente en lo que ten enseñan e
		// intenta asimilar los conceptos con imagenes en tu cabeza,
		// en Java todo al principio es un "salto de fe", cuando
		// tengas tod estudiado hasta POO comprenderas todo
		
		/*
		 * Para empezar a escribir codigo Java primero se tiene que aprender
		 * los fundamentos de la programacion desde un paradigma de 
		 * programacion funcional
		 * 
		 * Aqui tienes unos recursos que te pueden resultar utiles
		 * 
		 * */
		
		System.out.print("Hola mundo");
		
		System.out.println();
		short numero_pequeño = 17457;// Solo puedes introduccir numeros de entre -32768 a 32767 - Dato de tipo primitivo
		int numero_normal = 15489511;// Solo puedes introduccir numeros de entre -2147483648 a 2147483647 - Dato de tipo primitivo
		long numero_largo = 2075645684;// Solo puedes introduccir numeros de entre -9223372036854775808 a 9223372036854775807 - Dato de tipo primitivo
		
		System.out.println(numero_pequeño);
		System.out.println(numero_normal);
		System.out.println(numero_largo);
		
		float numero_con_coma_corto = 456464.321f;// Solo puedes introduccir numeros decimales - Dato de tipo primitivo
		double numero_con_coma_largo = 5456465441455.1551;// Solo puedes introduccir numeros decimales grandes - Dato de tipo primitivo
		
		System.out.println(numero_con_coma_corto);
		System.out.println(numero_con_coma_largo);
		
		String cadenas = "Esto es una cadena"; // Solo puedes introduccir cadenas de texto - Dato guardado en un objeto de clase String
		
		System.out.println(cadenas);
		
		/* 
		 * En Java tienes muchas clases que a su vez tienen 
		 * muchos recursos dentro de cada una de ellas
		 * 
		 * Para utilizar un clase en Java 
		 * 
		 * 		1º Se tiene que Importar un clase desde las primeras
		 * 		lineas de codigo de tu archivo Java con import la ruta
		 * 		del paquete y la clase que quieras utilizar o si quieres
		 * 		utilizar todas las clases del paquete tienes que utilizar
		 * 		*
		 * 
		 * 		2º Instanciar la clase
		 * 
		 * 		3º Utilizar la clase a traves de sus metodos
		 * 
		 * */
		
		/*
		 * Para utilizar una clase en Java 2º Paso
		 * 
		 * Esta es la clase Scanner, sirve para capturar datos 
		 * que el usuario introduzca por pantalla
		 * 
		 * */
		Scanner read = new Scanner(System.in);
		
		// Para utilizar la clase en Java 3º Paso
		read.next();
		read.nextInt();
		read.nextLine();
		read.nextShort();
		read.nextBoolean();
		
		/* 
		 * Recuerda que escaner como es una operacion
		 * donde se opera con datos de entrada y salida
		 * por lo tanto se crea un canal donde pasa un
		 * flujo de datos que despues de utlizarla
		 * habra que cerrarla
		 * 
		 * */
		read.close();  
		
		/* 
		 * COMENTARIOS : nos sirven para realizar una documentacion
		 * mas precisa de lo que hace nuestro codigo, lo que nos permitira
		 * realizar contribuciones, compartir nuestro codigo, o dejar listo
		 * nuestro codigo con la finalidad de que otro programador empiece
		 * a programar nuestro codigo, esto ultimo se da mas bien en empresas
		 * pues cuando terminamos de programar nuestro producto o programa
		 * y otro programador sigue con otra tarea posiblemente tenga que
		 * ver nuestro codigo y por lo tanto si ve nuestros comentarios
		 * le resultara mas facil leerlo y entender como funciona
		 * 
		 * Pues bien hay dos tipos de comentarios en Java :
		 * 
		 * */

		// LOS COMENTARIOS EN LINEA 
		
		System.out.println(); // Estos son los comentarios mas flexibles los puedes poner incluso a la izquierda de cada linea de tu codigo
		
		/* 
		 * LOS COMENTARIOS DE LINEAS MULTIPLES
		 * 
		 * Puedes agregar aqui multiples lineas, 
		 * pero solo puedes hacer por encima y por
		 * abajo de cada linea de tu codigo
		 * 
		 * En los comentarios de linea multiple
		 * podemos hacer estructuras de comentarios
		 * para facilitar la lectura de los programadores
		 * ejemplo:
		 * 
		 * 		Mi codigo es un sencillo Scanner que importo
		 * 		de la libreria java.util;
		 * 		tambien se puede utilizar un medio de captura
		 * 		de datos como BufferedReader para capturar datos;
		 * 		pero es preferible utilizar utilizar Scanner;
		 * 		dado que es un metodo mas facil de utilizar y mas
		 * 		completo, a la vez que resulta versatil y eficaz
		 * 
		 * Esto es una estructura de comentarios bastante mas facil 
		 * de leer, aunque si prefieres la tradicional, para compatibilizar
		 * con las estrucuturas de comentarios mas habitual en empresas,
		 * pues puedes utilizar esta: 
		 * 
		 * 		Mi codigo es un sencillo Scanner que importo
		 * 		de la libreria java.util, tambien se puede 
		 * 		utilizar un medio de captura de datos como 
		 * 		BufferedReader para capturar datos, pero es 
		 * 		preferible utilizar utilizar Scanner, dado 
		 * 		que es un metodo mas facil de utilizar y mas
		 * 		completo, a la vez que resulta versatil y eficaz
		 *   
		 * */
	}

}
