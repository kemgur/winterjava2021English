package OfficeHours04;

import java.util.Arrays;
import java.util.Scanner;

public class Office_2_PrintArrays {

//  ! Create a static method name: acceptString
	//  It should accept 3 strings as parameter
	//  ! and print them as an array
	//  ! e.g. String[] array = { "sam", "john", "tom" };
	//  ! acceptString(“sam”,”john”,”tom”);
	//  ! Then output: [sam, john, tom]

	//  ! Create another static method name: acceptString2
	//  It should take accept 3 strings as parameter
	//  ! and print each element in the array
	//  ! e.g. String[] array = { "sam", "john", "tom" };
	//  ! acceptString(“sam”,”john”,”tom”);
	//  ! Then output: sam john tom
	
	public static void main(String[] args) {
		
		String name1="sam";
		String name2="john";
		String name3="tom";
		
		acceptString(name1,name2,name3);
		acceptString2(name1,name2,name3);
			
	
	}
public static void acceptString(String name1,String name2, String name3) {
		
		String[] arr= {name1,name2,name3};
		System.out.println(Arrays.toString(arr));
	}

public static void acceptString2(String name1,String name2, String name3) {
	
	String [] arr = {name1,name2,name3};
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}	
		
		
}	

}
