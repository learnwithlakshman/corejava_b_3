package com.lwl.cj.day11;

public class StringClassMethods {
	public static void main(String[] args) {
		String data = "Rajesh- Mahesh- Suresh- rani -manoj- Kiran - Jayesh-Ramana- Ramya- Charan-Jagan- Rohit";
		String[] arr=data.split("-");
		
		for(String ele:arr) {
			String name = ele.trim().toUpperCase().substring(0, 3);
			System.out.println(name);
		}
		
		String email = "tanvi.a@gmail.com";
		// @ . (. index > @)
		
		System.out.println(email.indexOf("@"));
		System.out.println(email.indexOf("."));
		System.out.println(email.lastIndexOf("."));
		
		if(email.indexOf("@") != -1 && email.lastIndexOf(".") > email.indexOf("@")) {
			System.out.println("It passes basic email validation");
		}else {
			System.out.println("Wrong email id");
		}
		
		for(String ele:arr) {
			String name = ele.trim().toUpperCase();
			if(name.contains("MAN")) {
				System.out.println(ele.trim());
			}
		}
		
		
	}
}
