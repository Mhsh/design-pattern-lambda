package com.learn.lambda.pattern.command;

class AutomationRemote {
	Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void buttonPressed() {
		command.execute();
	}
}
