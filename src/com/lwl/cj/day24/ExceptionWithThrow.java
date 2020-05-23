package com.lwl.cj.day24;

// Singleton

class TaskManager implements Cloneable {
	private static TaskManager obj;

	private TaskManager() {
	}

	public synchronized static TaskManager getInstance() {
		if (obj == null)
			obj = new TaskManager();
		return obj;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("You can't clone this object");
	}

}

public class ExceptionWithThrow {
	public static void main(String[] args) throws CloneNotSupportedException {
		TaskManager obj1 = TaskManager.getInstance();
		
		Thread t2=new Thread(()->{
			TaskManager obj2 = TaskManager.getInstance();
			System.out.println(obj2);
		});

		Thread t3=new Thread(()->{
			TaskManager obj3 = TaskManager.getInstance();
			System.out.println(obj3);
		});
		
		System.out.println(obj1);
		Object obj3 = obj1.clone();
		System.out.println(obj3);

		

	}
}
