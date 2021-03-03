package day09methodoverloadingloops;

public class ForLoop01 {

	public static void main(String[] args) {
		printHello();
		printIntDesc();
	}
	
	/*
	 	Type code to print "Hello World!" 10 times on the console...
	*/
	public static void printHello() {
		
		for(int i=1; i<=3; i++){
			System.out.println("Hello World!");
		}
		
	}
	//Type code to print integefer from 12 to 5 on the console.
	public static void printIntDesc() {
		
		for (int i = 12; i >=5; i--) {
			System.out.print(i + " ");//12 11 10 9 8 7 6 5 
			
		}
		
	}
}


