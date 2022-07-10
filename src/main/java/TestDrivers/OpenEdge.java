package TestDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdge {

	public static void main(String[] args) throws InterruptedException {

		// Variables para usar el binario
		String DriverNavegador = "webdriver.edge.driver";
		String RutaDriver = "C:\\Rene\\Binarios\\EdgeDrives\\msedgedriver(103.0.1264.32).exe";
		String url ="https://www.udemy.com/";
		
		// Imstanciando el Driver
		WebDriver driver;
		// Definiendo el Driver y su ruta para el driver
		System.setProperty(DriverNavegador, RutaDriver);
		// Definiendo que Navegador usaremos
		driver =  new EdgeDriver();
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
