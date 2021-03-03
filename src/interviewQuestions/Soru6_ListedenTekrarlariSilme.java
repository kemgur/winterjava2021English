package interviewQuestions;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Soru6_ListedenTekrarlariSilme {

	public static void main(String[] args) {
		

		/*
		 kullanicidan sifirdan farkli int degerler alarak bir list olusturun
	     kullanici 0'a basarsa sayi alma islemi bitsin
	     sonra girilen sayilardan tekrar edenleri silip listeyi yazdirin 
	     
		 */
		
		   int sayi = 15; 
		
		   Scanner scan=new Scanner(System.in);
	       List<Integer> liste = new ArrayList<>();
	       
	        
	        while(sayi!=0) {
	        	System.out.println("Listeye ekleyerek intediginiz tamsayiyi giriniz"
	     		+"\nBitirmek icin 0'a basiniz");
	        	sayi = scan.nextInt();
	        	if(sayi!=0) {
	        		liste.add(sayi);
	        		
	        	}
	        }
	        System.out.println("Girdiginiz liste : " + liste);

	        //Bir listeden tekrar eden sayilari nasil silersiniz.
	        //yeni bir list olustururuz, ilk listeden elementleri alir,
	        //yeni listede yoksa ekleriz 25, 36, 15 ....
	        
	        List<Integer> yeniList = new ArrayList<>();
	        for(Integer each : liste) {
	        	if(!yeniList.contains(each)) {
	        		yeniList.add(each);
	        		
	        	}
	        	
	        }
	        System.out.println("Listenin tekrarsiz hali : " + yeniList);
	        
	        //2.yol:
	        //Girilen sayilarin olusturuldugu listeyi Set'e donustururum
	        //convert islemi aklimiza gelmezse bir Set olusturup listdeki tup 
	        //sayilari Set'e ekleyebilir siniz.Set matematikte kumelere denk gelir
	        
	        Set <Integer> sayilarKumesi = new HashSet<>(liste);
	        System.out.println("Set ile tekrarsiz liste : "+ sayilarKumesi);
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	}

}
