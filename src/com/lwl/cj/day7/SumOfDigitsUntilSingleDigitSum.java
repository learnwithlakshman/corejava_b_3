package com.lwl.cj.day7;

import java.util.Scanner;

public class SumOfDigitsUntilSingleDigitSum {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int temp = num;
		while(temp> 9) {
			int sum = temp / 10 + temp % 10;
			temp = sum;
		}
		
		System.out.println("Single digit sum of "+num +" is "+temp);
		sc.close();
		
	}
}
