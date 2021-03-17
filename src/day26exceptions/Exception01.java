package day26exceptions;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception01 {

	/*
	 1) There are 2 main types of Exceptions;
	    a) Compile Time Exception(Checked Exception)
	    b( Run Time Exception(Unchecked Exception)
	 2)After try block you can use 1 or more catch blocks
	 3)try block cannot be used alone  
	 4)When you use mutliple catch block, make the child exception classes first  
	 */
	
	/*
	 What is the meaning of "platform independent" 
	 */
	
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
//		//You may use nested try-catch block.
//		try {
//		fis = new FileInputStream("/Users/kemalgurler/eclipse-workspace/techproedsummer2020turkish2/src/day01variables/winterjava2021English/src/day26exceptions/File");
//		
//		int k = 0;
//		
//		try {
//			while((k = fis.read()) != -1) {
//				
//				System.out.print((char)k);
//				
//			}
//		} catch (IOException e) {
//			System.out.println("File could not be read");	
//		}
//		
//		}catch(FileNotFoundException e) {
//			System.out.println("File is deleted or path is wrong");
//			
//		}
		
		try {
			fis = new FileInputStream("/Users/kemalgurler/eclipse-workspace/techproedsummer2020turkish2/src/day01variables/winterjava2021English/src/day26exceptions/File");
			
			int k = 0;
			
			while((k = fis.read()) != -1) {
				
				System.out.print((char)k);
				
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());//path i ekrana yazdirir
			e.printStackTrace();
			
			System.out.println("File is deleted or path is wrong" + e.getMessage() );
			
		}catch(IOException e) {
			
			System.out.println("File could not be read");
	}
			
		
}
	
}




