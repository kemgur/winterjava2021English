package OfficeHours02;

import java.util.Scanner;

public class Question_02 {

	/*
     * Ask user Name, Surname and credit card numbers than convert it to special
     * form
     *
     * (Check credit card number, if there isn’t 16 digit print
     * “Invalid credit card number”
     *
     * Input : John White 1234234534561478
     * Output : Name : J*** W****
     *          CCN  : **** **** **** 1478
     *  (Initials for name and surname should be uppercase)
     */
	
	public static void main(String[] args) {
		

        Scanner scan=new Scanner(System.in);
        
        System.out.println("Please enter your first name");
        String firstName = scan.next();
        
        System.out.println("Please enter your surname");
        String surname = scan.next();
        
        System.out.println("Please enter your CCN");
        String ccn = scan.next();
        
        if(ccn.length()!=16) {
            System.out.println("Invalid credit card number");
        }else {
            firstName=firstName.substring(0,1).toUpperCase() + firstName.substring(1).replaceAll("\\w", "*");
            surname= surname.substring(0,1).toUpperCase() + surname.substring(1).replaceAll("\\w", "*");
            ccn= "**** **** ****" + ccn.substring(12);
            
            System.out.println("Name:" + firstName + " " + surname);
            System.out.println("CCN :" + ccn);
            
            scan.close();
            
        }
    }
}
