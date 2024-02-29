package Java_code1;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class control_statement {

	
	
	// 3 types of control statement
	// 1. selection or conditional statement- if,if else,it else if,switch
	
	//2. Iteration or looping - while,for,for each(advance for loop),do while
	//3.// jump - break,continue, return
	
	 
		public static void main(String[] args) {
			
			
	}
		
		public static void learningifstatement( ) {
			//syntax
			//application of the syntax
			// sense of the logic
			
			if (2<3) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
			
			
			
		}
		public static void smallest() {
		int a=10;
		int b=20;
		int c= 30;
		int d= 70;
		
		if(a<b && a<c && a<d) {
			System.out.println("a is less:"+ a );
			
		}
		
			else if (b<a && b<c && b<d) {
				System.out.println("b is less");
			} else if (c<a && c<b && c<d) {
				System.out.println("c is less");
			}
				
		}
		
		System.out.println("a is less:"+ b );
}

		
		public static void leapyear() {
			int year1=1996;
			int year2=2002;
			int year3=2004;
			
			
			//divided by 4
			if (year1% 4== 0) {
				System.out.println("leapyear");
			}
		}
		
		public static void checkingstring() {
			String s1= "hi";
			String s2= "hello";
			
			if (s1 != s2) {
				System.out.println();
			}
		}
		
		
		
		public static void main1(String[] args) {
		
			int a=10;
			int b=10;
			int c=12;
			
			if (a=b)
			{System.out.println("yes");
				
		}
		
		}
		
		
		
		
		
		
		
		
		

