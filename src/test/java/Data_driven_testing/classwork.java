package Data_driven_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class classwork {

	
	
public WebDriver driver;

	public WebDriverWait wait;
	
	@BeforeMethod
	
	
	public void openwebsite() {
		
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/");
	
	
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	
	 }
	
	@Test
	public void confirm_pass_testregister() {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='dropdown-toggle']/child::i/following-sibling::span[@class='hidden-xs hidden-sm hidden-md']")));
		
	    driver.findElement(By.xpath("//a[@class='dropdown-toggle']/child::i/following-sibling::span[@class='hidden-xs hidden-sm hidden-md']")).click();
		
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Register']")));
	    driver.findElement(By.xpath("//a[text()='Register']")).click();
	    
	    
		
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("manik");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("ahsvfdjd4541212@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("789456123");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("5497989261");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("5497989261");
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
}
}
