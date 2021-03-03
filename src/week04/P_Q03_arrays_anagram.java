package week04;

import java.util.Arrays;


public class P_Q03_arrays_anagram {

/*
 * Anagram is to create a new word from other word's letters.
		 * Write java code to check if two words are anagram or not
		 * isAnagram("listen", "Silent") ==> anagram
 */
	public static void main(String[] args) {
		

		 String str1 = "Race";
		    String str2 = "Care";
		    
		    str1 = str1.toLowerCase();
		    str2 = str2.toLowerCase();

		   
		    if(str1.length() == str2.length()) {

		      
		      char[] charArray1 = str1.toCharArray();
		      char[] charArray2 = str2.toCharArray();

		      
		      Arrays.sort(charArray1);
		      Arrays.sort(charArray2);

		      
		      boolean result = Arrays.equals(charArray1, charArray2);

		      if(result) {
		        System.out.println(str1 + " and " + str2 + " are anagram.");
		      }
		      else {
		        System.out.println(str1 + " and " + str2 + " are not anagram.");
		      }
		    }
		    
	}

}
