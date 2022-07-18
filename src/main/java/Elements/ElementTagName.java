package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementTagName {

	public static void main(String[] args) throws InterruptedException {
		// Variables para usar el binario
		String DriverNavegador = "webdriver.chrome.driver";
		String RutaDriver = "C:\\Rene\\Binarios\\ChromeDirvers\\chromedriver(103.0.5060.53).exe";
		String url ="https://demoqa.com/text-box";
		WebDriver driver;
		System.setProperty(DriverNavegador, RutaDriver);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Rene Allende");
		driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("Rene Allende");
		
		driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("Rene Allende");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/textarea")).sendKeys("Rene Allende");
		driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys("Rene Allende");
		

		
		
		Thread.sleep(5000);
		driver.quit();

	}

}
