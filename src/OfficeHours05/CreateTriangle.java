package OfficeHours05;

import java.util.Scanner;

public class CreateTriangle {

	public static void main(String[] args) {
		/*
		 *  Create Right Triangle pattern 
		 
	 * Example: Enter a number 
			Input: 5
			
			 * 
			 * * 
			 * * * 
			 * * * * 
			 * * * * *
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		
		rightTriangle(n);
		
		scan.close();
	}

	private static void rightTriangle(int n) {
		//Gives rows
		for(int i=0;i<=n;i++) {
			//Gives *
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}