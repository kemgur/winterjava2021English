package day18arraylistsforeachloop;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(21);
		list1.add(32);
		list1.add(25);
		list1.add(9);
		
		increaseListElement(list1);
		
		

	}

	
	/*
	 Create a method to increase every element of the given list by 3;
	 */
	
	public static void increaseListElement(List<Integer> list1) {
		
		
		for (int i = 0; i < list1.size(); i++) {
			list1.set(i, list1.get(i)+3);
			//set(,) methodu elemenetleri degistirken kullanilir.
		}
		System.out.println(list1);
	}
}
