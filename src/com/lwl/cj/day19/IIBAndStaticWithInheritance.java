package com.lwl.cj.day19;

class One{
	{
		System.out.println("IIB-1");
	}
	static {
		System.out.println("Static block -1 ");
	}
	One(){
		super();
		//iib();
		System.out.println("Constructor -1");
	}
	
}

class Two extends One{
	{
		System.out.println("IIB-2");
	}
	static {
		System.out.println("Static block - 2");
	}
	Two(){
		this(10);
		System.out.println("Constructor -2");
	}
	Two(int a){
		super();
		System.out.println("Constructor with params");
	}
}


public class IIBAndStaticWithInheritance {
	
	public static void main(String[] args) {
		Two obj1 = new Two();
		System.out.println("Main");
	}
}
