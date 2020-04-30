package com.lwl.cj.day8;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int rn = random.nextInt(6) + 1;
		for (int i = 1; i <= 3; i++) {
			System.out.println("Guess a number 1 - 6");
			int ch = sc.nextInt();
			if (rn == ch) {
				System.out.println("You guessed number in " + i + " attempts");
				break;
			} else {
				if (i == 3) {
					System.out.println("Sorry! you reached max number of attempts...");
					break;
				} else {
					System.out.println("Sorry! it is wrong guess try again...");
				}
			}

		}

		sc.close();
	}
}
