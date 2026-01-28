package com.dsa.algorithm.sort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array = { 5, 4, 2, 6, 3, 1 };
		System.out.println("Before Sorting: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		selectionSort(array);
		System.out.println("After Sorting: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	private static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				array[i] = (array[i] + array[minIndex]) - (array[minIndex] = array[i]);
			}
		}
	}

}
