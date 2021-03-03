package OfficeHours01;

import java.util.Scanner;

public class Q05_NameLastnameSsn {

	/*
	 Ask user to enter his/her first name, last name and Social Security Number.
	 Then type a program which makes
	 a) initials of the first name and the last name in uppercase,
	 other characters will be in lowercase.
	 b) all characters except last 4 characters of the Social Security Number “ * ”.
	 */
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("enter your first name");
		String firstName = scan.nextLine();
		
		System.out.println("enter your last name");
		String lastName = scan.nextLine();
		
		System.out.println("enter your Social Security Number");
		String socialSecurityNumber = scan.next();
		
		//  a) initials of the first name and the last name in uppercase, other characters will be in lowercase.
		
		
		firstName= firstName.substring(0, 1).toUpperCase()+firstName.substring(1).toLowerCase();
		System.out.println(firstName);
		lastName=  lastName.substring(0, 1).toUpperCase()+lastName.substring(1).toLowerCase();
		System.out.println(lastName);
		
		
		//  b) all characters except last 4 characters of the Social Security Number
		socialSecurityNumber= socialSecurityNumber.substring(0, 7).replaceAll("\\d", "*").
				                     concat(socialSecurityNumber.substring(socialSecurityNumber.length()-4));
		System.out.println(socialSecurityNumber);

		scan.close();
	}

}
