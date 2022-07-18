package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElemetsScroll {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Para Hacer un Scrool se puede usar Java Scrip para subir o bajar la pajina
		 * Se debe definir un elemento de Java Scrip y debe contener el Driver
		 *	Ejemplo:
		 *			JavascriptExecutor js =(JavascriptExecutor) driver; 
		 * 
		 * 
		 * 
		 * */ 
		String DriverNavegador = "webdriver.chrome.driver";
		String RutaDriver = "C:\\Rene\\Binarios\\ChromeDirvers\\chromedriver(103.0.5060.53).exe";
		String url ="https://youtube.com/";
		WebDriver driver;
		System.setProperty(DriverNavegador, RutaDriver);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		
		Thread.sleep(3000);
		driver.findElement(By.name("search_query")).sendKeys("hola mundo nicolas schurmann");
		Thread.sleep(2000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(2000);
		
		
		// Declaramos un elemento para buscarlo mas tarde
		
		WebElement Elemento1 = driver.findElement(By.xpath("//*[text()='Aprende HTML ahora! curso completo GRATIS desde cero']"));
		
		WebElement Elemento2 = driver.findElement(By.xpath("//*[text()='Aprende GIT ahora! curso completo GRATIS desde cero']"));
		
		jse.executeScript("arguments[0].scrollIntoView(1);", Elemento1);// JS hara un Scroll en la vista y  buscara el elemeto
		Thread.sleep(2000);
		Elemento2.click();
		Thread.sleep(2000);
		
		
		//JavascriptExecutor js =(JavascriptExecutor) driver;
		
		
		/*
		 * 
		 * //*[text()="Aprende GIT ahora! curso completo GRATIS desde cero"]
		 * 
		 * */
		Thread.sleep(5000);
		driver.quit();
	}

}
