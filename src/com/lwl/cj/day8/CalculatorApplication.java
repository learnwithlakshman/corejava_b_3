package com.lwl.cj.day8;

import java.util.Scanner;

public class CalculatorApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("num1:");
			int num1 = sc.nextInt();
			System.out.println("num2:");
			int num2 = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the operator (+,-,*,/,%)");
			String ch = sc.nextLine();

			switch (ch) {
			case "+":
				System.out.println(num1 + " + " + num2 + " is " + (num1 + num2));
				break;
			case "-":
				System.out.println(num1 + " - " + num2 + " is " + (num1 - num2));
				break;
			case "*":
				System.out.println(num1 + " * " + num2 + " is " + (num1 * num2));
				break;
			case "/":
				System.out.println(num1 + " / " + num2 + " is " + (num1 / num2));
				break;
			case "%":
				System.out.println(num1 + " % " + num2 + " is " + (num1 % num2));
				break;

			default:
				System.out.println("Please enter valid operator (+,-,*,/,%)");
			}

			System.out.println("Do you want continue.... (Yes/No)");
			String choice = sc.nextLine();
			if (!choice.equalsIgnoreCase("yes")) {
				sc.close();
				break;
			}

		}
	}
}
