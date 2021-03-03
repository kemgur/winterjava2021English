package day11whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {

	/*
	 Type java code by using while loop,
     Write a program that prompts the user to input an integer.
     It should then find sum of the digits of that number.
     123 ==> 1+2+3 = 6
     
     While döngüsünü kullanarak java kodunu yazın,
         Kullanıcıdan bir tam sayı girmesini isteyen bir program yazın.
         Daha sonra bu sayının rakamlarının toplamını bulmalıdır.
         123 ==> 1 + 2 + 3 = 6
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a n integer number");
		int i = scan.nextInt();
		
		int i1 = i%10;
		int i2 = (i/10)%10;
		int i3 = i/100;
		
		int sum = (i1 + i2 + i3);
		System.out.println(sum);
		
		scan.close();
	}
	
	//2.Way
	public static void sumOfDigits() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a n integer number");
		int number = input.nextInt();
		
		int sum = 0;
		
		while(number!=0) {
			sum = sum +number%10;
			
			number = number/10;
		}
		System.out.println(sum);
	}
	
	
	
	
	
	
}
