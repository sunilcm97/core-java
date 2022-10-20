package com.xworkz;

public class CarTester {

	public static void main(String[] args) {
		Carfactory carfactory = new Carfactory();

		Car i20 = carfactory.createCar("I20");
		i20.drive();
		i20.running();
		i20.stop();

		Car kia = carfactory.createCar("KIA");
		kia.drive();
		kia.running();
		kia.stop();

	}

}
