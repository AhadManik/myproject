package contronChromebro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouseActions {

	
	//click and hold
	//click and relise
	//context click(right-click)
	//back click
	//forward click
	//double click mouse
	//move to elements
	//move by offset
	//drag and drop
	
	public WebDriver driver;
	public ChromeOptions option;
	@Test
	public void mouseactionTN() {
		
		option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		
		Actions action = new Actions (driver);
		
		WebElement loginOrsignupbutton = driver.findElement(By.cssSelector("a._btnclick>span"));
		action.moveToElement(loginOrsignupbutton).perform();
		
		driver.findElement(By.xpath("//span[@id='shwlogn']/span[1]")).click();
		
	}
	@Test
	public void drag() {
		
		
			
			option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://jqueryui.com/draggable/");
			Actions action = new Actions (driver);
			
			list<WebElement
			
	}
	
}
