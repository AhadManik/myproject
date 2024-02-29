package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baust {

	public static void main(String[] args) {
		
		
		//exmaple2 ( );
		expample3();
	}

	public static void emample( ) {
		
	WebDriver driver = new ChromeDriver ();
	driver.manage().window().maximize();
	driver.get("https://www.baust.edu.bd/");
	
	//driver.findElement(By.xpath("//li[@id='menu-item-4015']/child::a[@title='Administration']/parent::li/following-sibling::li[1]/child::a")).click();
	//driver.findElement(By.xpath("//a[@title='Faculty of Electrical and Computer Engineering (FECE)']")).click();
	//driver.findElement(By.xpath("//a[@title='Electrical and Electronic Engineering (EEE)']")).click();
	//driver.findElement(By.xpath("//div[@class='box-icon box3']/following-sibling::div[@class='box-title']/child::a/child::h6")).click();
	driver.findElement(By.xpath("//div[@class='box-icon box3']/following-sibling::div/descendant::h6")).click();
		
}

	public static void exmaple2 ( ) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foxsports.com/");
		
		driver.findElement(By.xpath("//span[text()='Scores']")).click();
		driver.findElement(By.xpath("//a[@href='/scores/soccer']/child::h2")).click();
		driver.findElement(By.xpath("//a[@href='/scores/top']/child::h2")).click();
		driver.findElement(By.xpath("//span[text()='Home']")).click();
		
		//driver.findElement(By.xpath("//span[text()='Scores']']")).click();		
		
		
	}
	
	public static void expample3() {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/");
	
	driver.findElement(By.xpath("//div[@id='subtopnav']/descendant::a[7]")).click();
	driver.findElement(By.xpath("//div[@class='w3-clear nextprev']/child::a[2]")).click();
	driver.findElement(By.xpath("//div[@class='w3-clear nextprev']/child::a[1]")).click();
	
	driver.findElement(By.xpath("//nav[@class='tnb-desktop-nav w3-bar-item']/child::a[1]")).click();
	driver.findElement(By.xpath("//i[@class='fa fa-logo ws-hover-text-green']")).click();
	
	
	}

		

	
}
