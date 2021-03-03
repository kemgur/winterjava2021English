package interviewQuestions;

public class Soru3_ArrayMaxMinFarki {

	
	//Verilen bir arraydaki maximum ve minumum degerlerini bulup
	//max-min degerlerini yazdiran bir method yaziniz
	//{25,14,3,56,87,45,62};
	
	public static void main(String[] args) {
		
		int[] arr = {25,14,3,56,87,45,62};
		farkiBul(arr);
		

	}

	private static void farkiBul(int[] arr) {
		
		int maxSayi = Integer.MIN_VALUE;
		int minSayi = Integer.MAX_VALUE;
		
		 
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i]>maxSayi) {  //25 max=25,-> 14 ,-> 3, -> 56 max=56
                maxSayi=arr[i];
            }
            
            if (arr[i]<minSayi) { // 25 min=25,-> 14, min=14, ->3 min=3, ->56 
                minSayi=arr[i];
            }
        }
        System.out.println("Arraydeki maximum sayi : " + maxSayi +
                "\narraydeki minumum sayi : "+ minSayi +
                "\nMax ve min sayilar arasindaki fark : " + (maxSayi-minSayi));
		
	}

}
