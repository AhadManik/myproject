package practice;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class newbbb {

	public WebDriver driver;
	public Properties prop;
	
	@BeforeTest
	public void opening() throws Exception {
		
		 prop = new Properties();
		 FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\practice\\data.properties");
			prop.load(ip);	

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();
}
	
	@Test
	public void login() {
		
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(prop.getProperty("pass"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
