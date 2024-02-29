package abstraction;

public class abstraction_Excute_one extends abstractionone {

	public static void main(String[] args) {
		
		abstraction_Excute_one reff = new abstraction_Excute_one();
		reff.busstand();
		reff.ena();
		reff.hanif();
		reff.shohag();
		
		abstractionone refffff = new abstraction_Excute_one();
		refffff.ena();

	}

	@Override
	public void busstand() {
		System.out.println("shibgunj");
	}

	@Override
	public void shohag() {
		System.out.println("dhaka");
		
		
	}

	@Override
	public void ena() {
		System.out.println("sylhet");
		
	}

	@Override
	public void hanif() {
		System.out.println("saidpur");
		
	}

}
