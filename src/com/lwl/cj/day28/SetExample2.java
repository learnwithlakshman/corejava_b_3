package com.lwl.cj.day28;

import java.util.HashSet;
import java.util.Set;

public class SetExample2 {
	public static void main(String[] args) {
		String data = "JAVA,FUN,JAVA,PYTHON,JAVA,PYTHON,FUN,JAVA";
		Set<String> set = new HashSet<>();
		for(String name:data.split(",")) {
			if(set.add(name)) {
				System.out.println(name +" added");
			}else {
				System.out.println(name +" It is duplicate");
			}
		}
		System.out.println(set);
		
	}
}
