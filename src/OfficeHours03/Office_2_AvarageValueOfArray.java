package OfficeHours03;

public class Office_2_AvarageValueOfArray {

	/*
	 * write a java program that calculates the average value of array elements
         *
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
	 */
	public static void main(String[] args) {
		
		int [] input = {1,2,3,4,5,6,7};
		int sum =0;
		for (int i = 0; i < input.length; i++) {
			sum = sum + input[i];
			
		}
		//Calculate the avarage
		double avarage = sum/input.length;
		System.out.println("Avarage of elements in the given array " + avarage);
	}

}
