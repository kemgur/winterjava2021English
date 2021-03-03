package week01;

import java.util.Scanner;

public class Q9_Bonus {

	 /*
    A company decided to give bonus of 5% to employee if his/her year of 
    service is more than 5 years.
    Ask user for their salary and year of service and print the net bonus amount.
	EXAMPLE:
	INPUT      :  4 year service
        Salary :  4000 
        
	OUTPUT :  0
    */
	public static void main(String[] args) {
		
		    Scanner scan = new Scanner(System.in);
	        System.out.println("Please enter a year and salary ");
	        int year = scan.nextInt();
	        int salary = scan.nextInt();
	        
	        if(year>5) {
	        	System.out.println("Your bonus is: " + salary*0.5 + "$");
	        	
	        }else {
	        	System.out.println("You need to work " +(5-year) + " more years to get bonus");
	        }
	
		
scan.close();
	}

}
