package com.learn.lambda.pattern.strategy;

public class OperationSubstract implements Operation {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 - num2;
	}
}
