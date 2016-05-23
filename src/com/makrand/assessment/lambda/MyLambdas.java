package com.makrand.assessment.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MyLambdas {

	public static void main(String[] args) {
		BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
		
		Map<String, String> favorites = new HashMap<>();
		
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Tom", "Tram");
		favorites.put("Mak", "Train tour");
		favorites.put("Bhau", "Bike ride");

		String jenny = favorites.merge("Jenny", "Skyride", mapper);
		
		String tom = favorites.merge("Tom", "Skyride", mapper);
		
		System.out.println(favorites);
		
		System.out.println(jenny);
		
		System.out.println(tom);
	}

}
