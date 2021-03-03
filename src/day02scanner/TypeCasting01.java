package day02scanner;

public class TypeCasting01 {

	/*
	 byte, short, int , long , float, double
	 */
	public static void main(String[] args) {
		
		//Auto Widening: if you assign a small data to a large data type,
		//type casting is done automatically by java.
		//This process is called "Auto Widening" (Bu işleme "Otomatik Genişletme" denir)
		byte b1 = 112;
		int i1 = b1;
		System.out.println(b1);		
		System.out.println(i1);
		
		
		//Explicit Narrowing: If you assign a large data type to a small data type,
		//          type casting cannot be done by Java automatically.
		//          You should take the responsibility and type the casting explicitly.
		//          This process is called “Explicit Narrowing”
		//Explicit(Acikca) Narrowing(Daraltma) Casting
		
		int i2 = 120;
		short s1 = (short)i2;
		System.out.println(i2);
		System.out.println(s1);
		
		//When you type "float f1 = 2.3;", it will complain.(sikayet edecek)
		//To fix that issue, you have 4 options
		//1.way
		float f1 = 2.3f;
		//2.way
		float f2 = 2.3F;
		//3.way
		float f3 = (float)2.3;
		//4.way
		double f4 = 2.3;
		
		System.out.println(f1 + f2 +f3 +f4);
		
		
		//If you use “Explicit Narrowing” with the numbers which are not in the interval
		//then you will get different results. The result will be calculated according to the 
		//modulus operation.
		short s2 = 255;
		byte b4 = (byte)s2;//Explicit Narrowing
		System.out.println(s2);//255
		System.out.println(b4);//-1
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
