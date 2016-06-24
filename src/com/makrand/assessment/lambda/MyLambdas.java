package com.makrand.assessment.lambda;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class MyLambdas {

	public static void main(String[] args) {
		BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
		
		BiFunction<String, String, String> mapper2 = String::concat;
		
		Map<String, String> favorites = new LinkedHashMap<>();
		
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Tom", "Tram");
		favorites.put("Mak", "Train tour");
		favorites.put("Bhau", "Bike ride");

		String jenny = favorites.merge("Jenny", "Skyride", mapper2);
		
		String tom = favorites.merge("Tom", "Skyride", mapper);
		
		System.out.println(favorites);
		
		System.out.println(jenny);
		
		System.out.println(tom);
		
		test();
		test2();
		
		Stream<Double> randoms = Stream.generate(Math::random).limit(50);
		
		randoms.forEach(System.out::println);
	}
	
	public static void test(){
		
		BiFunction<Integer, Integer, Integer> compare = Integer::compare;
		
		System.out.println(compare.apply(6, 5));
	}
	
	public static void test2(){
		
		BinaryOperator<Integer> compare = Integer::compare;
		
		System.out.println(compare.apply(3, 5));
		System.out.println(compare);
	}

}
