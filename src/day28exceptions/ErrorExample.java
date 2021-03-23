package day28exceptions;

import java.util.ArrayList;
import java.util.List;

public class ErrorExample {

	/*
	 Errors connot be handled but Exceptions can be.
	 Error examples; Out of Memory Error, Stack over flow error, Crash memory error.
	 */
	public static void main(String[] args) {
		
		List <Object> list = new ArrayList<>();
		
		for (int i = 0; i < 3; i--) {
			System.out.println(i + " ");
			Object obj  = new Object();
			
		}
	}

}
