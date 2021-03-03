package day10forloop;

import java.util.Scanner;

public class Forloop04 {

	public static void main(String[] args) {
		
		/*
		 1) Ask user to enter beginning and ending values.
		    Type code to calculate the multiplication of the integers from the beginning to ending values
		 
		 2) That question can be asked like.
		    Type code to calculate the factorial of given number
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the starting integer value");
		int s = scan.nextInt();
		System.out.println("Enter the ending integer value");
		int e = scan.nextInt();
		
		int product =1;
		
		for (int i = s; i <=e; i++) {
			
			product = product * i;
		}
System.out.println(product);

scan.close();
	}

}
