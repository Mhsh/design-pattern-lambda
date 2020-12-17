package com.learn.lambda.pattern.fluent;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private List<String> cart = new ArrayList<>();
	private String address = "";

	public Order add(String item) {
		cart.add(item);
		System.out.println(item + " added to the cart");
		return this;
	}

	public Order deliverAt(String location) {
		this.address = location;
		System.out.println("The delivery address set by you is '" + location + "'");
		return this;
	}

	public void place() {
		System.out.println("Order placed!");
		System.out.println(
				this.cart.size() + " items ordered by you will be delivered at " + this.address + " by tomorrow");
	}

}
