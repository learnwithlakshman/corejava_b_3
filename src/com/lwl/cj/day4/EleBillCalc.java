package com.lwl.cj.day4;

import java.util.Scanner;

public class EleBillCalc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of used units :");
		int units = sc.nextInt();
		int min_amount = 50;
		int unit_price = 0;

		if (units > 500) {
			unit_price = 5;
		} else {
			unit_price = 3;
		}

		int bill_amount = (units * unit_price) + min_amount;

		System.out.println("Total units used :" + units);
		System.out.println("Net amount :" + bill_amount);
		System.out.println("Min amount:" + min_amount);
		System.out.println("Unit price:" + unit_price);
		sc.close();

	}
}
