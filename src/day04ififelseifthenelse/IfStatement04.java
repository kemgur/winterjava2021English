package day04ififelseifthenelse;

import java.util.Scanner;

public class IfStatement04 {

	/*
	 Ask user to enter the values of length and width of a rectangle, then check if it is square or not.
	 */
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("enter width and length of the square");
		double width = scan.nextDouble();
		double length = scan.nextDouble();
		
		if(width<=0 || length<=0) {
			System.out.println("Enter valid values");
			
		}
		if(width==length) {
			System.out.println("Square");
			
		}
		if(width!=length) {
			System.out.println("Rectangle");
			
		}
		
		//Note: Java comes from top to the bottom. It enters first staatement and
		//thirs statement at the same time which doesn't make sense. That's why we need if else!  
		scan.close();

	}

}
