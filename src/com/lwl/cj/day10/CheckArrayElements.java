package com.lwl.cj.day10;

public class CheckArrayElements {
	public static void main(String[] args) {
		int[] arr1 = { 2, 3, 4, 5 };
		int[] arr2 = { 3, 4, 6,7,8 };
		int[] arr3 = { 3,4, 5,6,7,8,9,10 };

		if (arr1.length < arr2.length && arr1.length < arr3.length) {
			for(int ele:arr1) {
				if(search(arr2, ele) && search(arr3, ele)) {
					System.out.println(ele);
				}
			}
		} else if (arr2.length < arr3.length) {
			for(int ele:arr2) {
				if(search(arr1, ele) && search(arr3, ele)) {
					System.out.println(ele);
				}
			}
		} else {
			for(int ele:arr3) {
				if(search(arr2, ele) && search(arr1, ele)) {
					System.out.println(ele);
				}
			}
		}

	}

	private static boolean search(int[] arr, int ele) {
		for (int value : arr) {
			if (value == ele) {
				return true;
			}
		}
		return false;
	}
}
