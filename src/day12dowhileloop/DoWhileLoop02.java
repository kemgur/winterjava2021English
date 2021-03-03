package day12dowhileloop;

import java.util.Scanner;

public class DoWhileLoop02 {

	/*
	     Ask user to enter his/her first name
		 If the initial is lower case print a message like “Make the initial upper case”
		 If the initial is upper case print a message like “You did it right”
	 */
	public static void main(String[] args) {
		
		uperandlowercase();

		
	}

	public static void uperandlowercase() {
		
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter first name");

		 String fname="";
		 
		 do {
			
			 fname = scan.nextLine();
			 
			if(fname.charAt(0)>='A' && fname.charAt(0)<='Z') {
				System.out.println("You did it right");
			} else {
				System.out.println("Make the initial upper case");
			}
		 }while(!(fname.charAt(0)>='A' && fname.charAt(0)<='Z'));
		 
		 scan.close();
		 
	}
}
