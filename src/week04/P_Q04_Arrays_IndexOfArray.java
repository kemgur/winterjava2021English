package week04;

import java.util.Scanner;

public class P_Q04_Arrays_IndexOfArray {

	//Create a method to find an element's index in an array
			// Get the element from the user and return index of that element
		    //int my_array[] = {12,15,43,23,56,76,78,90,77,43};
			//input : 15 ==> output : 15 is in the 1. index
			//input : 37 ==> output : -1
	public static void main(String[] args) {
		
		int arr[] = {12,15,43,23,56,76,78,90,77,43};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number to find index please");
		int num = scan.nextInt();
	System.out.println(num + " is in "+ findIndex(arr,num) + ".index");
	
	
	scan.close();
	}
	
	public static int findIndex(int arr[], int n) {
		int i = 0;
		while(i<arr.length) {
			if(arr[i]==n) {
				return i;
			}
			i++;
		}
		return -1;
		
		
	}

}
