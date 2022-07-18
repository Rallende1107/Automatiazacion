package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFromList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String DriverNavegador = "webdriver.chrome.driver";
		String RutaDriver = "C:\\Rene\\Binarios\\ChromeDirvers\\chromedriver(103.0.5060.53).exe";
		String url ="https://demoqa.com/select-menu";
		WebDriver driver;
		System.setProperty(DriverNavegador, RutaDriver);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("oldSelectMenu")).click();
		Select cmb = new Select (driver.findElement(By.id("oldSelectMenu"))); 
		
		cmb.selectByVisibleText("Black");
		Thread.sleep(2000);
		
		cmb.selectByIndex(4);
		Thread.sleep(2000);
		cmb.selectByValue("10");
		Thread.sleep(2000);

		driver.quit();

	}

}
