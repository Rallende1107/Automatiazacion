package TestDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class OpenIE {

	public static void main(String[] args) throws InterruptedException {

		// Variables para usar el binario
		String DriverNavegador = "webdriver.ie.driver";
		String RutaDriver = "C:\\Rene\\Binarios\\Internet Explorer Driver\\IEDriverServer (x64_4.2.0).exe";
		String url ="https://www.udemy.com/";

		//  Imstanciando el Driver
		WebDriver driver;
		// Definiendo el Driver y su ruta para el driver		
		System.setProperty(DriverNavegador, RutaDriver);
		// Definiendo que Navegador usaremos
		driver  = new InternetExplorerDriver();
		// Maximizando la vista
		driver.manage().window().maximize();
		// Abriendo URL
		driver.get(url);
		// Esperando 
		Thread.sleep(5000);
		// Minizando la vista
		driver.manage().window().minimize();
		// Esperando
		Thread.sleep(5000);
		// Cerrando el Driver
		driver.quit();

	}

}
