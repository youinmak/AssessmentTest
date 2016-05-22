package com.makrand.assessment;

public class Gamma extends Beta {

	public Gamma(String gamma)
	{
		super("gamma");
		System.out.println("Gamma");
	}
	
	public Gamma()
	{
		
	}
	String getType() { return "gamma"; }
	public static void main(String[] args) {
		
	Alpha a1 = new Beta("beta");
	Alpha a2 = new Gamma("gamma");
	Beta b1 = new Gamma("gamma");
	
	/*Gamma g1 = (Gamma) new Alpha();
	Gamma g2 = (Gamma) new Beta();*/
	System.out.println(a1.getType() + " "
	+ a2.getType() + " "+b1.getType());
	}
}
