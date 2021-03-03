package OfficeHours02;

import java.util.Scanner;

public class Question_03 {

	/*
     * Write a switch statement that tests the value of the char variable response and performs the following actions:
       if response is a, the message -- Your request is being processed-- is printed
       if response is b, the message -- Thank you anyway for your consideration -- is printed
       if response is c, the message -- Sorry, no help is currently available is -- printed
       for any other value of response, the message -- Invalid entry, please try again! -- is printed
       Create Scanner object.
       Use charAt() method, in order to get the char value at the specified index.
       * Example:
       -Display prompt: Enter command:
       input: a
       -Display prompt: Your request is being processed
       
       * Char değişkeni yanıtının değerini test eden ve aşağıdaki eylemleri gerçekleştiren bir anahtar ifadesi yazın:
       yanıt bir ise, - talebiniz işleniyor - mesaj yazdırılır
       yanıt b ise, - yine de değerlendirdiğiniz için teşekkür ederiz - mesaj yazdırılır
       yanıt c ise - Maalesef şu anda yardım yok - mesajı yazdırılır
       başka herhangi bir yanıt değeri için mesaj - Geçersiz giriş, lütfen tekrar deneyin! - yazdırılır
       Tarayıcı nesnesi oluşturun.
       Belirtilen dizindeki char değerini almak için charAt () yöntemini kullanın.
       * Misal:
       -Ekran istemi: Komutu girin:
       girdi: bir
       -Görüntüleme istemi: İsteğiniz işleniyor
     */

	public static void main(String[] args) {
		
		 Scanner scan=new Scanner(System.in);
	     System.out.println("Please enter char");
	     char ch = scan.next().charAt(0);
	     
	     switch (ch) {
	     case 'a':
	    	 System.out.println(" Your request is being processed");
	    	 break;
	     case 'b':
	    	 System.out.println(" Thank you anyway for your consideration");
	    	 break;	
	     case 'c':
	    	 System.out.println("Sorry, no help is currently available is");
	    	 break;	 
	     default :
	    	 System.out.println("Invalid entry, please try again!");
	    	 
	    	 
	     }
	     scan.close();
	}

}
