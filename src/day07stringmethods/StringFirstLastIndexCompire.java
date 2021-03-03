package day07stringmethods;

import java.util.Scanner;

public class StringFirstLastIndexCompire {

	public static void main(String[] args) {
		/*
		 Ask user to enter a String,
		 if the first and the last character of the String are same
		 print "Wooow" 
		 otherwise, print "Hmmmm" on the console.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String...");
		String s =scan.nextLine();
		// length()-1 everytime gives you the last index.
		String last = s.substring(s.length()-1);
		String first = s.substring(0,1);
		
		if(last.equals(first)) {
			System.out.println("Wooow");
			
		}else {
			System.out.println("Hmmmm");
		}
		
scan.close();
	}

}
