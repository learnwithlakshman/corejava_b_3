package com.lwl.cj.day2;

import java.util.Scanner;

public class NumberOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num1:");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2:");
		int num2 = sc.nextInt();
		
		System.out.println("Sum : "+(num1 + num2));
		System.out.println("Sub : "+(num1 - num2));
		System.out.println("Mul : "+(num1 * num2));
		System.out.println("Div : "+(num1 / num2));
		System.out.println("Mod : "+(num1 % num2));
		
		sc.close();
	}
}
