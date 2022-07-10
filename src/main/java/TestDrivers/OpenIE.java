package TestDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class OpenIE {

	public static void main(String[] args) throws InterruptedException {

		// Variables para usar el binario
		String BrowserDriver = "webdriver.ie.driver";
		String Ruta = "C:\\Rene\\Binarios\\Internet Explorer Driver\\";
		String BinarioName = "IEDriverServer (x64_4.2.0)";
		String FullPath= Ruta+BinarioName+".exe";
		String url ="https://www.udemy.com/";
		
		
		WebDriver driver;
		System.setProperty(BrowserDriver, FullPath);

		driver  = new InternetExplorerDriver();
		
		driver.get(url);
		Thread.sleep(5000);
		driver.quit();

	}

}
