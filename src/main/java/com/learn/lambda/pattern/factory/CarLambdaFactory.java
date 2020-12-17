package com.learn.lambda.pattern.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class CarLambdaFactory {

	final static Map<CarType, Supplier<Car>> carMap = new HashMap<>();
	// Store references of different Cars
	static {
		carMap.put(CarType.HONDA, Honda::new);
		carMap.put(CarType.VOLKSWAGEN, Volkswagen::new);
	}

	public Car getCar(CarType carType) {
		// Fetch care from the map based on car type
		Supplier<Car> car = carMap.get(carType);
		if (car != null) {
			return car.get();
		}
		throw new IllegalArgumentException("This car is not available");
	}
}