package com.learn.lambda.pattern.command;

// imperative style
// same way we have light off command
public class LightONCommand implements Command {
	private Light light;

	public LightONCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.turnOn();
	}
}
