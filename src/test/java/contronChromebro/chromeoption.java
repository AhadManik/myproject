package contronChromebro;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class chromeoption {

	
	// can contron speed of your code
	//Faster,slower,normal
	
	//can maximize from  here
	//can open code in ignito mode
	//other
	public WebDriver driver;
	
	@Test
	
	
	public void TNlogin() {
		
		
		ChromeOptions option = new ChromeOptions();
		option.setPageLoadStrategy(PageLoadStrategy.EAGER);// time will be less
		
		
		option.addArguments("--start-maximized");// for maximize
		option.addArguments("--incognito");  //for incognito
		option.setExperimentalOption("excludeSwitches",Arrays.aslist("enable-automation","disable-infobars"));
		driver = new ChromeDriver(option);
		//driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("ahsvfdjd@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("789456123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
	}
}
