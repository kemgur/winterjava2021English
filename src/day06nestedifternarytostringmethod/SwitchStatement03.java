package day06nestedifternarytostringmethod;

import java.util.Scanner;

public class SwitchStatement03 {

	/*
	 Ask user ta enter one of the ‘U’, ‘S’, and ‘A’.
	Then type a program by using “switch statement” to print “United” for ‘U’
	“States” for ‘S’, and “America” for ‘A’
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		char ch = scan.next().toLowerCase().charAt(0);
		
		switch(ch){
		  case 'U':
		  case 'u':// seklinde de yazabiliriz	  
			  System.out.println("United");
			  break;
		  case 'S':
		  case 's':
			  System.out.println("States");
			  break;
		  case 'A':
		  case 'a':
			  System.out.println("Amerika");
			  break;	
		  default:
			  System.out.println("Enter a valid character");
			  break;
			
		}

		scan.close();
	}

}
