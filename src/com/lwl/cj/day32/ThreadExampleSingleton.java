package com.lwl.cj.day32;

class DbConnection implements Cloneable {
	
	private volatile static DbConnection dbConnection = null;

	private DbConnection() {
	}

	public  static DbConnection getInstance() {

		if (dbConnection == null) {
			synchronized (DbConnection.class) {
				if (dbConnection == null) {
					dbConnection = new DbConnection();
				}
			}
		}
		return dbConnection;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("This object can't be cloned");
	}

}

public class ThreadExampleSingleton {
	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			DbConnection obj = DbConnection.getInstance();
			System.out.println(obj);
		});

		Thread t2 = new Thread(() -> {
			DbConnection obj = DbConnection.getInstance();
			System.out.println(obj);
		});

		Thread t3 = new Thread(() -> {
			DbConnection obj = DbConnection.getInstance();
			System.out.println(obj);
		});

		t1.start();
		t2.start();
		t3.start();

	}
}
