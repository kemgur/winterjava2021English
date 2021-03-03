package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
		
	    int num [] = {5, 1, 2, 8};
	    System.out.println(Arrays.toString(num));
	    //How to sort array elements
	    Arrays.sort(num);
	    System.out.println(Arrays.toString(num));
	    //How to sort array elements in descending order
	    //1) You should sort the elements in ascending order
	    //2)By using loops put the elements in descending order
	  
	    int revNum[] = new int[num.length];
	  
	    for(int i =0; i<num.length;  i++) {
	    	
	    	revNum[i] = num[num.length-1 - i];
	    }
	    
	    System.out.println(Arrays.toString(revNum));
	    
	    //How to check if an element exist or not in an Array
	    //1) sort the array elements
	    //2) use binarySearch() method
	    
	    int num2[]= {2,7,1,13};
	    Arrays.sort(num2);
	   System.out.println( Arrays.binarySearch(num2, 7));//2 =>index numarasini yazdirir.  
	   System.out.println( Arrays.binarySearch(num2, 13));//3
	   
	   //if an element does not exist in the array, Java return the "order number" with negative sign
	   System.out.println( Arrays.binarySearch(num2, 4));//-3 
	   //-3 Sayet arrayde olsaydi 3. sirada olacakti demektir.(index degil sira)
	   System.out.println( Arrays.binarySearch(num2,22));//-5=> Arrayde olsaydi 5. sirada olacakti, demektir.
	  }
	}


