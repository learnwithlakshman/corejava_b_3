package com.lwl.cj.day4;

import java.util.Scanner;

public class BillAmountUsingIf {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the bill amount:");
			float b_amount = sc.nextFloat();
			float discount = 0;
			
			if(b_amount > 5000) {
				discount = b_amount * 0.1f;
			}
			
			float net_amount = b_amount - discount;
			
			System.out.println("Bill amount :"+b_amount);
			System.out.println("Discount :"+discount);
			System.out.println("Net amount :"+net_amount);
			sc.close();
		}
}
