package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLinkText {

	public static void main(String[] args) throws InterruptedException {
		// Variables para usar el binario
		String DriverNavegador = "webdriver.chrome.driver";
		String RutaDriver = "C:\\Rene\\Binarios\\ChromeDirvers\\chromedriver(103.0.5060.53).exe";
		String url ="https://myanimelist.net/anime/genre/62/Isekai";
		WebDriver driver;
		System.setProperty(DriverNavegador, RutaDriver);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.findElement(By.linkText("No Game No Life")).click();
		/*
		 * LinkText
		 * Es un Texto que posee un Link
		 * 
		 * 
		 * */
		
		Thread.sleep(2000);


	}

}
