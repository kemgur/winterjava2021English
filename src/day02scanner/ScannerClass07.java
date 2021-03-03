package day02scanner;

import java.util.Scanner;

public class ScannerClass07 {

	/*
	 User will enter his/her first name you will print the first caracter on the console
	  User will enter his/her last name you will print the first caracter on the console
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first name");
		char firstNameInitial = scan.next().charAt(0);
		
		System.out.println("Enter your last name");
		char lastNameInitial = scan.next().charAt(0);
		
		System.out.println("initial of the first name is " + firstNameInitial);
		System.out.println("initial of the first name is " + lastNameInitial);
		
		/*
		 If you use mathematical operation for chars, java uses the ASCII values of chars.
		 If you want to print chars on the characters not ASCII values you have 2 options;
		 1) Use String together with chars
		 2) Use System.out.println();
		 
		 
		 */
		
		//1.yol
		System.out.println(" "+ firstNameInitial + lastNameInitial);
		
		//2.yol
		System.out.println(firstNameInitial);
		System.out.println(lastNameInitial);
		
		scan.close();
		
		
		
		
		
		
		
		

	}

}
