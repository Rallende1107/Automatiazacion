package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIDChrome {

	public static void main(String[] args) throws InterruptedException {
		// Variables para usar el binario
		String DriverNavegador = "webdriver.chrome.driver";
		String RutaDriver = "C:\\Rene\\Binarios\\ChromeDirvers\\chromedriver(103.0.5060.53).exe";
		String url ="https://www.youtube.com";
		
		
		WebDriver driver;
		System.setProperty(DriverNavegador, RutaDriver);
		driver = new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("search")).sendKeys("Hola Mundo");
		//driver.findElement(By.name("search_query")).sendKeys("Hola Mundo");
		
		driver.findElement(By.name("search_query")).sendKeys("Hola mundo nicolas schurmann");
		Thread.sleep(2000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(2000);
		

		driver.quit();

	}

}
