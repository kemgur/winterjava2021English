package week01;

import java.util.Scanner;

public class Q3_GradeCalculation {

	/*
    Ask user to enter mid-term grade, final grade, and project grade 
    Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)
    
     Example: 
         INPUT: mid-term grade=78
                final grade = 66
                project grade = 90 
         OUTPUT: "Your grade is : 81,6"
    
    */
	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("enter mid-term grade, final grade, and project grade ");
		double midTermGrade = scan.nextDouble();
		double finalGrade = scan.nextDouble();
		double projectGrade = scan.nextDouble();
		
		System.out.println("Your general grade is "+ midTermGrade*0.3 + finalGrade*0.2 + projectGrade*0.5);
		
		//2.way
		  Scanner scan1 = new Scanner(System.in);
	        System.out.println("Please enter your midterm grade");
	        double midterm = scan1.nextDouble();
	        double percentMidterm = midterm*30/100;
	        
	        System.out.println("Please enter your final grade");
	        double fnlGrade = scan1.nextDouble();
	        double percentFinalGrade = fnlGrade * 50/100;
	        
	        System.out.println("Please enter your final grade");
	        double proGrade = scan1.nextDouble();
	        double percentGrade =proGrade * 20/100;
	        
	        System.out.println("Your grade will be: "  + (percentMidterm + percentFinalGrade +  percentGrade ));
	        
	        scan.close();
	        scan1.close();

	}

}
