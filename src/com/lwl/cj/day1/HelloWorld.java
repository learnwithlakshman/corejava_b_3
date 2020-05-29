package com.lwl.cj.day1;

public class HelloWorld {
	public static void main(String[] args) {
	int i = 10;
	int j = 12;
	for(;;) {
		if(i++ < j--) {
			continue;
		}else {
			break;
		}
	}
	}
}
