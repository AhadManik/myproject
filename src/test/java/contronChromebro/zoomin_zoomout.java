package contronChromebro;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class zoomin_zoomout {

	
	
public WebDriver driver;
	
	@Test
	
	public void zoominZoomOut() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("document.body.style.zoom = '300%', ;");
		
		
		
		
		
		
		
	}
}
