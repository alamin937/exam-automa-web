package bd.com.Work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome {

	
	WebDriver driver;
	
	@BeforeSuite
	public void first() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
	}
	
	
	@AfterSuite
	public void second() {
		
		driver.close();
		
		
	}
	
	
	
	
}
