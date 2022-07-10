package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdge {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.edge.driver", "C:\\Rene\\Binarios\\EdgeDrives\\msedgedriver(103.0.1264.32).exe");
		
		driver =  new EdgeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(5000)	;
		driver.close();		
		

		

	}

}
