package contronChromebro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class alartsNpopup {

	
	public WebDriver driver;
	public ChromeOptions option;
	
	@Test
	
	public void handalingalart() {
		
		option = new ChromeOptions();
		option.setPageLoadStrategy(PageLoadStrategy.EAGER);
		option.addArguments("--start-maximized");// for maximize
		option.addArguments("--incognito");  //for incognito
		driver = new ChromeDriver(option);
		//driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.className("signinbtn")).click();
		
		Alert alert = driver.switchTo().alert();
		//alert is interface
		
		System.out.println("inside of box:"+ alert.getText());
		//either acceept the alert the alert of dismiss the alert
		
		alert.accept();
		
		//alert.dismiss(); //if it has cross button
		
		
	}
}
