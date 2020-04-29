package com.lwl.cj.day7;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while(temp != 0) {
			int r = temp % 10;
			sum += r * r * r;
			temp /= 10;
		}
		
		if(sum == num) {
			System.out.println(num+" is Amstrong number");
		}else {
			System.out.println(num+" is not a Amstrong number");
		}
		sc.close();
		
	}
}
