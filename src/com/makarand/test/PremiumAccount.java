package com.makarand.test;

public interface PremiumAccount extends Account {

	public default String getId(){ 
		return "String2";
	}
	
	
}
