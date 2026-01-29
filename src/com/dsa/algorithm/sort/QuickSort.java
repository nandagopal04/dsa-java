package com.dsa.algorithm.sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {

		int[] array = { 4, 6, 1, 7, 3, 2, 5 };
		System.out.println("Before Sort: \n" + Arrays.toString(array));
		quickSort(array, 0, array.length - 1);
		System.out.println("After Sort: \n" + Arrays.toString(array));

	}

	private static void quickSort(int[] array, int left, int right) {
		if (left < right) {
			int pivoteIndex = pivote(array, left, right);
			quickSort(array, left, pivoteIndex - 1);
			quickSort(array, pivoteIndex + 1, right);
		}

	}

	private static int pivote(int[] array, int pivoteIndex, int endIndex) {
		int swapIndex = pivoteIndex;
		for (int i = pivoteIndex + 1; i <= endIndex; i++) {
			if (array[i] < array[pivoteIndex]) {
				swapIndex++;
				swap(array, swapIndex, i);
			}
		}
		swap(array, pivoteIndex, swapIndex);
		return swapIndex;
	}

	private static void swap(int[] array, int leftIndex, int rightIndex) {
		int temp = array[leftIndex];
		array[leftIndex] = array[rightIndex];
		array[rightIndex] = temp;
	}

}
