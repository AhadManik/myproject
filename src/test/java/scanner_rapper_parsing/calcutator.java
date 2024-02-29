package scanner_rapper_parsing;

import java.util.Scanner;

public class calcutator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("give two number:");
		
		int first = scan.nextInt();
		
		System.out.println("give again two number");
		
		int second = scan.nextInt();
		
		
		System.out.println("what u want to do? +-*/");
		String option =scan.next();
		
		
		int result;
		
		switch(option) {
		case "+" : result = first + second;
		System.out.println("add is:"+ result);
		break;
		
		case "-" : result = first - second;
		System.out.println("sub is:"+ result);
		break;
		
		case "*" : result = first * second;
		System.out.println("mul is:"+ result);
		break;
		
		
		case "/" : result = first / second;
		System.out.println("div is:"+ result);
		break;
		
		
		default: System.out.println("invalid");
		break;
		
		
		}
		

	}

}
