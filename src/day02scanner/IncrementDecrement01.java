package day02scanner;

public class IncrementDecrement01 {

	//Increment: If you increase the value of a variable,
			//then this process is caled as "increment"
	public static void main(String[] args) {
		
		int num1 = 5;
		System.out.println("Befare increment "+ num1);//5
		
		//increase the value of num1 by 3.
		////1.way:
		num1 = num1 +3;
		System.out.println("After increment "+num1);//8
		
		//2.way
		num1 += 3;
		System.out.println("After increment "+num1);//11
		
		//3.way: This way can be used just to increase by 1
		//Bu yol yalnızca 1 artırmak için kullanılabilir
		num1++;
		System.out.println("After increment "+ num1);//12
		
		//Note: increment can be done by multiplication as well 
		num1 = num1 * 2;
		System.out.println("After multipcation increment " + num1);//24
		
		num1*=2;
		System.out.println("After multipcation increment " + num1);//48
		
		//Decrease the num1 by 2
		//1.way:
		num1 = num1 - 2;
		System.out.println("After decrement "+ num1);//46
		
		//2.way:
		num1 -= 2;
		System.out.println("After decrement "+ num1);//44
		
		//3.way: This way cam be used just to decrease by 1
		num1--;
		num1--;
		System.out.println("After decrement "+ num1);//43
		
		//Note: Decrement can be done by division as well
				num1 = num1 / 2;
				System.out.println("After division decrement " + num1);//21
				
				num1 /= 3;
				System.out.println("After division decrement " + num1);//7
		
		
		

	}

}
