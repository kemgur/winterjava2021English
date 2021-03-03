package OfficeHours01;

import java.util.Scanner;

public class Q06_NestedIfStatement {


	 /*
	  Type java code by using nested if statement,
If a number is even then check if it is divisible by 3 or not.
 If it is divisible by 3 the output will be
“Perfect even number” otherwise, the output will be “Good even number.”
If the number is odd then check if it is divisible by 3 or not. 
If it is divisible by 3 the output will be
“Perfect odd number” otherwise, the output will be “Good odd number.”
	 */

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a integer");
		int i = scan.nextInt();
		
		if(i%2==0) {
			if(i%3==0) {
				System.out.println("Perfect even number");
				
			}else {
				System.out.println("Good even number");
			}
			
		}else if(i%2==1) {
			if(i%3==0) {
				System.out.println("Perfect odd number");
				
			}else {
				System.out.println("Good odd number");
			}
			
		}
		
scan.close();
	}

}
