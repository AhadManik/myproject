package contronChromebro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class keyboard_action {

	
	public WebDriver driver;
	@Test
	public void loginByKeyboardTN() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		WebElement emailtextbox = driver.findElement(By.id("input-email"));
		WebElement passtextbox = driver.findElement(By.id("input-password"));
		WebElement loginbutton = driver.findElement(By.cssSelector("input.btn.btn-primary"));
		
		Actions actions = new Actions(driver);
		
		actions.click(emailtextbox).sendKeys("seleniumpanda1@gmail.com").perform();
		
		//now i want to copy the email
		//ctrl+a[select all]
		//ctrl+c [copy]
		//TAB
		//ctrl+v
		
		actions.keyDown(emailtextbox, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		actions.keyDown(emailtextbox, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		actions.keyDown(emailtextbox, Keys.TAB).perform();
		actions.keyDown(passtextbox, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		//enter key
		actions.keyDown(loginbutton, Keys.ENTER).perform();
		
		System.out.println("done");
		
	}
}
