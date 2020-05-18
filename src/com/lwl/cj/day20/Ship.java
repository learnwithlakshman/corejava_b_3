package com.lwl.cj.day20;

public class Ship implements Game {
	@Override
	public void start() {
		System.out.println(this.getClass().getSimpleName()+" game is going to start");
	}

	@Override
	public void play() {
		System.out.println("You are going to play: "+this.getClass().getSimpleName() +" game");
	}

	@Override
	public void stop() {
		System.out.println(this.getClass().getSimpleName()+" game is going to stop");
	}

}
