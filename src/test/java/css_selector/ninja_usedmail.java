package css_selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ninja_usedmail {

	public WebDriver driver;
	@BeforeMethod
	public void openwebsite() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
			
	}
	
	
	@Test
	public void testregister_used_email() {
		
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
		
		WebElement signlink = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible"));
		if (signlink.isDisplayed()) {
			driver.close();
		}
		else {
			System.out.println("error");
		}
	}
}
