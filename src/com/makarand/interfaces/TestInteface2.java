package com.makarand.interfaces;

public class TestInteface2 extends TestInteface {

	@Override
	public void m1() {
		I1 i1 = new TestInteface2();
		//i1.m1();
		I2 i2 = new TestInteface2();
		//i2.m1();
		System.out.println("in TI 2 m1");
		
	}
	
	public static void main(String[] args) {
		
		TestInteface ti = new TestInteface2();
		I1 i1 = new TestInteface2();
		ti.m1();
	}
}
