package com.makarand.test.inner;

public class InnnerTest {

	private static final Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getId());
			System.out.println("Instance Runnable");
			
		}
	};
	
	public static void testRun(){
		
		Runnable methodRunnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getId());
				System.out.println("Method runnable");
				
			}
		};
		
		Thread thread = new Thread(methodRunnable);
		Thread thread2 = new Thread(runnable);
		thread.start();
		thread2.start();
		
	}
	
	public class I1 {
		public static final int i =0;
		public void myMethod(){
			Runnable runnable2 = new Runnable() {
				public void run() {
					System.out.println(Thread.currentThread().getId());
					System.out.println("Inner Class runnable");
				}
			};
			
			Thread thread = new Thread(runnable2);
			thread.start();
		}
		
	}
	
	public void callInner(){
		I1 i1 = new I1(); 
		i1.myMethod();
	}
	
	static class I2{
		public static void staticMethod(){
			
		}
	}
	
	public static void main(String[] args) {
		InnnerTest test = new InnnerTest();
		I1 i1 = test.new I1();
		i1.myMethod();
		InnnerTest.testRun();
		
	}
}
