package day06nestedifternarytostringmethod;

import java.util.Scanner;

public class SwitchStatement02 {

	/*
	 *If the user pressed 1, 2, 3 the program will print the number that is pressed; 
      otherwise, program will print “Not allowed”.
      
      Kullanıcı 1, 2, 3'e basarsa, program basılan sayıyı yazdıracaktır;
      aksi takdirde, program "İzin verilmiyor" yazacaktır.
	 */
	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int d = scan.nextInt();
		
		switch (d) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("Not allowed");
			break;
		
		}
		scan.close();
	}

}
