package day10forloop;

public class ForLoop3 {

	/*
	 Find the sum of all integer from 10 to 200
	 */
	public static void main(String[] args) {
		
		sumOfAllInt();//20055

	}

	public static void sumOfAllInt() {
		
		int sum =0;
		
		for(int i =10 ; i<=200 ; i++) {
			sum = sum+i; //sum +=i works as well.
			
			System.out.println(sum);
			//If you want to see the sum value for every loop, put "System.out.println(sum);" indide the "for loop"
	}
		System.out.println(sum);//20055
		//if you type "System.out.println(sum:)" after the "for loop" it will display the final value of sum.
		//System.out.println(sum)
	}
    }
