package com.makrand.assessment.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TraditionalSearch {
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>(); // list of animals
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		
		animals.add(new Animal("turtle", false, true));
		
		Predicate<Animal> predicate = a -> !a.canSwim();
		
		Predicate<String> predicate2 = a -> a.startsWith("test");
		
		Predicate<String> and = predicate2.and(predicate2);
		
		print(animals, predicate); // pass class that does chec
		
		boolean abc[] = {true, false};
		
		howMany(true, abc);
	}

	private static void print(List<Animal> animals, CheckTrait checker) {
		for (Animal animal : animals) {
			if (checker.test(animal)) // the general check
				System.out.print(animal + " ");
		}
		System.out.println();
	}
	
	private static void print(List<Animal> animals, Predicate<Animal> predicate) {
		for (Animal animal : animals) {
			if (predicate.test(animal)) // the general check
				System.out.print(animal + " ");
		}
		System.out.println();
	}
	
	private void method(){
		
	}
	
	public static int howMany(boolean b, boolean... b2) {
		return b2.length;
		}
}