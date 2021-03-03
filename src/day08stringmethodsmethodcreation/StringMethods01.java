package day08stringmethodsmethodcreation;

public class StringMethods01 {

	public static void main(String[] args) {
		
		String str = "  Java is Java  ";

		//19) trim() method is used to delete space character 
		//from the beginning and from the end of the String
		System.out.println(str);//  Java is Java //14 
		System.out.println(str.trim());//Java is Java //12
		//trim() methodu space leri tras eder.
		

		/*
		 By using String methods change the String " Ali123 can?!@   "  to "Ali CAN"
		 */

		String str1 = " Ali123 can?!@   ";
		
		
		System.out.println(str1.length());//17
		System.out.println(str1.trim().length());//13
		
		System.out.println(str1.toLowerCase());//ali can
		System.out.println(str1.replaceAll("\\W", "").replace("123", " ").replace("can", "CAN"));
		
		//2.way
		String firstName = str1.substring(1,4);
		String lastName = str1.substring(8,11).toUpperCase();
		System.out.println(firstName +" "+  lastName);
		
		//concat() method is used to join String. "+" and "concat()" does the same.
		//But I recomend to use "concat()" instead of "+"
		firstName.concat(lastName);
		System.out.println(firstName.concat(" ").concat(lastName));//Ali CAN

		//3.way
		System.out.println(str1.trim().replaceAll("\\d", "").replace("can?!@", "CAN"));//Ali CAN
		
		/*
		 String str2 = "$12.99";
		  String str3 = "$8.00";
		  Find the sum of str2 and str3
		 */
		  String str2 = "$12.99";
		  String str3 = "$8.00";
		  String s2 = str2.replace("$", "").replace(".", "");
		  String s3 = str3.replace("$", "").replace(".", "");
		  
		  System.out.println(s2);//12.99
		  System.out.println(s3);//8.00
		  System.out.println(s2+s3);//12.998.00
		  
		  //Stringi integer a cevirerek toplama yapabiliriz.
		  //Dolar isaretini kaldirmazsak parseInt() methodu calismaz.
		  Integer.parseInt(s2);
		  System.out.println((Integer.parseInt(s2) + Integer.parseInt(s3))/100.0);
		//parseInt() method converts String  to integer, 
		  //if and only if the String is created just by digits.
		  
		  //valueOf() method converts Strings to integer, if and only the String is created just by digits.
		  System.out.println((Integer.valueOf(s2) + Integer.valueOf(s3))/100.0);
		  
		  //How to convert String to a decimal
		  String str4 = "$13.99";
		  String str5 = "$9.00";
		  
		  String s4 = str4.replace("$", "");
		  String s5 = str5.replace("$", "");
		  
		  System.out.println(s4);//13.99
		  System.out.println(s5);//9.00
		  
		  System.out.println(Double.parseDouble(s4) + Double.parseDouble(s5));//22.99
		  System.out.println(Double.valueOf(s4) + Double.valueOf(s5));//22.99
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		 
	}

}
