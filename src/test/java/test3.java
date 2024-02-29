import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test3 {

public WebDriver driver;
	
	@BeforeMethod
	
	
	public void openwebsite() {
		
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/");
	
	 }
	
	@Test
	public static void loginpage() {
		
		
		
	}
}
