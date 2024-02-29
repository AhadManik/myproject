package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testng_validation2 {
	
	public class ninja_test2 {

		public WebDriver driver;
		
		@BeforeMethod
		
		
		public void openwebsite() {
			
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		 }
		
		@Test 
		public void loginwaring() {
			
			driver.findElement(By.xpath("//a[@class='dropdown-toggle']/child::i/following-sibling::span[@class='hidden-xs hidden-sm hidden-md']")).click();
			driver.findElement(By.xpath("//a[text()='Register']")).click();
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			
			Assert.assertTrue(driver.findElement(By.xpath("//div[text()='First Name must be between 1 and 32 characters!']")).isDisplayed());
			
			
			Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Last Name must be between 1 and 32 characters!']")).isDisplayed());
			
			
			Assert.assertTrue(driver.findElement(By.xpath("//div[text()='E-Mail Address does not appear to be valid!']")).isDisplayed());
			
			Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Telephone must be between 3 and 32 characters!']")).isDisplayed());
			
			Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Password must be between 4 and 20 characters!']")).isDisplayed());
			
			String actualprivacy = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
			String excepted="Warning: You must agree to the Privacy Policy!";
			Assert.assertEquals(actualprivacy, excepted);
			
			
			
		}
		
		
	}
}
