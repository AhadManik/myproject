package exception;

public class finnaly_vlock {

	public static void main(String[] args) {
		
		int a=100, b=0 , c;
		
		try {
			c=a/b;
			System.out.println(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("i will run");
		}
		

	}

}
