package com.lwl.cj.day28;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample1 {

		public static void main(String[] args) {
			
			Set<Integer> set = new LinkedHashSet<Integer>();
			set.add(1001);
			set.add(1010);
			set.add(1010);
			set.add(1000);
			set.add(1001);
			set.add(1011);
			set.add(1012);
			
			
			
			set.forEach(e->{
				System.out.println(e);
			});
			
		}
}
