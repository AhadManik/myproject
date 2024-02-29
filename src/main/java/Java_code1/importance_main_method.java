package Java_code1;

public class importance_main_method {

	public static void main(String[] args) {
		

		//publc is for excess modifire
		//main mathod is the center of excuation of java program
		// public first or static first program will work
		
		//main is method in java
		//every mathod in java has a retern type which is void.
		//main is the name of the method(cannot change the main)
		//mathod has bolies which is representaed in  bracket {   }
		//string [] , square braket represents dimension, so technically this is 1-d and it is array
		//args is arguments
		//[] can replace with three dots ... program will work.
		
		
	System.out.println(1+2);
	test(); // test is called from test method from outside to give output, other wise it will run
	//but no output will come, both will run
		
	}

	public static void test() {
	System.out.println(30+10);
	}
}
