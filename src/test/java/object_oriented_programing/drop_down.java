package object_oriented_programing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class drop_down {

	public WebDriver driver ;
	public Select select;
	
	@BeforeMethod
	
	
	public void facebookDropDown() {
		
	
		
		
		}
	
	@Test (priority=1)
	public void creataccount() throws Exception  {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.name("lastname")).sendKeys("Panda");
		driver.findElement(By.name("reg_email__")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Selenium@123");
		
		select = new Select(driver.findElement(By.cssSelector("select#month"))); 
		select.selectByVisibleText("Dec");
		
		select = new Select(driver.findElement(By.cssSelector("select#day")));
		select.selectByVisibleText("12");
		
		select = new Select(driver.findElement(By.cssSelector("select#year")));
		select.selectByVisibleText("1996");
		
		driver.findElement(By.cssSelector(" label[for='u_g_4_UR']")).click();
//		
//		select = new Select(driver.findElement(By.id("month")));
//		select.selectByVisibleText("Jan");
//
//		select = new Select(driver.findElement(By.id("day")));
//		select.selectByVisibleText("20");
//
//		select = new Select(driver.findElement(By.id("year")));
//		select.selectByVisibleText("1947");
	}
	
			@AfterMethod
			public void end() {
				System.out.println("ok");
}

}
