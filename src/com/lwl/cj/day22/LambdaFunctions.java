package com.lwl.cj.day22;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

interface MyPredicate<T>{
	boolean test(T t);
}

class DataProvider{
	List<Long> list;
	
	{
	
		list = new Random().ints(10, 1000).limit(100).asLongStream().boxed().collect(Collectors.toList());
	
	}
	
	public List<Long> getNumbers(MyPredicate<Long> predicate){
		List<Long> elist = new ArrayList<Long>();
		for(Long l:list) {
			if(predicate.test(l))
				elist.add(l);
		}
		return elist;
	}
	
	
}

class EvenList implements MyPredicate<Long>{

	@Override
	public boolean test(Long t) {
		if(t % 2 == 0)
			return true;
		return false;
	}
	
}

class OddList implements MyPredicate<Long>{

	@Override
	public boolean test(Long t) {
		if(t % 2 != 0)
			return true;
		return false;
	}
	
}

public class LambdaFunctions {
	public static void main(String[] args) {
		DataProvider obj = new DataProvider();

		
		System.out.println(obj.getNumbers((t)-> t % 2 == 0));
		System.out.println(obj.getNumbers((t)-> t % 2 != 0));
	}

}
