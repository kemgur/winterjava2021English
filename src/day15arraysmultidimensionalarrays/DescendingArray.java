package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class DescendingArray {

	public static void main(String[] args) {
				//How to sort array elements in descending order
				//1) You should sort the elements in ascending order
				//2) By using loops put the elements in descending order
				
		int num[] = {5,1,2,8,5};
		
		Arrays.sort(num);
		for (int i = num.length-1; i >=0 ; i--) {
			System.out.print(num[i] + " ");
		}
			

	}

}
