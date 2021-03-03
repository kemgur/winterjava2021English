package interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Soru1_StringTersCevirme {

	//Kullanicidan vir String alin bu Stringi ters cevirin ve yazdirin
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String input = scan.nextLine();
		String tersString ="";
		
		for (int i =input.length()-1; i>=0 ; i--) {
			tersString +=input.charAt(i); 	
		}
		System.out.println("for loop ile ters cevirdigimiz :" + tersString);
		
		//2. way: StringBuffer ile ters cevirme
		StringBuffer strB = new StringBuffer();
		strB.append(input);
		strB = strB.reverse();
		System.out.println("String ile ters cevirdigimiz : " +strB );
		
		
		 // 3.yol method olusturup array kullanalim
        arrayIleTersineCevir(input);
    }
    public static String  arrayIleTersineCevir(String input) {
        
        String[] kelimeArr=input.split("");
        System.out.println(Arrays.toString(kelimeArr));
        
        String tersString= "";
        for (int i = kelimeArr.length-1; i >=0; i--) {
            tersString+=kelimeArr[i];
        }
       // System.out.println("method ve array kullanarak cevirdigimiz : " + tersString);
        
       return tersString;
        
	}

}
