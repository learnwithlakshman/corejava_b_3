package com.lwl.cj.day7;

import java.util.Scanner;

public class SumOfDigitsOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while (temp != 0) {
			int r = temp % 10;
			sum += r;
			temp /= 10;
			
		}
		
		System.out.println("The sum of digits of "+num+" is "+sum);
		sc.close();
	}
}
