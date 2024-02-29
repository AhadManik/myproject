package scanner_rapper_parsing;

public class unboxing_boxing {

	public static void main(String[] args) {
		
		//parent of this class is number Class
		//integer
		//long
		//Short
		//Double
		//Float
		//Byte
		
		
		//parant of this is Object class
		//Boolean
		//Charatcter
		
		
		
		
		
	}
	
	public static void boxingExample() {
		
		
		int a = 100;
		
		Integer b = Integer.valueOf(a);
		System.out.println("this is wrapper class"+ b);
		
	}

	
	public static void autoboxing() {
		
		int a = 100;
		
		Integer b = a;
		
	}
	
	public static void unboxing() {
		
		Integer result = 100;
		
		int newresult = result.intValue();
		
	}
	
	public void autounboxing() {
		
		Integer result =100;
		int newresult = result;
		
		
	}
	
	public void boxingChar() {
		
		char a = 14;
		//Character b = a;
		
		Character r = Character.valueOf(a);
		
		
	
	}
}
