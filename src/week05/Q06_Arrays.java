package week05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q06_Arrays {

	/*
	 * Ask user to enter a String and count the vowels (a,e,i,o,u) 
	 * contained in the String
	*/
	
	public static void main(String[] args) {
		/*
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scan.nextLine().toLowerCase();
		
		int count = 0;
		List <Character> vovels = new ArrayList<>();
		vovels.add('a');
		vovels.add('e');
		vovels.add('i');
		vovels.add('o');
		vovels.add('u');
		for (int i = 0; i < vovels.size(); i++) {
			if(vovels.contains(str.charAt(i))) {
				count++;
			}
			
		}
		System.out.println(count);
		*/
		
		vLetter();
		
	}

	public static void vLetter() {
		  Scanner scan = new Scanner(System.in);
	        System.out.println("Enter a String");
	        
	        String str1 = scan.nextLine();
	        String arr[] = str1.split("");
	        
	        List <String> list = new ArrayList<>();
	        list.add("a");
	        list.add("e");
	        list.add("i");
	        list.add("o");
	        list.add("u");
	        
	        int count=0;
	        
	        for(int i=0; i<arr.length; i++) {
	        	
	        if(list.contains(arr[i])) {
	            count++;
	        }
	        }
	        System.out.println(count);  
	        scan.close();
	}
	
}
