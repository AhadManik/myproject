package understanding_DOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators_rediff_sinf {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		//step1 click on sign in
		
		//driver.findElement(By.className("signin")).click();
		//driver.findElement(By.id("login1")).sendKeys("chowdhurygs@rediffmail.com");
		//driver.findElement(By.id("password")).sendKeys("Shajlee1");
		//driver.findElement(By.className("signinbtn")).click();
		
		//driver.findElement(By.id("remember")).click();	
		
		//{{{driver.findElement(By.className("moneyicon relative")).click();
		//driver.findElement(By.className("moneyicon relative")).click();
		
		//this is not run, because it is compound value, because 2 value there.***}}}
	
		
		//driver.findElement(By.className("vdicon")).click();
		
		
		//driver.findElement(By.linkText("money"));
		//driver.findElement(By.partialLinkText("SPORT")).click();
		
		//driver.findElement(By.linkText("Investors")).click();
		//driver.findElement(By.partialLinkText("Invest")).click();
		
		driver.findElement(By.linkText("Disclaimer")).click();
		

		
		
		
		
		
		
		
		
		
		
		
		
	}
}
