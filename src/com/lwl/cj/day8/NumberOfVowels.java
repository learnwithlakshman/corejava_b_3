package com.lwl.cj.day8;

public class NumberOfVowels {
	public static void main(String[] args) {
		String name = "Aeiou";
		int len = name.length();
		int count = 0;
		for (int i = 0; i < len; i++) {
			char ch = name.charAt(i);
			// 'a','e','i','o','u'
			switch (ch) {
			case 'a':
			case 'A':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;

			}
		}
		System.out.println(count);
	}
}
