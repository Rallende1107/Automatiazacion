package Acciones;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import TomarFotos.TomarFotosTSS;

public class TakesScreanShoot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// Variables para el Driver
		String DriverNavegador = "webdriver.chrome.driver";
		String RutaDriver = "C:\\Rene\\Binarios\\ChromeDirvers\\chromedriver(103.0.5060.53).exe";
		String url1 ="https://demoqa.com/text-box";
		//String url2 ="https://youtube.com/";

		// Iniciando el Driver
		WebDriver driver; 
		System.setProperty(DriverNavegador, RutaDriver);
		driver = new ChromeDriver();

		driver.get(url1);
		driver.manage().window().maximize();

		JavascriptExecutor jse =(JavascriptExecutor) driver;
		WebElement Elemento1 = driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img"));
		jse.executeScript("arguments[0].scrollIntoView();", Elemento1);// JS hara un Scroll en la vista y  buscara el elemeto
		TomarFotosTSS.fotografo_TSS("Test_1_Ir A la pagina", driver);
		
		
		driver.findElement(By.id("userName")).sendKeys("Rene Allende");
		Thread.sleep(1000);
		TomarFotosTSS.fotografo_TSS("Test_2_Full Name", driver);
		
		driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("rene.allende15@gmail.com");
		Thread.sleep(1000);
		TomarFotosTSS.fotografo_TSS("Test_3_Email", driver);
		
		
		driver.findElement(By.id("currentAddress")).sendKeys("My Home");
		Thread.sleep(1000);
		TomarFotosTSS.fotografo_TSS("Test_4_Direccion", driver);
		
		driver.findElement(By.id("permanentAddress")).sendKeys("Santiago de Chile");
		Thread.sleep(1000);
		TomarFotosTSS.fotografo_TSS("Test_5_Direccion2", driver);	
		
		
		
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		Thread.sleep(1000);
		TomarFotosTSS.fotografo_TSS("Test_6_Fin", driver);
		
		driver.close();
	}

}
