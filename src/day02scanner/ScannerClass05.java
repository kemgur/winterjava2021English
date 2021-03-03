package day02scanner;

import java.util.Scanner;

public class ScannerClass05 {

	/*
	 Type a program which asks user to enter his/her first name and last name, 
then print it on the console.


Kullanıcıdan adını ve soyadını girmesini isteyen bir program yazın,
daha sonra konsolda yazdırın.
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your firt name");
		String name = scan.nextLine();
		System.out.println("Enter your last name");
		String lastName = scan.nextLine();
		
		System.out.println(name +" "+lastName);
		
		//if you wanna get a String data from user, use nextLine() method.
		// nextLine()method gets full String which user entered	
		//NextLine () yöntemi, kullanıcının girdiği tam String değerini alır
		
	
		System.out.println("Enter your kid's first name");
		String kidFirstName = scan.next();
		
		System.out.println(kidFirstName);
		
		scan.close();
	}

}
