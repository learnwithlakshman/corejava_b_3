package com.lwl.cj.day6;

import java.util.Scanner;

public class NestedLoops {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------");

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("............Matrix........");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("" + i + j + " ");
			}
			System.out.println();
		}
		System.out.println("------------------------");
		int k = 1;
		for (int i = 1; i <= n; i++) {
			{
				for (int j = 1; j <= i; j++) {
					System.out.print(k + " ");
					k++;
				}
				System.out.println();

			}

		}
		for (int i = 1;; i++) {

			System.out.println(i);
			if (i % 3 == 0 && i % 7 == 0) {
				break;
			}
		}
		System.out.println("-------------------");
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i == j)
					continue;
				System.out.println("" + i + j);
			}
			System.out.println();
		}

		int arr[][] = { { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1 }, { 1, 0, 0, 0, 1 } };
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==1) {
					System.out.print("@ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
