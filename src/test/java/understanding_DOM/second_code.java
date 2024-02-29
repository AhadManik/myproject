package understanding_DOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class second_code {

	public static void main(String[] args) {
		
		
		//1-click website>
				//2-myaccount>
				//3-register>
				//4-information>
		//step 1
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		
		
		//step 2 click on my account
		//after open website right click on my account and click inspect
	// for this we have to learn locators
		
	//locators- 1- id,
		//2-class,
		//3-name,
		//4-linktext,
		//5-partiallinktext,
		//6-tagname,
		//7-xpath,
		//8-cssSector
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.linkText("input-email")).sendKeys("ahadmanik@gmail.com");
		
		
	}

}
