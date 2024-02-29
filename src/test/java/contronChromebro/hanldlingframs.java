package contronChromebro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class hanldlingframs {

	public WebDriver driver;
	public ChromeOptions option;
	
	@Test
	
	public void handalingframs() {
		
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		//find out total no of frams
		//html tag of frams is iframe
		
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		System.out.println(allFrames.size());
		
		
		// there are 8 frames
		
		
		driver.switchTo().frame(5);
		//the webelement has some class or some id
		driver.findElement(By.id("somthing")).click();
		
		//to come back to normal position
		driver.switchTo().defaultContent();
		//it will stay to the frame.
	}
		
}
