package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement05 {

	
		/*
		 * Type java code by using if-else if() statement.
		A school has following rules for grading system:
		1. Below 50 - D     2. 50 to 59 - C       3. 60 to 79 - B.     4. From 80 to 100 - A
		Ask user to enter marks and print the corresponding grade.
		 */
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Please enter your grade: ");
			int a = scan.nextInt();
			
			if(a<50 && a>=0) {
				System.out.println("your grade is "+a+" and it means D");
			}else if(a>=50 &&a<=59) {
				System.out.println("your grade is "+a+" and it means  C");
			}else if(a>=60 &&a<=79) {
				System.out.println("your grade is "+a+" and it means  B");
			}else if(a>=80 &&a<=100) {
				System.out.println("your grade is "+a+" and it means  A");
			}else if(a<0 || a>100){
				System.out.println("Your grade cannot be less then 0 or more than 100");
			}
			scan.close();
		}
	}