package com.msl.innerclass;

abstract class AnonymousInnerClass{
	public abstract void display();
}

/*
class Child extends AnonymousInnerClass{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		//fixed implementation
		
		System.out.println("Hello");
	}
	
	
}

Child c = new Child()
*/

public class OuterClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousInnerClass anonClass = new AnonymousInnerClass() {

			@Override
			public void display() {
				// TODO Auto-generated method stub
				System.out.println("Good morning");
	
			}
		
		};
		
		AnonymousInnerClass anonClass2 = new AnonymousInnerClass() {

			@Override
			public void display() {
				// TODO Auto-generated method stub
				System.out.println("Good evening");
				
			}
			
			
		};

		anonClass.display();
		anonClass2.display();

	}

}
