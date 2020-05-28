package com.lwl.cj.day29;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {

		String names = "KRISH,MANOJ,RAJESH,BALU,RAMANA,RAKESH";

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String name : names.split(",")) {
			map.put(name, name.length());
		}

		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + " " + map.get(key));
		}

		Collection<Integer> values = map.values();
		for (Integer val : values) {
			System.out.println(val);
		}

		Set<Entry<String, Integer>> entrySet = map.entrySet();

		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		// Java8
		System.out.println("------------------- using java8 ----------------------");
		map.keySet().stream().forEach(e -> {
			System.out.println(e + " " + map.get(e));
		});

		System.out.println("----------------- Entry set java8-------------------------");
		map.entrySet().forEach(e -> {
			System.out.println(e.getKey() + " : " + e.getValue());
		});
		System.out.println("----------------- key and value java8 ---------------------");
		map.forEach((k, v) -> {
			System.out.println(k + " : " + v);
		});

	}

}
