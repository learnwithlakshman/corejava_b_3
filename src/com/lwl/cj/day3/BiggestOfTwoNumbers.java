package com.lwl.cj.day3;

import java.util.Scanner;

public class BiggestOfTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		System.out.println("Enter the num1: ");
		int num = sc.nextInt();
		
		int i = 1;
		while(i <= 10) {
			System.out.println(num+" * "+i+" = "+(num * i));
			i = i+1;
		}
		
		
		sc.close();
	}
}
