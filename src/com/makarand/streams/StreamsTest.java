package com.makarand.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;



public class StreamsTest extends Thread {

	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("Makarand".split("a"));
		Map<String, List<String>> myMap = new HashMap();
		myMap.put("", Arrays.asList(""));
		
		List<String> list = new ArrayList<>();
		
		list.addAll(new ArrayList<>());
		
		for(int i=0; i<2000000; i++)
	      {
	         synchronized(StreamsTest.class)
	         {
	            new StreamsTest().start();
	         }
	      }
		if(threadcounter < 1000000){
			System.out.println("less than 1000000");
		}else if(threadcounter == 1000000){
			System.out.println("equal");
		}else{
			System.out.println("greater than");
		}
		 System.out.print("threadcouner is : "+threadcounter);
	}
	

   public double process(double payment, int rate)
   {
      double defaultrate = 0.10;        //1
    // if(rate>10) defaultrate = rate;  //2
      class Implement{
         public int apply(double data){
        	 BiFunction<Integer, Double, Integer> f = (m, n)->m+(int)(n*m); 
        	 return f.apply((int)data, defaultrate); 
         }
      }
      Implement i = new Implement();
      return i.apply(payment);
   }
   
   private static int threadcounter = 0;
   public void run()
   {
      threadcounter++;     
   }

}
