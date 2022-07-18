package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementXpath {

	public static void main(String[] args) throws InterruptedException {
		// Variables para usar el binario
		/*	Xpath:
		 * Identificador de elemento Web, que pueden servir si el elemento en si no posee, ID, Name, Etc...
		 * Puden ser relativo o Absolutos
		 * 
		 * */
		
		String DriverNavegador = "webdriver.chrome.driver";
		String RutaDriver = "C:\\Rene\\Binarios\\ChromeDirvers\\chromedriver(103.0.5060.53).exe";
		String url ="https://www.google.com/";
		WebDriver driver;
		System.setProperty(DriverNavegador, RutaDriver);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		/*
		 * Para Copiar un Xpath se debe copiar el elemnto completo
		 * 
		
		 * Xpath Relativo:
		 * */
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Hola mundo");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.ESCAPE);
		/*
		 * Xpath Absoluto//Full Xpath
		 * */
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
