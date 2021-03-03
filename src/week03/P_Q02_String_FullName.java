package week03;

import java.util.Scanner;

public class P_Q02_String_FullName {
	/*
	 * Ask user to enter their fullname as two words.
	 Convert their full name as following :
	 INPUT : JULIA ROBERTS  -->  OUTPUT :Julia ROBERTS
	 (Initial of the firstname should be uppercase and the rest of firstname should be
	 lowercase. All letters of lastname should be in uppercase)
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter your first and last name");
		String firstName = scan.nextLine();
		String lastName = scan.nextLine();
		
		String firstName1 = firstName.substring(0,1).toUpperCase();
		String firstName2 = firstName.substring(1).toLowerCase();
		
		String lastName2 = lastName.toUpperCase();
		
		System.out.println(firstName1 + firstName2 + " "+ lastName2);

		scan.close();
	}

}