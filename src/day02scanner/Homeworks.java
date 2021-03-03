package day02scanner;

import java.util.Scanner;

public class Homeworks {

	/*
	 1)Type a program which calculates the area and the perimeter of a circle
whose radius is entered by user. (Use float)
Hint 1: Take pi number as 3.14159
Hint 2: Area of a circle is 3.14159 x radius x radius
Hint 3: Perimeter of a circle is 2 x 3.14159 x radius
Hint 4: To get float, use nextFloat()

2)Type a program which calculates the perimeter of a triangle whose
Side lengths are entered by user. (Use byte)
Hint 1: Perimeter of a triangle is a + b + c
Hint 4: To get byte, use nextByte()

3)Type a program which converts the mile to kilometer. Mile value will be
entered by user. (Use double)
Hint 1: km = mile x 1.6
Hint 2: To get double, use nextDouble()

4)Type a program which converts the hours to seconds. Hours value will be
entered by user. (Use long)
Hint 1: second = hour x 60 x 60
Hint 2: To get long, use nextLong()
	 */
	public static void main(String[] args) {
		

		/*
		 1)Type a program which calculates the area and the perimeter of a circle
	whose radius is entered by user. (Use float)
	Hint 1: Take pi number as 3.14159
	Hint 2: Area of a circle is 3.14159 x radius x radius
	Hint 3: Perimeter of a circle is 2 x 3.14159 x radius
	Hint 4: To get float, use nextFloat()*/
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please enter a radius");
		float radius = scan1.nextFloat();
		
		System.out.println("Area of a circle is " + (3.14159 * radius * radius));
		System.out.println("Perimeter of a circle is " + (2 * 3.14159 * radius));
		
		
		System.out.println("======================================");
		
		/*
		 2)Type a program which calculates the perimeter of a triangle whose
		Side lengths are entered by user. (Use byte)
		Hint 1: Perimeter of a triangle is a + b + c
		Hint 4: To get byte, use nextByte()
		 */
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Please enter three lengths");
		byte a = scan2.nextByte();
		byte b = scan2.nextByte();
		byte c = scan2.nextByte();
		System.out.println("Perimeter of a triangle is "+ (a + b + c) );
		
		System.out.println("======================================");
		
		/*
		 3)Type a program which converts the mile to kilometer. Mile value will be
		entered by user. (Use double)
		Hint 1: km = mile x 1.6
		Hint 2: To get double, use nextDouble()
		 */
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Please enter the mile");
		double mile = scan3.nextDouble();
		System.out.println("km=  " + mile * 1.6);
		
		
		System.out.println("======================================");
		
		/*
	 4)Type a program which converts the hours to seconds. Hours value will be
		entered by user. (Use long)
		Hint 1: second = hour x 60 x 60
		Hint 2: To get long, use nextLong()
		 */
		Scanner scan4 = new Scanner(System.in);
		System.out.println("Please enter the hours");
		long hour = scan4.nextLong();
		System.out.println("second = " + (hour * 60 * 60));
		
		
		
	}

}
