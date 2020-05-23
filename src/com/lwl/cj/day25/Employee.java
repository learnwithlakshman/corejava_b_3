package com.lwl.cj.day25;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {
	private Integer empno;
	private String ename;
	private double salary;

	public Employee(String ename, double salary) {
		this.ename = ename;
		this.salary = salary;
	}
}
