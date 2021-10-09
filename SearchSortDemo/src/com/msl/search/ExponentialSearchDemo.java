package com.msl.search;

import java.util.Arrays;

public class ExponentialSearchDemo {
	public static void main(String [] args) {
		int arr[]= {12,34,44,45,56,89,90};
		int searchKey = 90;
		
		int outcome = exponentialSearch(arr,arr.length,searchKey);
		
		if(outcome < 0) {
			System.out.println(searchKey+ " not found");
		}else {
			System.out.println(searchKey + " found at " + outcome);
		}
	}
	
	
	public static int exponentialSearch(int arr[],int length,int value) {
		
		if(arr[0] == value) {
			return 0;
		}
		
		int i = 1;
		while(i<length && arr[i] <= value) {
			i = i*2;
		}
		
		return Arrays.binarySearch(arr,i/2,Math.min(i, length), value) ;
	}

}
