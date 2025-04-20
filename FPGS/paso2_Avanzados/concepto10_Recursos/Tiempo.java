package paso2_Avanzados.concepto10_Recursos;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class Tiempo {

	public static void main(String[] args) {
		
		// TODO Clases relacionadas con el tiempo
		/* TODO Podremos un ejemplo de utilidad en cada clase pero 
		 * solo cuando no se sepa bien su utilidad a simple vista 
		 * */

			// ----------------- Paquete java.util ---------------------
		
			System.out.println("Calendar");
			Calendar calendar = Calendar.getInstance();
			System.out.printf("Miliegundo actual %s \n", calendar.get(Calendar.MILLISECOND));
			System.out.printf("Segundo actual %s \n", calendar.get(Calendar.SECOND));
			System.out.printf("Minuto actual %s \n", calendar.get(Calendar.MINUTE));
			System.out.printf("Hora actual %s \n", calendar.get(Calendar.HOUR));
			System.out.printf("Hora actual %s \n", calendar.get(Calendar.HOUR_OF_DAY));
			System.out.printf("Dia de mes actual %s \n", calendar.get(Calendar.DAY_OF_MONTH));
			System.out.printf("Dia de semana en este mes actual %s \n", calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
			System.out.printf("Dia de semana actual %s \n", calendar.get(Calendar.DAY_OF_WEEK));
			System.out.printf("Dia de año actual %s \n", calendar.get(Calendar.DAY_OF_YEAR));
			System.out.printf("Mes actual %s \n", calendar.get(Calendar.MONTH));
			System.out.printf("Año actual %s \n", calendar.get(Calendar.YEAR));
			System.out.printf("Era actual %s \n", calendar.get(Calendar.ERA));
			System.out.printf("Fecha y hora con Calendar %s \n", calendar.getTime());
			
			System.out.println("\n");
			
			System.out.println("Date");
			Date fecha = new Date();
			System.out.printf("Dias transcurridos en el año actual en milisegundos %s \n", fecha.getTime());
			
			System.out.println("\n");
			
			System.out.println("GregorianCalendar");
			GregorianCalendar fecha_personalizada = new GregorianCalendar(2001, Calendar.AUGUST, 12);
			System.out.printf("Segundos %s\n", fecha_personalizada.get(Calendar.SECOND));
			System.out.printf("Minutos %s\n", fecha_personalizada.get(Calendar.MINUTE));
			System.out.printf("Hora %s\n", fecha_personalizada.get(Calendar.HOUR));
			System.out.printf("Dia del mes %s\n", fecha_personalizada.get(Calendar.DATE));
			System.out.printf("Dia del mes %s\n", fecha_personalizada.get(Calendar.DAY_OF_MONTH));
			System.out.printf("Dia de la semana %s\n", fecha_personalizada.get(Calendar.DAY_OF_WEEK));
			System.out.printf("Dia de la semana en el mes %s\n", fecha_personalizada.get(Calendar.DAY_OF_WEEK_IN_MONTH));
			System.out.printf("Dia del año %s\n", fecha_personalizada.get(Calendar.DAY_OF_YEAR));
			System.out.printf("Mes %s\n", fecha_personalizada.get(Calendar.MONTH));
			System.out.printf("Año %s\n", fecha_personalizada.get(Calendar.YEAR));

			System.out.println("\n");
			
			System.out.println("TimeZone");
			TimeZone zona_horaria = SimpleTimeZone.getTimeZone("Europe/Madrid");
			GregorianCalendar hora_zona = new GregorianCalendar(zona_horaria);
			System.out.println(hora_zona.getTime());

			System.out.println("\n");
			
			// ----------------- Paquete java.text --------------------
			
			System.out.println("SimpleDateFormat");
			SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println(formato.format(fecha));

			SimpleDateFormat formato2 = new SimpleDateFormat("yyyy MM dd");
			System.out.println(formato2.format(fecha));

			SimpleDateFormat formato3 = new SimpleDateFormat("hh:mm:ss:SSSS");
			System.out.println(formato3.format(fecha));

			SimpleDateFormat formato4 = new SimpleDateFormat("'hora' hh 'minutos' mm 'segundos' ss 'nanosegundos' SSSS");
			System.out.println(formato4.format(fecha));

			System.out.println("\n");
			
			// ----------------- Paquete java.time --------------------
			
			System.out.println("LocalDateTime");
			LocalDateTime tiempo = LocalDateTime.now();
			System.out.printf("Fecha y Hora en ISO DATE TIME %s \n", tiempo.format(DateTimeFormatter.ISO_DATE_TIME));
			System.out.printf("Fecha y Hora en ISO LOCAL TIME %s \n", tiempo.format(DateTimeFormatter.ISO_LOCAL_DATE));
			System.out.printf("Fecha y Hora en BASIC ISO DATE %s \n", tiempo.format(DateTimeFormatter.BASIC_ISO_DATE));
			System.out.printf("Fecha y Hora en ISO TIME %s \n", tiempo.format(DateTimeFormatter.ISO_TIME));
			// Aqui salta una excepcion porque no soporta el formato de hora
			// java.time.temporal.UnsupportedTemporalTypeException
			// System.out.printf("Fecha y Hora en ISO OFFSET DATE %s \n", tiempo.format(DateTimeFormatter.ISO_OFFSET_DATE));

			tiempo = LocalDateTime.of(2020, 11, 30, 5, 4, 4, 4);
			System.out.printf("Pedir nanosegundo %s\n", tiempo.getNano());
			System.out.printf("Pedir segundo %s\n", tiempo.getSecond());
			System.out.printf("Pedir minuto %s\n", tiempo.getMinute());
			System.out.printf("Pedir hora %s\n", tiempo.getHour());
			System.out.printf("Pedir dia %s\n", tiempo.getDayOfMonth());
			System.out.printf("Pedir mes %s\n", tiempo.getMonth());
			System.out.printf("Pedir año %s\n", tiempo.getYear());

			System.out.println("\n");
			
			System.out.println("Clock");
			Clock reloj = Clock.systemDefaultZone();
			System.out.println(reloj);

			Clock reloj_2 = Clock.systemUTC();
			System.out.println(reloj_2);

			System.out.println("\n");
			
			System.out.println("Duration");
			Duration duracion = Duration.ofHours(5);
			System.out.println(duracion);
			
			duracion = Duration.ofHours(7);
			System.out.println(duracion);
			
			duracion = Duration.ofMinutes(10);
			System.out.println(duracion);

			System.out.println("\n");
			
			System.out.println("Instant");
			Instant instancia = Instant.now();
			System.out.println(instancia);
			
			System.out.println("\n");
			
			System.out.println("Period");
			Period periodo = Period.ofDays(120);
			System.out.println(periodo);

			System.out.println("\n");
			
			System.out.println("OffsetTime");
			OffsetTime tiempo2 = OffsetTime.MAX;
			System.out.println(tiempo2);
			
			System.out.println("\n");
			
			System.out.println("Year");
			Year year = Year.now();
			System.out.println(year);
			
			System.out.println("\n");
			
			System.out.println("ZoneId");
			ZoneId zoneid = ZoneId.of("Europe/Madrid");
			System.out.println(zoneid + " - " + zoneid.getId() + " - " + zoneid.normalized());
			zoneid = ZoneId.of("Europe/Madrid");
			
			System.out.println("\n");
			
			// ----------------- Convertir de GregorianCalendar a Date --------------------
			
			System.out.println("Conversion de GregorianCalendar a Date");
			Date convertido = fecha_personalizada.getTime();
			SimpleDateFormat formato5 = new SimpleDateFormat("hh:mm:ss:SSSS yy-MM-dd");
			System.out.println(formato5.format(convertido));

			System.out.println("\n");
					
				// Fuentes
				// https://ajaxhispano.com/ask/como-obtener-ano-mes-dia-horas-minutos-segundos-y-milisegundos-del-momento-actual-en-java-15580/
				// https://code.tutsplus.com/es/tutorials/learn-java-for-android-development-date-and-time-basics--mobile-3940
				// https://www.concretepage.com/java/java-gregoriancalendar-example#:~:text=Java%20GregorianCalendar%20Example%201%20Get%20Current%20Time%20To,method.%20...%208%20Format%20Date%20...%20M%C3%A1s%20elementos
				// https://www.javatpoint.com/java-clock
					
	}

}
