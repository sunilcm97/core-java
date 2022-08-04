package com.xworkz.atmapp;

import java.util.Scanner;

public class AtmTester {

	public static void main(String[] args) {
		System.out.println("Main method started");
      
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount");
		int amount = sc.nextInt();
		AtmMachine atm = new AtmMachine(); 
		
		try {
			atm.check(amount);
		} catch (AtmException e) {
		
			e.printStackTrace();
		}
		System.out.println("Main method ended");
		sc.close();
	}

}
