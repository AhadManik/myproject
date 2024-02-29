package polymarphosim;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login_TN {
	public WebDriver driver;
	
	@Test(priority=1)
	public void loginwithvalid() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		
		
		
		
	}
	
}
