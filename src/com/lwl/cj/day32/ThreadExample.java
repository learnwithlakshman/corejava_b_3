package com.lwl.cj.day32;

class Account {
	int balance = 5000;

	public synchronized void withDraw(int amount) {
		System.out.println(Thread.currentThread().getName()+" is trying withdraw");
		if (amount > balance) {
			System.out.println(Thread.currentThread().getName() + " Waiting for depositing money....  ");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= amount;
		System.out.println(Thread.currentThread().getName() + " withdrawn amount " + amount
				+ " and current balance is :" + balance);
	}

	public synchronized void deposite(int amount) {
		System.out.println(Thread.currentThread().getName() + " is going to deposite amount:" + amount);
		try {
			this.balance += amount;
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" is deposited successfully and balance :"+balance);
		notify();
	}
}

public class ThreadExample {
		public static void main(String[] args) {
			Account obj = new Account();
			
			Thread t1 = new Thread(()->obj.withDraw(10000),"WT");
			Thread t2 = new Thread(()->obj.deposite(7000),"DT");
			
			t1.start();
			t2.start();
			
		}

}
