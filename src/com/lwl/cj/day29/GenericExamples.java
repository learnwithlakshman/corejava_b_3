package com.lwl.cj.day29;

import java.util.ArrayList;
import java.util.List;

class MyContainer<T extends Number>{
	
	List<T> list = new ArrayList<>();
	
	public void add(T ele) {
		list.add(ele);
	}
	public void remove(T ele) {
		list.remove(ele);
	}
	public List<T> getElements(){
		return list;
	}
	
}

public class GenericExamples {
	
	
	public static <T> boolean search(T[] arr, T ele) {
		for(T t:arr) {
			if(t.equals(ele))
				return true;
		}
		
		return false;
	}
	public static void main(String[] args) {
			MyContainer<Integer> obj = new MyContainer<>();
			obj.add(1001);
			obj.add(1002);
			obj.add(1003);
			obj.add(1004);
			
			
		
		
	}
}
