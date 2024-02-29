package contronChromebro;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class screenshot {
public WebDriver driver;
	
	@Test(enabled=false)
	
	public void screenshot() throws Exception {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org/");
		
		
		//step 1 - identity the webelement which want to take screenshot
		
		WebElement logo = driver.findElement(By.xpath("//div[@class='section where-to']"));
		
		//step2 using the reff we will call a method getScreenshotAs
		
		File source = logo.getScreenshotAs(OutputType.FILE);
		
		//step3 where will it store
		//
		
		File destination = new File("C:\\Users\\Ahad  Manik\\eclipse-workspace\\maven_project\\test-output\\screenshots//openweather.png");
		
		//have to copy into the destination 
		
		FileHandler.copy(source, destination);
		
		
	}
	
	@Test 
	public void screenshotbaust() throws Exception {
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.baust.edu.bd/");
		
		WebElement logo2 = driver.findElement(By.xpath("//div[@class='hero-leftside col-sm-6']/child::img"));
		File source2 = logo2.getScreenshotAs(OutputType.FILE);
		File destination2 = new File("C:\\Users\\Ahad  Manik\\eclipse-workspace\\maven_project\\test-output\\screenshots//baust.png");
		FileHandler.copy(source2, destination2);
		
		
	}
	
}















