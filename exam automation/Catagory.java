package bd.com.Work;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Catagory extends Chrome {
	
	
	@Test(priority = 0)
	public void one() throws InterruptedException {

		driver.get("https://itera-qa.azurewebsites.net/home/automation");

		driver.manage().window().maximize();

		Thread.sleep(3000);

	}
	
	
	
	@Test(priority = 1)
	public void two() throws InterruptedException {

		
		WebElement custom = driver.findElement(By.className("custom-select"));
		
		Select select = new Select(custom);
		
		select.selectByVisibleText("Norway");
		Thread.sleep(3000);
		
		
		
	}

}
