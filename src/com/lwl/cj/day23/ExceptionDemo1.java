package com.lwl.cj.day23;

import java.util.List;

public class ExceptionDemo1 {

	public static void main(String[] args) {

//			EmployeeService empService = new EmployeeService();
//			List<Employee> list = empService.getEmployees();
//			System.out.println(list);
		
		
		checkValue();
		System.out.println("End of main");
	}

	public static int checkValue() {
		try {
			int a = 100;
			int b = 2;
			int res = a / b;
			System.out.println(res);
			System.exit(0);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally block");
		}
		return 0;

	}
}
