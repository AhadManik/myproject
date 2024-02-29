package exception;

public class throw_ {

	public static void main(String[] args) {
		
		dividebyZero();
		
		
		
	}
	
	public static void dividebyZero() {
		
int a=100, b=0 , c;
		
		c=a/b;
		System.out.println(c);
		
		throw new ArithemeticException("i am trying to handle");
	}

}
