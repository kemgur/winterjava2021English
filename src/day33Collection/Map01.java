package day33Collection;

import java.util.HashMap;

public class Map01 {

	public static void main(String[] args) {
		
		/*
		 1) HashMap puts the elements in random order, because of that ist is fast
		 2) HashMap is "not thread-safe" that is ; HashMap objects cannot be used in multithreading
		 3) HashMap is "not synchronized" that is; HashHap objects can not be synchronized
		 4) HashMap can have a single "null" in key part
		 5) HashMap can have multiple null values in "values" part
		 
		 */
		HashMap<String, Integer> hm = new HashMap<>();
		
		hm.put("Cat", 3);
		hm.put("Caterpillar", 11);
		hm.put("Lion", 4);
		hm.put("Tiger", 5);
		
		System.out.println(hm);
		
		//keySet() method returns just keys in Set Coolection
		System.out.println(hm.keySet());//[Cat, Lion, Caterpillar, Tiger]
		
		//values()method return all values in Coolection
		System.out.println(hm.values());//[3, 4, 11, 5]
		

	}

}
