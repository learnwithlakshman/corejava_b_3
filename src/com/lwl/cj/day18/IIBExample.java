package com.lwl.cj.day18;

class Person {
	private int pid;
	private String name;
	private int age;

	{
		System.out.println("You are trying create Person object");

	}

	static {

		System.out.println("Static block - Person");
	}

	public Person(int pid, String name) {
		this.pid = pid;
		this.name = name;
	}

	public Person(int pid, String name, int age) {
		this.pid = pid;
		this.name = name;
		this.age = age;
	}

}

public class IIBExample {

	static {

		System.out.println("Static block - Main");
	}

	public static void main(String[] args) {
		Person p1 = new Person(1001, "Krish");
		Person p2 = new Person(1002, "Manoj");
		System.out.println("Main method");
	}

}
