package com.learn.lambda.pattern.decorator;

public class DecoratorPatternTest {
	public static void main(String[] args) {
		// Imperative style.
		// To add Buffering behavior we can decorate FileInputStream with
		// BufferedInputStream.
		//To add gzip behavior BufferedInputStream we can decorate it with GzipInputStream.
		Car basicCar = new BasicCar();
		System.out.println(basicCar.assemble());
		Car sportsCar = new SportsCar(basicCar);
		System.out.println(sportsCar.assemble());
		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		System.out.println(sportsLuxuryCar.assemble());
		System.out.println("");
		// Lambda style without any implementor.
		System.out.println("------------Lambda-----------------");
		Car basicCar1 = () -> "Basic Car";
		Car sportsCar1 = () -> basicCar1.assemble() + ". Adding features of Luxury Car";
		Car luxuryCar = () -> basicCar1.assemble() + ". Adding features of Luxury Car";
		// For new decorator we don't need new class.
		Car sportsLuxuryCar1 = () -> sportsCar1.assemble() + ". Adding features of Luxury Car";
		System.out.println(basicCar1.assemble());
		System.out.println(sportsCar1.assemble());
		System.out.println(luxuryCar.assemble());
		System.out.println(sportsLuxuryCar1.assemble());
	}
}