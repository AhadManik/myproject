package object_oriented_programing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Employee {
	
	
	public Employee() {
		
		
	}
	public WebDriver driver;
	
	Employee okkk = new Employee();
		
		@BeforeMethod 
		
		
		
		
		
		public void tiotorial2() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		
		
	}
		@Test
		
		public void open() {
			
			
			
			
		}

}
