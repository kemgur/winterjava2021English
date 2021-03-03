package interviewQuestions;

import java.util.Scanner;

public class Soru4_palindrome {

	
	
	public static void main(String[] args) {
		//Kullanicidan bir string alalim ve bu String'in 
		//palindrome olup olmadigini yazdiralim
		//ey Edip adanada pide ye.

//ilk sorudaki ters cevirme methodunu kullanabiliriz
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen palindrome mu kontrol edeceginiz String'i yazdirin");
		String input = scan.nextLine();
		
		Soru1_StringTersCevirme obj = new Soru1_StringTersCevirme();
		String tersString = obj.arrayIleTersineCevir(input);
		
		if(input.equalsIgnoreCase(tersString)) {
			System.out.println("Girdiginiz String palindromedur");
			
		}else {
			System.out.println("Girdiginiz String palindrome degildir");
		}
		
		
		scan.close();
	}

}
