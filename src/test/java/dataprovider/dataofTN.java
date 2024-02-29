package dataprovider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataofTN {

	
	
	public WebDriver driver;
	public Properties prop;
	
	
	@Test (dataProvider = "dataTN", priority = 1)
	public void loginTN(String email, String pass) throws Exception {
        prop = new Properties();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\dataprovider\\config_data_TN.properties");
		prop.load(ip);
		
		driver.get(prop.getProperty("url"));
		
		Assert.assertTrue(driver.findElement(By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")).isDisplayed());;
		System.out.println("1st done");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(email);
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(pass);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.close();
		
	}
	@DataProvider 
	public Object [][] dataTN(){
		
		Object  data [][] = {{"ahsvfdjd111@gmail.com","5497989261"	},
				{"ahsvfdjd2222@gmail.com","5497989261"	},
				{"ahsvfdjd3333@gmail.com","5497989261"	},
				{"ahsvfdjd4444@gmail.com","5497989261"	},
				{"ahsvfdjd5555@gmail.com","5497989261"	},
				{"ahsvfdjd66666@gmail.com","5497989261"	},
				{"ahsvfdjd7777@gmail.com","5497989261"	},
				{"ahsvfdjd8888@gmail.com","5497989261"	}};
		
		return data;
	}
	

}
