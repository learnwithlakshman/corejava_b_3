package com.lwl.cj.day16;

class Payment {
	String biller;
	int amount;

	public Payment(String biller, int amount) {
		this.biller = biller;
		this.amount = amount;
	}

	public void show() {
		System.out.println("Thank for payment for Biller:" + biller + " Amount is: " + amount);
	}
}

class CreditCard extends Payment {
	String cardNumber;

	public CreditCard(String biller, int amount, String cardNumber) {
		super(biller, amount);
		this.cardNumber = cardNumber;
	}

	@Override
	public void show() {
		System.out.println(
				"Thank for payment for Biller:" + biller + " Amount is: " + amount + " and Cardnumber:" + cardNumber);
	}
}

public class PaymentManager {
	public static void main(String[] args) {
		Payment obj = new CreditCard("Airtel", 980, "345676543356543");
		obj.show();
	}
}
