package Java_code1;

public class pattren_star_program {

	public static void main(String[] args) {
		
		//star2();
		//star1();
		//star3();
		number_pattern();
	}

	
	public static void star1() {
		
		for (int i=1 ; i<=5 ; i++) {
			for(int j=1 ; j<=i ; j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
	}
	public static void star2() {
		
	
	for(int i=1 ; i<=5 ; i++) {

		for(int j=5 ; j>=i ; j--) {
			System.out.print("* "); 

		}

		System.out.println();
	}
	}
	
	public static void star3() {
		
		for (int i=1 ; i<=5 ; i++) {
			for(int j=1 ; j<=i ; j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
		for(int i=1 ; i<=5 ; i++) {

			for(int j=4 ; j>=i ; j--) {
				System.out.print("* "); 

			}
			System.out.println();
		}
	}
	
	public static void number_pattern() {
		for (int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);// change it to j then the output will be 1 12 123 1234
				
			}
			System.out.println();
		}
	}
}
























