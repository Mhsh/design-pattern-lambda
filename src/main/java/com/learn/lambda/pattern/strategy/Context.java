package com.learn.lambda.pattern.strategy;

public class Context {
	private Operation strategy;

	public Context(Operation strategy) {
		this.strategy = strategy;
	}

	public int executeStrategy(int num1, int num2) {
		return strategy.doOperation(num1, num2);
	}
}