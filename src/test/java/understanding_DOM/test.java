package understanding_DOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] agrs) {
		
		registerAccount1();
		registerAccount2() ;
		registerAccount3();
		
		
		
	}
	
	
	public static void registerAccount1(){
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("ahad");
		driver.findElement(By.id("input-lastname")).sendKeys("manik");
		driver.findElement(By.id("input-email")).sendKeys("ahadmankikk@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("459789661");
		driver.findElement(By.id("input-password")).sendKeys("456789456");
		driver.findElement(By.id("input-confirm")).sendKeys("456789456");
		driver.findElement(By.name("agree"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	
	public static void registerAccount2() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("manik");
		driver.findElement(By.id("input-lastname")).sendKeys("ahad");
		driver.findElement(By.id("input-email")).sendKeys("ahadmankik@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("4597896612");
		driver.findElement(By.id("input-password")).sendKeys("4567894562");
		driver.findElement(By.id("input-confirm")).sendKeys("4567894562");
		driver.findElement(By.name("agree"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	
	
	public static void registerAccount3() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("manika");
		driver.findElement(By.id("input-lastname")).sendKeys("ahada");
		driver.findElement(By.id("input-email")).sendKeys("ahadmanki@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("45978966125");
		driver.findElement(By.id("input-password")).sendKeys("45678945625");
		driver.findElement(By.id("input-confirm")).sendKeys("45678945625");
		driver.findElement(By.name("agree"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	
	
		
	
	
}
