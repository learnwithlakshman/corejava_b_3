package com.lwl.cj.test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class CheckPairs {

	public static List<List<Integer>> getPairs(Integer[] arr, int x) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length; j++) {
				List<Integer> l = new ArrayList<Integer>();
				int ele1 = arr[i];
				int ele2 = arr[j];

				if (ele1 > ele2) {
					if (ele1 - ele2 == x) {
						addToList(arr, list, i, j, l);
					}
				} else {
					if (ele2 - ele1 == x) {
						addToList(arr, list, i, j, l);
					}

				}
			}
		}
		return list;
	}

	private static void addToList(Integer[] arr, List<List<Integer>> list, int i, int j, List<Integer> l) {
		l.add(arr[i]);
		l.add(arr[j]);
		list.add(l);
	}

	@Test
	void test() {
		List<List<Integer>> list = getPairs(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, 4);
		list.stream().forEach(ele -> {
			System.out.println(ele);
		});
		assertEquals(8, list.size());
	}

}
