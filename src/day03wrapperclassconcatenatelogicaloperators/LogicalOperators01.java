package day03wrapperclassconcatenatelogicaloperators;

public class LogicalOperators01 {

	/*
	 Operator in java
	 
	 1) = is assignment operator.
	 	  Get the value from right and puts i t into container on the left
	 	  For example; int s =12;
	 	  
	 NOte: Following are "Compararison Operator"	  
	 	  "Compararison Operator" return boolean everytime.
	 2) == is equal sign in java
	 5 == 2+3 return boolean
	 If left part to rigth part, it returns "true", otherwise it return false	
	 
	 3) != means "not equal"  
	 	!= returns boolean,
	 	If left part does not equal to right part, it returns "true", otherwise it return false
	 	Note: ! ==> Not for java.
	 	
	 4) > means greater than
	 	> return boolean.
	 	
	 5) <  means less than
	 	<  return boolean.
	 	
	 6) >= means greater than or equal to
	 	>= returns boolen.
	 	
	 7) <= means less than or equal to
	 	<= returns boolen.	
	 	
	 Note: Foolowing are "Logical Operator"
	  "Logical Operator" return boolean everytime
	 
	 8) && And operator
	 	&& returns true if everything is true
	 	
	 9) || 	Or operator
	 	||returns false if everythings is false.
	 	
	 10) & And operator
	 	 & returns true if everything is true
	 	
	 	
	 */
	public static void main(String[] args) {
		
		System.out.println( 5 == 2+3);//True
		System.out.println( 5 == 4+3);//False
		
		System.out.println(5 != 2+3);//false
		System.out.println(5 != 4+3);//True
		
		System.out.println(5>3);//true
		
		System.out.println(5>=5);//true
		System.out.println(5<=3);//false
		
		System.out.println((5<7) && (3>1)&& (4==4));//true
		System.out.println((5<7) && (3>1)&& (4==5));//false
		
		System.out.println((8<7) || (3>11)|| (5==4));//false
		System.out.println((8<7) || (3>11)|| (4==4));//true
		
		// What is the difference between && ans &
		System.out.println((5>7) & (3>1) & (4==4));//false

		
	
	}

}
