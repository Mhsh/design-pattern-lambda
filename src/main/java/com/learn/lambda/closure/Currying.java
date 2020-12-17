package com.learn.lambda.closure;

import java.util.function.Function;

public class Currying {

	public static void main(String[] args) {
		Function<Integer, Function<Integer, Integer>> fun1 = u -> (v -> u + v);
		Function<Integer, Integer> f2 = fun1.apply(10);
		System.out.println(f2.apply(10));
		System.out.println(fun1.apply(10).apply(5));
	}

}
