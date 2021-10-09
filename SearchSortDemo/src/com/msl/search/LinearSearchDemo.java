package com.msl.search;

import java.util.Scanner;

public class LinearSearchDemo {

	public static void main(String[] args) {
	int arr[]= {23,45,67,12,89};
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the search value:");
	
	int searchValue = scan.nextInt();
	
	scan.close();
	int result = linearSearch(arr,searchValue);
	
	if(result == -1) {
		System.out.println(searchValue + "  not found");
	}else {
		System.out.println(searchValue + " found at index " + result);
	}
	
	}
	
	public static int linearSearch(int arr[],int searchValue) {
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] == searchValue) {
				return i;
			
			}
		}
		
		return -1;
	}

}
