package day12dowhileloop;

public class Car {

	/*
	 When we creat a class, Java knows you will create objects.
	 To create objects you need "constructor", necause of that Java puts "constructor" behind the class for you.
	 That kind of constructors are called "default constructor"
	 */
	public String make ="Honda";
public String model ="Accord";
public int price =20000;
public int year =2020;
		
	public static void main(String[] args) {
		
		Car myCar1 = new Car();
		
		System.out.println(myCar1.make);//Honda
		System.out.println(myCar1.model);//Accord
		System.out.println(myCar1.price);//20000
		System.out.println(myCar1.year);//2020
		
		myCar1.move();//Moves fast
		myCar1.stop();//The car can stop
		
		
	}

	public static void move() {
		System.out.println("Moves fast");
		
		
	}
	
	
	
	public static void stop() {
		System.out.println("The car can stop");
		
		
	}
}
