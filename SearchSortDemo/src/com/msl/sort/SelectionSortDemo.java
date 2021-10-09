package com.msl.sort;

public class SelectionSortDemo {
	
	public static void main(String[] args) {
		
		int arr[] = {89,34,67,23,69,9,3,7};
		
		selectionSort(arr);
		
		System.out.println("Sorted values");
		
		for(int i:arr) {
			System.out.println(i);
		}
	}
	
	public static void selectionSort(int arr[]) {
		for(int i =0;i<arr.length - 1;i++) {
			int index = i;
			
			for(int j = i+1 ;j<arr.length;j++) {
				if(arr[j] < arr[index]) {
					index = j;
				}
			}
			
			int smallValue = arr[index];
			arr[index] = arr[i];
			arr[i]= smallValue;
		}
	}

}
