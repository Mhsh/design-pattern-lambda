package com.learn.lambda.pattern.factory;

public class Honda implements Car {
	@Override
	public void start() {
		System.out.println("Inside Honda::start method");
	}

}