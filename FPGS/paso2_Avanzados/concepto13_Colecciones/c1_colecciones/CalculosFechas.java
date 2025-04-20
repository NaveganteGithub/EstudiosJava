package paso2_Avanzados.concepto13_Colecciones.c1_colecciones;

import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * Primer conceto: La creacion de una clase sin metodo main;
 * las clases sin main son muy importantes y muy comunes en
 * la programacion orientada a objetos, cada clase contiene
 * metodos y atributos que la hacen unica, y esa es la gracia
 * de la programacion orientada a objetos que cada clase
 * tenga metodos y atributos unicos que se puedan utilizar 
 * una y otra vez tanto en el main como en otras clases
 * 
 * Consejo refactoriza siempre tu clase para que no quede 
 * ninguna variable o libreria que no estes utilizando ahora
 * mismo, se te indica con un subrayado amarillo 
 * 
 * */

public class CalculosFechas {

	/*
	 * Segundo concepto: Atributos y modificadores de acceso;
	 * 
	 * Atributos: son conocidos tambien como variables de clase
	 * son variables que podemos utilizar tanto dentro como
	 * fuera de nuestra clase dentro de los metodos, pero eso
	 * si, depende de los modificadores de acceso si puedes o
	 * no utilizar un atributo, metodo o clase fuera o dentro
	 * de tu clase
	 * 
	 * Modificadores de acceso: para enteder primero que son
	 * los modificadores de acceso primero tenemos que entender
	 * lo que es el "encapsulamiento"
	 * 		
	 * 		Encapsulamiento: es una propiedad que tiene Java
	 * 		para ocultar y proteger nuestros datos de posibles
	 * 		accesos y modificaciones, por parte del programador, 
	 * 		¿para que?, bueno, puede ser por muchas situaciones:
	 * 
	 * 			Para evitar que el programador modifique un dato
	 * 			de un atributo de clase que ya esten utilizando
	 * 			otras clases; 
	 * 			que es lo mas habitual en proyectos grandes; 
	 * 			y sera habitual en tus proyectos a medida que crezca;
	 * 			y necesites evitar que modifican los
	 * 			datos de tus variables de clase, para evitar errores
	 * 			y confusiones a la hora de emplear la logica y sobre
	 * 			todo tu sentido organizativo, no vaya ser que se
	 * 			este ejecutando una clase y vengas tu con tu clase 
	 * 
	 * 			Para regular en que clases, metodos y atributos puede 
	 * 			o no utilizar un metodo o una clase
	 * 
	 * 		Otra forma de decirlo es que el encapsulamiento nos 
	 * 		sirve para proteger la integridad de los datos y la
	 * 		integridad de los métodos y de las variables 
	 * 		decidiendo lo que se deben de introducir en 
	 * 		ellas, evitando errores
	 * 
	 * 		Otra forma de decirlo es que el Encapsulamiento es una 
	 * 		característica que nos permite proteger la información 
	 * 		del exterior
	 * 
	 * los modificadores de acceso se pueden dividir en cuatro:
	 * 				
	 * 		public: aqui estamos diciendo que el atributo o el metodo esta disponible
	 * 		para todos los metodos, atributos y clases de nuestro proyecto, es el
	 * 		modificador de acceso Java mas permisivo, pues con este estas diciendo
	 * 		que todos objetos, metodos, atributos y clases de tu proyecto pueden acceder
	 * 		a dicho metodo, atributo o clase que tiene el modificador public; 
	 * 		es decir;
	 * 		en la propia clase;
	 * 		en las clases donde este la clase del paquete actual de nuestro atributo o 
	 * 		metodo (o clase si modificas el modificador de la clase);
	 * 		en las subclases de esta clase, y en todas las clases de fuera de nuestro
	 * 		paquete 
	 * 		
	 * 		protected: aqui estamos diciendo que solo la propia clase, las clases del
	 * 		paquete actual donde esta dicha clase, metodo o atributo que llevaran ese
	 * 		modificador, y las subclases de misma esta clase, podra acceder al metodo,
	 * 		a la clase o atributo que llevaran dicho protected
	 * 		
	 * 		package: aqui estamos diciendo que solo la propia clase y las clases del paquete
	 * 		actual de la clase, metodo o atributo que lleve el modificador pueden acceder al
	 * 		metodo, clase o atributo el cual lleva dicho package
	 * 		
	 * 		private: es el modificador mas restrictivo dado que estamos diciendo que
	 * 		solo la propia clase, tenga acceso al metodo, subclase o atributo con la
	 * 		declaracion private (ADVERTENCIA: NO UTILIZAR ESTE MODIFICADOR EN CLASES
	 * 		DEBES UTILIZARLA EN SUBCLASES, METODOS, Y EN ATRIBUTOS, SI LO QUE QUIERE
	 * 		ES CAMBIAR EL MODIFICADOR DE ACCESO DE LA CLASE, REALIZAR CAMBIOS EN LOS
	 * 		MODIFICADORES DE ACCESO DE LOS CONSTRUCTORES ES UNA GRAN ALTERNATIVA)
	 * 
	 * NO SE DEBE DE DEJAR A UNA VARIABLE DE CLASE SIN EL MODIFICADOR PRIVATE SIN CONSECUENCIAS
	 * NEGATIVAS, DADO QUE CUALQUIERA PUEDE MODIFICAR LA CLASE A SU ANTOJO DESDE CUALQUIER CLASE
	 * Y ESO PODRIA SUPONER FALLOS EN TU PROGRAMA A LA HORA DE EJECUTARLO SI LA LOGICA NO SE APLICA
	 * MAS SI ES UN PROYECTO GRANDE DONDE VARIOS PROGRAMADORES MODIFICAN EL CODIGO, 
	 * Y PARA IMPEDIRLES EL ACCESO A LA VARIABLE PARA QUE NO LA PUEDAN MODIFICAR O QUE NO 
	 * LA MODIFIQUEN SIN ANTES PASAR POR UNAS CONDICIONES MAS CONCRETAS, Y QUE NO LAS PUEDAN 
	 * CONSULTAR DIRECTAMENTE SINO QUE UTILICEN UN METODO
	 * 
	 * */
	
	private GregorianCalendar f1; 
	private GregorianCalendar f2;
	private int dia;
	private int mes;
	private int año;
	
	/* 
	 * Quinto concepto:
	 * 
	 * Los metodos getters y setters son metodos que nos sirven para 
	 * pedir e introduccir datos en los atributos de clase o propiedades
	 * de clase repectivamente
	 * 
	 *  getters: metodos para pedir datos - get -> pedir
	 *  setters: metodos para meter datos - set -> dar
	 * 
	 * pero no te confundas, estos metodos no tienen nada de especial
	 * son solo metodos, para pedir o insertar datos en las variables
	 * de clase, puedes crearlos tu mismo a mano si quieres
	 * 
	 * Puedes definir que atributos tendran getters y setters o getters
	 * solamente o setters solamente, no todos los atributos no tienen
	 * porque tener un getter o un setter cada uno
	 * 
	 * */ 
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	/*
	 * Cuarto concepto: Constructor
	 * 
	 * Un constructor es un objeto se usa para instanciar objetos cuando 
	 * creas un constructor no hace nada ni tiene referencia a memoria, 
	 * pero cuando se ejecute en el main o en otro objeto, se hará una 
	 * referencia en memoria, y se instanciara en memoria al mismo tiempo.
	 * 
	 * Para declarar el modificador de acceso que tendra la clase hay que 
	 * modificarlo en los constructores, y puedes personalizar el acceso
	 * a la clase, declarando que un contructor tenga un acceso y otro
	 * tenga otro modicador; 
	 * pues para acceder a la clase se necesitas el constructor y por lo
	 * tanto si modificas el modificador de acceso del constructor 
	 * modificaras el acceso de la clase;
	 * y como dato final y el mas importante no modifiques el modificador
	 * de acceso public de la clase;
	 * recuerda el concepto Concepto00EstructuraBasica la estructura de 
	 * clase debe tener ese modificador, si quieres impedir que otras 
	 * clases fuera del paquete accedan a tu clase cambia el contructor
	 * a package 
	 * 
	 * */
	
	/*
	
	public CalculosFechas() { // Esto es un objeto
		super();
	}
	
	public CalculosFechas(GregorianCalendar f1) { // Esto es un objeto
		super();
		this.f1 = f1;
	}
	
	public CalculosFechas(GregorianCalendar f1, GregorianCalendar f2) { // Esto es un objeto
		super();
		this.f1 = f1;
		this.f2 = f2;
	}
	
	*/
	public CalculosFechas() { // Esto es un objeto
		super();
	}
	
	CalculosFechas(GregorianCalendar f1) { // Esto es un objeto
		super();
		this.f1 = f1;
	}
	
	protected CalculosFechas(GregorianCalendar f1, GregorianCalendar f2) { // Esto es un objeto
		super();
		this.f1 = f1;
		this.f2 = f2;
	}

	/*
	 * Tercer concepto: metodos o comportamiento de clase
	 * 
	 * Los metodos son paqueñas estructuras de codigo que podemos
	 * llamar desde cualquier lugar de nuestro codigo, y teniendo
	 * en cuenta que el modificador de acceso, se podra utilizar,
	 * o no, el metodo en una clase u otra;
	 * 
	 * Con los metodos podemos reutilizar nuestro codigo tantas
	 * veces como queramos, y hay esta la fuerza de POO;
	 * 
	 * Puedes devolver toda clase de datos primitivos y objetos e 
	 * incluso el propio objeto de la propia clase, pero para no
	 * devolver ningun tipo de dato o objeto y solo ejecutar el
	 * metodo se pone la declaracion void
	 * 
	 * */
	public void EntreFechas() {

		int año1, año2, mes1, mes2, dia1, dia2, $resultado, $suma_dias = 0, dias_resta = 0;
		
		dia1 = f1.get(Calendar.DATE);
		mes1 = f1.get(Calendar.MONTH);
		año1 = f1.get(Calendar.YEAR);
		
		dia2 = f2.get(Calendar.DATE);
		mes2 = f2.get(Calendar.MONTH);
		año2 = f2.get(Calendar.YEAR);
		
		// Te cuidado con las condicionales, son una parte importante a la hora de comunicarse con el PC,
		// debes de tener cuidado por lo que implica poner una mala condicional o expresarte mal a la hora
		// de crear una condicional, no es lo mismo "sentido doble" que "doble sentido", ten cuidado
		// if (dia1 <= dia2 && mes1 <= mes2 && año1 <= año2) {
		if (dia2 <= dia1 && mes2 <= mes1 && año2 <= año1) {
			if (dia1 == dia2 && mes1 == mes2 && año1 == año2) System.out.println("Son el mismo el dia.");
			return;
		}
		
		// Consejo 1:
		// Un consejo, a la hora de programar ve despacio, poco a poco, 
		// con cabeza fria y relajada, y ve utilizando lo System.out.println()
		// para ir haciendo pruebas de tus avances aunque sea poco lo que has
		// hecho hasta ese momento, por muy poco codigo que hayas escrito, da
		// igual tu haz pruebas para ver si lo que hace tu codigo funciona
		// System.out.println(año1);
		
		año1 += 1;
		$resultado = Math.abs(año1 - año2);
		
		// Consejo 2:
		// Primero crea el algoritmo a partir de tu concepto, es decir, primero
		// haz que tu concepto y el algoritmo funcione, despues se mirara si se
		// puede llegar a mejorar
		
		// Primero se averigurara cuantos dias totales tiene la suma del rango de años
		// que hay entre los años declarados, incluidos los años bisiestos
		
		// 2000 - 2001 - 2002 - 2003 - 2004
		//		----------------------
		// 		Se calcula lo subrayado
		
		// System.out.println($resultado);
		
		if($resultado > 1)
			for (int i = 0; i < $resultado; i++) {
					// Dato: https://www.calendario-365.es/anos-bisiestos.html	
					// Un año es bisiesto si el numero de ese año puede ser divido entre 4
					// Un año bisiesto tiene 366 dias, en vez de 365 dias como suelte tener un año
					// Un siglo es biesiesto si el numero de ese año puede ser divido entre 4, 100 y 400
					// System.out.println(año1);
					if (tiempoBisiesto(año1))
						$suma_dias += 366;
						// System.out.println("bisiesto");
					else $suma_dias += 365;
					año1 += 1;
			}
		
		año1 -= 1;
		
		// Se calcula los meses restantes de los años declarados
		
		if (año2 != año1) {
			
			for (int i = 0; i < (12 - mes1); i++) {
				$suma_dias += diasDelMesTotal(mes1 + i, año1);
				// System.out.println($suma_dias + " - " + (mes1 + i));
			}
			
			for (int i = 0; i < mes2; i++) {
				$suma_dias += diasDelMesTotal(i, año2);
				// System.out.println($suma_dias + " - " + i);
			}
			
			$suma_dias -= dia1 - dia2;
			
		} else {
			for (int i = mes1 - 1; i <= mes2 - 1; i++) {
				$suma_dias += diasDelMesTotal(i, año1);
				// System.out.println($suma_dias + " - " + i);
			}
			
			$suma_dias -= dia1 + (diasDelMesTotal(mes2, año2) - dia2) - 1;
			
		}
		
		// Consejo : busca constantes, siempre hay constantes, una constante es un patron que se repite,
		// un dato, una circunstancia, algo que se repite, busca datos que se mantengan constantes
		
		// Consejo : divide el problema en trozos mas pequeños, y soluciona cada problema uno por uno 
		
		System.out.println(
				"Hay " + ($suma_dias - dias_resta) + " dias entre el dia " + 
						f1.get(Calendar.DATE) + "/" + (f1.get(Calendar.MONTH) + 1) + "/" + f1.get(Calendar.YEAR) + " y " + 
						f2.get(Calendar.DATE) + "/" + (f2.get(Calendar.MONTH) + 1) + "/" + f2.get(Calendar.YEAR) + ".");
		
	}
	
	public void CuantoFalta(GregorianCalendar fecha) {
		
		int dia, mes, año, $dActual, $mActual, $aActual, $resultado_año, $resultado_mes, $resultado_dias = 0, meses_contador = 0;
		
		// --------------- Primero se pedira los datos del objeto GregorianCalendar ----------------------
		
		dia = fecha.get(Calendar.DATE);
		mes = fecha.get(Calendar.MONTH);
		año = fecha.get(Calendar.YEAR);
		
		// --------------- Segundo se pedira la fecha actual, por separado -------------------------------
		
		$dActual = Calendar.getInstance().get(Calendar.DATE);
		$mActual = Calendar.getInstance().get(Calendar.MONTH); 
		$aActual = Calendar.getInstance().get(Calendar.YEAR);
		
		// System.out.println($mActual);
		
		// ------------------------------------------------------------------------------------------------ 
		// Tercero se comprobara si la fecha que introduce no es una fecha anterior
		// a la fecha actual
		
		if (dia <= $dActual && mes <= $mActual && año <= $aActual) {
			// Si se diera el caso de que la fecha introducida 
			// fuera hoy se dira que faltan 0 dias
			if(dia == $dActual) System.out.println("Hoy es " + dia + "/" + (mes + 1) + "/" + año + ".");
			return;
		}
		
		// System.out.println("H");
		// No hay que ser tan restrictivo siempre, es decir, aqui por ejemplo,
		// tenemos el caso de que antes se utiliza en esta condicion <= en vez
		// de utilizar < pero eso tenia un problema de logica, porque al final
		// si un usuario introduccia el mes actual entonces el metodo finaliza
		// y eso no puede ser, tenmos que permitir que el usuario tenga opcion
		// de introduccir el mes actual
		// if (mes < $mActual) return;
		// System.out.println("A");
		// if (año < $aActual) return;
		// System.out.println("B");
		
		// ------------------------------------------------------------------------------------------------
		// Cuarto se averiguara cuantos meses y año quedan hasta el mes y año indicado en el
		// GregorianCalendar
		
		$resultado_mes = Math.abs($mActual - mes);
		$resultado_año = Math.abs($aActual - año);
		// System.out.println($resultado_mes);
		
		// ------------------------------------------------------------------------------------------------
		// Quinto se averiguara cuantos dias tiene cada mes, y despues se hara una suma de los dias que
		// tiene cada uno, sacando como total el numero de dias que tienen juntos todos esos meses. Eso
		// si tenemos que tener cuenta para el calculo a realizar lo siguiente:
		//		año x es el año actual
		//		año y es el año del GregorianCalendar
		
		// Tienes que mirar que se den todas las condiciones para realizar un calculo,
		// es decir, en este caso antes no habia condicional que examinara el calculo,
		// pero al poner una condicional para comprobar que se den las condiciones que
		// permitan utilizar este calculo correctamente, se ha mejorado la fiabilidad,
		// y la estabilidad del calculo.
		
		// if(mes != $mActual && $resultado >= 1) $resultado *= 30;
		
		// Una vez terminada la tarea de saber cual es calculo a realizar o la tarea a
		// realizar, y haberla comprendido en profundidad, podremos crear un algortimo
		// mejor que el anterior.
		
		// System.out.println($resultado_mes);
		
		// En caso de que el usuario introduzca el mismo mes y dia, pero distinto año
		// solamente para saber cuantos dias para que llegue a esa fecha
		if($aActual != año && $mActual == mes && $resultado_mes == 0)
			$resultado_mes = 11;
		
		// Para calcular los dias de los meses del año x y el año y
		if((mes != $mActual && $resultado_mes >= 1) || ($resultado_año == 1) || (mes == $mActual))
			for (int i = 0; i <= $resultado_mes; i++) {
				$resultado_dias += diasDelMesTotal($mActual + meses_contador, $aActual);
				/*System.out.println("Suma meses " + i + " - " + $resultado_dias +
									" - " + ($mActual + meses_contador) + " - " +
									diasDelMesTotal($mActual + meses_contador, año));*/
				// Un pequeño arreglo para poder contabilizar los años tambien,
				// en que decimos que cuando ya no se pueda sumar mas los meses
				// debido a que llegamos a Septiembre, pues devolvera al mes de
				// Enero
				if($mActual + meses_contador == 11) {
					// Se iniciarizara los meses a 0, para poder contabilizar los dias del primer año
					// o sea el año x y el ultimo año o sea año y
					$mActual = 0;
					// Cambiaremos el valor de 0 a -1 debido a que no se tubo en cuenta que el contador
					// subira 1 en vez de permancer en cero debido al orden en el que se ejecuta el codigo
					meses_contador = -1;
					// Pasaremos del año actual, al año indicado del GregorianCalendar, para tener
					// en cuenta dos cosas, primero el mes de febrero de los años bisiestos, hacer
					// esto, nos permitira ajustar el calculo de los dias de los meses indicados.
					// Es decir, con esto ajustaremos la calculadora, para que, sume los meses del 
					// año indicado en el GregorianCalendar y el actual solamente
					$aActual = fecha.get(Calendar.YEAR);
				}
				if(i == $resultado_mes) {
					// Se devolvera los datos inicales al mes y al año una vez terminado el bucle
					$mActual = Calendar.getInstance().get(Calendar.MONTH);
					$aActual = Calendar.getInstance().get(Calendar.YEAR);
				}
				meses_contador++;
				// System.out.println(meses_contador);
				
			} // Se ha borrado el else if debido a que era demasiado redundante el calculo dado
			  // que ya tenemos el calculo de los meses para ello

		// System.out.println("Año actual " + $aActual);
		
		// Calcular los dias de los años que hay entre medias de los años indicados anteriormente
		// ejemplo, si tubieramos

		// 2000 - 2001 - 2002 - 2003 - 2004
		//		----------------------
		// 		Se calcula lo subrayado
		
		// System.out.println($resultado_año);
		// System.out.println($resultado_dias);
		if($resultado_año > 1) {
			// System.out.println("Hola");
			// $resultado_año -= 1;
			// Se iniciara con 1 en vez de 0, para que no tenga en cuenta el año actual o el año incial
			// sino los años que estan entre el año x y el año y, sin tener en cuenta el año x y el año
			// y
			for(int i = 1; i < $resultado_año; i++) {
				if (tiempoBisiesto($aActual + i)) $resultado_dias += 366;
				else $resultado_dias += 365;
				// System.out.println($aActual + i);
				// System.out.println($resultado_año);
				/*if (tiempoBisiesto($aActual + i)) System.out.println(366);
				else System.out.println(365);*/
				// System.out.println("Suma años " + i + " - " + $resultado_dias);
			}
		}

		// System.out.println($resultado_dias);
		
		// ------------------------------------------------------------------------------------------------
		// Sexto se mirara el dia actual de hoy, y por esa cantidad de dias que han 
		// transcurrido a lo largo de este mes, se restara los dias transcurridos y
		// los dias de la suma anterior. (Dia Inicial)
		$resultado_dias -= $dActual;
		// System.out.println($resultado_dias);
		// System.out.println($dActual);
		
		// ------------------------------------------------------------------------------------------------
		// Septimo se mirara cuantos dias tiene el mes indicado en el GregorianCalendar,
		// y se mirara el dia indicado por el GregorianCalendar, para despues, hacer una
		// resta, y saber asi, la cantidad de dias que quedan para que termine dicho mes
		// indicado. (Dia Final)
		// System.out.println(diasDelMesTotal(mes, año) - dia);
		$resultado_dias -= diasDelMesTotal(mes, año) - dia;
		// System.out.println($resultado_dias);
		System.out.println("Faltan " + $resultado_dias + 
							" dias, para llegar al " + 
							dia + "/" + (mes + 1) + "/" + 
							año + ".");
	}
	
	public boolean tiempoBisiesto(int año) {
		
		if (año % 4 == 0) return true;	
		
		return false;
	}
	
	public boolean sigloBisiesto(int año) {
		
		if (año % 4 == 0 && 
				año % 100 == 0 && 
				año % 400 == 0) return true;
		
		return false;
	}
	
	public int diasDelMesTotal(int mes, int año) {
		
		// http://repositori.uji.es/cursos/Unidad_1_-_La_logica_financiera/cmo_contamos_el_tiempo_en_dias.html#:~:text=Todos%20sabemos%20que%20el%20a%C3%B1o%20natural%20tiene%20365,junio%2C%20septiembre%20y%20noviembre.%20Tienen%2028%20d%C3%ADas%3A%20Febrero.
		
		// System.out.println(mes);
		// System.out.println(año);
		
		int meses[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(tiempoBisiesto(año)) meses[1] = 29;
		
		return meses[mes];
		
	}
	
}
