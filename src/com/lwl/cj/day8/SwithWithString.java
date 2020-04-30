package com.lwl.cj.day8;

import java.util.Scanner;

public class SwithWithString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day short name :");
		String name = sc.nextLine();
		// Mo, Tu,We,Th,Fr // Sa, Su // Invalid day
		name = name.toUpperCase();
		switch (name) {
		case "MO":
		case "TU":
		case "WE":
		case "TH":
		case "FR":
				System.out.println("You are in Week days...");
			break;
		case "SA":
		case "SU":
				System.out.println("You are in weekends");
			break;
		default:
			System.out.println("Invalid day.... "+name);
		}
		sc.close();
	}
}
