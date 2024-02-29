package polymarphosim;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class testBase {

	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip;
	//public WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
	public WebDriver testbases() throws Exception {
		
		
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\polymarphosim\\config_data.properties");
		prop.load(ip);
		
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(1000));
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
//		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(1000));
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
		Assert.assertTrue(driver.findElement(By.cssSelector("input.form-control.input-lg")).isDisplayed());
		System.out.println("1st done");
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("input.form-control.input-lg")));
		System.out.println("2nd done");
		
		return driver;
		
		
	}
}
