package ba_day01_practice;

import java.util.Scanner;

public class Question03 {

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
		System.out.println("Enter two numbers");
		double i1 = scan.nextDouble();
		double i2 = scan.nextDouble();
		
		double sum = i1 +i2;
		double mult = i1 *i2;
		double sub = i1 -i2;
		double div = i1/i2;
		
		System.out.println("The sum of two numbers is : " + sum);
		System.out.println("The division of two numbers is : " + div);
		System.out.println("The product of two numbers is : " + mult);
		System.out.println("The difference of two numbers is : " + sub);

		scan.close();
		
		//2.yol
/*
		System.out.println("Please enter two numbers:");
		double a=scan.nextDouble();
		double b= scan.nextDouble();
		System.out.println("Please enter a operator:");
		int op=scan.nextInt();
		switch(op) {
		case(1):
			System.out.println(a+b);
		break;
		case(2):
			System.out.println(a-b);
		break;
		case(3):
			System.out.println(a*b);
		break;
		case(4):
			System.out.println(a/b);
		break;
		default:
			System.out.println("Please enter valid number!!!");
		}
​
​*/
		
		int num1 = 125;
		int num2 = 25;
		
	System.out.println("The sum of two numbers is :" +(num1+num2)+
"\n"+"The difference of two numbers is :" +(num1-num2)+ 
"\n"+"The product of two numbers is :" +(num1*num2)+
"\n"+"The division of two numbers is :" +(num1/num2));

	}

}
