package week01;

import java.util.Scanner;

public class Q10_Concatenation {

	
	/*
	 Write a Java program to create a string in the form Str1 + Str2 + Str1 from two strings.
    EXAMPLE:
	 INPUT      : Str1 = Refrigerator
                  Str2 = Empty
    OUTPUT :    EmptyRefrigaratorEmpty
	 */
	public static void main(String[] args) {
		

		  Scanner scan = new Scanner(System.in);
	        System.out.println("Please enter three strings");
	        String str1 = scan.nextLine();
	        String str2 = scan.nextLine();
	        String str3 = scan.nextLine();
	        
	        System.out.println(str1 +str2 +str3);
	        
	        scan.close();
	        
	       
	}

}
