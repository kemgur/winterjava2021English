package day04ififelseifthenelse;

import java.util.Scanner;

public class IfElseStatement01 {

	/*
	 Ask user to enter the values of length and width of a rectangle, then check if it is square or not.
	 */
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("enter width and length of the square");
		double width = scan.nextDouble();
		double length = scan.nextDouble();
		
		if(width<=0 || length<=0) {
			System.out.println("Width and length can not be negative or zero");
			
			
		}else {
			if(width==length) {
				System.out.println("Square");
					
			} else {
				System.out.println("rectangle");
			}
				
			
		}
		scan.close();
	} 
	
}
