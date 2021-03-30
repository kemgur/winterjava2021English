package day33Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Collection02 {

	/*
	 Queue:
	 1) elements are sorted in insertion order
	 */
	public static void main(String[] args) {
		
		Queue<String> q1 = new PriorityQueue<>();
		q1.add("Ali");
		q1.add("Veli");
		q1.add("Can");
		q1.add("Mary");
		System.out.println(q1);
		
		q1.element();//copy + paste => 1.elemani verir ama silmez ama ilk elemani Queue'den silmez.
		//Ilk eleman yoksa "NosuchElementException" verir.
		q1.peek();//copy +paste => Ilk elemani size verir, Queue'dan silmez, element methodundan farki 
		//ilk eleman yoksa "null" return eder.
		q1.poll(); // cut + paste => 
		
		//Deque: Double Ended Queue
		//
		
		
		
	
	
	
	}

}
