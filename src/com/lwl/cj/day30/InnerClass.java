package com.lwl.cj.day30;

import java.util.Iterator;
import java.util.List;

interface One{
	 void run();
}

class Outer{
	private List<String> list;
	
	public Iterator<String> iterator(){
		 class Inner implements Iterator<String>{

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public String next() {
				// TODO Auto-generated method stub
				return null;
			}
			
		}
		Inner obj =  new Inner();
		return obj;
	}
	
}

abstract class X implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	abstract void m1();
	
}

public class InnerClass {
	public static void main(String[] args) {
		X obj = new X() {

			@Override
			void m1() {
				System.out.println("M1.....");
				
			}
			
		};
		
	}
}
