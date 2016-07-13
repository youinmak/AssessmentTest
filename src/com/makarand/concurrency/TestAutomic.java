package com.makarand.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class TestAutomic {

	private static AtomicInteger ai = new AtomicInteger(0);
	
	public static void main(String[] args) {
		IntSupplier  supplier = ai::incrementAndGet;

		IntStream is = IntStream.generate(supplier);
		// fun
		is.parallel().peek(System.out::println).limit(100).sequential().forEach(x -> System.out.println(x));
	}

}
