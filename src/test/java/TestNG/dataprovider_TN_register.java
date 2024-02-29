package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider_TN_register {
public WebDriver driver;
	
	@Test(dataProvider = "registerDataForTN")
	public void registerTest(String first, String second, String email, String phone, String pass, String confirmpass) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(first);
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys(second);
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(phone);
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(pass);
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(confirmpass);
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.quit();
	}
	@DataProvider 
	public Object [][] registerDataForTN() {
		
		Object [][] data= {{ "ahad", "manik", "ahsvfdjdabkkk@gmail.com","929538","455916231","455916231"},
				{ "ahad", "manik", "ahsvfdjdabkkk44@gmail.com","929538","455916231","455916231"},
				{ "ahad", "manik", "ahsvfdjdabkkk1@gmail.com","929538","455916231","455916231"},
				{ "ahad", "manik", "ahsvfdjdabkkk555@gmail.com","9295556","455916231","455916231"}};
		
		return data;
		
	}
	
}
