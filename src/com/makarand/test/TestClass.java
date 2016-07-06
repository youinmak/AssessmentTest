package com.makarand.test;

import java.util.Arrays;
import java.util.List;

public class TestClass implements I2 {

	@Override
	public void m1() {
		System.out.println("Hello");

	}
	
	public static void main(String[] args) throws Throwable{
	      TestClass tc = new TestClass();
	      ( (I2) tc).m1();
	      //( (I1) tc).m1();
	      
	     // throw new Error();
	      



List<StringBuilder> messages = Arrays.asList(new StringBuilder(), new StringBuilder());
messages.stream().forEach(s-> s.append("helloworld"));//works fine 

messages.stream().forEach((StringBuilder s)-> s.append("helloworld")); //works fine 

//messages.stream().forEach(s-> s); // doesn't work , Void methods cannot return a value

messages.stream().forEach(s-> s.toString()); // works fine

//messages.stream().forEach(s-> {return s.append("helloworld");}); // doesn't work , Void methods cannot return a value

//messages.stream().forEach((StringBuilder s)-> {return s.append("helloworld");});  // doesn't work , Void methods cannot return a value

messages.forEach(s->{
    s.insert(5,",");
    System.out.println(s);
});


	      
	      List<String> asList = Arrays.asList("a", "aa", "aaa");
	      
	      asList.forEach(System.out::println);
	   }

}
