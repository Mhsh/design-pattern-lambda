package com.learn.lambda.pattern.decorator;

public class LuxuryCar extends CarDecorator {
	public LuxuryCar(Car c) {
		super(c);
	}

	@Override
	public String assemble() {
		// call above car behavior first and then add new behavior.
		return super.assemble() + ".  Adding features of LuxuryCar Car.";
	}
}
