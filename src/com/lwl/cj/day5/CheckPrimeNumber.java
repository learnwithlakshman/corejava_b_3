package com.lwl.cj.day5;

import java.util.Scanner;

public class CheckPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check prime:");
		int num = sc.nextInt();
		
		boolean flag = true;
		for (int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				flag = false;
				break;
			}
		}
	
		if(flag) {
			System.out.println(num +" is a prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}
		sc.close();

	}
}
