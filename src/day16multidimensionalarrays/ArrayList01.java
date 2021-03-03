package day16multidimensionalarrays;

import java.util.ArrayList;

public class ArrayList01 {

	/*
	 1) ArrayLists are flexible in size.
	 2) ArrayLists cannot store multiple data types
	 3) ArrayLists store non-primitive data type.
	 4) ArrayLists are updates version of Arrays.
	 5) 
	 */
	public static void main(String[] args) {
		
		ArrayList<Integer>list1 = new ArrayList<>(); 
	
		System.out.println(list1);
	
		//How to add element into an ArrayList.
		//add()  method uses Insertion order.(yerlestirme sirasi)
		list1.add(12);
		list1.add(12);
		list1.add(33);
		
		
		//How to add an element into a specific index
		list1.add(1,45);
		
		System.out.println(list1);
	}

}
