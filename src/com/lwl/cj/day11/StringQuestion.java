package com.lwl.cj.day11;

public class StringQuestion {
	public static void main(String[] args) {
		String name = "RAJESH";
		int len = 5;
		
		for(int i=0;i<name.length();i++) {
			System.out.println(name.charAt(i));
		}
		
		for(int i=0;i<name.length()-len+1;i++) {
			System.out.println(name.substring(i,i+len));
		}
		
		
	}
}
