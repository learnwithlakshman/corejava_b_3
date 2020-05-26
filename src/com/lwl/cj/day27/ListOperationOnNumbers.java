package com.lwl.cj.day27;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class ListOperationOnNumbers {
	public static void main(String[] args) {
			
		List<Integer> list = IntStream.rangeClosed(11, 50).boxed().collect(Collectors.toList());
		// Get all the numbers which are divisible by three
		
		// Divisible by 3
		List<Integer> list_d_3 = list.stream().filter(e->e % 3==0).collect(Collectors.toList());
		System.out.println(list_d_3);
		
		// Get even numbers, double each number and collect into list
		
		List<Integer> list_even_double = list.stream().filter(e->e % 2==0).map(e->e*2).collect(Collectors.toList());
		System.out.println(list_even_double);
		
		Random random = new Random();
		
		List<Integer> randomList = random.ints(20,10,100).boxed().collect(Collectors.toList());
		List<Integer> sortedList = randomList.stream().sorted((e1,e2)->e2.compareTo(e1)).collect(Collectors.toList());
		System.out.println(sortedList);
	}
}
