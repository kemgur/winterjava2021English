package OfficeHours08;

public class IQ_04_LongestPalindrome {

	/*
	 *  * Given a string, find the longest substring which is palindrome.
For example,
Input#
	Given string :"fortechproorphcetfor",
Output#
	"techproorphcet"
Input#
	Given string :"aacabbacba",
Output#
 	"cabbac"
 The simple approach is to check each substring whether the substring
 is a palindrome or not. To do this first, run three nested loops,
 the outer two loops pick all substrings one by one by fixing the corner characters,
the inner loop checks whether the picked substring is palindrome or not.
	 */
	public static void main(String[] args) {
		
		String str1="fortechproorphcetfor";
		longestPalindromeSubstring(str1);
		
		System.out.println("**************************************");
		System.out.println("**************************************");
		
		String str2="aacabbacba";
		longestPalindromeSubstring(str2);
	}

	public static void longestPalindromeSubstring(String str) {
		int len = str.length();
		
		int maxLenght=0, startingIndex=0, endingIndex=str.length()-1;
		int flag;
		//Define starting index, ending index
		for(int i=0; i <len; i++) {
			for(int j=i;j<len;j++) {
				flag=1;//repsents palindrome
				
				//Check palindrome
				for(int k=0; k<(j-i+1)/2; k++) {
					if(str.charAt(i+k)!=str.charAt(j-k)) {
						flag=0;
					}
				}
				if(flag !=0 && j-i+1>maxLenght) {
					startingIndex=i;
					endingIndex=j+1;
					maxLenght=endingIndex-startingIndex;
				}
			}
		}
		System.out.println("The given string:"+str);
		System.out.println("--------------------");
		System.out.println("The longest palindrome sub-string is: "+str.substring(startingIndex, endingIndex));
		//print max lenght of the sub-string
		System.out.println("Max lenght of the sub-string is:"+maxLenght);
		
		
	}
}