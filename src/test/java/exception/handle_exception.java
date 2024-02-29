package exception;

public class handle_exception {
	
	//try catch block
	
	public static void main(String[] args) {
		
		int a=100, b=0 , c;
		
		
		try {// try block will hold the risky code
			c=a/b;
			System.out.println(c);
		} catch (Exception e) {// catch block will hold the handling code
			
			e.printStackTrace();
		}
		System.out.println(20+30);
		
	}

	//logic
	//exception will occure bcoz of a programing mistake. the method which has the programming mistake - typically should take respon
}
