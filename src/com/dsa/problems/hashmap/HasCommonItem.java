package com.dsa.problems.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HasCommonItem {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 1 };
		System.out.println(hasCommonItem(arr1, arr2));

	}

	public static boolean hasCommonItem(int[] arr1, int[] arr2) {
		Map<Integer, Boolean> myHashMap = new HashMap<>();
		for (int i : arr1) {
			myHashMap.put(i, true);
		}
		for (int j : arr2) {
			if (myHashMap.containsKey(j)) {
				return true;
			}
//			if(myHashMap.get(j) != null) {
//				return true;
//			}
		}
		return false;
	}

	public static boolean hasCommonItemInEfficient(int[] arr1, int[] arr2) {
		for (int i : arr1) {
			for (int j : arr2) {
				if (i == j) {
					return true;
				}
			}
		}
		return false;
	}

}
