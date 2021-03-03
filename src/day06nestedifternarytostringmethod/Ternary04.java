package day06nestedifternarytostringmethod;

import java.util.Scanner;

public class Ternary04 {

	/*
	 Ask user to enter an integer
	 if the integer is negative return "This integer is negative"
	 if the integer is pozitive return its square
	 use ternary
	 */
	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer... ");
		
		int a = scan.nextInt();
		System.out.println(a<0 ? "This integer is negative" : a*a);
	
		scan.close();
	}

}
