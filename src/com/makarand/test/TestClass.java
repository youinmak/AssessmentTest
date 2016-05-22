package com.makarand.test;

public class TestClass implements I1, I2 {

	@Override
	public void m1() {
		System.out.println("Hello");

	}
	
	public static void main(String[] args) throws Throwable{
	      TestClass tc = new TestClass();
	      ( (I2) tc).m1();
	      ( (I1) tc).m1();
	      
	     // throw new Error();
	   }

}
