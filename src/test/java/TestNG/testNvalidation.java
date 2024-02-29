package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNvalidation {
	
	
	//assertions-sre validation specific to TestNG, which helps to validate your test cases/
	
	//2 type of assertioons
	//1- hard assert. is called assert only but we tend to use the wprd hard.
	//2- soft assert
	
	//assert is a class in testNG library
	
	
	//***************** Tn_login_by_assert() {
		
		public WebDriver driver;
		
		@BeforeMethod
		
		public void setup() {
			
			
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo/");
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();
			
		}
			
		@Test
		
		public void login() {
			driver.findElement(By.cssSelector("input#input-email")).sendKeys("ahsvfdjd@gmail.com");
			driver.findElement(By.cssSelector("input#input-password")).sendKeys("5497989261");
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
			
			
		}
		
	

}
