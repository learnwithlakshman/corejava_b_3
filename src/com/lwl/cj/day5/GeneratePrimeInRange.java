package com.lwl.cj.day5;

import java.util.Scanner;

public class GeneratePrimeInRange {

		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the lb value:");
			int lb = sc.nextInt();
			System.out.println("Enter the ub value:");
			int ub = sc.nextInt();
			
			for(int k=lb;k<=ub;k++) {
				
				int num = k;
				boolean flag = true;
				for (int i = 2; i <= num / 2; i++) {
					if (num % i == 0) {
						flag = false;
						break;
					}
				}
				
				if(flag) {
					System.out.println(num);
				}
			}
			sc.close();
			
		}
}
