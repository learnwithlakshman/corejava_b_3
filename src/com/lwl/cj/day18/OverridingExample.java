package com.lwl.cj.day18;

import java.io.IOException;

class One {
	void m1(int a) throws IOException {

	}

    public int m1(int a, int b) {
		return 1;
	}

	public One m1() {
		return null;
	}
}

class Two extends One {
	@Override
	public void m1(int a)throws IOException {

	}

	@Override
	public int m1(int a, int b) {
		return 1;
	}

	public int m1(int a,int b,int c) {
		return 1;
	}
	@Override
	public Two m1() {
		return null;
	}
}

public class OverridingExample {

}
