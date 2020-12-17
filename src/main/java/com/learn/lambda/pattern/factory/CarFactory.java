package com.learn.lambda.pattern.factory;

//Enum for Car Type
enum CarType {
	HONDA, VOLKSWAGEN;
}

//Factory for creating different Cars
public class CarFactory {

	public Car getCar(CarType carType) {

		switch (carType) {

		case HONDA:
			return new Honda();

		case VOLKSWAGEN:
			return new Volkswagen();

		default:
			return null;

		}
	}
}