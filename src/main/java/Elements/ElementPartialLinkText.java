package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementPartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		// Variables para usar el binario
		String DriverNavegador = "webdriver.chrome.driver";
		String RutaDriver = "C:\\Rene\\Binarios\\ChromeDirvers\\chromedriver(103.0.5060.53).exe";
		String url ="https://the-internet.herokuapp.com/";
		WebDriver driver;
		System.setProperty(DriverNavegador, RutaDriver);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.findElement(By.partialLinkText("Broken Im")).click();;
		/*
		 * PartialLinkText 
		 * Es un texto parcial que contiene un link
		 * 
		 * */
		Thread.sleep(2000);

	}

}
