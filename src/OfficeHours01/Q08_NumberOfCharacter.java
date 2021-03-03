package OfficeHours01;

import java.util.Scanner;

public class Q08_NumberOfCharacter {

	
	/*SLIDE 87
	 * Ask user to enter a String and output will be 
	 * the number of the characters in the String.
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a String");
		String str = scan.nextLine();
		int numOfChars = str.length();
		
	   System.out.println("There are " + numOfChars + " characters in your String");
	   
   scan.close();
	}

}
