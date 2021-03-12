package OfficeHours05;

import java.util.Scanner;

public class Advance_2_CamelCase {

	/*
	 Write a return method that accepts a sentence as parameter
     * Then converts it to Camelcase
     * (without any space or specialCharacter)
     *
     * Input : I am writing code easily
     * Output : IAmWritingCodeEasilyItIsGreat
     *
	 */
	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str = scan.nextLine();
		
		String arr []=str.split(" ");
		String Output = "";
		
		for(int i =0; i <arr.length; i++) {
			Output += (arr[i].substring(0,1).toUpperCase() + arr[i].substring(1).toLowerCase());
			
			
		}
		System.out.println(Output);
		scan.close();
	}

}
