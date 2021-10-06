package com.msl.trycatch;

public class MyClass {

	public static void main(String[] args) {
		
		int intArray[] = new int[3];
		
		try {
			intArray[2] = 34;
			System.out.println("After assigning");
			//connecting to database
			
			
			//check the pin
			//some logic
			
			
		}catch(ArrayIndexOutOfBoundsException exception) {
			exception.printStackTrace();
		}catch(Exception e) {
			//handle the incorrect pin
			
		//	throw new IncorrectPinException("Pin has to be 4 digit");
		}finally {
			//cleaning up code will go here
			System.out.println("In finally ");
		}
	}
}
