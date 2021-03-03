package day14constructorsstatickeywordarrays;

import java.util.Arrays;

public class Arrays01 {

	/*
	 To store multiple values, we need "Arrays"
	 */
	
	public static void main(String[] args) {
		

		/*How to create an array?
		 1) Decide which data type will you store.
		 2) Put a name for the array 
		 3) After the name "[]"
		 4) put the data type again with brackets==>[]
		 */
		
		int array1[] = new int[5];
		
		//1.Way no create and assign values.
		array1[1]=11;
		array1[4]=22;
		array1[3]=33;
		array1[2] =272;
		array1[0]=-2;
		
		System.out.println(Arrays.toString(array1));//[0, 0, 0, 0, 0]

		//2.way to create and addign values.
		String array2[] = {"Ali", "Can", "Kemal", "Mary"};
		System.out.println(Arrays.toString(array2));//[Ali, Can, Kemal, Mary]
		
		//How to ubdate an element
		array2[1] ="Canan";
		System.out.println(Arrays.toString(array2));
		
		//How to add elemnts more than size.
		//if you try to add elemnts more than the size of the array, you will get run time error.
//		array2[4] ="Angie";
//		System.out.println(Arrays.toString(array2));//RTE
		
		//Ubdate all elemnts to "Joe"
		
		for (int i = 0; i < array2.length; i++) {
			array2[i]="Joe";	
		}
		System.out.println(Arrays.toString(array2));//[Joe, Joe, Joe, Joe]
		
		//How to print array1 elements one by one on the console in different lines.
		int k = 0;
		while(k<array1.length) {
			System.out.println(array1[k]);
			k++;
		}
		System.out.println(Arrays.toString(array1));//[-2, 11, 272, 33, 22]
		System.out.println();
		
		//How to find the sum of all "array1" element
		
		int m =0;
		int sum = 0;
		do {
			sum =sum +array1[m];
			m++;	
		}while(m<array1.length);
		System.out.println("The sum of elements is " + sum);//The sum of elements is 336
		
		//Replace "*" for all the character 'J' in array2
		
		for(int i =0; i<array2.length; i++) {
			array2[i] = array2[i].replace("J", "*");
			//Assignment yapmadan kode degismeyebilir.
		}	
	System.out.println(Arrays.toString(array2));//[*oe, *oe, *oe, *oe]
	
		
		
	}

}
