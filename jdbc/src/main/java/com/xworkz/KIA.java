package com.xworkz;

public class KIA implements Car {
	
     
	public void drive() {
		System.out.println("Driving Kia" + this.getClass().getSimpleName());
		
		
	}

	public void running() {
		System.out.println("Running Kia" + this.getClass().getSimpleName());
		
	}

	public void stop() {
		System.out.println("Stopping Kia" + this.getClass().getSimpleName());
		
		
	}

}
