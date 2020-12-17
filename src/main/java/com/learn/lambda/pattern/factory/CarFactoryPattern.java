package com.learn.lambda.pattern.factory;

//Using Car Factory Pattern to create different Cars
public class CarFactoryPattern {

	public static void main(String[] args) {
		// java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods
		// uses Factory pattern

		CarFactory carFactory = new CarFactory();
		// Get an object of type Mercedes
		Car car1 = carFactory.getCar(CarType.HONDA);
		// Call start method of Mercedes
		car1.start();
		// Get an object of type Ferrari
		Car car2 = carFactory.getCar(CarType.VOLKSWAGEN);
		// Call start method of Ferrari
		car2.start();

		// Lambda
		CarLambdaFactory lambdaFactory = new CarLambdaFactory();
		Car car3 = lambdaFactory.getCar(CarType.HONDA);
		car3.start();
		Car car4 = lambdaFactory.getCar(CarType.VOLKSWAGEN);
		car4.start();
	}
}