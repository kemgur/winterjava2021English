package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("enter a character");
		int ch =scan.next().toLowerCase().charAt(0);
		
		
		if(ch>='a' && ch<='z') {
			System.out.println(ch + " is an alphabet");
			
		}else {
			System.out.println(ch + " is not an alphabet");
		}
		
	
	scan.close();
	}

}
