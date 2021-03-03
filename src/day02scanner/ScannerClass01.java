package day02scanner;

import java.util.Scanner;

public class ScannerClass01 {

	/*
	 1) Type==> Scanner scan = new Scanner(System.in);
	 "new" keyword is used to create an object
	 "System.in" mean , you are getting data from outside into your code.
	 (System.in ", verileri dışarıdan kodunuza alıyorsunuz demektir.)
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter the first integer");//Lütfen ilk tam sayıyı girin
		
		int num1 = scan.nextInt();
		
		System.out.println("Please enter the second integer");
		int num2 = scan.nextInt();
		
		System.out.println("Sum: " + num1 + num2);
		System.out.println("Product: " + num1 * num2);
		System.out.println("Difference: " + (num1 - num2));
		
		scan.close();
		
	}

}
