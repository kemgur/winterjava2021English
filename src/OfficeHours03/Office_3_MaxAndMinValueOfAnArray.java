package OfficeHours03;

import java.util.Arrays;

public class Office_3_MaxAndMinValueOfAnArray {

	/*
	 * write a method that accepts an integer array as input and prints the minimum
         * and the maximum numbers from given array
         *
         *
         * Input : {3,2,5,4,1,6}
         * Output : min: 1 max : 6
	 */
	public static void main(String[] args) {
	
		int arr[]={3,2,5,4,1,6};
		
		maxAndMin(arr);
		
		
		
		Arrays.sort(arr);
		int min = arr[0];
		int max = arr[arr.length-1];
		System.out.println("max number is " +max +"\n"+ "min number is " + min);
		

	}

	public static void maxAndMin(int input[]) {
		int max = input[0];
		int min = input[0];
		
		for (int i = 0; i < input.length; i++) {
			if(input[i]>max) {
				max=input[i];
			}
			if(input[i]<min) {
				min = input[i];
			}
		}
		System.out.println("Min value in the array : "+ min +"\n"+ "Max value in the array: "+max);
		
	}
}
