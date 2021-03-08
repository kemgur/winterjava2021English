package day20passbyvaluepassbyreferencedate;

public class Varargs01 {

	/*
	1) If you want to method to run with different number of argument use varargs
	2) varargs behaves like lists but behind the varrags arrays work
	3) To declare a varargs use "int... a" or "String... s" etc.
	4) varargs must be the last parameter inside the method parenthesis  
	*/
	
	public static void main(String[] args) {
		
		System.out.println(add(3,4,5,7,9,11,-45));
		
		System.out.println(retirementPaymet("Mary Stone", 2,3,4,5,6));
		
	}

	public static int add(int... a) {
		
		int sum =0;
		
		for(int w : a) {
			sum = sum +w;
		}
		return sum;
	}
	public static String retirementPaymet(String empName, int... amount) {
		int result =1;
		
		for(int w :amount) {
			result = result *w;
		
		}
	return empName + ":" + result;
	}
	
}
