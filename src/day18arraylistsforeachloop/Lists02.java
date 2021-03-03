package day18arraylistsforeachloop;

import java.util.ArrayList;
import java.util.List;

public class Lists02 {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(21);
		list1.add(32);
		list1.add(25);
		list1.add(9);
		
		updateList(list1);
	}
		/*
	 	Create a method to delete odd elements and increase the even elements by multiplying 5
	*/
	public static void updateList(List<Integer> list1) {
		
		for(int i=0; i<list1.size(); i++) {
			
			if(list1.get(i)%2!=0) {
				
				list1.remove(i);
				i--;//remove elemani silince onun indexine diger sayi gekir. O sayiyiyi okumak icin i yi azaltiriz.
				
			}else {
				
				list1.set(i, list1.get(i)*5);
				
			}
			
		}
		
		System.out.println(list1);
		
	}

}