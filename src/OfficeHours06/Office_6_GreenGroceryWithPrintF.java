package OfficeHours06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Office_6_GreenGroceryWithPrintF {
/*
 * Write a basic green grocery shopping program
 * 1. Step: Ask to the user to choose product from productList and ask how many kilograms
 * does he/she likes to buy
 * Please select by number at the beginning
			Num 	Grocery 	Price
			====	 =======	 =========
			00	 Tomatoes   	 $ 2.10
			01	 Potatoes   	 $ 3.20
			02	 Pepper     	 $ 1.50
			03	 Onion      	 $ 2.30
			04	 Carrot     	 $ 3.10
			05	 Apple      	 $ 1.20
			06	 Banana     	 $ 1.90
			07	 Strawberry 	 $ 6.10
			08	 Melon      	 $ 4.30
			09	 Grape      	 $ 2.70
			10	 Lemon      	 $ 0.50
 * 2. Step : Ask if he wants to buy any other product or not-- If he doesn't want
 * show total amount if he wants make him choose any product from the beginning
 * Repeat this operation until she/he wants to finish the shopping.
 *
 * 3. Step: When customer chooses any product and the price of the product will be added
 * to the total amount.
 *
 * 4. Step : Show the total amount when the shopping finishes.
 *
 *  Create two methods named customerChoice() and cash()
 */
	static List <String> grocery = new ArrayList<>();
	static List <Float> price = new ArrayList<>();
	static float total =0;
	
	
	public static void main(String[] args) {
		
		grocery.add("00 - Tomatoes \n");
		grocery.add("01 - Potatoes \n");
		grocery.add("02 - Pepper \n");
		grocery.add("03 - Onion \n");
		grocery.add("04 - Carrot \n");
		grocery.add("05 - Apple 'n");
		grocery.add("06 - Banana \n");
		grocery.add("07 - Strawberry \n");
		grocery.add("08 - Melon \n");
		grocery.add("09 - Grape \n");
		grocery.add("10 - Lemon");
		
		price.add(2.10f);
		price.add(3.20f);
		price.add(1.50f);
		price.add(2.30f);
		price.add(3.10f);
		price.add(1.20f);
		price.add(1.90f);
		price.add(6.10f);
		price.add(4.30f);
		price.add(2.70f);
		price.add(0.50f);
		
		System.out.print(grocery.toString());
		System.out.println();
		order();
		
	}
	public static void order() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Which product would you like to buy");
		int groceryList =scan.nextInt();
		System.out.println("How many pounds would you like to get");
		float pounds =scan.nextFloat();
		
		float oneProductPrice = price.get(groceryList);
		float oneProductAllPrice = oneProductPrice * pounds;
		total+=oneProductAllPrice;
		
		System.out.println("The product of your choice : "+ grocery.get(groceryList));
		System.out.println("Product price : "+ oneProductAllPrice);
		
		System.out.println("If you want to continue shopping: 1 click \\ n If you want to go to the checkout: 2 clicks");
		int choose = scan.nextInt();
		
		if(choose==1) {
			order();
		
		}else {
			System.out.println("All total : "+ oneProductAllPrice);
		}
			scan.close();
		
	}

}
