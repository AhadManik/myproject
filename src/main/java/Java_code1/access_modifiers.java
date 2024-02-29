package Java_code1;

public class access_modifiers {
// class can be public and default not other two 
	public static void main(String[] args) {
		
		// public- accessible for all(same package or class)
		//protected-accessable in the same package and subclasses(same classes in package)
		//private- only within the same class( into the class)
		//default-only within the same package

		accessmodifier_public_validation.test1(); //call from other class and package to run here as public
	}
	

}
