package com.makarand.test;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class Test {

	private static void magic(Stream<Integer> s) {
		Optional<Integer> max = s.filter(x -> x < 7).limit(3).max((x, y) -> x - y);
		System.out.println(max.get());
	}

	public static void main(String[] args) throws InterruptedException, IOException {

		Queue<String> myQueue = new LinkedList<>();

		// myQueue.

		ArrayDeque<String> myArrayDeque = new ArrayDeque<String>();

		List<Integer> integerList = new ArrayList<Integer>();

		for (int i = 0; i < 1000000; i++) {
			integerList.add(i);
		}
		long currentTimeMillis = System.currentTimeMillis();
		for (Integer integer : integerList) {
			System.out.print(integer);
		}
		long currentTimeMillis2 = System.currentTimeMillis();

		System.out.println("Time normal : " + (currentTimeMillis2 - currentTimeMillis));
		long currentTimeMillis3 = System.currentTimeMillis();

		Stream<Integer> parallelStream = integerList.parallelStream();
		Spliterator<Integer> spliterator = parallelStream.spliterator();

		spliterator.forEachRemaining((i) -> System.out.print(i));

		// parallelStream.forEach((i) -> System.out.print(i));
		long currentTimeMillis4 = System.currentTimeMillis();

		System.out.println("Time Parallel : " + (currentTimeMillis4 - currentTimeMillis3));

		/*
		 * Path dir = Paths.get("C:/7"); try (DirectoryStream<Path> stream =
		 * Files.newDirectoryStream(dir, "**.class")) { // so we don't have
		 * close() for (Path path : stream) // loop through the stream
		 * System.out.println(path.getFileName()); }
		 */

		Integer y = -129; // make a wrapper
		Integer x = y; // assign a second ref
		// var to THE wrapper
		System.out.println(y == x); // verify that they refer
		// to the same object
		y++; // unwrap, use, "rewrap"
		y--;
		System.out.println(x + " " + y); // print values
		System.out.println(y == x);

		/*
		 * List<String> list = new ArrayList<>();
		 * 
		 * list.add("44");
		 * 
		 * list.add("42");
		 * 
		 * //String a = "4";
		 * 
		 * list.removeIf("42"::startsWith);
		 */

		List<Integer> list = Arrays.asList(1, 2, 3);
		list.replaceAll(z -> z * 2);
		// list.set(1,4);
		// System.out.println(list);
		magic(list.stream());
		List<Integer> integerList2 = new ArrayList<>();

		integerList2.add(4);
		integerList2.add(2);
		integerList2.add(6);
		integerList2.add(1);
		Consumer<List<Integer>> methodRef1 = Collections::sort;
		System.out.println(integerList2);
		methodRef1.accept(integerList2);
		System.out.println(integerList2);
		Collections.shuffle(integerList2);

		System.out.println(integerList2);
		methodRef1.accept(integerList2);

		Supplier<ArrayList<Integer>> methodRef4 = ArrayList::new;

		Supplier<String> methodRef5 = String::new;

		ArrayList<Integer> arrayList = methodRef4.get();

		String string = methodRef5.get();

		/*
		 * Set<MyMap<String, String>> myMapSet = new
		 * TreeSet<MyMap<String,String>>(); MyMap<String, String> myMap = new
		 * MyMap<String, String>(); //myMapSet.add(myMap);
		 */
		Comparator<String> c = (s1, s2) -> Integer.valueOf(s1) - Integer.valueOf(s2);
		// Collections.sort(list, c);

		// System.out.println(list);

		Set<Rabbit> rabbit = new TreeSet<>();
		//rabbit.add(new Rabbit());

		 String [] arr = new String [2];
	        
	      Array [] array = new Array[2];
	      
	      int len = array.length;
		

	}



	static class Rabbit {
		int id;
	}
}
