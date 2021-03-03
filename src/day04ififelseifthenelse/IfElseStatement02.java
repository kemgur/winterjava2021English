package day04ififelseifthenelse;

import java.util.Scanner;

public class IfElseStatement02 {

	/*
	 Ask user to enter a character, then check whether the character is alphabet or not
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a character");
		char ch = scan.next().toLowerCase().charAt(0);
		
		if(ch>='a' && ch<='z') {
			System.out.println("it is from alphabet");
			
		}else {
			System.out.println("it is not from alphabet");
		}
		

		scan.close();
	}

}
