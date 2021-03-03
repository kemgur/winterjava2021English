package day03wrapperclassconcatenatelogicaloperators;

import java.util.Scanner;

public class ModulusOperator0101 {

	
	 /*
		  Ask user to enter 3 digit integer.
	 	Type a program to find the sum of the digits
	 	For example; 438 ==> 4+3+8 = 15
		  */
	 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 3 digit integer.");
		int num =scan.nextInt();
		
		int num1 = num%10;
		int num2 = (num/10)%10;
		int num3 = num/100;
		
		System.out.println(num1 + num2 + num3);
		

	}

}
