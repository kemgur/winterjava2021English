package day06nestedifternarytostringmethod;

import java.util.Scanner;

public class StringManipulation01 {

	/*
	 String Methods:
	 1)toUpperCase()  2)to LowerCase()  3)charAt()  4)equals()  5)equalsIgnoreCase()   6) length()
	 7)next()   8) nextLine()    9) indexOf()  10) lastIndexOf()  11)contain() 
	 
	 */
	public static void main(String[] args) {
		
		String str = "Java is easy if you study";
		
		//indexOf() method returns the index of first occurence of the character
		System.out.println(str.indexOf("i"));//5
		
		//indexOf() accepts char as parameter as well
		System.out.println(str.indexOf('i'));//5
		
		//if the character does not exist in the String , it runs "-1"
		System.out.println(str.indexOf("x"));//-1
		
		//If you use multiple characters in indexOf(), it returns the index of firs character.
		System.out.println(str.indexOf("easy"));//8
		
		// Java bu kodda 8. indexten sonra 'i' aramaya baslar ve 13. indexte bulur.
		System.out.println(str.indexOf('i', 8));//13
		
		//If you use indexOf() with 2 parameters, Java looks for the character after the given index.
		//Seond parameter is inclusive.
		System.out.println(str.indexOf('e', 8));//8

		/*
		 Ask user to enter a String and a character, then if the String has the character or not
		 Kullanıcıdan bir Dize ve bir karakter girmesini isteyin, ardından Dize karaktere sahip olup olmadığını
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String the enter a character");
		String s = scan.nextLine();
		char ch = scan.next().charAt(0);
		
		String result = s.indexOf(ch)==-1 ? "The String has no the character" : "The String has the character";
		System.out.println(result);
		
		//10) lastIndexOf(); Stringin en sonunda yer alan 'a' nin indexini bulup getirir
		//10) lastIndexOf(); returns the index of last occurence of the character
		//karakterin son oluşumunun dizinini verir
		String t = "Java ah Java!";
		System.out.println(t.lastIndexOf('a'));//11
		System.out.println(t.lastIndexOf("a"));//11
		
		//lastIndexOf(); method returns "-1" if the character does not exist in the String
		//karakter Dizede yoksa yöntem "-1" döndürür
		System.out.println(t.lastIndexOf("w"));//-1
		
		//lastIndexOf(); retuns the index of firs character of last occurence of "Java"
		// "Java" nın son oluşumundaki ilk karakterin dizinini yeniden çalıştırır
		System.out.println(t.lastIndexOf("Java"));//8
		
		//If you use lastIndexOf() with 2 parameters, get the character starting with the index to the begining of the String
		//In the following example we are usen "Java a"
		//Aşağıdaki örnekte biz "Java a" kullanıyoruz
		System.out.println(t.lastIndexOf("v", 5));//
		
		/*
		  Ask user to give a String and a character.
		  if the character does not exist in the String or exist just once print "Not good!"
		  If the character is used multiple time print "Woow!";
		  
		  Kullanıcıdan bir String ve bir karakter vermesini isteyin.
			karakter String'de yoksa veya yalnızca bir kez mevcutsa "İyi değil!"
			Karakter birden çok kez kullanılıyorsa "Woow!" Yazdırın;
		 */
		System.out.println("Enter a String the enter a character");
		String s1 =scan.nextLine();
		char ch1 = scan.next().charAt(0);
		
		if(s1.indexOf(ch1)==-1 || s1.indexOf(ch1)==s1.lastIndexOf(ch1)) {
			System.out.println("Not good");
		}
		if(s1.indexOf(ch1) !=s1.lastIndexOf(ch1)) {
			System.out.println("Woow");
			
		}
		
		//11) contains() is used to check if a single character or multiple characters in a String
		// contain() method returns boolen
		String r = "Learn Java, earn money";
		System.out.println(r.contains("e"));//true
		System.out.println(r.contains("x"));//false
		System.out.println(r.contains("earn"));//true
		
		
		
		
		scan.close();
		

	}

}
