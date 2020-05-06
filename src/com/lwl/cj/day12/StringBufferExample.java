package com.lwl.cj.day12;

public class StringBufferExample {
	public static void main(String[] args) {
		
		int age = 4;
		String firstName = "Tanvi";
		String lastName = "A";
		String city = "Bangalore";
		StringBuffer sb = new StringBuffer();
		sb.append(firstName).append(" ").append(lastName).append(",").append(age).append(",").append(city);
		String profileData = sb.toString();//firstName.concat(" ").concat(lastName).concat(",").concat(""+age).concat(",").concat(city);
		System.out.println(profileData);
		
	}
}
