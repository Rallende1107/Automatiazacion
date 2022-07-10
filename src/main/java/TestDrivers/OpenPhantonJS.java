package TestDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class OpenPhantonJS {

	public static void main(String[] args) throws InterruptedException {

		// Variables para usar el binario
		String DriverNavegador = "phantomjs.binary.path";
		String RutaDriver = "C:\\Rene\\Binarios\\PhantomJS\\phantomjs-2.1.1\\bin\\phantomjs.exe";
		String url ="https://www.udemy.com/";

		//  Imstanciando el Driver
		WebDriver driver;
		// Definiendo el Driver y su ruta para el driver		
		System.setProperty(DriverNavegador, RutaDriver);
		// Definiendo que Navegador usaremos		
		driver  = new PhantomJSDriver();
		
		System.out.println("Se abrio en navegador");
		
		driver.get("https://www.google.com/");
		Thread.sleep(5000)	;
		driver.quit();		
	}

}
