package com.lwl.cj.day14;

public class DefaultValueCheck{
	
		byte age;
		short fatherAge;
		char gendar;
		int motherAge;
		float salary;
		double fatherSalary;
		long motherSalary;
		boolean isWorking;
		String city;
	
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("DefaultValueCheck [age=").append(age).append(", fatherAge=").append(fatherAge)
					.append(", gendar=").append(gendar).append(", motherAge=").append(motherAge).append(", salary=")
					.append(salary).append(", fatherSalary=").append(fatherSalary).append(", motherSalary=")
					.append(motherSalary).append(", isWorking=").append(isWorking).append(", city=").append(city)
					.append("]");
			return builder.toString();
		}


		public static void main(String[] args) {
			int a=0;
			DefaultValueCheck obj1 = new DefaultValueCheck();
			DefaultValueCheck obj2 = new DefaultValueCheck();
			System.out.println(obj1);
			System.out.println(obj2);
			System.out.println(a);
	  }
		
}
