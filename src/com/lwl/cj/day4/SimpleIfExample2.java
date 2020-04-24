package com.lwl.cj.day4;

public class SimpleIfExample2 {
	public static void main(String[] args) {
		
		int arr[] = {30,31,28,30,29,31,28,30,31,28,30,29,31,28,30,31,28,30,29,31,28,30,31,28,30,29,31,28};
		int count =0;
		for(int i=0;i<arr.length;i++) {
			 int num = arr[i];
			//Logic
			if(num < 30) {
				count++;
			}
		}
		System.out.println(count);
		
	}
}
