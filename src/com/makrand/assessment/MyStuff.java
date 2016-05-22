package com.makrand.assessment;

@SuppressWarnings("unused")
public class MyStuff {
	MyStuff(String n) {
		name = n;
	}

	String name;

	public static void main(String[] args) {
		MyStuff m1 = new MyStuff("guitar");
		MyStuff m2 = new MyStuff("tv");
		System.out.println(m2.equals(m1));
	}

	public boolean equals(Object o) {
		
		StringBuilder builder = new StringBuilder(30);
		
		StringBuffer buffer = new StringBuffer(35);
		
		String s = "a" + 1 + 3 + 6;
		
		System.out.println("S is = "+s);
		
		MyStuff m = (MyStuff) o;
		if (m.name != null)
			return true;
		return false;
	}
}