package com.xworkz;

public class Carfactory {
	
	public static Car createCar(String carName) {
		
		if(carName == "I20") {
		return new I20();
		}
		else if(carName == "KIA") {
			return new KIA();
		}
		else {
			return null;
		}
		
	}

}
