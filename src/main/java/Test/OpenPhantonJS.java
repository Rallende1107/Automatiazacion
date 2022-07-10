package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class OpenPhantonJS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Instanciando el WebDriver
		WebDriver driver;
		
		// Ruta del binario
		System.setProperty("phantomjs.binary.path", "C:\\Rene\\Binarios\\PhantomJS\\phantomjs-2.1.1\\bin\\phantomjs.exe");
		
		driver  = new PhantomJSDriver();
		
		System.out.println("Se abrip en navegador");
		
		driver.get("https://www.google.com/");
		Thread.sleep(5000)	;
		driver.quit();		
	}

}
