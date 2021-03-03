package week03;

import java.util.Scanner;

public class P_Q03_Method {

	public static void main(String[] args) {
		
		isEven();
		
		/*
		 	Write a method named isEven that accepts an integer argument.
	       The method should return true if the argument is even, or false otherwise.
		 */
	}
	
	public static void isEven() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a integer");
		int i =scan.nextInt();
		
		if(i%2==0) {
			System.out.println("True");
		}else {
			System.out.println("False");
			
			scan.close();
		}

	}

}
