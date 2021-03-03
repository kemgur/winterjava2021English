package week02;

import java.util.Scanner;

public class P_Q03_Ternary_Price {

	/*
    Write a code using ternary:
Create int variable : price
Create string variable : decision
If the price = $10 Print “it's cheap”
If price is 10-$20 print “it's ok” 
Otherwise “it's expensive”.
ORNEK:
INPUT      : price= 12                
OUTPUT  : it's ok
INPUT      : price= 10                
OUTPUT  : it's cheap
INPUT      : price= 23                
OUTPUT  : it's expensive
    */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a price");
		int price = scan.nextInt();
		
		String decision = (price<=10) ? ("it's cheap"): (price>10 &&price <20 ? "it's ok" : "it's expensive");
		System.out.println(decision);
		
scan.close();
	}

}
