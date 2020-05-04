package com.lwl.cj.day10;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		int[] arr1 = new int[] {1,3,4,5,6,7,8};
		int[] arr2 = new int[] {3,4,5,6,7,8,8,9};
		
	    int[] arr3 = new int[arr1.length + arr2.length];
//	    int c;
//	    for(c=0;c<arr1.length;c++) {
//	    	arr3[c] = arr1[c];
//	    }
//	    for(int j=0;j<arr2.length;j++) {
//	    	arr3[c++] = arr2[j];
//	    }
//	    System.out.println(Arrays.toString(arr3));
	    System.arraycopy(arr1,0, arr3, 0,arr1.length);
	    System.arraycopy(arr2,0, arr3, arr1.length,arr2.length);
	    System.out.println(Arrays.toString(arr3));
	
	}
}
