package encaplusation;

public class student {

	//1. decleare the instance variables
	
	private String name;
	private int age;
	private double hight;
	
	//2. write a getter and setter method which are associated with the instance variales
	
	public void setData(String name,int age,double hight) {
		
		this.name = name;
		this.age = age;
		this.hight = hight;
		
		
		
	}
	
	public String getNameOfStudent() {
		return name;
	}
	
	
	public int getAgeStudent() {
		return age;
		
	}
	public double getHighetStudent() {
		
		return hight;
		
	}
}
