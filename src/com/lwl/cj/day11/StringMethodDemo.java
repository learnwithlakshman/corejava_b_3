package com.lwl.cj.day11;

public class StringMethodDemo {
	public static void main(String[] args) {
		String name1 = "Core Java";
		String name2 = "Core Java";
		String name3 = new String("Core Java");
		String name4 = new String("Core Java");
		
		System.out.println(name1 == name2);
		System.out.println(name3 == name4);
	    System.out.println(name1.equals(name3));
		
	    String s1 = "Core";
	    String s2 = s1.concat(" Java");
	    System.out.println(s2 == name1);
	    System.out.println(s2.equals(name1));
	    
	}
}
