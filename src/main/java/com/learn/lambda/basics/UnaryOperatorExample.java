package com.learn.lambda.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(2, 3, 6, 7);
		UnaryOperator<Integer> op = a -> a * 100;
		System.out.println(multiply(l1, op));
		Optional<String> opt = Optional.ofNullable(null);
		System.out.println(opt.get());
	}

	private static <T> List<T> multiply(List<T> l1, UnaryOperator<T> op) {
		List<T> newList = new ArrayList<>();
		for (T i : l1) {
			newList.add(op.apply(i));
		}
		return newList;
	}
}
