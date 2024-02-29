package understanding_DOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tutorial_ninja {

	public static void main(String[] args) {
	
		//createAccount();
		
		 //login();
		

		 walmart();	}
	
	
	public static void createAccount() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("ahad");
		driver.findElement(By.id("input-lastname")).sendKeys("manik");
		driver.findElement(By.id("input-email")).sendKeys("manika@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("15499284651");
		driver.findElement(By.id("input-password")).sendKeys("12345684");
		driver.findElement(By.id("input-confirm")).sendKeys("12345684");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	public static void login() {
		
		
		WebDriver driver2 = new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://tutorialsninja.com/demo");
		
		driver2.findElement(By.linkText("My Account")).click();
		driver2.findElement(By.linkText("Login")).click();
		driver2.findElement(By.id("input-email")).sendKeys("manika@gmail.com");
		driver2.findElement(By.id("input-password")).sendKeys("15499284651");
		driver2.findElement(By.cssSelector("input.btn.btn-primary")).click();
			
		
		
	}
	
	public static void walmart() {
	
	WebDriver driver3 = new ChromeDriver();
	driver3.manage().window().maximize();
	driver3.get("https://google.com/");
	
	//driver3.findElement(By.id("APjFqb")).sendKeys("walmart");
	driver3.findElement(By.className("btnK")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
