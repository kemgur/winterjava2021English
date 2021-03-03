package week04;

import java.util.Arrays;
import java.util.Scanner;

public class P_Q05_Arrays_RepeatedLetters {

	/*
	 /Count the number of characters in a String
	//Test the code by using abaab, abaabc, abc
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String please");
		String s = scan.nextLine();
		
		String ch []=s.split("");
		System.out.println(Arrays.toString(ch));
		Arrays.sort(ch);
		
		int counter = 0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i-1].equals(ch[i])) {
				counter++;
			
			}else {
				System.out.println("The number of "+ ch[i-1] + " is "+ (counter + 1));
				counter=0;
			}if(i==ch.length-1) {
				System.out.println("The number of "+ ch[i] + " is "+ (counter + 1));
			}
			
		}
		scan.close();
	}

}
