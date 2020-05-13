package com.lwl.cj.day16;

class Employee{
	
	private int empno;
	private String ename;
	private double salary;
	public Employee(int empno, String ename, double salary) {
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empno;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empno != other.empno)
			return false;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", salary=" + salary + "]";
	}

}

public class ObjectClassExample extends Object {
	

		public static void main(String[] args) {
	
				Employee emp1 = new Employee(1001, "Krish", 456765);
				Employee emp2 = new Employee(1001, "Krish", 458900);
				System.out.println(emp1 == emp2);
				System.out.println(emp1.equals(emp2));		
				
				
		}
}
