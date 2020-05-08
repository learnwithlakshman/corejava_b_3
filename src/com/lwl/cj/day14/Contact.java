package com.lwl.cj.day14;

public class Contact {

	int cid;
	String name;
	String email;
	String mobile;


	public Contact(int cid, String name, String email, String mobile) {
     	this.cid = cid;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

	public void setValues(int cid, String name, String email, String mobile) {
		this.cid = cid;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

	public void showDetails() {
		String data = String.format("Cid = %d, Name = %s, Email = %s and Mobile = %s", cid, name, email, mobile);
		System.out.println(data);
	}
}
