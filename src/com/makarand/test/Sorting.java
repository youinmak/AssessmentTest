package com.makarand.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;

public class Sorting {

	public Sorting(int x){
		
	}
	
	public Sorting(Integer x, Integer y){
		
	}
	
	public static void main(String[] args) {
		List<I1> i1s = new ArrayList<>();
		Collections.sort(i1s);

		TimeUnit[] values = TimeUnit.values();
		
		List<TimeUnit> asList = Arrays.asList(values);
		
		Collections.sort(asList);
		
		IntFunction<Sorting> intf = Sorting::new;
		
		BiFunction<Integer, Integer, Sorting> intbif = Sorting::new;

		Sorting apply = intf.apply(0);
		
		
		
		List i2s = new ArrayList();
		
		Collections.sort(i2s);
	}

}
