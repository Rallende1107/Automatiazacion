package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Rene\\Binarios\\ChromeDirvers\\chromedriver(103.0.5060.53).exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(4000)	;
		driver.close();
	}

}
