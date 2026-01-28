package com.dsa.algorithm.sort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = {5,4,2,6,3,1};
		System.out.println("Before Sorting: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		insertionSort(array);
		System.out.println("After Sorting: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		} 
	}

	private static void insertionSort(int[] array) {
		for(int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j = i - 1;
			while(j > -1 && temp < array[j]) {
				array[j + 1] = array[j];
				array[j] = temp;
				j--;
			}
		}
	}

}
