package understanding_DOM;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		for (int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print("*");
				
				
			}
			System.out.println();
		}
	
		for (int i=1; i<=5; i++) {
			for(int j=4; j<=i; j++) {
				System.out.print(" ");
				
				
			}
			for (int k=5; k>=5; k++)
			System.out.println("*");
		}
	
	}
	public static void do_while_loop ()
	{
		int i =0;
		do {
			//body
			//first the do body will be excuted
			//then it will check for the while condition
			//if the while condition 
			//
			i++;
			System.out.println(i);
		}
		
		//while(true != false);
		
		while (i<=5);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

				
}
