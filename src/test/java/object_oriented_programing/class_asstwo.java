package object_oriented_programing;

public class class_asstwo {
	
	static int age = 10;
	static String gender =  "m";
	
	String name = "ajsgdh";
	int hight = 10;
	
			

	public static void main(String[] args) {
		
		method();
		method2();
		method3();
		
		class_asstwo abc = new class_asstwo();
		abc.method4();
		abc.method5();
		
		System.out.println(age);
		System.out.println(gender);
		
		System.out.println(name);
		
		
		
		

	}
	public static void method() {
		System.out.println("1");
		//method2();
	}
   
	public static void method2() {
	System.out.println("2");
	//method();
	}

	public static void method3() {
		System.out.println("3");
//		method();
//		method2();
//		method3();
		
	}
	
	public void method4() {
		System.out.println("4");
		//method5();
		
	}
	public void method5() {
		System.out.println("5");
		//method4();
	}
}
