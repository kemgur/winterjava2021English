package OfficeHours01;

import java.util.Scanner;

public class Q01_EqualInteger {

    /*
    Write a Java program that accepts two integer numbers and checks if they are equal.
EXAMPLE:
  INPUT      : 
first integer number: 1234
second integer number: 4321
  OUTPUT : 
These numbers are different.
*/
	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two integers");
		int a = scan.nextInt();
		int b = scan.nextInt();

		if(a==b) {
			System.out.println("These numbers are same.");
			
		}else {
			System.out.println("These numbers are different.");
		}
		scan.close();
	}

}
