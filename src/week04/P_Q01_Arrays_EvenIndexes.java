package week04;

public class P_Q01_Arrays_EvenIndexes {

	/*
	 //Create a String array whose elements are : 
	//print the elements whose indexes are even on the console
	String arr[]= {"Ali", "John", "ALI", "Brad", "Mary", "Ayse"};

	 */
	public static void main(String[] args) {
		
		String arr[]= {"Ali", "John", "ALI", "Brad", "Mary", "Ayse"};
		
		String indx="";
		for(int i=0; i<arr.length;i++) {
			if (i%2==0) {
				indx=indx+arr[i];
			}
		}

		System.out.println(indx + " ");
	}

}
