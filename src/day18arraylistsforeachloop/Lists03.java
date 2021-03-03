package day18arraylistsforeachloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists03 {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(21);
		list1.add(32);
		list1.add(25);
		list1.add(90);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(111);
		list2.add(222);
		list2.add(333);
		list2.add(444);
		list2.add(555);
		
		//How to join two lists
		//list1 changes below
		//addAll() method adds the elements at the end
		//Returns true if this list changed as a result of the call 
		list1.addAll(list2);
		
		System.out.println(list2);//[111, 222, 333, 444, 555]
		System.out.println(list1);//[12, 21, 32, 25, 90, 111, 222, 333, 444, 555]
		
		
		list1.addAll(2, list2);//2. index'ten itibaren list2 yi ekle demektir.
		System.out.println(list2);
		System.out.println(list1);
		
		
		//How to delete all element from a list
		//clear() method removes all of the elements from this list
		//clear() method returns nothing  ==> return type is "void"
		//list2.clear();
		//System.out.println(list2);//[ ]
		
		//How to check existence of multiple elements
		//list1.containsAll(list2)  method return true if all elements of list2 exist in the list1
		System.out.println(list1.containsAll(list2));//true
		
		
		//How to get the index of last occurrence of an element in a list
		//Listedeki bir elemanın son oluşumunun dizini nasıl elde edilir
		list1.lastIndexOf(111);//10
		System.out.println(list1.lastIndexOf(111));//10
		
		
		//How to remove multiple elements from a list
		list1.removeAll(list2);
		System.out.println(list1);
		
		//How to delete elements by using some condition
		//it returns true if any element is removed  otherwise it returns false.
		list1.removeIf(t->t%2!=0);//Lambda expression
		System.out.println(list1);//[12, 32, 90]
		
		//How to get specific part of a list.
		//subList(1,3); => 1 is inclusive , 3 is exclusive
		//subList(1, 3) => It returns the sublist
		System.out.println(list2.subList(1, 3));
		
		
		//How to convert a list to an array
		System.out.println(list2.toArray());//[Ljava.lang.Object;@816f27d
		//toArray() string methodududr
		System.out.println(Arrays.toString(list2.toArray()));//[111, 222, 333, 444, 555]
		
		
		//How to convert an array to a list <== We use that many times
		//When you create a list by using array, some array features transferred to the list.
		//As you know, arrays are not flexible in length, the list which is created from an array will not be
		Integer arr[] = {1,54,21,13};
		List<Integer> list3 = Arrays.asList(arr);
		System.out.println(list3);//[[I@87aac27]
		
		//list3.remove(2); //UnsupportedOperationException//Desteklenmeyen İşlem İstisnası
		//list3.clear();//UnsupportedOperationException
		//list3.add(34, arr);//UnsupportedOperationException
		list3.set(1, 21);
		System.out.println(list3);//[1, 21, 21, 13]
		
		System.out.println(list3.subList(2, 4));// [21, 13]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
