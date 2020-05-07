package com.lwl.cj.day13;

import java.util.Arrays;


enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumTest {
	
	public static void main(String[] args) {
		Day[] days = Day.values();
	    System.out.println(Arrays.toString(days));
		
		for(Day d:days) {
			System.out.println(d);
		}
		
		Day day = Day.valueOf("MONDAY");
		System.out.println(day);
		System.out.println(day.toString());
		
		//int   -> Integer
		//float -> Float
		String num = "1001";
		int value = Integer.parseInt(num);
		int num1 = 15;
		System.out.println(Integer.toBinaryString(num1));
		
		int a = 100;
		float b = a;
		
		float d = 3.5f;
		
		int e = (int)d;
		System.out.println(e);
		
	}
}