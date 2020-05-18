package com.lwl.cj.day20;

import java.util.Scanner;

public class Manager {
	public static void main(String[] args) {
		Game game = getSelectedGame();
		game.showVersion();
		game.start();
		game.play();
		game.stop();
	}

	private static Game getSelectedGame() {

		System.out.println("1.Car 2. Ship 3.Bicycle");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		sc.close();
		if (ch == 1)

			return new Car();
		else if (ch == 2)
			return new Ship();
		else if (ch == 3)
			return new Bicycle();

		throw new IllegalArgumentException("Please choose vlid game");

	}
}
