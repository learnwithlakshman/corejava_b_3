package com.lwl.cj.day20;

public interface Game {

	public static final int code = 1001;

	void start();

	void play();

	void stop();
	
	default void showVersion() {
		System.out.println("This is brand new version");
	}
}
