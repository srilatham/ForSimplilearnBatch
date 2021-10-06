package com.msl.innerclass;

public class OuterClass2 {
	String message = "Inner class in method";

	public void display() {
		class Inner{
			void showMessage() {
				System.out.println(message);
			}
		}
		
		Inner inner = new Inner();
		inner.showMessage();
	}
	
	
	public static void main(String[] args) {
		OuterClass2 outer = new OuterClass2();
		outer.display();
	}
}
