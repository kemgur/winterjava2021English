package OfficeHours04;

import java.util.Arrays;
import java.util.Scanner;

public class Office_3_SplitArray {

	/*
	 * Ask user to enter 5 names then assign them to an array
		 * 
		 * eg: String names = "john Marry william Brian Richard";
		 * Then print the names one by one on the console
		 * 
		 * Hint: String [] arrayNames = names.split(" ");
	 */
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter 5 names");
		String name = scan.nextLine();
		
		String str [] = name.split(" ");
		 for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
		

	}

}
