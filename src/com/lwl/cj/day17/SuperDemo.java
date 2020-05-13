package com.lwl.cj.day17;

class A {
	int num = 100;
	public void m1() {
		System.out.println("A M1 :"+num);
	}
}

class B extends A {
	int num = 999;
	@Override
	public void m1() {
		System.out.println("B M1 :"+num);
	}
	

}

class C extends B {
	int num = 1111;
	public void m1() {
		System.out.println("C M1");
	}
}

public class SuperDemo {
	public static void main(String[] args) {
		A obj = new B();
		obj.m1();
		System.out.println(obj.num);

	}
}
