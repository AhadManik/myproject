package exception;

public class print {

	public static void main(String[] args) {
		
		int a=100, b=0 , c;
		
		try {
			c=a/b;
			System.out.println(c);
		} catch (Exception e) {
			
			//e.printStackTrace();//prints name and describtion and stackTrace
			System.out.println(e);//print only name and description
			System.out.println(e.toString());//print only name and description
			System.out.println(e.getMessage());//only description
		}

	}

}
