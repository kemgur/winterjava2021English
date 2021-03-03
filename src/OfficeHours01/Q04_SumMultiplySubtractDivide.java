package OfficeHours01;

import java.util.Scanner;

public class Q04_SumMultiplySubtractDivide {

	/*
    Ask user to enter two numbers
    Show them a menu of operation signs and ask them to choose one.
    "Addition: 1 , Subtraction : 2 , Multiplication : 3, Division : 4
    Print the result on the console
    EXAMPLE:
       INPUT:    Num1 : 50
                 Num2 : 5
Which operation do you prefer?
1 for Addition
2 for Subtraction
3 for Multiplication
4 for Division
select 1
Result= 55
    */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two integer");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
			System.out.println("Which operation do you prefer?\r\n"
				+ "1 for Addition\r\n"
				+ "2 for Subtraction\r\n"
				+ "3 for Multiplication\r\n"
				+ "4 for Division");
			
			int opt = scan.nextInt();
			
			switch(opt) {
			case 1:
				System.out.println(a+b);
				break;
			case 2:
				System.out.println(a-b);
				break;
			case 3:
				System.out.println(a*b);
				break;
			case 4:
				System.out.println(a/b);
				break;
			default:
				System.out.println("Enter a valid number");
				break;
				
			}
			scan.close();
			
			//2.yol
			/*
			 Scanner scan = new Scanner(System.in);
		
		System.out.println("enter two numbers");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
				
		System.out.println("select one operation:" + "1:Adition" + "2:Subtraction"+ "3:Multiplication"+ "4:Division");
		
		int select = scan.nextInt();
		
		if (select == 1) {
			System.out.println(a+b);
		}else if (select == 2) {
			System.out.println(a-b);
		}else if (select == 3) {
			System.out.println(a*b);
		}else if (select == 4) {
			System.out.println(a/b);
			 */
	}

}
