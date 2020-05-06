package com.lwl.cj.day12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountNumberOfPalindromes {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("numbers.txt"));
		String data = sc.nextLine();

		String[] arr = data.split(",");
		for (String ele : arr) {
			if (isPalindrome(ele)) {
				System.out.println(ele);
			}
		}
	}

	private static boolean isPalindrome(String str) {
		return new StringBuffer(str).reverse().toString().equals(str);
	}
}
