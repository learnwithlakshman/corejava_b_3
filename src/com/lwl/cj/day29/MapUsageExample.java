package com.lwl.cj.day29;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.lwl.cj.day27.Employee;
import com.lwl.cj.day27.EmployeeService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class User {
	private String name;
	private String email;
	private String password;

}

class UserService {
	
	private static Map<String, User> map;
	static {
		map = new HashMap<String, User>();
		List<String> lines;
		try {

			lines = Files.readAllLines(Paths.get("users.csv"));
			
		    map = lines.stream().map(line->mapper(line)).collect(Collectors.toMap(User::getName, Function.identity()));
			lines.stream().map(line->mapper(line)).forEach(e->{
					map.put(e.getEmail(), e);
			});

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public User getUser(String email) {
		return map.get(email);
	}

	public User login(String email, String password) {
		User user = map.get(email);
		if (user != null && user.getPassword().equals(password)) {
			return user;
		}
		throw new IllegalArgumentException("Invalid credentials");
	}

	private static User mapper(String line) {
		String[] arr = line.split(",");
		String name = arr[0];
		String email = arr[1];
		String password = arr[2];
		User user = new User(name, email, password);
		return user;
	}

}

public class MapUsageExample {
	public static void main(String[] args) {
			EmployeeService empService = new EmployeeService();
			List<Employee> list = empService.getEmployees();
			for(Employee emp:list) {
				System.out.println(emp.getEmpno()+" "+emp.getEname()+" "+emp.getAge()+" "+emp.getDept());
			}
			System.out.println("-------------------- Sorted Data -------------------------------");
			list.stream().sorted(Comparator.comparing(Employee::getDept)
											.thenComparing(Comparator.comparing(Employee::getAge)).reversed()
											.thenComparing(Comparator.comparing(Employee::getEname))									
					
					).forEach(emp->{
				System.out.println(emp.getEmpno()+" "+emp.getEname()+" "+emp.getAge()+" "+emp.getDept());
			});
	}
}
