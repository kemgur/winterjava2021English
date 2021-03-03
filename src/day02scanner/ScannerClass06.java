package day02scanner;

import java.util.Scanner;

public class ScannerClass06 {

	/*
	    Ask user to enter his/her full name
	 	Then ask user to enter his/her spouse’s first name
	 	Then ask user to enter his/her adress
	 	Then print them all on the console.
	 
	 */
	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your fullname");
		String fullName = scan.nextLine();
		
		System.out.println("Enter your spouse's first name");
		String spouseName = scan.next();
		
		scan.nextLine();//After using nextLine(), if you use any other method
		//type "scan.nextLine();" once
		
		
		System.out.println("Enter your adres");
		String adres = scan.nextLine();
		
		System.out.println(fullName +" "+ spouseName +" "+adres);
		
		
		scan.close();
	}

}
