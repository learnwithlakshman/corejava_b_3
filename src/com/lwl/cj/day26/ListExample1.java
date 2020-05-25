package com.lwl.cj.day26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		String data = "1001,1002,1003,1004,1005,1006,1007,1008,1009,1010";

		for (String ele : data.split(",")) {
			list.add(Integer.parseInt(ele));
		}

		System.out.println("Size of list :" + list.size());
		System.out.println("Is empty ? :" + list.isEmpty());
		System.out.println("Element at 2 :" + list.get(2));
		System.out.println("Sub list of [2,5] :" + list.subList(2, 5));

		list.add(1011);
		System.out.println("After adding element size:" + list.size());

		list.remove(new Integer(1001));
		System.out.println(list);

		System.out.println("1001 contains ? " + list.contains(1001));

		System.out.println("1002 contains ? " + list.contains(1002));

		List<Integer> subList = new ArrayList<>();
		subList.add(1010);
		subList.add(1005);
		subList.add(1008);

		System.out.println(subList + " is contains all ? " + list.containsAll(subList));

		List<Integer> subList1 = new ArrayList<>();
		subList1.add(1011);
		subList1.add(1005);
		subList1.add(1020);
		list.addAll(0, subList1);
		System.out.println(list);

		// By using for loop

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		// by using for-each
		System.out.println();
		for (Integer ele : list) {
			System.out.print(ele + " ");
		}

		// Java 8 streams
		System.out.println("");
		list.stream().forEach((e) -> System.out.print(e + " "));

		// Iterators
		System.out.println("");
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			int ele = iterator.next();
			System.out.print(ele + " ");
		}

		// List iterator

		ListIterator<Integer> literator = list.listIterator();
		System.out.println("");
		while (literator.hasNext()) {
			int ele = literator.next();
			if(ele==1005)
				literator.set(9999);
			if(ele==1006)
				literator.add(8888);
			System.out.print(ele + " ");
		}
		System.out.println();
		while (literator.hasPrevious()) {
			int ele = literator.previous();
			System.out.print(ele + " ");
		}

	}
}
