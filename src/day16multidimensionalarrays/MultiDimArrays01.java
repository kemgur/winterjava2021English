package day16multidimensionalarrays;

import java.util.Arrays;

public class MultiDimArrays01 {

	public static void main(String[] args) {
		
		int arr2[][] = new int [3][];//[null, null, null]
		int arr1[][] = new int [3][2];//[[0, 0], [0, 0], [0, 0]]
	
		int arr[][]= {{7,11,5},{71,12},{9}};
		
		//How to print a specific element
		System.out.println(arr[1][1]);//12
		System.out.println(arr[0][1]);//11
		
	
		//Array'lerde Arrays.toString() methodu kullaniyorduk
		//MultiDimArrays'lerde Arrays.deepToString() methodunu kullaniriz.
		//To peint multidimentional arrays on the console, use deepToString() method
		System.out.println(Arrays.deepToString(arr));

		//How to print forst array
		System.out.println(Arrays.toString(arr[0]));//[7, 11, 5]
		System.out.println(Arrays.toString(arr[2]));//[9]
		
		//How to find the sum of the element of the first element
		int sum = 0;
		
		for (int i = 0; i < arr[0].length; i++) {
			sum = sum + arr[0][i];	
		}
		System.out.println(sum);//23
		
		
	}

}
