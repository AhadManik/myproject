package Data_driven_testing;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class register_TN {

	
	 public WebDriver driver;
	 public Properties prop;
	 public FileInputStream ip;
	 
	 @BeforeMethod
	 
	 
	 public void start() throws Exception {
		 
		 prop = new Properties();
		 ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\Data_driven_testing\\config_register.properties");
		 prop.load(ip);
		 
		 
		 
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(prop.getProperty("url"));
		 
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		 driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(1000));
		  
		 //example of implicityWait
		 
		
		 
		 
		
		 	 
	 }
	 
	 @Test 
	 public void register()  {
		 
		 driver.findElement(By.xpath("//a[@class='dropdown-toggle']/child::i/following-sibling::span[@class='hidden-xs hidden-sm hidden-md']")).click();
			driver.findElement(By.xpath("//a[text()='Register']")).click();
			driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(prop.getProperty("first"));
			driver.findElement(By.cssSelector("input#input-lastname")).sendKeys(prop.getProperty("last"));
			driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(prop.getProperty("email"));
			driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(prop.getProperty("phone"));
			driver.findElement(By.cssSelector("input#input-password")).sendKeys(prop.getProperty("pass"));
			driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(prop.getProperty("pass"));
			driver.findElement(By.cssSelector("a.agree+input")).click();
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		 
	 }
	 
	 @Test (priority = 1)
			 public  void warningMassege() {
		 
		 driver.findElement(By.xpath("//a[@class='dropdown-toggle']/child::i/following-sibling::span[@class='hidden-xs hidden-sm hidden-md']")).click();
			driver.findElement(By.xpath("//a[text()='Register']")).click();
			
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			 
			
			String warning1 = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
			String actualwarning1 = prop.getProperty("warning1");
			Assert.assertTrue(warning1.contentEquals(actualwarning1));
			
			System.out.println("ok");
			
			
			
		 
	 }
	
}
