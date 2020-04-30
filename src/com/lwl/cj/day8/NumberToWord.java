package com.lwl.cj.day8;

import java.util.Scanner;

public class NumberToWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		
		switch (num) {
		
		case 1:
			System.out.println("One");
			break;
		case 2 :
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("Out of Range.... Please Enter only 1 -5 ");
			
			
		}
		
		sc.close();
		
	}
}
