package day24inheritanceoverriding;

/*
 1)To create an object you can use just a single constructor
		 	2)super() keyword must be in the first line inside the constructor
		 	3)You can use super() just once in a constructor.
		 	4)If you make constructor call for a non-existing constructor from
		 	 parent class, you will get compile time error.
		 	5)this() ==> Calls the constructors inside the class itself
		 	 super() ==> Calls the constructors from parent class
		 	 
		 	 public Animal(int height, int weight) {
			 this.height = height;
			 this.weight = weight;}
			 
			 
			 public Mammal(boolean haveBaby) {
			 this.haveBaby = haveBaby;}
			 
			 
	}
 */

public class Animal {
	
	public int height;
	public int weight;

	public Animal() {
		this(5);
		System.out.println("Animal constructor without parameter...");
	}
	
	public Animal(int a) {
		System.out.println("Animal constructor with int parameter");
	}
	
	public Animal(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}
}