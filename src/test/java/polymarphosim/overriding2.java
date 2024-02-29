package polymarphosim;

public class overriding2 extends overriding1 {

	public static void main(String[] args) {
		
		overriding2 over = new overriding2();
		over.piramid();
		over.tuten();
		
		overriding1 overr = new overriding1();
		overr.piramid();
		overr.tuten();
		
	}
	
	public void piramid() {
		
		System.out.println("agun");
		
	}
    
	public void tuten() {
		System.out.println("pani");
	
    }
}
