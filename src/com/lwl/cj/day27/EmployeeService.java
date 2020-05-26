package com.lwl.cj.day27;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeService {

	private static List<Employee> empList;

	static {
		try {
			List<String> lines = Files.readAllLines(Paths.get("emp.txt"));
			empList = lines.stream().map(line -> {
				return mapper(line);
			}).collect(Collectors.toList());
			System.out.println(empList);
		} catch (Exception e) {
			System.out.println("While loading data from file:" + e);
		}
	}

	public List<Employee> search(Predicate<Employee> empPre) {
		return empList.stream().filter(empPre).collect(Collectors.toList());
	}

	public long empCountByDept(final String dept) {
		return empList.stream().filter(e -> e.getDept().equals(dept)).count();
	}
	public double avgAgeByDept(final String dept) {
		LongSummaryStatistics stat = empList.stream()
				                            .filter(e->e.getDept().equals(dept))
				                            .mapToInt(e->e.getAge())
				                            .asLongStream()
				                            .summaryStatistics();
		System.out.println(stat);
		return empList.stream().filter(e->e.getDept().equals(dept)).mapToInt(e->e.getAge()).average().getAsDouble();
	}

	private static Employee mapper(String line) {
		String[] arr = line.split(",");
		int empno = Integer.parseInt(arr[0]);
		String ename = arr[1];
		int age = Integer.parseInt(arr[2]);
		String dept = arr[3];
		Employee emp = Employee.builder().empno(empno).age(age).ename(ename).dept(dept).build();
		return emp;
	}

	public static void main(String[] args) {

		EmployeeService empService = new EmployeeService();

		List<Employee> list = empService.search((emp) -> emp.getDept().equalsIgnoreCase("cs"));
		list.stream().map(e -> e.getEname()).forEach(System.out::println);
		System.out.println(empService.empCountByDept("CS"));
		System.out.println(empService.avgAgeByDept("CS"));

	}

}
