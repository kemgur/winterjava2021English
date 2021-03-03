package interviewQuestions;

import java.util.Scanner;

public class Soru2_sayilariDegistirme {

	
	//Kullanicidan iki sayi alip bunlari degistirelim(swap)
	//1.yol ==> 3.bir degisken kullanarak degistireviliriiz
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 2 sayi giriniz");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		int sayi3 = sayi1;
		sayi1 = sayi2;
		sayi2 = sayi3;
		
		System.out.println("ilk sayinin yeni degeri :" + sayi1 +
				"\nikinci sayinin yeni degeri :"+sayi2);
		
		
		//2.yol
		
		sayi1 = sayi1 + sayi2;
		sayi2 = sayi1-sayi2;
		sayi1 = sayi1 - sayi2;
		System.out.println("ilk sayinin yeni degeri :" + sayi1 +
				"\nikinci sayinin yeni degeri :"+sayi2);
		
		
		scan.close();
	}

}
