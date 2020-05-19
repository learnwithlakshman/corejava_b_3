package com.lwl.cj.day21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
class Employee implements Cloneable {
	private int empno;
	private String name;
	private double salary;

	public void incrementSalary(int amount) {
		this.salary += amount;
	}

	@Override
	protected Employee clone() throws CloneNotSupportedException {
		return (Employee) super.clone();
	}

}



public class MarkerInterfaceExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee = new Employee(1001, "Krish", 55000);
		Employee emp = employee.clone();
		employee.incrementSalary(5000);
		System.out.println(emp);
		System.out.println(employee);

		BinaryOperator<Integer> mul = (a, b) -> a * b;
		BinaryOperator<Integer> add = (a, b) -> a + b;
		BinaryOperator<Integer> sub = (a, b) -> {
			if (a > b) {
				return a - b;
			} else {
				return b - a;
			}
		};

		System.out.println(mul.apply(10, 5));
		System.out.println(add.apply(10, 5));
		int res = sub.apply(20, 10);
		System.out.println(res);

		String[] names = "Lakshman,,Krish,Manoj,Rajesh,,Mani".split(",");
		List<String> list = Arrays.asList(names);

		list.stream().filter((t) -> t.startsWith("L")).forEach(e -> {
			System.out.println(e);
		});
		
		Thread t = new Thread(() -> {
			System.out.println("Running my Runnable.....");
		});
		t.start();

	}

}
