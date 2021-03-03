package week03;

import java.util.Scanner;

public class P_Q08_DoWhile_OCAType {

	/*
	 Print numbers from given number till the next multiple of 10. e.g.,
	  if input is 5 it should print 5, 6, 7, 8, 9, 10 or
	  if input is 27 it should print 27, 28, 29, 30 or
	  if input is 40 then it should print 40.
	 */
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		
		m01(num);
		scan.close();
		

	}

	public static int m01(int num) {//num==5;
		while(num%10!=0) {
			System.out.println(num);//5,6,7,8,9' u yazdirir.
			num++;
		}
		System.out.print(num);//sadece 10 u yazdirir
		return num;
	}

}