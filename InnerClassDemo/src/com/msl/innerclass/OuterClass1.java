package com.msl.innerclass;

public class OuterClass1 {
	private String message = "Welcome to Java";
	
	class Inner{
		
		void hello() {
			System.out.println(message + " Let us learn Inner classes");
		}
	}

	public static void main(String[] args) {
		OuterClass1 outC1 = new OuterClass1();
		OuterClass1.Inner innerObj = outC1.new Inner();
		innerObj.hello();

	}

}
