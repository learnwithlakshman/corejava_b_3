package com.lwl.cj.day17.one;

public class One {
	
	private int pri_num = 100;
	public int pub_num = 200;
	int def_num = 300;
	protected int pro_num = 400;
	
	public void show() {
		System.out.println(pri_num);
		System.out.println(def_num);
		System.out.println(pro_num);
		System.out.println(pub_num);
	}
}
