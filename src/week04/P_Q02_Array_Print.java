package week04;

import java.util.Arrays;
import java.util.Scanner;

public class P_Q02_Array_Print {

	
	/*
	Ask user to enter 5 names then assign them to an array
	eg:
	String names = "john Marry william Brian Richard";
	Then print the names and the number of the letters in each word 1 by 1 on the console

	*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter five names with space");
		String str = scan.nextLine();
		
		String names []= str.split(" ");
		System.out.println(Arrays.toString(names));
		
		for (int i = 0; i < names.length; i++) {
			
		System.out.println(names.clone()[i]+ " "+names[i].length());
			
		}
	
		scan.close();
	}

}
