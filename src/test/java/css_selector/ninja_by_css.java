package css_selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ninja_by_css {

	public static void main(String[] args) {
		
		
		
		
		//register() ;
		 login();
	
	}
	public static void register() {
		
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/");
	
	driver.findElement(By.cssSelector("div#top-links>ul>li:nth-of-type(2)>a")).click();
	driver.findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right>li:nth-of-type(1)>a")).click();
	driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("ahad");
	driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("manik");
	driver.findElement(By.cssSelector("input#input-email")).sendKeys("bahsybdjd@gmail.com");
	driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("5497989261");
	driver.findElement(By.cssSelector("input#input-password")).sendKeys("5497989261");
	driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("5497989261");
	driver.findElement(By.cssSelector("a.agree+input")).click();
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	public static void login() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.cssSelector("div#top-links>ul>li:nth-of-type(2)>a")).click();
		
		driver.findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right>li:nth-of-type(2)>a")).click();
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("bahsybdjd@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("5497989261");
		
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
}
