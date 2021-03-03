package day06nestedifternarytostringmethod;

import java.util.Scanner;

public class Ternary03 {

	/*
	 Ask user to enter an integer. If the number has 3 digits, output will be
     “This number has 3 digits.” Otherwise, output will be “This number has no 3 digits.”
     How can you decide the number of digits of an integer?
     
     Kullanıcıdan bir tam sayı girmesini isteyin. Numaranın 3 hanesi varsa, çıktı
	"Bu sayı 3 hanelidir." Aksi takdirde, çıktı "Bu numaranın 3 hanesi yoktur."
	Bir tamsayının basamak sayısına nasıl karar verirsiniz?
     
	 */
	public static void main(String[] args) {
	

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 digits... ");
		int a = scan.nextInt();
		
		String result = (a>99 && a<1000) || (a<-99 && a>-1000) ? "his number has 3 digits." : "This number has no 3 digits.";
		System.out.println(result);
		
		
		scan.close();
	}

}
