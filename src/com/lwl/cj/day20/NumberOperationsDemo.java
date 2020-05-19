package com.lwl.cj.day20;

import java.util.ArrayList;
import java.util.List;

interface NumberOpes{
	public  int revrse(int num);
	public boolean isPrime(int num);
	
	default List<Integer> primeInRange(int lb,int ub){
		List<Integer> list = new ArrayList<Integer>();
		for(int i=lb;i<=ub;i++) {
			if(isPrime(i)) {
				list.add(i);
			}
		}
		return list;
	}
	default boolean isPalindrome(int num) {
		return revrse(num) == num;
	}

}

class NumberOpesImpl implements NumberOpes{

	@Override
	public int revrse(int num) {
		return 0;
	}

	@Override
	public boolean isPrime(int num) {
		return true;
	}
	
}


public class NumberOperationsDemo {

		public static void main(String[] args) {
			NumberOpes obj = new NumberOpesImpl();
			System.out.println(obj.revrse(1234));
			System.out.println(obj.isPrime(2354));
			
		}
}
