package bd.com.Work;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Iteraqa extends Chrome{

	
	@Test (priority = 0)
	public void one() throws InterruptedException {
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
	}
	
	
	
	@Test (priority = 1)
	public void two() throws InterruptedException {
		
		
		WebElement name = driver.findElement(By.id("name"));
		WebElement mobile = driver.findElement(By.id("phone"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement address = driver.findElement(By.id("address"));
		WebElement button = driver.findElement(By.name("submit"));
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,350)", "");
		
		
		
		
		
		name.sendKeys("alamin");
		Thread.sleep(3000);
		
		mobile.sendKeys("0175555555");
		Thread.sleep(3000);
		
		email.sendKeys("alamin@gmail.com");
		Thread.sleep(3000);
		
		password.sendKeys("alamin");
		Thread.sleep(3000);
		
		address.sendKeys("mirpur");
		Thread.sleep(3000);
		
		
		button.click();
		Thread.sleep(3000);
		
		
		
	}
	
	
	
	
	
	
	
}
