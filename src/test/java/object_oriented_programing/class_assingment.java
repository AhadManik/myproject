package object_oriented_programing;

public class class_assingment {

	int no_of_qestions = 10;
	String name = "jajaja";
	
	
	
	static int age = 10;
	static String gender =  "m";
	public static void main(String[] args) {
		
		//class_assingment some = new class_assingment();
		class_assingment.someMethod();
		class_assingment.someMethod2();
		
		
		class_assingment some = new class_assingment();
		some.extras();
		
	}

	
	
	
	
	
	public static void someMethod() {
		System.out.println("yes");
	}
	
	public static void someMethod2() {
		System.out.println("noooo");
		
	}
	public void extras() {
		System.out.println("AAAAAAAAAAAAAAA");
	}
	
}




 
















