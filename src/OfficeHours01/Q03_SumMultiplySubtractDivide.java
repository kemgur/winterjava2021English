package OfficeHours01;

import java.util.Scanner;

public class Q03_SumMultiplySubtractDivide {

	 /*
    Write a Java program to print the sum (addition), multiply, subtract, divide two numbers.
EXAMPLE:
INPUT      : 
first number: 125
second number: 25
OUTPUT:
The sum of two numbers is : 150
The difference of two numbers is : 100
The product of two numbers is : 3125
The division of two numbers is : 5.0
    */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 integers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int sum = a+b;
		int mult = a*b;
		int sub = a-b;
		int div = a/b;
		
		System.out.println("The sum of two numbers is : "+ sum);
		System.out.println("The difference of two numbers is :"+ sub);
		System.out.println("The product of two numbers is : "+ mult);
		System.out.println("The division of two numbers is :"+ div);

		scan.close();
	}

}
