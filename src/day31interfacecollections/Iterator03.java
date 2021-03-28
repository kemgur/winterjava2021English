package day31interfacecollections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator03 {

	/*
	     Create an integer list
		 Increase all elements by 2
		 Print the “list elements” on the console in reverse order.
		 Print the list on the console in reverse order by using reverse()
	 */
	public static void main(String[] args) {
	
		List<Integer> list4 = new ArrayList<>();
		list4.add(12);
		list4.add(13);
		list4.add(14);
		list4.add(15);
		System.out.println(list4);
		
		ListIterator<Integer> it4 = list4.listIterator();
		while(it4.hasNext()) {
			it4.next();
			
		}
		while(it4.hasPrevious()) {
			Integer el = it4.previous();
			it4.set(el +2);
			System.out.println(el + " ");
		}

	}

}
