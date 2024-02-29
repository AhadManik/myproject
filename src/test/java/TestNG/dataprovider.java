package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {

	
	
	//data provider stores data in a certain formet and provied the data to test case.
	
	
	//rule- will return 2-dimentional object arry
	
	@Test(dataProvider = "getdata") 
	public void login(String username,String pass, String browsername, int mobilenum) {
		
		
		System.out.println(username+ "-----"+ pass+ "---"+browsername+"---"+ mobilenum);
		
		
	}
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[3][4];
		
		data[0][0]= "username1";
		data[0][1]="password1";
		data[0][2] = "chrome";
		data[0][3]= 1235644;
		
		data[1][0]= "username12";
		data[1][1]="password12";
		data[1][2] = "firefox";
		data[1][3]= 12356441;
		
		data[2][0]= "username123";
		data[2][1]="password123";
		data[2][2] = "chrome23";
		data[2][3]= 123564412;
		
		return data;
	}
}
