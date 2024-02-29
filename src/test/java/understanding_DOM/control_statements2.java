package understanding_DOM;

public class control_statements2 {

	public static void main(String[] args) {
	
		//There are 3 types of control statements in java

		//1. Selection or Conditional Statement
		//Examples - if, if else, if else if(in contront statement ), nested if, switch

		//2. Iteration or Looping Statement
		//Example - while, for, for each (advanced for loop), do while

		//3. Jump Statement
		//Example - break, continue, return
		
		
		//nested if,- means somthing inside somthing(cangroo baby)
		
		//if(condition) {
				
		//forloop();
		
		whileLoop();
	}
	//if(condition)
		
		{if(2==2) {
			if(1==1) {
				System.out.println("this inner if block'ligic is correct");
			}
			System.out.println("this is the body of the outer if block");
			
			
			}
		}
	
	
	public static void nastedif(){
		if(2==2) {
			if(1!=1) {
				System.out.println("this inner if block'ligic is correct");
			}
			System.out.println("this is the body of the outer if block");
			
			}
		
	}
	
	public static void switch_statements() {
		
		//switch statements is a multi-way branch statements
		//switch statements defines multiple paths of excuation of a program
		
		
		//from github
	}
		
	
	public static void forloop() {
		
		//if the same block exceute multiple number of times as per as logic
		
		//for(initialization : condition : increment/decrement) {
		// body
		// }
		
		
		
		//logic sequencing of for loop
		
		//step1- initializing
		//step-2 condition
		//step-3 ture then go inside
		//step-4 increment/decrement
		//step-5- check condition 
		
		//for(int i=1; i<=5; i++ ) {
			//System.out.println(i);
			
			
			
			//for (int i=2; i<=20; i=i+2) {                     //out put 2.4...20
				//System.out.println(2*i+" ");
		int sum = 0;
		for(int i=1 ; i<=50 ; i++) {
		System.out.print(i + " "); //1 2
		sum = sum + i; // 0 + 1 = 1, sum = sum + i


		}
		System.out.println();
		System.out.println("the sum at this place is : " + sum);
		}
		
	
	
	
	public static void whileLoop() {
		
		//when the knowledge of the end point is not clear
		//when somthing tends to infinity
		//we use while loop
		//cnn.com is a news website
		// today the total no of links
		
		//while(condition) {
			
			//body
		//}
		
		
//		int i=1;
//		while(i<6) {
//			System.out.println(i);
//			i=i+1;
//		}
		
//		String S1="world";
//		while(S1.equals("world")) {
//			System.out.println(S1);
//		}
//		
		//100 natural number 
		
//		int j=1;
//		while (j<=100) {
//			System.out.println(j);
//			 j++;
//					 
//		}
	
		
	
		//100 in reverse
		
//		int k=100;
//		while (k>=1) {
//			System.out.println(k);
//			k--;
//		}
				
		int c=1;
		while (c<=20) {
			System.out.println(c*5+ "");
			c++;
			
		}
		
		
		
		
		
	
	}
	
//	public static void forloopinsidewhileloop() {
//		
//		int d=1;
//				while (d<10) {
//				//ture
//					
//					for(int e=)
//				}
//		
		
	//}
		
		
	
	public static void nestedforloop() {
		
	//for one excuation of outer loop -inner excuation compltely
		
		//create *****
		//		 *****
		//       *****
		//       *****
		//       *****
		
      for (int h=1; h<=5; h++) {
    	  
    	  
    	  
    	  for (int =1; )
    		  
    		  //outer for loop always colm
    		  //inner for loop always row
      }
		
	
		
		}
}
		

	


