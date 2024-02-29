package validation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validation1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");

	
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		
		String exceptedtitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		
		
		
		String acctualurl = driver.getCurrentUrl();
		System.out.println(acctualurl);
		
		String expectedurl = "https://www.rediff.com/";
		
		if (actualtitle.equals(exceptedtitle) && acctualurl.equals(expectedurl))
				{
				driver.findElement(By.cssSelector("p#signin_info>a.signin")).click();
				}
		
		else {
			System.out.println("error");
		}
		driver.findElement(By.xpath("//a[@title='Create new Rediffmail account']/child::u")).click();
		String actualtitle2 = driver.getTitle();
		System.out.println(actualtitle2);
		String extitle = "Rediffmail Free Unlimited Storage";
		if (actualtitle2.equals(extitle)) {
			//driver.findElement(By.xpath("//a[@title='Create new Rediffmail account']/child::u")).click();
			driver.findElement(By.xpath("//input[@name='name939af757']")).sendKeys("ahadmanik");
			
		}
		else {
			System.out.println("huday");
		}
	}

}
