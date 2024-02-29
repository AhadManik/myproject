import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testthree {
public WebDriver driver;
	
	@BeforeMethod
	
	
	public void openwebsite() {
		
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	
	 }
	
	@Test
	public void wrongPasswprdLogin() {
		
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("ahsvfdjd@gmail.com");
		//driver.findElement(By.cssSelector("input#input-password")).sendKeys("5497989261");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
		WebElement wrongpass = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible"));
		if ( wrongpass.isDisplayed()) {
			
			System.out.println("perfect1");
			
		}
		else {
			System.out.println("error");
		}
		
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		String exceptedtitle = "Account Login"; 
		 
		String acctualurl = driver.getCurrentUrl();
		System.out.println(acctualurl);
		
		String expectedurl = "https://tutorialsninja.com/demo/index.php?route=account/login";
		
		if (actualtitle.equals(exceptedtitle) && acctualurl.equals(expectedurl))
				{
				System.out.println("okkkkkkkkkkkkkkkkkk");
				}
		
		else {
			System.out.println("error");
		}
		
}
	
//	@Test
//	public void wrongemail() {
//		
//		driver.findElement(By.cssSelector("input#input-email")).sendKeys("ahsvfdj888@gmail.com");
//		driver.findElement(By.cssSelector("input#input-password")).sendKeys("5497989261");
//		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
//		
//		
//		WebElement wrongpass = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible"));
//		if ( wrongpass.isDisplayed()) {
//			
//			System.out.println("perfect1");
//			driver.close();
//		}
//		else {
//			System.out.println("error");
//		}
//		
		
	
		
	
	
	@AfterMethod
	public void finish() {
		
	
	driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}