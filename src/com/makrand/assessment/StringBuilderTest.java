package com.makrand.assessment;

public class StringBuilderTest {

	public static void main(String[] args) {

		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de");
		b = b.append("f").append("g");
		a.append("h");
		a.insert(8, "j");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

}
