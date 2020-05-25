package com.lwl.cj.day25;

public final class EmployeeService implements IEmployeeService {

	private static EmployeeService employeeService;
	private Employee[] arr;
	private int count = 0;

	private EmployeeService() {
		arr = new Employee[3];
	}

	public static synchronized EmployeeService getInstance() {
		if (employeeService == null) {
			employeeService = new EmployeeService();
		}
		return employeeService;
	}

	@Override
	public int addEmployee(Employee employee) {
		if (count == arr.length) {
			Employee[] temp = new Employee[count + count>>1];
			System.arraycopy(arr, 0, temp, 0, arr.length);
			arr = temp;
		}
		int newId = IdGenerator.getNewEmpno();
		employee.setEmpno(newId);
		arr[count++] = employee;
		return newId;
	}

	@Override
	public boolean deleteEmployee(int empno) {
		if (count == 0) {
			return false;
		} else {
			int index = getIndexOf(empno);
			if (index != -1) {
				Employee[] temp = new Employee[arr.length - 1];
				if(index > 0) {
					System.arraycopy(arr, 0, temp, 0, index);
				}
				System.arraycopy(arr, index + 1, temp, index, arr.length - index -1);
				arr = temp;
		     	count--;
				return true;
			} else {
				return false;
			}
		}
	}

	@Override
	public Employee[] getEmployees() {
		Employee[] empArr = new Employee[count];
		System.arraycopy(arr, 0, empArr, 0, count);
		return empArr;
	}

	@Override
	public Employee[] searchEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployee(int empno) {

		return null;
	}

	@Override
	public boolean updateEmployee() {
		// TODO Auto-generated method stub
		return false;
	}

	private int getIndexOf(int empno) {

		for (int i = 0; i < count; i++) {
			if (arr[i].getEmpno() == empno) {
				return i;
			}
		}
		return -1;
	}

}
