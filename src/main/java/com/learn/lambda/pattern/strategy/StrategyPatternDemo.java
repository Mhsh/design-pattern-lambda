package com.learn.lambda.pattern.strategy;

public class StrategyPatternDemo {
	// Collection.sort() is an example of strategy pattern where different
	// implementation of sorting logic defines sorting.
	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationSubstract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		// lambda way
		context = new Context((a, b) -> a + b);
		System.out.println(context.executeStrategy(10, 5));
		context = new Context((a, b) -> a * b);
		System.out.println(context.executeStrategy(10, 5));
	}
}