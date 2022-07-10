package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCssSelector {

	public static void main(String[] args) {
		// Variables para usar el binario
		String DriverNavegador = "webdriver.chrome.driver";
		String RutaDriver = "C:\\Rene\\Binarios\\ChromeDirvers\\chromedriver(103.0.5060.53).exe";
		String url ="https://www.google.com/";
		WebDriver driver;
		System.setProperty(DriverNavegador, RutaDriver);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

}
