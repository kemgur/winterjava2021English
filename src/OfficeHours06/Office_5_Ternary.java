package OfficeHours06;

public class Office_5_Ternary {

	public static void main(String[] args) {
		
		char c='z';
		System.out.println("c: "+c);//c: z

		char d=c--; //c='y';
		System.out.println("d: "+d);
		
		System.out.println("new c: "+c);//new c: y
		
		char e=--c;
		System.out.println("e: "+e);//e: x
		
		System.out.println("c last: "+c);//c last: x
		
		char f=c-=2;
		System.out.println("f: "+f);
		System.out.println("the latest c: "+c);
		
		System.out.println(c+d+e+f);//478 Sum of Ascii Values
		System.out.println(""+c+d+e+f);//vzxv
		
		char result= (d>e)?(e>f)?f:(d>f)?e:d:f;
		
		System.out.println(result);//v
		
		

	}

}
