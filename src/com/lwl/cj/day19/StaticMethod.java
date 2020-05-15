package com.lwl.cj.day19;

class Employee {
	String ename;
	double salary;
	static int count = 0;

	{
		count++;

	}

	public Employee() {
		super();
	}

	public Employee(String ename) {
		this.ename = ename;
	}

	public Employee(String ename, double salary) {
		super();
		this.ename = ename;
		this.salary = salary;
	}

}

public class StaticMethod {

	static int code = 100;

	public static void showMessage() {
		System.out.println("This is Special message from Special person...." + code);
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee("ALN", 7654567);
		Employee emp3 = new Employee("GLN", 7854567);
		System.out.println(emp3.count);
	}
}
