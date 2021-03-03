package day10forloop;
public class WhileLoop01 {
	public static void main(String[] args) {
		
		printOdd();
		printOdd2();
		div();
	}
	/*
	 Type a program to print odd integers from 4 to 25 in the same line with a space on the console.
	  1) use a for loop
	  2) use while-loop 
	 */

	public static void printOdd() {
	for(int i =4 ; i <=25 ; i++) {
		if(i%2==1) {
			System.out.print(i +" ");//5 7 9 11 13 15 17 19 21 23 25 
		}
		
	}
	System.out.println();
	}
	
	//while Loop
	public static void printOdd2() {
		
		int i = 4;
		while(i<26) {
			if(i%2!=0) {
				System.out.print(i +" ");//5 7 9 11 13 15 17 19 21 23 25 
			}
			i++;
		}
		System.out.println();
	}
	/*
	 Create a method to print integers which are divisible by 6 and 8 from 500 to 24 on the console. 
	 */
	
	public static void div() {
		
		int i=25;
		while(i<=500) {
			if(i%6==0 && i%8==0) {
				System.out.print(i +" ");
			}
			//Do not forget the icrement and decrement , otherwise it will be intinitive loop.
			i++;
		}
	}
	}
	