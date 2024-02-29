package understanding_DOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_ninja {

	public static void main(String[] args) {
		
		if(1==1){
            System.out.println(“Hello”);
           }else if(2==2){
            System.out.println(“World”);
           }


	}
	
	public static void directninja() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		
		
		driver.findElement(By.linkText("button")).click();
		
	}
	
	

	

}
