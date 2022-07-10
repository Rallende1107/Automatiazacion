package TestDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFox {

	public static void main(String[] args) throws InterruptedException {

		// Variables para usar el binario
		String DriverNavegador = "webdriver.gecko.driver";
		String RutaDriver = "C:\\Rene\\Binarios\\GeckoDrivers\\geckodriver (0.31.0).exe";
		String url ="https://www.udemy.com/";
		
		// Imstanciando el Driver
		WebDriver driver;
		// Definiendo el Driver y su ruta para el driver
		System.setProperty(DriverNavegador, RutaDriver);
		// Definiendo que Navegador usaremos
		driver = new FirefoxDriver();
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
