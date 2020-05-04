package com.lwl.cj.day10;

public class MatrixExample {
	public static void main(String[] args) {
		int[][] arr = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int d_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
				
				if(i == j) {
					d_sum += arr[i][j];
				}
				
			}
			System.out.println();
		}

		int sum = 0;
		for (int[] eleArr : arr) {
			for (int ele : eleArr) {
				System.out.print(ele + " ");
				sum += ele;
			}
			System.out.println();
		}
		System.out.println(sum);
		System.out.println(d_sum);

		// Sum of elements of the matrix

	}
}
