package polymarphosim;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class timemanagement {
	
	public WebDriver driver;
	public Properties prop;
	//public WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
	
	@BeforeTest
	
	public void openurl() throws Exception {
		
		prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\polymarphosim\\config_data.properties");
		prop.load(ip);
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1000));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
		
	Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Qafox.com']")).isDisplayed());
	System.out.println("1st done");
	Assert.assertTrue(driver.findElement(By.xpath("//span[@class='hidden-xs hidden-sm hidden-md']/self::span[text()='Currency']")).isDisplayed());
	System.out.println("2nd done");
	
	
	}
	
	
	@Test 
	public void register() {
		
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']/child::i/following-sibling::span[@class='hidden-xs hidden-sm hidden-md']")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='content']/child::h1")).isDisplayed());
		System.out.println("3rd done");
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='content']/child::h1")));
		System.out.println("4th done");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(prop.getProperty("first"));
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys(prop.getProperty("last"));
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(prop.getProperty("phone"));
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(prop.getProperty("pass"));
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(prop.getProperty("pass"));
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		System.out.println("5th done");
		
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.close();
	}

}
