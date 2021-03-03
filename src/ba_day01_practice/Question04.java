package ba_day01_practice;

import java.util.Scanner;

public class Question04 {

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
		
			System.out.println("Which operation do you prefer?\n"
				+ "1 for Addition\n"
				+ "2 for Subtraction\n"
				+ "3 for Multiplication\n"
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
			
			/*2.way
			 
			 *Scanner scan = new Scanner(System.in);
		
		int x = 50, y = 5;
		
		System.out.print("Which operation? ");
		System.out.print("1 for Sum: ");
		System.out.print("2 for Sub: ");
		System.out.print("3 for Mult: ");
		System.out.print("4 for Div: ");
		
		int o = scan.nextInt();
		if(o != 1 && o != 2 && o !=3 && o != 4) {
			System.out.println("Please enter appropriate number:");
		}
		else if(o == 1) {
			System.out.println(x + y);
		}else if(o == 2) {
			System.out.println(x - y);
		}else if(o == 3) {
			System.out.println(x * y);
		}else {
			System.out.println(x / y);
		}
​
	}
			 */
		
			/*
			 3.way
			  
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
       
//        */
//        Scanner scan = new Scanner(System.in);
//        
//        System.out.println("Enter first number please");
//        
//        double num1 = scan.nextDouble();
//        
//        System.out.println("Enter second number please");
//        
//        double num2 = scan.nextDouble();
//        
//        System.out.println();
//        
//        System.out.println("Which operation do you prefer?\n1 for Addition\n2 for Subtraction\n3 for Multiplication\n4 for Division");
//        
//        int option = scan.nextInt();
//        
//        if(option==1) {
//            
//            System.out.println("Result=" + (num1+num2));
//        }else if(option==2){
//            System.out.println("Result=" + (num1-num2));
//        }else if(option==3){
//            System.out.println("Result=" + (num1*num2));
//        }else if(option==4) {
//            System.out.println("Result=" + (num1/num2));
//        }else {
//            System.out.println("Enter a valid operation" );
//        }
//        
//        scan.close();
//
//			 */
	}

}
