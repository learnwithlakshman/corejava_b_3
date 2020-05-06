package com.lwl.cj.day12;

public class StringBufferMethods {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("JAVA");
		String data  = sb1.append(" - OCA").reverse().toString();
		System.out.println(data);
		
		StringBuilder sb3 = new StringBuilder("JAVA");
		String data1  = sb3.append(" - OCA").reverse().toString();
		System.out.println(data1);
		
		StringBuffer sb = new StringBuffer();
		sb.append("core");
		System.out.println(sb.length());
	}
}
