package com.lwl.cj.day25;

public interface IEmployeeService {

	public int addEmployee(Employee employee);

	public boolean deleteEmployee(int empno);

	public Employee[] getEmployees();

	public Employee[] searchEmployee();

	public Employee getEmployee(int empno);

	public boolean updateEmployee();
}
