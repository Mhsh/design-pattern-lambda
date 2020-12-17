package com.learn.lambda.closure;

public class JavaClosure {

	public static void main(String[] args) {

		int val = 111;

		Task lambda = () -> {
			// Here value cannot be changed as it is final implicit if we change we will
			// get compilation error.
			// val = 112;
			System.out.println(val);
			System.out.println("Task Completed");

		};

		printValue(lambda);

	}

	private static void printValue(Task lambda) {
		// Here there is not val but still it is printed since final value is captured
		// and passed here.
		lambda.doTask();

	}

}