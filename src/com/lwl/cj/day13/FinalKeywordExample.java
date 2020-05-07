package com.lwl.cj.day13;

import java.util.Arrays;

final class One{
	
}
class Employee{
	int age;
	String name;
}

public class FinalKeywordExample{
	public static final void main(final String... args) {
		final int DAYS_WEEK = 7;
		System.out.println(args.length);
		
	}
	
	public static void udpateAge(final Employee employee,final int updateAge) {
		employee.age = updateAge;
		
	}
}
