package com.lwl.cj.day25;

import java.util.Scanner;

interface Game{
	void play();
}
class Car implements Game{

	@Override
	public void play() {
		System.out.println("You are playing :"+this.getClass().getSimpleName() +" GAME");
	}
	
}
class Bike implements Game{

	@Override
	public void play() {
		System.out.println("You are playing :"+this.getClass().getSimpleName() +" GAME");
	}
	
}

class Ship implements Game{

	@Override
	public void play() {
		System.out.println("You are playing :"+this.getClass().getSimpleName() +" GAME");
	}
	
}

class GameService{
	
	public static Game getGame(int choice) {
		if(choice== 1) {
			return new Bike();
		}else if(choice == 2) {
			return new Car();
		}else if(choice == 3) {
			return new Ship();
		}
		
		throw new IllegalArgumentException("Plase provide valid option");
	}
	
}

public class FactoryMethod {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("1.Bike 2. Car 3.Ship");
				int ch = sc.nextInt();
				Game g = GameService.getGame(ch);
				g.play();
				sc.nextLine();
				System.out.println("Do you want to continue.... y/n");
				String choice = sc.nextLine();
				if(!choice.equalsIgnoreCase("y"))
					break;
			}
		}
}
