package bd.com.Work;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class AlertExample extends Chrome {

	
	
	@Test(priority = 0)
	public void one() throws InterruptedException {

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.manage().window().maximize();

		Thread.sleep(3000);

	}
	
	
	@Test(priority = 1)
	public void two() throws InterruptedException {
		
		
		
		WebElement jsalert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		WebElement jsconfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		WebElement jspromot = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		
		jsalert.click();
		Thread.sleep(3000);

		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		Thread.sleep(3000);
		
		assertEquals("You successfully clicked an alert", "You successfully clicked an alert");
		
		jsconfirm.click();
		Thread.sleep(3000);
		
		alert.accept();
		Thread.sleep(3000);
		
		assertEquals("You clicked: Ok", "You clicked: Ok");
		
		jspromot.click();
		Thread.sleep(3000);
		
		alert.sendKeys("alamin");
		Thread.sleep(3000);
		
		alert.accept();
		Thread.sleep(3000);
		
	}
}
