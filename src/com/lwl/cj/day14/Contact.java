package com.lwl.cj.day14;

public class Contact {

	private int cid;
	private String name;
	private String email;
	private String mobile;

	public Contact(int cid, String name) {
		this(cid, name, "N/A");
	}

	public Contact(int cid, String name, String email) {
		this(cid, name, email, "N/A");
	}

	public Contact(int cid, String name, String email, String mobile) {
		this.cid = cid;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

	public void showDetails() {
		String data = String.format("Cid = %d, Name = %s, Email = %s and Mobile = %s", cid, name, email, mobile);
		System.out.println(data);
	}

	public int getCid() {
		return cid;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getMobile() {
		return maskMobileNumber(mobile);
	}
	
	
	public void setCid(int cid) {
		this.cid = cid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		if(email == null || email.isEmpty() || !validEmail(email)) {
			throw new IllegalArgumentException("Please provide a valid email");
		}
		this.email = email;
	}

	private boolean validEmail(String email2) {
		return false;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	private static String maskMobileNumber(String inputMobile) {
		int len = inputMobile.length();
		String mobile = inputMobile.substring(0, len - 4).replaceAll("\\d", "*") + inputMobile.substring(len - 4);
		return mobile;
	}
}
