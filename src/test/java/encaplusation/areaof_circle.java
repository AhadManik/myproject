package encaplusation;

public class areaof_circle {

	
	private int radious;
	private double pi;
	public void radious(int radious, double pi) {
		
		this.radious = radious;
		this.pi = pi;
		//double area = pi* (radious*radious);
		System.out.println(pi*radious*radious);
		
		
		
	}
	
	
	
//	public int radiouss() {
//		return radious;
//	}
//	public double pii() {
//		return pi;
//	}

}

class name{
	private int age;
	private double hight;
	private int money;
	 public void tmi(int age, double hight, int money) {
		 
		 this.money = money;
		 this.age = age;
		 this.hight= hight;
		 
		 System.out.println(age+hight+money);
	 }
	 
	 @Test
	    ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		 WebDriver driver = new ChromeDriver(options);
		driver.get("https://tutorialsninja.com/demo");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
}

<test name="test6">


<parameter name="first" value="ahad" />
<parameter name="last" value="manik" />
<parameter name="phone" value="123456789" />
<parameter name="password" value="5151515151" />
<parameter name="confirmpass" value="5151515151" />
<parameter name="email" value="ahadmanik@gmail.com" />





@Test
@Parameters({"first", "last", "phone", "password", "confirmpass","email"})
public void registerTNParameterizationConcept(String first, String last, String phone, String password, String confirmpass,String email) {
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo");
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(first);
	driver.findElement(By.cssSelector("input#input-lastname")).sendKeys(last);
	driver.findElement(By.cssSelector("input#input-email")).sendKeys(email); 
	driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(phone);
	driver.findElement(By.cssSelector("input#input-password")).sendKeys(password);
	driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(confirmpass);
	driver.findElement(By.cssSelector("a.agree+input")).click();
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();



















