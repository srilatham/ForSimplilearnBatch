package com.msl.search;

public class BinarySearchDemo {

	public static void main(String[] args) {
	
		int arr[] = {7,12,45,89,90};
		int searchKey = 12;
		
		binarySearch(arr,0,searchKey,arr.length-1);
	

	}
	
	public static void binarySearch(int arr[],int start,int search,int length) {
		int midValue = (start + length) /2;
		
		while(start <= length) {
			
			if(arr[midValue] < search) {
				start = midValue + 1;
				
			}else if (arr[midValue] == search) {
				System.out.println("Found " + search + " at "+ midValue );
				break;
			}else {
				
				length = midValue - 1;
			}
			midValue = (start + length)/2;
		}
		
		if(start > length) {
			System.out.println(search + " not found");
		}
		
		
		
	}

}
