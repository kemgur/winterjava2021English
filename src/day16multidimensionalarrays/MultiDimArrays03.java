package day16multidimensionalarrays;

public class MultiDimArrays03 {

	public static void main(String[] args) {
	
		String arr[][] = {{"A", "B"},{"K","e"},{"L","e"}};
		//By using giveb multidimentional array, print "bee" ion the console
	String s = "";
	for(int i =0; i<arr.length; i++) {
				
			s =s + arr[i][arr[i].length-1];	
		
	}
	System.out.println(s);
	
	//Homework
	//Find the multiplicational the first elements in every array
	int brr[][]= {{32,12,11},{21,34},{3}};
	
		int  brr1 =1;
	
	for (int i = 0; i < brr.length; i++) {

			brr1=brr1 * brr[i][0];	
	}
	System.out.println(brr1);//2016
	}

}
