package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ninja_test2 {

	public WebDriver driver;
	
	@BeforeMethod
	
	
	public void openwebsite() {
		
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/");
	
	 }
	
	@Test
	public void confirm_pass_testregister() {
		
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']/child::i/following-sibling::span[@class='hidden-xs hidden-sm hidden-md']")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Ahad");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("manik");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("ahsvfdjd@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("789456123");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("5497989261");
		//driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("5497989261");
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		WebElement confirm_pass = driver.findElement(By.cssSelector("div.text-danger"));
		if (confirm_pass.isDisplayed()) {
			
			System.out.println("perfect1");
			driver.close();
		}
		else {
			System.out.println("error");
		}
				
	}
	
	@Test
	public void without_first_name()
	{
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']/child::i/following-sibling::span[@class='hidden-xs hidden-sm hidden-md']")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Ahad");
		//driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("manik");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("ahsvfdjd@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("789456123");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("5497989261");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("5497989261");
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		WebElement first_name = driver.findElement(By.xpath("//input[@id='input-firstname']/following-sibling::div"));
		if (first_name.isDisplayed()) {
			System.out.println("Perfect2");
			driver.close();
		}
		else {System.out.println("no");
		
		}
	}
	
	@Test
	public void without_last_name() {
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']/child::i/following-sibling::span[@class='hidden-xs hidden-sm hidden-md']")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Ahad");
		//driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("manik");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("ahsvfdjd@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("789456123");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("5497989261");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("5497989261");
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	
	
	WebElement last_name = driver.findElement(By.xpath("//input[@id='input-lastname']/following-sibling::div"));
	if (last_name.isDisplayed()) {
		System.out.println("perfect2");
		driver.close();
	}	
	else {
		System.out.println("wrong");
	}
	}
}
