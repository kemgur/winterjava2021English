package day02scanner;

import java.util.Scanner;

public class ScannerClass04 {

	/*
	 Type a program which calculates the volume of a rectangular prism
     whose length, with, and height are entered by user.
     Hint 1: Volume of a rectangular prism is width x length x height
     
     Dikdörtgen prizmanın hacmini hesaplayan bir program yazın
     uzunluğu, uzunluğu ve yüksekliği kullanıcı tarafından girilir.
     İpucu 1: Dikdörtgen prizmanın hacmi genişlik x uzunluk x yüksekliktir
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length of the rectangle prism");
		double length = scan.nextDouble();
		
		System.out.println("Please enter the width of the rectangle prism");
		double width = scan.nextDouble();
		
		System.out.println("Please enter the heigth of the rectangle prism");
		double heigth = scan.nextDouble();
		
		System.out.println("The volume of a rectangular: "+ length * width * heigth);
		
		scan.close();
	}

}
