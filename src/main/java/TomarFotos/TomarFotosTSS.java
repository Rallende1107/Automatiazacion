package TomarFotos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;




public class TomarFotosTSS {
	
	
	public static void fotografo_TSS(String nombrePaso, WebDriver driver) throws IOException {
		String path_foto="D:\\WorkSpace\\Eclipse\\WorkSpace\\SeleniumMaven\\target\\Fotografias\\";
		String Extencion=".png";
		String fullname = path_foto+nombrePaso+Extencion;
		
		File screenShot;
		screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenShot, new File (fullname));
		System.out.println("ScreenShot Tomado para el paso: "+nombrePaso);
		
	}
	

}
