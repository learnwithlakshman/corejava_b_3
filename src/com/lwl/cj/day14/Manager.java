package com.lwl.cj.day14;

public class Manager {
	public static void main(String[] args) {
		
			Contact contact1 = new Contact(1001,"Krish","krish.t@gmail.com","76567894444");
			contact1.showDetails();
			Contact contact2 = new Contact(1002,"Tanvi","tanvi.a@gmail.com","87654567888");
			contact2.showDetails();
			String names = "".join("-", new String[] {"Krish","Manoj","Rajesh"});
			System.out.println(names);
			
			  String name1= String.join("-", "A","B","C");
			  System.out.println(name1);

	}
}
