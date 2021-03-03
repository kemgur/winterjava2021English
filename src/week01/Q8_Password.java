package week01;

import java.util.Scanner;

public class Q8_Password {

	/*
	 Type java code by using if-else statement,
     if the password is “JavaLearner”, output will be “The password is true”.
     Otherwise, output will be “The password is false”.
	 */
	public static void main(String[] args) {
		

		 Scanner scan = new Scanner(System.in);
	        System.out.println("Please enter a password ");
	        String password = scan.nextLine();
	        
	        if(password.equals("JavaLearner")) {
	        	System.out.println("The password is true");
	        	
	        }else {
	        	System.out.println("The password is false");
	        }
	        	

	        scan.close();
	}

}
