package week01dt;

public class Q01_Increment {

	public static void main(String[] args) {
		

		int a = 3;
		double d = 4.5;
		
		d +=a;
		a +=d;
		d -=a;
		a -=d;
		System.out.println("d = " + ++d);//-1.5
		System.out.println("a = " + a--);//12
		System.out.println(a);//11
	}

}
