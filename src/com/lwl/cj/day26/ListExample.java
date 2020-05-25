package com.lwl.cj.day26;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	
		public static void main(String[] args) {
			List list =  new ArrayList();
			list.add(1001);
			list.add("Rajesh");
			list.add("Krish");
			list.add(1002);
			list.add(true);
			list.add(25.56);
			
			double sum = 0;
			for(int i=0;i<list.size();i++) {
				Object  ele = list.get(i);
				if(ele instanceof String) {
					String name = (String)ele;
					System.out.println(name.toUpperCase());
				}
				
				if(ele instanceof Number) {
					if(ele instanceof Double) {
						sum += (Double)ele;
					}else if(ele instanceof Integer) {
						sum += (Integer)ele;
					}
				}
				
			}
			
			System.out.println(sum);
		}
	
}
