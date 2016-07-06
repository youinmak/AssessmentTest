package com.makarand.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestClass {

	public <E extends CharSequence> Collection<E> getWordsStartingWith(Collection<E> input, char ch) {
		Collection<E> returnValue = new ArrayList<E>();
		int len = input.size();
		System.out.println(len);
		for (E e : input) {
			if (e.charAt(0) == ch)
				returnValue.add(e);
		}
		return returnValue;
	}

	public void checkIt() {
		List<String> a = new ArrayList<String>();
		a.add("apple");
		a.add("cherry");
		Set<StringBuffer> b = new HashSet<StringBuffer>();
		b.add(new StringBuffer("pineapple"));
		Collection<String> ac = getWordsStartingWith(a, 'a');
		Collection<StringBuffer> bc = getWordsStartingWith(b, 'b');
		
		System.out.println(ac);
		System.out.println(bc);
	}

	public static void main(String[] args) {
		new TestClass().checkIt();
	}

}
