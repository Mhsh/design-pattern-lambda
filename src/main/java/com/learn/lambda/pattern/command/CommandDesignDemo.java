package com.learn.lambda.pattern.command;

public class CommandDesignDemo {

	public static void main(String[] args) {
		AC ac2 = new AC();
		AutomationRemote remote = new AutomationRemote();
		remote.setCommand(ac2::turnOn);
		remote.buttonPressed();

		Light light = new Light();
		remote.setCommand(() -> light.turnOff());
		remote.buttonPressed();

	}

}
