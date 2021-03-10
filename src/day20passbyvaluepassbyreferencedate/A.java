package day20passbyvaluepassbyreferencedate;

public class A {

	public static void main(String[] args) {
		
		int a[] = {1, 2};

		int b[] = {3, 2, 1};



		for(int w : a) {

			for(int m : b) {

					System.out.print(w + m + " ");
	}

	}
}}