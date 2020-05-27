package com.lwl.cj.day28;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		
		String name= "LAKSHMINARANAYA";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(Character c:name.toCharArray()) {
			
				if(map.get(c) == null) {
					map.put(c,1);
				}else {
					int count = map.get(c);
					map.put(c,count+1);
				}
				
				// map.put(c, map.get(c) == null ? 1 : map.get(c) + 1);
			
		}
		System.out.println(map);
	}
}
