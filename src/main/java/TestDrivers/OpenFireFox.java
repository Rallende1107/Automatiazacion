package TestDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "C:\\Rene\\Binarios\\GeckoDrivers\\geckodriver (0.31.0).exe");
		driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(4000)	;
		driver.close();
	}

}
