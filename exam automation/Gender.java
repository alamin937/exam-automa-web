package bd.com.Work;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Gender extends Chrome {
	
	
	
	@Test (priority = 0)
	public void one() throws InterruptedException {

		driver.get("https://itera-qa.azurewebsites.net/home/automation");

		driver.manage().window().maximize();

		Thread.sleep(3000);

	}
	
	
	@Test (priority = 1)

	public void two() throws InterruptedException {

		WebElement gender = driver.findElement(By.id("male"));
		WebElement tuesday = driver.findElement(By.id("thursday"));
		WebElement friday = driver.findElement(By.id("friday"));
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,480)", "");

		gender.click();
		Thread.sleep(3000);
		
		tuesday.click();
		Thread.sleep(3000);
		
		friday.click();
		Thread.sleep(3000);
	}

}
