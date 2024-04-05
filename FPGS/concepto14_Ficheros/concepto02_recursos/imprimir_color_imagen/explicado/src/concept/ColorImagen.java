package conceptos.paso2_Avanzados.concepto01_Ficheros.concepto02_recursos.imprimir_color_imagen.explicado.src.concept;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ColorImagen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int color, r, g, b;
		
		try {
			
			File imagen = new File("C:/Users/Navegante/eclipse-workspace"
					+ "/ManejarImagenes/src/concept/verde.png");
				
			BufferedImage imagenAnalisis = null;
			
			imagenAnalisis = ImageIO.read(imagen);
			
			color = imagenAnalisis.getRGB(20, 10);
			r = (color & 0x00ff0000) >> 16;
			g = (color & 0x0000ff00) >> 8;
			b = (color & 0x000000ff);
			
			System.out.println(r + " " + g + " " + b);
			
		} catch (IllegalArgumentException a) {
			
		} catch (IOException i) {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
