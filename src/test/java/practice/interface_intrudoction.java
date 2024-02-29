package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class interface_intrudoction implements introduction{

	public static void main(String[] args) {
		
		interface_intrudoction reff = new interface_intrudoction();
		
		reff.one();
		reff.tow();
		reff.three();
		
	}

	@Override
	public void one() {
		System.out.println("111111");
		
	}

	@Override
	public void tow() {
		System.out.println("222222222");
		
	}

	@Override
	public void three() {
		System.out.println("3333333");
		
	}

}

 class register_data{
	
	 public WebDriver driver;
	 @Test (dataProvider = "getdataregister" )
	 public void register(String firstName, String lastName, String email,String telephone,String password, String confirmPassword) {
		 
		 
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo");
			driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a")).click();
			driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a+ul>li:nth-child(1)>a")).click();
			driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(firstName);
			driver.findElement(By.cssSelector("input#input-lastname")).sendKeys(lastName);
			driver.findElement(By.cssSelector("input#input-email")).sendKeys(email);
			driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(telephone);
			driver.findElement(By.cssSelector("input#input-password")).sendKeys(password);
			driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(confirmPassword);
			driver.findElement(By.cssSelector("a.agree+input")).click();
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			
			
		 
	 }
	 
	 @DataProvider 
	 
	 public Object [][]  getdataregister() {
		 
		 Object [][] data = {{ "ahad", "manik", "ahdvggcv@gmail.com","51646131","96164","6416561"}
		 
		 };
		 return data;
		 
		 
	 }
	 
}

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 