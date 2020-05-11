package com.lwl.cj.day14;

public class Manager {
	public static void main(String[] args) {

		Contact contact1 = new Contact(1001, "Krish", "krish.t@gmail.com", "76567894444");
		Contact contact2 = new Contact(1002, "Tanvi", "tanvi.a@gmail.com", "87654567888"); // tanvi.abc@gmail.com
		Contact contact3 = new Contact(1004, "Swathi", "swathi.t@gmail.com", "97656789778");
		Contact contact4 = new Contact(1003, "Anusha", "anusha.a@gmail.com", "87654567899");

		Contact[] contactArr = { contact1, contact2, contact3, contact4 };

		for (Contact contact : contactArr) {
			String str = "To: %s, \nHello %s \nYour mobile is selected for lucky draw worth of 100L, confirm your mobile number %s";
			System.out.println(String.format(str, contact.getEmail(), contact.getName(), contact.getMobile()));
			System.out.println();
		}
	}

}
