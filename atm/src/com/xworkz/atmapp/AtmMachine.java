package com.xworkz.atmapp;

public class AtmMachine {
	
	public void check(int amount) throws AtmException {
		if(amount>=50000 || amount%100!=0) {
			System.out.println("Withdraw your amount");
			
		}
		else {
			throw new AtmException();
			
		}
		System.out.println("check method started");
	}

}
