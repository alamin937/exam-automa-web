package bd.com.Work;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Daraz extends Chrome {

	
	@Test(priority = 0)
	public void one() throws InterruptedException {

		driver.get("https://www.daraz.com.bd/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

	}
	
	
	@Test(priority = 1)
    public void two() throws InterruptedException {
		
		
		WebElement autom = driver.findElement(By.xpath("//li[@id='Level_1_Category_No12']"));
		
		WebElement gear = driver.findElement(By.xpath("//body/div[@id='J_7459419030']/div[@id='J_LzdSiteNav']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/ul[12]/li[11]"));
		
		WebElement helmet = driver.findElement(By.xpath("//body/div[@id='J_7459419030']/div[@id='J_LzdSiteNav']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/ul[12]/li[11]/ul[1]/li[1]"));
		
		
		Actions action = new Actions(driver);
		
		action.moveToElement(autom).perform();
		Thread.sleep(3000);
		
		action.moveToElement(gear).perform();
		Thread.sleep(3000);
		
		action.moveToElement(helmet).perform();
		Thread.sleep(3000);
		
		helmet.click();
		Thread.sleep(3000);
		
	}
	
	
}
