package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class xammm_5 {

	
	public class Select_Dropdown {
		public WebDriver driver;
		public Select select;

		@Test(priority=1)
		public void facebookDateOfBirthDropdownForJanuary1947() throws Exception {
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			
			driver.findElement(By.xpath("//input[@class='input_error form_input']/self::input[@id='user-name']")).sendKeys("standard_user");
			driver.findElement(By.xpath("//input[@class='input_error form_input']/self::input[@id='password']")).sendKeys("secret_sauce");
			
			Assert.assertTrue(driver.findElement(By.xpath("//h4[text()='Accepted usernames are:']")).isDisplayed());
			
			Assert.assertTrue(driver.findElement(By.xpath("//div[@class='login_logo']")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//div[@id='login_credentials']")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//div[@id='login_credentials']//child::br]")).isDisplayed());
			Assert.assertNull(driver, null)
			String acctualurl = driver.getCurrentUrl();
			System.out.println(acctualurl);
			
			String expectedurl = "https://www.saucedemo.com/";
			
			if (actualtitle.equals(exceptedtitle) && acctualurl.equals(expectedurl))
					{
					System.out.println("ok");
					}
}
}
}
















select = new Select(driver.findElement(By.id("month")));
select.selectByVisibleText("Jan");

select = new Select(driver.findElement(By.id("day")));
select.selectByVisibleText("20");

select = new Select(driver.findElement(By.id("year")));
select.selectByVisibleText("1947");
