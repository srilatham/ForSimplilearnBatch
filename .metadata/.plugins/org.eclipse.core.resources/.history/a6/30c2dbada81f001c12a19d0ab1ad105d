package com.msl.sampleobj;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.msl.package1.ModifierDemo2;

public class Test {
	public static void mainOld2(String[] args) {
		
		ModifierDemo1 demo1 = new ModifierDemo1();
		//demo1.result
		
		ModifierDemo2 demo2 = new ModifierDemo2();
		
		System.out.println(demo2.display());
		
		String message = demo2.display();
		//
		int basicSal=2000;
		
		int salary = demo2.calculateSalary(basicSal,500,"New");
		
		if(salary == 0) {
			System.out.println("Details not available, please consult HR");
		}else {
		
			System.out.println("salary: " + salary);
		}
		
		//StringBuilder
		StringBuilder stringBuilder = new StringBuilder("Hello");
		stringBuilder.append("World");
	
		
		
		
	}

	public static void mainOld(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Hello World everyone");
		
		//Create Student Objects
		Student student1 = new Student();
		// putting exact details to the student1 object
		student1.setRollNumber(1);
		student1.setFirstName("srilatha");
		student1.setLastName("matam");
		//concatenation
		System.out.println("student1:" + student1.getRollNumber());
		System.out.println("student1:" + student1.getFirstName());
		System.out.println("student1:" + student1.getLastName());
		
		System.out.println("student1:" + student1.toString());

		Student student2 = new Student(2,"msl","abc");
		System.out.println("student2:" + student2.toString());
		
		Student.batchName = "Cisco";
		
		System.out.println("student1: " + student1.batchName);
		
		student2.batchName = "FSD";
		
		System.out.println("student2: " + student2.batchName);
		System.out.println("student1: " + student1.batchName);
		
		//boolean available = false;  //true or false
		int age = 18;
		if(age > 18) {
			System.out.println("Allowed");
			
		}else if(age <18){
			System.out.println("Not Allowed");
		}else {
			System.out.println("Not sure");
		}
		
		
		//loops
		for(int i = 1;i<11;i=i+1) {
			/*
			if(i == 5) {
				break;
			}
			*/
			if(i==6) {
				continue;
			}
			
			System.out.println(i);
		}
		
		//System.out.println("After for loop");
		//while
		int counter=10;
		while(counter < 20 ) {
			//assuming some processsing is happening here
			System.out.println("counter :" + counter);
			counter++; //counter = counter + 1
			
		}
		
		//do while
		
		do{
			//assuming some processsing is happening here
			System.out.println("do while counter :" + counter);
			counter++; //counter = counter + 1
			
		}while(counter < 20);
		
		//implicit type casting
		int a = 20;
		double d = a;
		
		//explicit
		int c = (int) d;
	
				
	}

	public static void mainold3(String[] args) {
		
		int codes[] = new int[5];
		int counter = 0;
		
		for(int i=0;i<codes.length;i++ ) {
			
			counter = counter + 5;
			codes[i] = counter;
			
	//		System.out.println("codes["+ i + "]:" + codes[i]);
		}
		
		
		int marks[]= {50,60,70,100};
		
		for(int i =0;i<marks.length;i++) {
			
			System.out.println(marks[i]);
		}
		
		//2 dimensional 2 by 5
		
		int geoPosition[][]= new int[2][5];
		int value = 5;
		
		for(int row=0;row < 2; row++) {
			
			for(int col=0;col < 5;col++) {
				geoPosition[row][col] = value;
				value = value + 5;
				
				System.out.println("geoPosition["+ row + "]" +"[" + col + "]:" + geoPosition[row][col]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		String regExp = "[a-zA-Z0-9]+";
		String text = "this is a Sample to see of Mixed 2case alpa4hBets are matc7hed";
		
		Pattern pattern = Pattern.compile(regExp);
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			
			System.out.println(text.substring(matcher.start(), matcher.end()));
		}
		
	}
}

















