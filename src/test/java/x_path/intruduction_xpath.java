package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class intruduction_xpath {

	public static void main(String[] args) {
		
		
		//address of a we elements
		
		//two types of x path- 1. absolute xpath,2. relative/dynamic/customized xpath
		
		//absolute xpath is more accurate
		
		//relative is the most safe
		
		///html/body/div[1]/div/div[3]/p/a[1] (absulate xpath of sign in in rediff.com) very unsafe
		
		//relative will always used, it has syntaxes-
		//1st systax//htmltag[@attribute='valueoftheattribute']
		
		//cnrtl+f open a box in inspect write relative ,write there from the inspect ,make sure 1 of 1
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");
		driver.findElement(By.xpath("//a[@class='signin']"));
		driver.findElement(By.xpath(""));
		
		
		
		//2nd syntax for two elements //htmltag[@attribute='valueoftheattribute' and @attribute='valueoftheattribute']
				
		
		// 3rd syntax for two elements //htmltag[@attribute='valueoftheattribute' or @attribute='valueoftheattribute']
		
		//compound value will work in thouse xpath
		
		
		//4th syntax (telated mostly to links
		//htmltag[text()='valueofthetext'];
		
		
		//5th  & 6th syntex (very populer)
		//htmltag[contains(text().'valueoftext')]- mostly used for links
		//htmltag[contains(@attributes,'valueoftext')]- for rest of all
		
		
		//7th syntax -- special if id value is changing then use this xpath
		//supose this is xpath we got dov-got-ad-516642262
		//html[starts-with(@id='dov-got-ad-'] it will be our xpath
		
		
		//8th systax-- if value change at first
		//suppose xpath is 516642262-dov-got-ad
		//html[ends-with(@id='dov-got-ad-']

	}

}
