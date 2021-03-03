package day10forloop;

import java.util.Scanner;

public class WhileLoop02 {

	
	/*
	 Type java code by using while loop,
	         Write a program that prompts the user to input a positive integer.
	         It should then print the multiplication table of that number.
	        
	         3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30
	 */
	public static void main(String[] args) {
		multiplicationTable1();
		multiplicationTable2();

	}

	public static void multiplicationTable1() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first integer");
		int n1 = scan.nextInt();
		System.out.println("Enter second integer");
		int n2 = scan.nextInt();
		
		System.out.println(n1 + "x" + n2 + "=" + n1*n2++);
		System.out.println(n1 + "x" + n2 + "=" + n1*n2++);
		System.out.println(n1 + "x" + n2 + "=" + n1*n2++);
		System.out.println(n1 + "x" + n2 + "=" + n1*n2++);
		System.out.println(n1 + "x" + n2 + "=" + n1*n2++);
		System.out.println(n1 + "x" + n2 + "=" + n1*n2++);
		System.out.println(n1 + "x" + n2 + "=" + n1*n2++);
		System.out.println(n1 + "x" + n2 + "=" + n1*n2++);
		System.out.println(n1 + "x" + n2 + "=" + n1*n2++);
		System.out.println(n1 + "x" + n2 + "=" + n1*n2++);
		
	}
	
public static void multiplicationTable2() {
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter first integer");
		double d = scan1.nextInt();
	
		
		double i =1;
		
		while(i<=10) {
			
			System.out.println(d + "x" + i +"=" + (d*i));
			i++;
		}
		scan1.close();
		
	
}
}