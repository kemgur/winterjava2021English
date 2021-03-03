package day10forloop;

public class ForLoop01 {

	public static void main(String[] args) {
		printEvenInt();
		printEvenInt1();
		printDivInt();

	}
/*
 Print all even integers from 100 to 23 on the console in the same line with a space among them.
 */
	//1.Way:
	public static void printEvenInt() {
		
		for (int i = 100; i>=23; i--) {
			if(i%2==0) {
				System.out.print(i +" ");
			}
			
		}
		System.out.println();
	}
	
  //2.Way:
  public static void printEvenInt1() {
		
		for (int i = 100; i>22; i=i-2) {
			
			System.out.print(i +" ");
			
		}
  }
		/*
		 Print all integers which divisible by 5 from 100 to 23 on the console in the same line with a space among them.
		 */
//1.Way:
		public static void printDivInt() {
			
			for (int i = 100; i>=23; i--) {
				if(i%5==0) {
					System.out.print(i +" ");
				}
				
			}
			System.out.println();
		
		
		
		
		}
}
