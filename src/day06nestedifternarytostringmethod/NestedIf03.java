package day06nestedifternarytostringmethod;

import java.util.Scanner;

public class NestedIf03 {

	
	/*
	 Type java code by using nested if statement,
	
	If a number is even then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
	“Perfect even number” otherwise, the output will be “Good even number.”
	
	If the number is odd then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
	“Perfect odd number” otherwise, the output will be “Good odd number.”
	 */
	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a password...");
		int num = scan.nextInt();
		
		if(num%2==0) {
			if(num%3==0) {
				System.out.println("Perfect even number" );
				
			}else {
				System.out.println("Good even number.");
			}
		}else if(num%2==1) {
			if(num%3==0) {
				System.out.println("“Perfect odd number” " );
				
			}else {
				System.out.println("“Good odd number.”");
			}
			
		}
		scan.close();
	}

}
