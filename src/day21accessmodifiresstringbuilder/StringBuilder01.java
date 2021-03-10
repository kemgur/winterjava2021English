package day21accessmodifiresstringbuilder;

public class StringBuilder01 {

	/*
	 1)String Class'i "immutable(Degistirilemez)" dir.
	  Java "mutable(Degistirilebilir)" String'ler
	   uretebilmemiz icin "StringBuilder" isimli bir class uretti.
	 2)Java'da "StringBuilder" ile hemen hemen ayni isi yapan
	  bir de "StringBuffer" class'i var.
	   "StringBuffer" class'i "StringBuilder" class'indan daha once uretilmisti.
	   StringBuffer yavas calisan bir class'dir, StringBuilder hizli calisir.  
	   Stringbuffer "synchronize" islemlerini yapabilir ama StringBuilder yapamaz.	   
	 3)Ayni anda bir cok isin yapilmasina "multi threading" denir.
	  "multi" = Cok, "thread" = Yapilan islerin herbiri
	   Multi threading varsa, bu islerin siraya konulmasi lazim.
	    Islerin siraya konulmasina "synchronization" denir. 
	 */

	
	public static void main(String[] args) {
		
		//How to create a String by using "StringBuilder Class"
		//If you will add new characters constantly int you String use 1st way
		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1);//Empty String
		
		System.out.println(sb1.capacity());//16 is the default capacity
		
		sb1.append("Ali Can");
		sb1.append(" is a student");
		
		System.out.println(sb1);//Ali Can is a student
		
		//2.Way:
		StringBuilder sb2 = new StringBuilder("Veli Han is a parent");
		System.out.println(sb2);
		
		//3.Way:
		StringBuilder sb3 = new StringBuilder(5);//length of the String
		sb3.append("Javaxx");
		
		System.out.println(sb3.capacity());//5 <== It returns the capacity of the StringBuilder field
		System.out.println(sb3.length());//4 <== It return s the number of characters

		
	}

}