package com.makrand.assessment;

import java.util.Random;
import java.security.SecureRandom;
import java.nio.*;

@SuppressWarnings("unused")
public class _C {

	public static void main(String[] main) {
		Random r = new Random();
		System.out.println(r.nextInt(10));		
		System.out.println(Math.random());
		System.out.println(Math.log10(1000.0d));
		try
		{
		SecureRandom sr = new SecureRandom();
		System.out.println(sr.getAlgorithm());
		System.out.println(sr.nextInt(7));
		}
		catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
		
		byte x = 5;
		byte y = 6;
		double d = 10.0;
		double z = x + y;
		
		boolean a = false;
		
		boolean b = x >= y ;
		
		if (b = true)
		{
			System.out.println("b = true");
		}
		
		if (x == 1)
		{
			System.out.println("b = true");
		}
		
		int j = 5*4%3;
		
		
		
		int p = 10;
		
		String k = null;
		
		if (p == d)
		{
			System.out.println("p == d");
		}
		
		System.out.println("j = "+j);
		
		//boolean c = a<=b;
		
		if(!b) System.out.println("a");
		else System.out.println("a");
		System.out.println("a");
	}
}