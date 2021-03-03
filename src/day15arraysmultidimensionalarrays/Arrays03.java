package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays03 {

	/*
	 One more String Method...
	 split() method is used to split() a String by using specific character/s
	 split() method puts the splitted parts into an array.
	 */
	public static void main(String[] args) {
	
		String str = "JavaGood";
		
		String arr[]=str.split("a");
		
		System.out.println(Arrays.toString(arr));//[J, v, Good]
		
		String brr[] = str.split("");
		System.out.println(Arrays.toString(brr));//[J, a, v, a, G, o, o, d]
		
		System.out.println(brr.length);//8
		
		
		String str2 ="Ali Can come here no I ";
		String crr[] = str2.split(" ");
		System.out.println(Arrays.toString(crr));
	}

}
