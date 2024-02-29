package TestNG;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class utilities {
public WebDriver driver;
	
	@BeforeMethod
	
	
	public void openwebsite() {
		
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/");
	
	 }
	
	@Test(invocationCount = 10)
	public void confirm_pass_testregister() {
		
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']/child::i/following-sibling::span[@class='hidden-xs hidden-sm hidden-md']")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Ahad");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("manik");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(emailTimeSteamp());//we need to take care of this
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("789456123");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("5497989261");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("5497989261");
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	public String emailTimeSteamp() {
		
		Date date = new Date();
		System.out.println(date);
		String timestemp = date.toString().replace(" ", "_");
		System.out.println(timestemp);
		
		return "ahsvfdjd" + timestemp + "@gmail.com";
		
	}
	
}
