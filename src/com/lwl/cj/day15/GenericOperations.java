package com.lwl.cj.day15;

public class GenericOperations {

	public int add(int a, int b) {
		System.out.println("2 args method is called");
		return a + b;
	}

	public int add(int a, int b, int c) {
		System.out.println("3 args method is called");
		return a + b + c;
	}

	public int add(String name,int... arr) {
		System.out.println("Var args length variables method is called");
		int sum = 0;
		for (int ele : arr) {
			sum += ele;
		}
		return sum;
	}

	public static void main(String... args) {
		GenericOperations obj = new GenericOperations();
		System.out.println(obj.add("GL",1, 3, 4, 5, 6, 7));

	}

}
