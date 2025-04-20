package conceptos.paso2_Avanzados.concepto01_Ficheros.concepto02_recursos.imprimir_color_imagen.documentado;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;

public class ColorImagen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Declaramos en el module-info.java 
		 * require java.desktop;
		 * 
		 * 
		 * Declaramos las siguientes cuatro
		 * variables integer
		 * 
		 * */
		
		int color, r, g, b;
		
		try {
			
			/*
			 * Elegimos una imagen para hacer el procedimiento
			 * 
			 * CUIDADO CON LA RUTA, cambiala para que concuerde con tu proyecto
			 * 
			 * */
			
			File imagen = new File("C:/Users/navegante/eclipse-workspace/RepasoInvestacion/src"
					+ "/conceptos/paso2_Avanzados/concepto01_Ficheros/"
					+ "concepto02_recursos/imprimir_color_imagen/"
					+ "documentado/verde.png");
			
			/*
			 * Declaramos que dentro de un BufferedImage esten los bytes leidos
			 * por el metodo read de ImageIO
			 * 
			 * */
			
			BufferedImage imagenAnalisis = null;

			imagenAnalisis = ImageIO.read(imagen);
			
			/*
			 * Pedimemos mediante el pixel de la posicion que elegimos por los paramentros del metodo
			 * un numero que sera el color de nuestro pixel
			 * */
			
			color = imagenAnalisis.getRGB(20, 10);
			
			/*
			 * Ahora traducimos el color que nos han 
			 * dado del decimal al sistema RGB
			 * */
			r = (color & 0x00ff0000) >> 16;
			g = (color & 0x0000ff00) >> 8;
			b = color & 0x000000ff;
			
			System.out.println(r + " " + g + " " + b);
			
		} catch (IllegalArgumentException i) {
			System.out.println("Error en el argumento");
		} catch (IOException e) {
			System.out.println("Error en el flujo de datos");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error");
		}
		
		/*
		 * https://aprenderaprogramar.com/foros/index.php?topic=3451.0
		 * 
		 * https://stackoverflow.com/questions/22391353/get-color-of-each-pixel-of-an-image-using-bufferedimages
		 * 
		 * https://programmerclick.com/article/23851480685/
		 * 
		 * */
		
	}

}
