package com.lwl.cj.day20;

interface One {
	int a = 100;
	void m1();
}

interface Two {
	int a = 900;
	void m1();
	void m2();
}

interface Three extends One,Two{
	void m3();
	int m1(int a);
}

class C1 implements One,Two,Three{

	@Override
	public void m3() {
		System.out.println(Two.a);
	}

	@Override
	public int m1(int a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void m2() {
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	

	
	
}

public class InterfaceDemo {
	public static void main(String[] args) {
		One obj = new C1();
		obj.m1();
		
	}
}
