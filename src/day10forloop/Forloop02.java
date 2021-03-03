package day10forloop;

import java.util.Scanner;

public class Forloop02 {

	/*
	 1)Ask user to enter a String
	 2)Check the String if it is “Palindrome” or not
	 3) For Example: aba and aba
	 */
	public static void main(String[] args) {
		
		/*
		 Reverse the String
		 Put the reversed String into a container
		 Compare the String with the reserved String.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to see if it is palindrome or not");
		String str = scan.nextLine();
		
		//1.Way
		  String reverse = "";
		    for(int i = str.length()-1 ; i >=0 ; i--){
		    	reverse= reverse + str.charAt(i);
		    	System.out.println(reverse);
		    }
		    System.out.println(str.contains(reverse));
		    scan.close();
		    
		    //2.Way
		    String revStr = "";
		    for(int i1 =str.length()-1; i1 >=0; i1--) {
		      revStr = revStr + str.substring(i1,i1+1);
		    }
		    if(str.equals(revStr)) {//if you use equalsIgnoreCase 
		    	//the difference between upper and lower case letters disappears.
		    	System.out.println(str + " is palindrome");
		    	
		    }else {
		    	System.out.println(str + " is not palindrome" );
		    }
		}
		
	}
	

