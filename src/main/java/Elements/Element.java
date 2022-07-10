package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		Elemetos puedes ser identificados por 
		Name
		ID
		Xpath
		PartialLinkText
		LinkText
		ClassName
		tagName
		
		se identifica el  elemento por el comando
		 
		driver.findElement(By.Localizador("")).Accion);
		
		*/

		// Variables para usar el binario
		String DriverNavegador = "webdriver.chrome.driver";
		String RutaDriver = "C:\\Rene\\Binarios\\ChromeDirvers\\chromedriver(103.0.5060.53).exe";
		String url ="https://www.youtube.com/watch?v=5dmQ3QWpy1Q";

		WebDriver driver;									// Imstanciando el Driver
		System.setProperty(DriverNavegador, RutaDriver);	// Definiendo el Driver y su ruta para el driver
		driver = new ChromeDriver();						// Definiendo que Navegador usaremos
		driver.manage().window().maximize();				// Maximizando la vista
		driver.get(url);									// Abriendo URL
		Thread.sleep(5000); 								// Esperando 
		
		// Identificando elementos
		/*
		 * Ingresando a Youtube y buscando un video
		 * */
		driver.findElement(By.id("logo-icon")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("search_query")).sendKeys("Hola Mundo");
		Thread.sleep(5000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("search_query")).clear();
		Thread.sleep(5000);	
		driver.findElement(By.name("search_query")).sendKeys("Heavy [Official Music Video] - Linkin Park (feat. Kiiara)");
		Thread.sleep(5000);
		driver.findElement(By.name("search_query")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		driver.quit();										// Cerrando el Driver

	}

}
