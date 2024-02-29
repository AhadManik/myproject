package polymarphosim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class fromTestBaseRegister extends testBase {
	

	
//	public fromTestBaseRegister() {
//		
//		super();
//	}
	public WebDriver driver;
	
	@BeforeMethod
	public void clickOnRegister() throws Exception {
		
		driver = testbases();
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']/child::i/following-sibling::span[@class='hidden-xs hidden-sm hidden-md']")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
	}
	
	@Test 
	public void registertest() {
		
		
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(prop.getProperty("first"));
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys(prop.getProperty("last"));
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("ahsvfdjd454@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(prop.getProperty("phone"));
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(prop.getProperty("pass"));
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(prop.getProperty("pass"));
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
	}
	

}
