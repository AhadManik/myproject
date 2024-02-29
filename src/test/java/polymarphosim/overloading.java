package polymarphosim;

public class overloading {

	public static void main(String[] args) {
		
		overloading over = new overloading();
		over.aladin();
		over.aladin(50);
		over.aladin(12, 56);
		
		main(2, "aaaaaaaaa");// main method overloading 
	}
	
	public void aladin() {
		System.out.println("aladin");
		
	}
	
	public void aladin(int a) {
		//int d = a;
		System.out.println(a);
		
	}
	
	public void aladin(int b, int c) {
		
		int e = b+c;
		System.out.println(e);
		
	}
	public static void main(int a, String s1) {
		System.out.println("ajob");
	}

}
