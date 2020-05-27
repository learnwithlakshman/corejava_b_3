
package com.lwl.cj.day28;

import java.util.HashSet;
import java.util.Set;

public class SubStringSet {

		public static void main(String[] args) {
			String name = "RAMANA";
		
			// R A M A N A RA RAM RAMA RAMANA AM AMA AMAN AMANA MA MAN MANA AN ANA NA A
			Set<String> set = new HashSet<>();
			for(int i=0;i<name.length();i++) {
			    for(int j=i;j<name.length() ;j++) {
					set.add(name.substring(i,j+1));
				}
			}
			System.out.println(set);
			set.stream().filter(e->isPalindrome(e)).forEach(System.out::println);
		}

		private static boolean isPalindrome(String e) {
			if(e.length() == 1)
				return true;
			return new StringBuffer(e).reverse().toString().equals(e);
		}
}
