package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class throws_ {

	public static void main(String[] args) throws FileNotFoundException  {
		
		filrPresentOrNot();

	}
	
	
	public static void filrPresentOrNot() throws FileNotFoundException {
		
		FileInputStream ip = new FileInputStream("C:\\Users\\Ahad  Manik\\Desktop");
	}

}
