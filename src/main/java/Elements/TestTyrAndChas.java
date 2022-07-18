package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTyrAndChas {

	public static void main(String[] args) throws InterruptedException {
		//#######################################################################################################
		String DriverNavegador = "webdriver.chrome.driver";
		String RutaDriver = "C:\\Rene\\Binarios\\ChromeDirvers\\chromedriver(103.0.5060.53).exe";
		String url ="https://www.youtube.com";
		//#######################################################################################################
		WebDriver driver;
		System.setProperty(DriverNavegador, RutaDriver);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		JavascriptExecutor SJE = (JavascriptExecutor) driver;
		
		
		Thread.sleep(3000);
		driver.findElement(By.name("search_query")).sendKeys("hola mundo nicolas schurmann");
		Thread.sleep(2000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(2000);
		try {
			
			WebElement Elemento1 = driver.findElement(By.xpath("//*[text()='Aprende HML ahora! curso completo GRATIS desde cero']"));
			WebElement Elemento2 = driver.findElement(By.xpath("//*[text()='Aprende GIT ahora! curso completo GRATIS desde cero']"));
			SJE.executeScript("arguments[0].scrollIntoView(1);", Elemento1);// JS hara un Scroll en la vista y  buscara el elemeto
			Thread.sleep(2000);
			Elemento2.click();

			
		} catch (NoSuchElementException e) {
				System.out.println("Elemento No encontrado: " + e);
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
