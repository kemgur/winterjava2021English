package day10forloop;

import java.util.Scanner;

public class FoorloopTerstenYazdirma {

	public static void main(String[] args) {
		/*
		 1)Ask user to enter a String
		 	 2)Print the String reverse
		 For example; Germany ===> ynamreG
		 */
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string to see it in reverse order");
		String str =scan.nextLine();
		
		for (int i = str.length()-1; i>=0  ; i--) {
			System.out.print(str.charAt(i));
			
		}
		scan.close();
	}

}
