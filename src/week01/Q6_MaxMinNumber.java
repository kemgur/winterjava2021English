package week01;

import java.util.Scanner;

public class Q6_MaxMinNumber {

	/*
    ask user to enter 3 numbers then 
	1-find the max number
	2-find the minumum number
EXAMPLE:
INPUT      :      Num1: 23
                  Num2: 29
                  Num3: 55 
                 
OUTPUT  :         Max Number is : 55
                  Min Number is : 23
                  
    */
	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("enter 3 numbers then");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("Max Number is : " + num1);
			
		}else if(num2>num3) {
			System.out.println("Max Number is : " + num2);
			
		}else {
			System.out.println("Max Number is : " + num3);
		}
		
		if(num1<num2 && num1<num3) {
			System.out.println("Min Number is : " + num1);
			
		}else if(num2<num3) {
			System.out.println("Min Number is : " + num2);
			
		}else {
			System.out.println("Min Number is : " + num3);
		}
		
		scan.close();
	}

}
