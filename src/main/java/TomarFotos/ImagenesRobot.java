package TomarFotos;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImagenesRobot {

	
	
	public static void fotografo(String nombrePaso) throws InterruptedException, AWTException, IOException {
		
		//Variables 
		String formato_foto=".png";
		String path_foto="D:\\WorkSpace\\Eclipse\\WorkSpace\\SeleniumMaven\\target\\Fotografias\\";
		String Archivo_foto= path_foto+nombrePaso+formato_foto;
		// Toma fotos		
		Thread.sleep(2000);
		Robot robot = new Robot();
		BufferedImage imagen = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(imagen, "png", new File(Archivo_foto));
		Thread.sleep(2000);
		System.out.println("Foto Tomada para el paso: "+nombrePaso);
	}
	

}
