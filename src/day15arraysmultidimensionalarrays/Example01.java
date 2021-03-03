package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Example01 {

	public static void main(String[] args) {
		String str2="Ali Can come here";
		
		 String crr[]=str2.split(" ");
		 
		 System.out.println(crr.length);
		 
		 String rev="";
		 for (int i = crr.length-1; i >=0; i--) {
			rev +=i;
		}
		 System.out.println(Arrays.toString(crr));
	}

}
