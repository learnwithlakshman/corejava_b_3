package com.lwl.cj.day31;



public class ThreadExampl1 {
	public static void main(String[] args) {
		System.out.println("Main method starts");

		Thread task = new Thread(() -> {
			for (int i = 1; i <= 1000; i++) {
				System.out.println(i + " ");
			}
		});
		task.start();

		System.out.println("Main method ends");
	}
}
