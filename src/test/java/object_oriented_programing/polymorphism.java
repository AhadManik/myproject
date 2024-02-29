package object_oriented_programing;

public class polymorphism {
	
	//what is ploymorphism?
	
	//poly= means many
	//morphism=  means froms
	
	
	public static void main(String[] arg) {
		
		polymorphism reff = new polymorphism();
		reff.firsttype();
		reff.firsttype(10, 25);
		
	}
	
	
	public void firsttype() {
		System.out.println(90+10);
	}

	public void firsttype(int a, int b) {
		int c =a+b;
		System.out.println(c);
		
	}
}
