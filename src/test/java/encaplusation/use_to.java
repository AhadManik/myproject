package encaplusation;

public class use_to {

	public static void main(String[] args) {
		
		use_to use = new use_to();
		use.display();
		
	}

	
	void display() {
		
		System.out.println("hello-world");
	}
	
	void show() {
		
		this.display();
		display();
	}
}
