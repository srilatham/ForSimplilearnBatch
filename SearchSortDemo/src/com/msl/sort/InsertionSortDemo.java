package com.msl.sort;

public class InsertionSortDemo {

	public static void main(String[] args) {
	int arr[] = {99,89,87,76,2,3,11,88};
	
	insertionSort(arr);
	System.out.println("Sorted values");
	
	for(int i =0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}

	}
	
	
	public static void insertionSort(int arr[]) {
		for(int j = 1;j<arr.length;j++) {
			int key  = arr[j];
			int i = j - 1;
			while((i>= 0) && (arr[i] > key)) {
				arr[i+1] = arr[i];
				i--;
			}
			
			arr[i+1] = key;
	
		}
		
	}

}
