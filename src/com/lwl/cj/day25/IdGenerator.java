package com.lwl.cj.day25;

public final class IdGenerator {

	private static int id = 1001;

	private IdGenerator() {

	}

	public static int getNewEmpno() {
		return id++;
	}
}
