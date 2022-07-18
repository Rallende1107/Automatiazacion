package Acciones;

import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import TomarFotos.ImagenesRobot;

public class FotosRobot {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException  {
		// Variables para el Driver
		String DriverNavegador = "webdriver.chrome.driver";
		String RutaDriver = "C:\\Rene\\Binarios\\ChromeDirvers\\chromedriver(103.0.5060.53).exe";
		String url1 ="https://demoqa.com/text-box";
		String url2 ="https://youtube.com/";

		// Iniciando el Driver
		WebDriver driver; 
		System.setProperty(DriverNavegador, RutaDriver);
		driver = new ChromeDriver();

		driver.get(url1);
		driver.manage().window().maximize();
		
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		WebElement Elemento1 = driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img"));
		jse.executeScript("arguments[0].scrollIntoView();", Elemento1);// JS hara un Scroll en la vista y  buscara el elemeto
		ImagenesRobot.fotografo("Test_1");
		
		
		driver.findElement(By.id("userName")).sendKeys("Rene Allende");
		Thread.sleep(1000);
		ImagenesRobot.fotografo("Test_2");
		
		driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("rene.allende15@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		Thread.sleep(1000);
		ImagenesRobot.fotografo("Test_3");
		
		
		driver.get(url2);
		driver.manage().window().maximize();
		ImagenesRobot.fotografo("Segunda");
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
