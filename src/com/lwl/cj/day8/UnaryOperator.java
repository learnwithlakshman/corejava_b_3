package com.lwl.cj.day8;

public class UnaryOperator {
	public static void main(String[] args) {
		int a = 5;
		
		switch (++a) {
		case 5:
			System.out.println(5);
			break;
		case 6:
			System.out.println(6);
			break;
		case 7:
			System.out.println(7);
			break;
		default:
			break;
		}
	}
}
