package Assignment;

import java.util.Scanner;

public class SwapTwoNum {

	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Program to swap two numbers");
		System.out.println("Enter the first number:");
		int x=sc.nextInt();
		System.out.println("Enter the Second number:");
		int y=sc.nextInt();
		x=x^y;
		y=x^y;
		x=x^y;
		
		System.out.println("The swapped numbers are "+x+" and "+y);
		sc.close();

	}
	
}
