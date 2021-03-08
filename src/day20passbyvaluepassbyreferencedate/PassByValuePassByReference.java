package day20passbyvaluepassbyreferencedate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PassByValuePassByReference {

	public static void main(String[] args) {
	
		int price = 100;
		
		//price = discount(price);
		//System.out.println(discount(price));//?
		//System.out.println(price);//?
		
//		String str = "Java";
//		System.out.println(concatenate(str));//JavaX
//		System.out.println(str);//Java
//		
//		List <Integer> list =new ArrayList<>();
//		list.add(11);
//		list.add(12);
//		list.add(13);
//		System.out.println(updateAllElement(list));
//		System.out.println(list);
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a String");
		String d = scan.next();
		
		String a = "Java";
		String b = "Java";
		String c = new String("Java");
		System.out.println(a + "-" + b + "-" + c);//Java-Java-Java
		System.out.println();
		System.out.println(a==b);//True => String pool
		System.out.println(a==c);//False value lar ayni referanslar farkli.
		System.out.println(a==d);//false
		System.out.println(a.equals(d));//true
		System.out.println(a.equals(c));//true
		
		scan.close();
	
	}
	
	public static int discount(int price) {
		price = price - 10;
		return price;
	}

	public static String concatenate(String str) {
	
	str = str + "x";
	return str;


	
}
	public static List<Integer>  updateAllElement(List<Integer> list){
		
		for(int i =0; i<list.size(); i++) {
			list.set(1, list.get(i)+3);
		}
		return list;
	}
}