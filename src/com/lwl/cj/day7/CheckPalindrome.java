package com.lwl.cj.day7;

import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int temp = num;
		int rev = 0;
		
		while(temp != 0) {
			int r = temp % 10;
			rev = rev * 10 + r;
			temp = temp / 10;
		}
		System.out.println("The reverse of "+num+" is "+rev);
		if(num == rev) {
			System.out.println("The given number :"+num+" is a Palindrome");
		}else {
			System.out.println("The given number :"+num+" is not a Palindrome");
		}
		sc.close();
	}
}
