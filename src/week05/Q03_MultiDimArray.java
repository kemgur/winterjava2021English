package week05;




public class Q03_MultiDimArray {

	/*
	    Type a program that can add the even numbers in the array
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         * OUTPUT : The sum of even numbers is  : 26
	 */
	public static void main(String[] args) {
		
		int arr[][] ={{1,3,6},{2,8},{5,7,9,14}};
		 int sum =0;
		for (int i = 0; i < arr.length; i++) {
	       
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]%2 ==0) {
					sum = sum + arr[i][j];
                }
            }
        }
        System.out.println(sum);	
				}
	
}
	
