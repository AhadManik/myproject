package contronChromebro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tooltip {
	
	public WebDriver driver;
	
	@Test
	
	public void determineToolTip() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		WebElement sininlink = driver.findElement(By.className("signin"));
		
		String tootip = sininlink.getAttribute("title");
		System.out.println(tootip);
		
		//determine tooltip of any webelements
		
		
		
	}
	

}
