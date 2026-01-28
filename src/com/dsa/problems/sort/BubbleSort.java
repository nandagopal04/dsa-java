package com.dsa.problems.sort;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] array = {5,4,2,6,3,1};
		System.out.println("Before Sorting: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		bubbleSort(array);
		System.out.println("After Sorting: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		

	}

	public static void bubbleSort(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					array[j] = (array[j] + array[j + 1]) - (array[j + 1] = array[j]);
				}
			}
		}
	}

}
