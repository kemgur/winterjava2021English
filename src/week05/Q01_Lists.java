package week05;

import java.util.ArrayList;
import java.util.List;

public class Q01_Lists {

	/*
	 Create an integer list which has 5 elements
	 Update all element by adding "*" on the rigth of every element
	 */
	public static void main(String[] args) {
	
		List<Integer> list1 = new ArrayList<>();
		list1.add(3);
		list1.add(7);
		list1.add(1);
		list1.add(11);
		
		List <String> list2 = new ArrayList<>();
	
		for (int i = 0; i < list1.size(); i++) {
			
			list2.add(list1.get(i)+"x");
		}
		System.out.println(list2);//[3x, 7x, 1x, 11x]

	}

}
