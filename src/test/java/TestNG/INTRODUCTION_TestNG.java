package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class INTRODUCTION_TestNG {

	
	
		
		public WebDriver driver;
		
		@BeforeMethod
		public void openwebsite() {
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo/");
				
		}
		
		@Test
		
		public void usedemailregister() {
			
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
		@Test
		public void unusedemailregister() {
			
			driver.findElement(By.cssSelector("div#top-links>ul>li:nth-of-type(2)>a")).click();
			driver.findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right>li:nth-of-type(1)>a")).click();
			driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("ahad");
			driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("manik");
			driver.findElement(By.cssSelector("input#input-email")).sendKeys("bahsybdj@gmail.com");
			driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("5497989261");
			driver.findElement(By.cssSelector("input#input-password")).sendKeys("5497989261");
			driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("5497989261");
			driver.findElement(By.cssSelector("a.agree+input")).click();
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			
		}
		
		@Test
		public void nophone_number() {
			
		
		driver.findElement(By.cssSelector("div#top-links>ul>li:nth-of-type(2)>a")).click();
		driver.findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right>li:nth-of-type(1)>a")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("ahad");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("manik");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("bahsybdjd@gmail.com");
		//driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("5497989261");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("5497989261");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("5497989261");
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		}
		@Test
		public void no_input_password() {
			driver.findElement(By.cssSelector("div#top-links>ul>li:nth-of-type(2)>a")).click();
			driver.findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right>li:nth-of-type(1)>a")).click();
			driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("ahad");
			driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("manik");
			driver.findElement(By.cssSelector("input#input-email")).sendKeys("bahsybdjd@gmail.com");
			driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("5497989261");
			//driver.findElement(By.cssSelector("input#input-password")).sendKeys("5497989261");
			driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("5497989261");
			driver.findElement(By.cssSelector("a.agree+input")).click();
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		}
		@Test
		public void no_confirm_pass() {
			driver.findElement(By.cssSelector("div#top-links>ul>li:nth-of-type(2)>a")).click();
			driver.findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right>li:nth-of-type(1)>a")).click();
			driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("ahad");
			driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("manik");
			driver.findElement(By.cssSelector("input#input-email")).sendKeys("bahsybdjd@gmail.com");
			driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("5497989261");
			driver.findElement(By.cssSelector("input#input-password")).sendKeys("5497989261");
			//driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("5497989261");
			driver.findElement(By.cssSelector("a.agree+input")).click();
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		}
		@Test
		public void no_agree_button() {
			driver.findElement(By.cssSelector("div#top-links>ul>li:nth-of-type(2)>a")).click();
			driver.findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right>li:nth-of-type(1)>a")).click();
			driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("ahad");
			driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("manik");
			driver.findElement(By.cssSelector("input#input-email")).sendKeys("bahsybdjd@gmail.com");
			driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("5497989261");
			driver.findElement(By.cssSelector("input#input-password")).sendKeys("5497989261");
			driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("5497989261");
			//driver.findElement(By.cssSelector("a.agree+input")).click();
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		}
		@AfterMethod
		public void finish() {
			
		
		driver.close();
		}
	}


