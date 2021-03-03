package ba_day01_practice;

import java.util.Scanner;

public class Question02 {

	 /*
    Write a program in Java to input 5 numbers from keyboard and find their sum and average.
EXAMPLE:
INPUT      :  
Input the 5 numbers :                                                            
1                                                                                
2                                                                                
3                                                                                
4                                                                                
5              
 OUTPUT : 

The sum of 5 number is : 15
The Average is : 3.0       
*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 5 number");
		double i1 = scan.nextDouble();
		double i2 = scan.nextDouble();
		double i3 = scan.nextDouble();
		double i4 = scan.nextDouble();
		double i5 = scan.nextDouble();
		
		
		double sum = (i1 + i2 + i3 +i4 +i5);
		double Avr = sum/5;
		
		System.out.println("The sum of 5 number is : "+ sum);
		System.out.println("The Average is : " + Avr);
		
		scan.close();
	}

}
