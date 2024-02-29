package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testNG_assert_class_work {
	
	
	public WebDriver driver;
	public SoftAssert softassert = new SoftAssert();
	
	@BeforeMethod
	
	
	public void register_ass() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']/child::i/following-sibling::span[@class='hidden-xs hidden-sm hidden-md']")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
	}

	
	@Test(priority=1)
	public void noInput() {
		
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
	
	@Test(priority=2)
	public void withMandotaryDetails() {
		
		
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Ahad");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("manik");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("ahsvfdjdab@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("789456123");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("5497989261");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("5497989261");
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='col-sm-9']/child::h1")).isDisplayed());
		
		
	}
	
	@Test(priority=3)
	public void withAllDetails() {
		
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Ahad");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("manik");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("ahsvfdjdac@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("789456123");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("5497989261");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("5497989261");
		driver.findElement(By.cssSelector("a.agree+input")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='0']")).isEnabled());
		
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		//Sdriver.close();
		
	}
	
	@Test(priority=4)
	public void sameEmail() {
		
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Ahad");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("manik");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("ahsvfdjda@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("789456123");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("5497989261");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("5497989261");
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).isDisplayed());
		System.out.println("My Assert for Test Case 4 is correct");
	}
	
	@Test(priority=5)
	public void noConfirmPassword() {
	driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Ahad");
	driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("manik");
	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("ahsvfdjdae@gmail.com");
	driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("789456123");
	driver.findElement(By.cssSelector("input#input-password")).sendKeys("5497989261");
	//driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("5497989261");
	driver.findElement(By.cssSelector("a.agree+input")).click();
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	
	Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Password confirmation does not match password!']")).isDisplayed());
	//driver.close();
	
	}
	
	@AfterMethod
	public void finish() {
		
		System.out.println("all good");
		driver.quit();
		
	}
}




























