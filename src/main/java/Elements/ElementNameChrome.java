package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementNameChrome {

	public static void main(String[] args) throws InterruptedException {
		// Variables para usar el binario
		String DriverNavegador = "webdriver.chrome.driver";
		String RutaDriver = "C:\\Rene\\Binarios\\ChromeDirvers\\chromedriver(103.0.5060.53).exe";
		String url ="https://www.google.com/";
		WebDriver driver;
		System.setProperty(DriverNavegador, RutaDriver);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("hola mundo nicolas schurmann");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();

	}

}
