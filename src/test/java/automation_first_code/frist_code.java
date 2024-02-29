package automation_first_code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//crnl;+shit+o
public class frist_code {

	public static void main(String[] args) {
	
		
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("http://www.flipkart.com/");
	driver.quit();
		
		
	WebDriver driver1 = new FirefoxDriver();
	driver1.manage().window().maximize();
	driver1.get("http://www.flipkart.com/");
	driver1.quit();
	
	WebDriver driver2 = new EdgeDriver();
	driver2.manage().window().maximize();
	driver2.get("http://www.flipkart.com/");
	driver2.quit();
	
	WebDriver driver5 = new ChromeDriver ();
	driver5.manage().window().maximize();
	driver5.get("http://www.whatsapp.com/");
	
	WebDriver driver6 = new ChromeDriver();
	driver6.manage().window(). maximize();
	driver6.get("http://www.facebook.com");
	
	
	WebDriver driver7 = new ChromeDriver();
	driver7.manage().window().maximize();
	driver7.get("http://facebook.com");
	
	
	}

}
