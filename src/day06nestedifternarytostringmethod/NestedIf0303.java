package day06nestedifternarytostringmethod;

import java.util.Scanner;

public class NestedIf0303 {

	
		
		/*
		 Type java code by using nested if statement,
		
		If a number is even then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
		“Perfect even number” otherwise, the output will be “Good even number.”
		
		If the number is odd then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
		“Perfect odd number” otherwise, the output will be “Good odd number.”
		 */
	
	public static void main(String[] args) {
		
		//Condition   Question Mark   Code will be excuted if the condition is true  Colon   Code will be excuted if the condition is false
		//a%2==0         ?  					"The integer is even"				   :      "The integer is even";
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a password...");
		int num = scan.nextInt();
		
		//1way
		String result = num%2==0 ? "The integer is even" : "The integer is odd";
		System.out.println(result);
		
		//2.way
		System.out.println(num%2==0 ?  "The integer is even":"The integer is odd");
		

		/*
		 ype java code by using ternary .Ask user to enter two integers
			Write a program to print the minimum one on the console.
		 */
		System.out.println("Enter 2 integer");
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int result2 = b>c ? c : b;
		System.out.println(result2);
		
		
		scan.close();
	}

}
