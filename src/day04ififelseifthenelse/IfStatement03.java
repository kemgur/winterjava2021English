package day04ififelseifthenelse;

import java.util.Scanner;

public class IfStatement03 {

	
	/*
	 Type java code by using if statement. When you enter the name of the day of a week,
     output will be “Weekday” or “Weekend day” according to the name of the day.
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the name of the day of a week");
		String dayName = scan.next().toLowerCase();
		
		//Note: To compare String, DO NOT USE "==". Use "equals()" method.
		//equals() checks just the values, equals() does not check references. 
		// "==" check values and reference. If both are same then java tells these String are same.
		//"equals()" check just the value. If the values are same Java tells two String are the same.
		//If the values are same  then Java tells the Strings are same
		//"Ali".equals("Veli"); ==> false
		//"Ali".equals("Ali"); ==> true
		//"Ali".equals("ali"); ==> false
		
		if(dayName.equals("monday") || dayName.equals("tuesday")|| dayName.equals("wednesday")||
				dayName.equals("thursday")|| dayName.equals("friday")) {
			System.out.println("Week day");
			
		}
		if(dayName.equals("saturday") || dayName.equals("sunday")) {
			System.out.println("Weekend day");
			
		}
		
		if(!dayName.equals("monday") && !dayName.equals("tuesday")&& !dayName.equals("wednesday")&&
				!dayName.equals("thursday")&& !dayName.equals("friday") && !dayName.equals("saturday") &&
				!dayName.equals("sunday")) {
			System.out.println("Enter a valid day name");
		}
		scan.close();
		
		
	}

}
