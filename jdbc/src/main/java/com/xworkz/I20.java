package com.xworkz;

public class I20 implements Car {
   
	public void drive() {
		System.out.println("Driving I20" + this.getClass().getSimpleName());
		
	}

	public void running() {
		System.out.println("Running I20" + this.getClass().getSimpleName());
		
	}

	public void stop() {
		System.out.println("Stoping I20" + this.getClass().getSimpleName());
		
	}

}
