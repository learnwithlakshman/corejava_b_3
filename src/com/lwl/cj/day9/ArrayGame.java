package com.lwl.cj.day9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayGame {
	public static void main(String[] args) {
		Random rn = new Random();

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int num = rn.nextInt(20) + 1;
			arr[i] = num;
		}

		System.out.println("Guess a number (1-20), Please enter your number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		boolean isFound = false;
		System.out.println(Arrays.toString(arr));

		for (int ele : arr) {
			if (ele == num) {
				System.out.println("Congratulation... you guessed number");
				isFound = true;
				break;
			}
		}

		if (!isFound) {
			System.out.println("Sorry! better luck next time...");
		}

		sc.close();

	}
}
