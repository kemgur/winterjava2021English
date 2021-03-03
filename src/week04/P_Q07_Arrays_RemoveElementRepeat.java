package week04;

import java.util.Arrays;
import java.util.Scanner;

public class P_Q07_Arrays_RemoveElementRepeat {

	public static void main(String[] args) {
		
		/*
		 Create an array by the help of user
		 Kullanıcı yardımıyla bir dizi oluşturun.
		
		 Ask user the element to remove the element user asked
		 Kullanıcıdan, kullanıcının istediği öğeyi kaldırmasını isteyin
		
		 Print the array on the console after removing
		 Çıkardıktan sonra diziyi konsola yazdırın
		 */
		  Scanner scan = new Scanner(System.in);
	      System.out.println("Enter the length of the array");
	      int lenght = scan.nextInt();
	      
	      int arr[] =new int[lenght];
	      int i =0;
	      do {
	    	  System.out.println("Enter a vakue of index " +i);
	    	  arr[i]=scan.nextInt();
	    	  i++;
	      }while(i<arr.length);
	      System.out.println(Arrays.toString(arr));
	      
	      System.out.println("Tell me the index of the element that you want to remove");
	      int remEl = scan.nextInt();
	      
	}

}
