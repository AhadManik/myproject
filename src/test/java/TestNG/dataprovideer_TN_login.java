package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovideer_TN_login {

	
	public WebDriver driver;
	
	@Test (dataProvider = "getTNData"  )
	public void login(String email, String pass) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(email);
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(pass);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.quit();
	}
	
	@DataProvider
	public Object [][] getTNData() {
		
		
		Object [][]data = {{"ahsvfdjd@gmail.com","5497989261"	},
							{"ahsvfdjd@gmail.com","5497989261"	},
							{"ahsvfdjd@gmail.com","5497989261"	},
							{"ahsvfdjd@gmail.com","5497989261"	},
							{"ahsvfdjd@gmail.com","5497989261"	},
							{"ahsvfdjd@gmail.com","5497989261"	},
							{"ahsvfdjd@gmail.com","5497989261"	},
							{"ahsvfdjd@gmail.com","5497989261"	}};
		return data;
}
}