package com.lwl.cj.day17;

class One {
	void m1() {
		System.out.println("One M1");
	}
}

class Two extends One {
	void m1() {
		System.out.println("Two M1");
	}

	void m2() {
		System.out.println("Two M2");
	}
}

class Three extends One {

	void m1() {
		System.out.println("Three M1");
	}

	void m2() {
		System.out.println("Three M2");
	}

	void m3() {
		System.out.println("Three M3");
	}

}

public class TypeCastingExample {
	public static void main(String[] args) {
		One obj = new One();
		
		if (obj instanceof Three) {
			Three ref = (Three) obj;
			ref.m1();
			ref.m2();
			ref.m3();
		}else if(obj instanceof Two) {
			Two ref = (Two) obj;
			ref.m1();
			ref.m2();
		}else {
			obj.m1();
		}
	}

}
