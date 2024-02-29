package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_xpath {

	public static void main(String[] args) {
		
		 
		 //registerTN();
		 loginTN();
		
	}
	
	public static void registerTN() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("ahad manik");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("abdul");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("akhadmanik20@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password' and @class='form-control' ]")).sendKeys("654987951");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("654987951");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("9295389556");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
	}
	
	
	public static void loginTN() {
		
		
		WebDriver driver1 =new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://tutorialsninja.com/demo/");
		
		
		driver1.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		driver1.findElement(By.xpath("//a[text()='Login']")).click();
		driver1.findElement(By.xpath("//input[@id='input-email']")).sendKeys("akhadmanik20@gmail.com");
		driver1.findElement(By.xpath("//input[@id='input-password']")).sendKeys("654987951");
		driver1.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
		
		
		
	}
	
	
		
	}


