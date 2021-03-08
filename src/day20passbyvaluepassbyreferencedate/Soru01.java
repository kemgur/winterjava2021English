package day20passbyvaluepassbyreferencedate;

public class Soru01 {

	public static void main(String[] args) {
	

		int price = 100;
		
		//price = discount(price);
		
		System.out.println(discount(price));//?
		
		System.out.println(price);//?
		

	}
	
	public static int discount(int price) {
		price = price - 10;
		return price;
	}

}