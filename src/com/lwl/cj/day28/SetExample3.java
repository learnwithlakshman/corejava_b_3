package com.lwl.cj.day28;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.lwl.cj.day27.Employee;
import com.lwl.cj.day27.EmployeeService;

public class SetExample3 {

		public static void main(String[] args) {
			EmployeeService obj = new EmployeeService();
			List<Employee> list = obj.getEmployees();
			System.out.println(list.size());
			Set<Employee> empSet = removeDuplicateObjects(list);
			System.out.println(empSet.size());
			
		}
		
		private static Set<Employee> removeDuplicateObjects(List<Employee> list){
			Set<Employee> set = new HashSet<>();
			for(Employee emp:list) {
				set.add(emp);
			}
			return set;
		}
}
