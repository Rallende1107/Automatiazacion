package TestDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) throws InterruptedException {

		// Variables para usar el binario
		String DriverNavegador = "webdriver.chrome.driver";
		String RutaDriver = "C:\\Rene\\Binarios\\ChromeDirvers\\chromedriver(103.0.5060.53).exe";
		String url ="https://www.udemy.com/";

		//  Imstanciando el Driver
		WebDriver driver;
		
		System.setProperty(DriverNavegador, RutaDriver);
		
		// Definiendo que Navegador usaremos
		driver = new ChromeDriver();
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
