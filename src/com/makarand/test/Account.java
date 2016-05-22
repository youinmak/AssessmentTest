package com.makarand.test;

import java.util.Arrays;
import java.util.Comparator;

interface Account {
	public default String getId(){ 
		
		int [] ints = new int[3];
		
		Arrays.sort(ints);
		
		return "String";
	}
}