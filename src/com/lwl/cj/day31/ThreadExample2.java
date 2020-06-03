package com.lwl.cj.day31;

class SeqGenerator {
	int num = 1001;

	public  int getNewId() {
			System.out.println("Thread "+Thread.currentThread().getName()+" Entered");
			
			synchronized (this) {
				num = num + 1;
			}
			System.out.println(Thread.currentThread().getName() + "  --  " + num);
		
		return num;
	}
}

public class ThreadExample2 {
	public static void main(String[] args) {
		
		try {
			System.out.println("Please wait.... your test is being prepared...");
			Thread.sleep(1000);
		}catch (Exception e) {
			
		}
		SeqGenerator obj = new SeqGenerator();

		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 100; i++) {
				try {
					obj.getNewId();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.setName("T1");

		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 100; i++) {
				try {
					obj.getNewId();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}, "T2");

		t1.start();
		t2.start();
	}

}
