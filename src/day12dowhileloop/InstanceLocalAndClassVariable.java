package day12dowhileloop;

public class InstanceLocalAndClassVariable {

	/*
	 1) If a varibale is created
	    a) inside the class but outside the main method and
	    b) it is not "static"
	    then it is called "Instance Variable" 
	Note: If you don't assign any value for a instance variable,
	    Java assigns, "0" for it, if the variable is a number.
	      The values which Java assigns are called "default value"
	      
	  2) If a variable  is created
	     a) inside the class but outside the main method and;
	     b) it is "static"
	    then it is called "Class Variable"   
	    Note: The main differences between "static(class)" and "instance(object)" variable is that.
		       a) All uptades on a sttsic variable is visible by all objects which are created from the class but
		          all updates on an "instance variable" is visible just by the object
		       b) "static variable" are common for all objects, but instance variables are specifies for an object 
	 
	  3) If a variable is created inside a method, it is called "local variable"	
	     Note: For "local variables", there is no default value.
	     You have to assign value, when you create a local variable.       
	 */
	
	int i = 12; //This is instance variable
	int k; //This is instance variable(default value is 0)
	String str;//This is instance variable , default value is null
	boolean bl; //This is instance variable , default value is false.
	char ch; //This is instance variable , default value is ''
	
	
	public static void main(String[] args) {
		//local variable'in basina static yazmaya gerek yok.
		short sh =11;//This is "local variable"
		sh++;
		
	
		
		
	}
}
