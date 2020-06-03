package com.lwl.cj.day32;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnable implements Runnable {
	int num;

	public MyRunnable(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		long sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(Thread.currentThread().getName() +" :" +sum);
	}

}

public class MyRunnableExample {
	public static void main(String[] args) {
		ExecutorService exService = Executors.newFixedThreadPool(10);
		for(int i=1;i<=20;i++) {
			MyRunnable obj = new MyRunnable(10000);
			exService.execute(obj);
		}
		System.out.println("Finished all thread execution");
	}
}