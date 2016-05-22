package com.makrand.assessment.lambda;

public class CheckIfHopper implements CheckTrait {
	public boolean test(Animal a) {
		return a.canHop();
	}
}