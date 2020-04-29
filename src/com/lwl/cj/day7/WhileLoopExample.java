package com.lwl.cj.day7;

import java.util.Scanner;

public class WhileLoopExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		
		int i = 1;
		while(i <= n) {
			System.out.println(i);
			i++;
		}
		
		int num = 25;
		System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.toOctalString(num));
		System.out.println(Integer.toHexString(num));
		sc.close();
	}
}
