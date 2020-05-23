package com.lwl.cj.day25;

import java.util.Scanner;

public class Manager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IEmployeeService service = EmployeeService.getInstance();
		while (true) {
			System.out.println("-----------------Employee Information--------------------------");
			System.out.println("1. Add 2. Fetch All 3.Delete 4.Exit  ");
			System.out.println("-----------------Employee Information--------------------------");
			int ch = sc.nextInt();
			if (ch == 1) {
				sc.nextLine();
				System.out.println("Enter the name of employee:");
				String ename = sc.nextLine();
				System.out.println("Enter the salary :");
				double salary = sc.nextDouble();
				Employee employee = new Employee(ename, salary);
				int id = service.addEmployee(employee);
				System.out.println("Employee is added with id:" + id);
			} else if (ch == 2) {
				Employee[] arr = service.getEmployees();
				if(arr.length == 0) {
					System.out.println("Employees not yet added, please add to see");
				}
				for (Employee emp : arr) {
					System.out.println(String.format("%d %s %.2f", emp.getEmpno(), emp.getEname(), emp.getSalary()));
				}
			} else if (ch == 3) {
				System.out.println("Enter the empo number to delete");
				int empno = sc.nextInt();
				if(service.deleteEmployee(empno)) {
					System.out.println("Employee is deleted.... with empno:"+empno);
				}else {
					System.out.println("Employee is not found with id:"+empno);
				}
			}
		}

	}
}
