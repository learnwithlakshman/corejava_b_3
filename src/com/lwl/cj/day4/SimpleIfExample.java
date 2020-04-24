package com.lwl.cj.day4;

import java.util.Scanner;

public class SimpleIfExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num:");
		int num = sc.nextInt();
		
		if(num < 0) {
			System.out.println("You entered -ve number and it is converted to +ve");
			num = -num;
		}
		
		System.out.println("Entered number is :"+num);
		sc.close();
	}
}
