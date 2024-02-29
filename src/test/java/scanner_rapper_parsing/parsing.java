package scanner_rapper_parsing;

public class parsing {

	public static void main(String[] args) {
		
		
		//parsing means converting a string representation of a value into corresponding primitive data type
		StringtoDouble();
		
	}
	
	public void StringtoInteger() {
		
		String price1= "400";
		String price2 = "250";
		
		
		int p1 = Integer.parseInt(price1);
		int p2 = Integer.parseInt(price2);
		
		System.out.println(p1+p2);
		
		
		
		
	}
public static void StringtoDouble() {
	
	String price1 = "2.55";
	String price2 = "3.55";
	
	double p1 = Double.parseDouble(price1);
	double p2 = Double.parseDouble(price2);
	
	System.out.println(p1+p2);
}



}
