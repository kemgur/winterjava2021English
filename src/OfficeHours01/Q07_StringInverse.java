package OfficeHours01;

import java.util.Scanner;

public class Q07_StringInverse {

	   /*
    Ask user to enter a word which has 4 letters and output will be inverse of the word.
    For example; if user enters “MARK” output will be “KRAM”
    */
	
	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a 4 letters of String");
		String s = scan.next();
		
		String inv = "";
		
		for(int i=s.length()-1; i>=0;i--) {
			inv = inv + s.charAt(i);	
		}
		System.out.println(inv);//kema ->amek
		
		//2.yol
		
		StringBuilder stb = new StringBuilder(s);
		System.out.println(stb.reverse());
		
		scan.close();
	}

}
