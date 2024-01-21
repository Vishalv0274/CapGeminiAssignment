package Assignment;

import java.util.Scanner;
public class Smallest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first no:");
		int a=sc.nextInt();
		
		System.out.println("Enter first no:");
		int b=sc.nextInt();
		
		System.out.println("Enter first no:");
		int c=sc.nextInt();
		
		if(a==b && a==c) 
			System.out.println("All numbers are equal");
				
		else {
		int temp=a<b?a:b;
		int small=c<temp?c:temp;
		
		System.out.println(small+" is the smallest");
		
		}
		
		sc.close();
	}
}
	
		
		

