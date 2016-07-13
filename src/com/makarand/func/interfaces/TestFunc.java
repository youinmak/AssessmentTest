package com.makarand.func.interfaces;

import com.makarand.interfaces.TestInteface2;

public class TestFunc {

	public static void main(String[] args) {

		Sprint con = s -> s.m1();
		
		con.sprint(new TestInteface2());
		

	}

}
