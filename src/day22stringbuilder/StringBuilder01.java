package day22stringbuilder;

public class StringBuilder01 {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("Java");
		StringBuilder sb2 = new StringBuilder("Java");
		//equal() in StringBuilder returns false even the value are same.
		//Because equal() method in StringBuilder uses "==" in it
		System.out.println(sb1.equals(sb2));
		
		//How can we compare the value of  StringBuilders?
		
		//1.Way : Convert StringBuilder to String then use equals() method
		System.out.println(sb1.toString().equals(sb2));//true);
		
		//2.way: Use compareTo() method
		//System.out.println(sb1.compareTo(sb2));//) ==> StringBuilders have same characters
		//If you get "0" be sure StringBuilder values are same.
		
		
	}

}
