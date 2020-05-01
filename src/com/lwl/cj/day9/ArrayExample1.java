package com.lwl.cj.day9;
/**
 * This is an array example
 * @author Admin
 *
 */
public class ArrayExample1 {
	/**
	 * Execution of the program starts from here...
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int[] arr = {10,30,50,40,60,20};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(int i = arr.length - 1;i >= 0;i--) {
			System.out.println(arr[i]);
		}
		
		for(int ele:arr) {
			System.out.println(ele);
		}

		

	}
	
}
