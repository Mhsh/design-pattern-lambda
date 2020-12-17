package com.learn.lambda.pattern.fluent;

public class FluentShopping {

	public static void main(String[] args) {
		// Fluent API and builder pattern are almost same. In builder pattern separate
		// builder is required for creation of object by calling build method.
		// spring cloud gateway.
		Order order = new Order();
		order.add("shoes").add("Headphones").deliverAt("Street no 45, Jodhpur").place();
	}

}
