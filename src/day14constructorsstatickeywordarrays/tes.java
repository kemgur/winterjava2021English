package day14constructorsstatickeywordarrays;

public class tes {

	static int a = 11;	
	
	public static void main(String[] args) {
		
		int x[] = { 3, 5, 7 };

		int a = 0;

		int b = 0;

		while (a < x.length) {

			b = b + x[a];

			a++;

		}

		System.out.println(b);;

	}
}
