package com.learn.lambda.pattern.builder;

import com.learn.lambda.pattern.builder.Task.TaskBuilder;

public class BuilderTest {

	public static void main(String[] args) {
		TaskBuilder builder = new TaskBuilder().with(taskBuilder -> {
			taskBuilder.setDescription("description");
			taskBuilder.setId(7);
			taskBuilder.setSummary("summary");
		});
		Task task = builder.build();
		System.out.println(task.getId());
	}

}
