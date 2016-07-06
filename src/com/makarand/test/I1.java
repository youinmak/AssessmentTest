package com.makarand.test;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class I1 {
	
	   public static void main(String [] args){
		   String s = Duration.of(60, ChronoUnit.SECONDS).toString();
		   
		   System.out.println(s);
	   }
}
