package Data_driven_testing;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class data_from_properties {
	
	//step1- create the object of properties
	public WebDriver driver;
	public Properties prop;
	
	@BeforeTest
	public void opening() {
		
		
	}
	@Test
	public void readFromPropFile() throws Exception {
		
	
	
	 prop = new Properties();
	
	//step2-  
	
	//FileInputStream ip = new FileInputStream("C:\\Users\\Ahad  Manik\\eclipse-workspace\\maven_project\\src\\test\\java\\Data_driven_testing\\config.properties");
	FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\Data_driven_testing\\config.properties");
	prop.load(ip);
	login();
	}


	public void login() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(prop.getProperty("pass"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
		}
	@Test
	public void without_first_name()
	{
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']/child::i/following-sibling::span[@class='hidden-xs hidden-sm hidden-md']")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Ahad");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("manik");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("ahsvfdjd@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("789456123");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("5497989261");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("5497989261");
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
	}	
}
