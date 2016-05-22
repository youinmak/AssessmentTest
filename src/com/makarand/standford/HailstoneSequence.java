package com.makarand.standford;

import java.util.Scanner;

public class HailstoneSequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Number : ");
		int nextInt = scanner.nextInt();

		printHailStoneSequence(nextInt);
		scanner.close();
		
		int a=4, b=7, c =0;
		
		Integer k = null;
		
		k = new Integer(a) + new Integer(b);
	}

	private static void printHailStoneSequence(int nextInt) {
		if (nextInt > 1) {
			if (nextInt % 2 == 0) {
				nextInt /= 2;

			} else {
				nextInt = 3 * nextInt + 1;
			}
			System.out.println(nextInt);
			printHailStoneSequence(nextInt);
		}
		
		float a = 10.0f, b= 11.0f;
			
		if(a % b == 2.0f){
				
			}

	}
	
	//if (false) ; else ;
	
	//abstract public void add();
	
	
	

}
