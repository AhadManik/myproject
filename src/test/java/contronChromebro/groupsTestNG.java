package contronChromebro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class groupsTestNG {
	
	//what are groups
	//how to create groups
	//how to excuate groups
	//whta are Metagroups
	//regular Expression 
	//groups at a class level
	
	public WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
	}

	@Test(priority = 1,groups = {"smoke","sanity","regression"})
	public void enterValidCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed()); 
	}

	@Test(priority = 2, groups = {"smoke","sanity"})
	public void enterValidEmailInvalidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123456");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertEquals(actualWarningMessage, expectedWarningMessage);


	}

	@Test(priority = 3, groups = {"smoke"})
	public void enterInvalidEmailValidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("selenium4324234panda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertEquals(actualWarningMessage, expectedWarningMessage);

	}

	@Test(priority = 4, groups = {"sanity"})
	public void enterInvalidCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("selenium4324234panda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123456");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertEquals(actualWarningMessage, expectedWarningMessage);

	}

	@Test(priority = 5, groups= {"regression"})
	public void enterNoCredentials() {

		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertEquals(actualWarningMessage, expectedWarningMessage);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
