package com.lwl.cj.day22;

interface Game{
	void start();
	void play();
	void stop();
}

abstract class AbstractGame implements Game{
	@Override
	public void start() {
		System.out.println(this.getClass().getSimpleName()+" is going start");
	}
	
	@Override
	public void stop() {
		System.out.println(this.getClass().getSimpleName()+" is going stop");
	}
	
}


class Car extends AbstractGame implements Game{
	@Override
	public void play() {
		System.out.println("You are playing car game ... enjoy...");
		
	}
}

class Bike extends AbstractGame implements Game{
	@Override
	public void play() {
		System.out.println("You are playing Bike game carefull.....");
	}
}



abstract class NumberOperations{
	public boolean isPalindrome(int num) {
		return num == reverse(num);
	}
	public abstract int reverse(int num);
}

class NumbersEx extends NumberOperations{

	@Override
	public int reverse(int num) {
		System.out.println("Reverse method is called");
		int rev = 0;
		while(num != 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		return rev;
	}
	
}



public class AbstractClassWithInterface {
	public static void main(String[] args) {
		Game g = new Bike();
		g.start();
		g.play();
		g.stop();
		
		NumberOperations obj = new NumbersEx();
		boolean res = obj.isPalindrome(12321);
		System.out.println(res);
	}
}
