package day12dowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {

	/*
	     Ask user to enter password.
		 If the password has more than 6 characters print “It is okay”
		 Otherwise, print “Make the password longer than 6 characters” and ask user to enter a new password
	 */
	public static void main(String[] args) {
		checkPassword();


	}
public static void checkPassword() {
		
		Scanner scan = new Scanner(System.in);
			
		System.out.println(" Create your Password");
		
		String pass = "";
		
		do {
			pass = scan.nextLine();
			if(pass.length()>=6) {
				System.out.println(" It is Okay");
			}else {
				System.out.println(" Enter a new Pasword");
				
							
			}
					
			
		}while(!(pass.length()==6));
		
		scan.close();
		

}
}