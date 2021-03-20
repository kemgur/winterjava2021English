package interviewQuestions;

public class ArraydeTekrarEdenSayiCountu {

	public static void main(String[] args) {
		//Arrayde tekrar eden sayilarin kac kez tekrar ettigini bulan java kodu

		int arr[]= {3,2,4,5,3,6,3};
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==3) {
				count++;
		}
		}System.out.println(count);	
		}
		}


