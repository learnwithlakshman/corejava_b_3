package com.lwl.cj.day12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringExample {
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File("emp.txt"));
		sc.nextLine();
		int sum_age = 0;
		int count = 0;
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] arr = line.split(",");
			int age = Integer.parseInt(arr[2]);  // "35"
			sum_age += age;
			count++;
		}
		
		int avg_age = sum_age / count;
		System.out.println("The sum of ages:"+sum_age);
		System.out.println("The total count:"+count);
		System.out.println("Average age is :"+avg_age);
		
		
	}
}
