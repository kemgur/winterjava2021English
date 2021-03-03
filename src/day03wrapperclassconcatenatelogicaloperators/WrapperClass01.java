package day03wrapperclassconcatenatelogicaloperators;

public class WrapperClass01 {

	
	/*
	 Wrapper Class: Java created some objects whose values are coming from
	 				primitive data types but the objects have methods as well.
	 				
	  Wrapper Class for boolean ==> Boolean 
        **** Wrapper Class for char ==> Character
        Wrapper Class for byte ==> Byte
        Wrapper Class for short ==> Short
        **** Wrapper Class for int ==> Integer
        Wrapper Class for long ==> Long
        Wrapper Class for float ==> Float
        Wrapper Class for double ==> Double
	 
	 
	 				
	 */
	public static void main(String[] args) {
		
//		Integer i = 12;
//		Boolean b = true;
		
		
		
		//Find the min and max value of byte data type.
		Byte byteMin = Byte.MIN_VALUE;
		System.out.println(byteMin);//-128
		Byte byteMax = Byte.MAX_VALUE;
		System.out.println(byteMax);//127
		
		//Find the min and max value of short data type.
		Short sortMin = Short.MIN_VALUE;
		System.out.println(sortMin);//-32768
		Short sortMax = Short.MAX_VALUE;
		System.out.println(sortMax);//32767
		
		//Homerwork :  Find all min and all max values of primitive data types
		
		//Find the min and max value of int data type.
		Integer intMin = Integer.MIN_VALUE;
		System.out.println(intMin);
		Integer intMax = Integer.MIN_VALUE;
		System.out.println(intMax);
		
		//Find the min and max value of long data type.
		Long longMin = Long.MIN_VALUE;
		System.out.println(longMin );
		Long longMax = Long.MAX_VALUE;
		System.out.println(longMax);
		
		//Find the min and max value of float data type.
		Float floatMin = Float.MIN_VALUE;
		System.out.println(floatMin);
		Float floatMax = Float.MAX_VALUE;
		System.out.println(floatMax);
		
		//Find the min and max value of double data type.
		Double doubleMin = Double.MIN_VALUE;
		System.out.println(doubleMin);
		Double doubleMax = Double.MAX_VALUE;
		System.out.println(doubleMax);
		
		
		
	}

}
