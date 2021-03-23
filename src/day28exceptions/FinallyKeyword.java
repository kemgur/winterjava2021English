package day28exceptions;

public class FinallyKeyword {

	public static void main(String[] args) {
		/*
		 Finally keyword: 
​
1) Why do we use it? ==> To end connections with cloud, to end connection with database; 
2) How do we use it? ==> 
	a)in a try-catch-finally block:
​
public static void div(int a, int b) {
		try {
		System.out.println(a/b); (12,0) 
		}catch(ArithmeticException e) {
			System.out.println("Do not use zero for the second parameter");
		} finally {
			System.out.println("Do you want to do more operations?"); //it excecutes both catch and finally
		}
	}
​
b) with a try block regardless of whether a catch block is present:
try {
    System.out.println("Inside try");
} finally {
    System.out.println("Inside finally");
}
​
3) What is finally keyword? ==> finally defines a block of code we use along with the try keyword. It defines code that's always run after the try and any catch block, before the method is completed.
​
​
a)Finally will be excecuted in any condition and It is excecuted everytime; 
b) It is used in try catch; 
​
Summary: 
The finally keyword is used to execute code (used with exceptions - try..catch statements) no matter if there is an exception or not.
		 */
	}

}
