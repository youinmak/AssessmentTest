package com.makarand.test;

import java.util.ArrayList;
import java.util.List;

public class MySolutions {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		myList.add(1);
		myList.add(2);
		myList.add(5);

		List<Integer> myReversedList = new ArrayList<>();
		reverseList(myList, myReversedList);
		System.out.println(myReversedList);

	}

	public static <E> void reverseList(final List<E> list, final List<E> reversedList) {

		int size = list.size();
		if (size > 0) {
			reversedList.add(list.get(size - 1));
			list.remove(list.get(size - 1));
			reverseList(list, reversedList);
		}

	}
	
}
