package day06nestedifternarytostringmethod;

import java.util.Scanner;

public class Ternary0303 {

	/*
	 Ask user to enter a String. If the String has 2 characters, output will be
     “It is valid for state abbreviations” Otherwise, output will be “It is not valid for state abbreviations”
     
     Kullanıcıdan bir Dize girmesini isteyin. Dize 2 karakter içeriyorsa, çıktı
	"Eyalet kısaltmaları için geçerlidir" Aksi takdirde çıktı "Eyalet kısaltmaları için geçerli değildir" olacaktır.
	 */
	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a abbreviations of a state... ");
		String abrv = scan.next();
		
		String result = abrv.length()==2 ? "It is valid for state abbreviations" : "It is not valid for state abbreviations";
		System.out.println(result);
		
		scan.close();
	}

}
