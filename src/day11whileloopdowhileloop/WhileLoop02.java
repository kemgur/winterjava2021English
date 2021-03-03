package day11whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop02 {

	/*
	     Type java code by using while loop,
         Write a program to count the factors of an integer which is entered by user.
         Factors of 12 = 1, 2, 3, 4, 6, 12
         
         While döngüsünü kullanarak java kodunu yazın,
         Kullanıcı tarafından girilen bir tamsayının faktörlerini saymak için bir program yazın.
         12'nin faktörleri = 1, 2, 3, 4, 6, 12
	 */
	public static void main(String[] args) {
		countFactors();
		

	}

	
	public static void countFactors () {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer number");
		int number = input.nextInt();
		
		if(number<0) {
			number = -number;
		}
		int i=1;
		while(i<=number) {
			
			if(number%i==0) {
				System.out.print(i + " ");
			}
			i++;
			
			
		}
		input.close();
	}
}
