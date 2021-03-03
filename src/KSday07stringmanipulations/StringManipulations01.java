package KSday07stringmanipulations;

public class StringManipulations01 {
/*
 tring Methods:
	 1) toUpperCase()
	 2) toLowerCase()
	 3) charAt()
	 4) equals()
	 5) equalsIgnoreCase()
	 6) length()
	 7) next()
	 8) nextLine()
	 9) indexOf()
	 10) lastIndexOf()
	 11) contains()
 */
	public static void main(String[] args) {
		

		String str1 = "Learn coding by typing";
		
 //12) startsWith() method is used for to check if this String start with the specific prefix.
		//startsWith() can be used with only String. We can't use it with char.
		//startsWith() can be used with more than one characters
		//startsWith() returns boolean.(true-false)
		
		
		System.out.println(str1.startsWith("L"));//true
		System.out.println(str1.startsWith("1"));//false
		System.out.println(str1.startsWith("Le"));//true
		System.out.println(str1.startsWith("c", 6));//true
		//Stringdeki c harfinin 6.indexte oludugunu kontrol eder.
		System.out.println(str1.startsWith("by", 13));//true
		System.out.println(str1.startsWith("typ", 16));//true
		
		//13) endsWith() method is used for to check if this String start with the specific suffix.
				//endsWith() can be used with only String. We can't use it with char.
				//endsWith() can be used with more than one characters
				//endsWith() returns boolean.(true-false)	
		System.out.println(str1.endsWith("g"));//true
		System.out.println(str1.endsWith("n"));//false
		System.out.println(str1.endsWith("ping"));//true

		//14) isEmpty() method return boolean, true means the length of the String is equal to 0;
		str1.isEmpty();
		System.out.println(str1.isEmpty());//false
		String s = "";
		System.out.println(s.isEmpty());//true
		
		  //15) replace() 
	    // to replace all occurrences of a specific character I can use replace()
	    String str2 = "Java is easy";
	    System.out.println(str2.replace("a", "e"));//Jeve is eesy
	    System.out.println(str2);//Java is easy
	    System.out.println(str2.replace("a", "??????"));//J??????v?????? is e??????sy
	    System.out.println(str2.replace("a", str2));//JJava is easyvJava is easy is eJava is easysy
	    //How can I delete all "a" ? 
	    System.out.println(str2.replace("a", ""));//Jv is esy
	    //How can I put ! before and after each character ? 
	    System.out.println(str2.replace("", "!"));//!J!a!v!a! !i!s! !e!a!s!y!
	    System.out.println(str2.replace('a', 'e'));//Jeve is eesy
	    
	    
	    //16) replaceAll()
	    // replaceAll() and replace() does the same thing
	    // But there are some differences : 1) In replaceAll() you cannot use chars 
	                                    //  2) In replaceAll() you can use regular expressions
	    
	    
	    String str3 = "Teach_more, learn123 more!!!  ..";
	    
	     /* Regular Expressions ==>  
	      *1) \\s: space character
	       2) \\S: all characters except space character
	       3) \\w: a->z  A->Z _    0->9
	       4) \\W: All characters except a->z    A->Z _    0->9
	       5) \\d: 0 -> 9
	       6) \\D: All characters except 0 -> 9
	*/
	    //\\s: space character :
	    System.out.println(str3.replaceAll("\\s", "*"));// Teach_more,*learn123*more!!!**..
	    //\\S: all characters except space character
	    System.out.println(str3.replaceAll("\\S", "*"));// *********** ******** *******  **
	    //\\w: a->z  A->Z _    0->9
	    System.out.println(str3.replaceAll("\\w", "&"));// &&&&&&&&&&, &&&&&&&& &&&&!!!  ..
	    //\\W: All characters except a->z    A->Z _    0->9
	    System.out.println(str3.replaceAll("\\W", "%"));// Teach_more%%learn123%more%%%%%%%
	    //\\d: 0 -> 9
	    System.out.println(str3.replaceAll("\\d", "+"));// Teach_more, learn+++ more!!!  ..
	    //\\D: All characters except 0 -> 9
	    System.out.println(str3.replaceAll("\\D", "*"));// *****************123************
	    
	    //17) replaceFirst()
	    // replaceFirst() changes just the first occurrance of the character
	    System.out.println(str3.replaceFirst("a", "e")); //Teech_more, learn123 more!!!  ..
	        	
		
	}

}
