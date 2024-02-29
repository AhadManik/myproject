package practice;

public class callingMethod {

	
	
	
	 int roll;
	 double mark;
	 
	public static void main(String[] args) {
		
		callingMethod run = new callingMethod();
		run.agun();
		run.pani();
		run.roll = 10;
		run.mark= 2.2;
		mati();
		
		yoyo run2 = new yoyo();
		run2.akash();
		run2.batas();
		
	}

	
	public void agun() {
		System.out.println("agunnnnnn");
	}
	
	
	public void pani() {
		
		System.out.println("paniiiiiiiiiii");
	}
	
	
	public static void mati() {
		System.out.println("matiiiiiiiiiiiiiii");
	}
}

	class yoyo{
		
		
		public void akash() {
			System.out.println("akashhhhhhhhhhhh");
		}
		
		
	public void batas() {
		System.out.println("batassssssssss");
		
	}
		
		
	}