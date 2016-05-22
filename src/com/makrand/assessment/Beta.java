package com.makrand.assessment;

public class Beta extends Alpha {
	
	public Beta(String beta)
	{
		super("Alpha");
		System.out.println("Beta");
	}

	public Beta()
	{
		
	}
	String getType() { return "beta"; }
}
