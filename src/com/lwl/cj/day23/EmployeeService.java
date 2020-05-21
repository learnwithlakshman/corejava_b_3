package com.lwl.cj.day23;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeService {

	private static List<Employee> empList;

	static {
		empList = new ArrayList<Employee>();
		try {
			Scanner sc = new Scanner(Paths.get("emp.txt"));
			sc.nextLine(); // to skip headers
			while (sc.hasNextLine()) {
				String data = sc.nextLine();
				String[] arr = data.split(",");
				int empno = Integer.parseInt(arr[0]);
				int age = Integer.parseInt(arr[2]);

				String name = null;
				try {
					name = arr[1].substring(0, 3);
				} catch (Exception e) {
					System.out.println("Name has less than 3 characters in it" + e);
				}
				Employee employee = Employee.builder().empno(empno).name(name).age(age).build();
				empList.add(employee);
			}
		} catch (StringIndexOutOfBoundsException | IOException e) {
			try {
				//File logic
				
			} catch (Exception e1) {
				System.out.println("While writing exception :" + e1);
			}
			e.printStackTrace();
		}finally {
			
		}
		//---------
	}

	public List<Employee> getEmployees() {
		return empList;
	}

	public List<Employee> filter(Predicate<Employee> p) {
		return empList.stream().filter(p).collect(Collectors.toList());
	}

}
