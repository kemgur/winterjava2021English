package day13consructors;

public class Dog {

	private String name;
	private int weight;
	private int height;
	
	public Dog(String name, int weight, int height) {
		
		this.name =name;
		this.weight = weight;
		this.height = height;
		
	}
	public static void main(String[] args) {
//		
//		Dog dog1 = new Dog("Joe");
//		System.out.println(dog1.name);
//	    dog1.sound();
		
		System.out.println("=======================");
		
		//Creating a dog by using name, weight and height
		
		Dog dog2 = new Dog("Bobby", 24, 27);
		System.out.println(dog2.name);
		System.out.println(dog2.weight);
		System.out.println(dog2.height);
		dog2.sound();
		
		//If you want to access clas members, you should create object from the class.
	}

	public static void sound() {
		System.out.println("Dog bark...");
	}
}
