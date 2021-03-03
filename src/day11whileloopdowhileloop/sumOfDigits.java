package day11whileloopdowhileloop;

import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {
		sumOfDigits();

	}

public static void sumOfDigits() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a n integer number");
		int number = input.nextInt();
		
		int sum = 0;
		
		if(number<0) {
			number = number*(-1);
			
		}
		while(number!=0) {
			sum = sum +number%10;
			
			number = number/10;
		}
		System.out.println(sum);
	input.close();
}
}