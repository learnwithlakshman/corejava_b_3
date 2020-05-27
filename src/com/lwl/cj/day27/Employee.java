package com.lwl.cj.day27;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class Employee extends Object {

		private int empno;
		private String ename;
		private int age;
		private String dept;
		
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
		
		
		
}
