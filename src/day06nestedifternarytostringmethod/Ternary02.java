package day06nestedifternarytostringmethod;

import java.util.Scanner;

public class Ternary02 {

	/*
	 Type java code by using ternary.
     Write a program to print absolute value of an integer entered by user.
     
     Ternary kullanarak java kodunu yazın.
     Kullanıcı tarafından girilen bir tam sayının mutlak değerini yazdırmak için bir program yazın.
	 */
	public static void main(String[] args) {
		

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter an integer..");
		int a = scan.nextInt();
		
		int result1 = a<0 ? -1*a : a;
		System.out.println(result1);
		
		
		/*
		 Type java code by using using ternary.
         Take values of length and width of a rectangle from user and check if it is square or not.
         
		 ternary kullanarak java kodunu yazın.
         Kullanıcıdan bir dikdörtgenin uzunluk ve genişlik değerlerini alın ve kare olup olmadığını kontrol edin.
		 */


		Scanner scan1 = new Scanner (System.in);
		System.out.println("Enter an integer..");
		int length = scan.nextInt();
		int width = scan.nextInt();
		
		String result2 = length!=width ? "Rectangle" :"Square";
		System.out.println(result2);
		
		scan.close();
		scan1.close();
	}

}
