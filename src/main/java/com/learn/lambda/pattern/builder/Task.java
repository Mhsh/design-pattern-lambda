package com.learn.lambda.pattern.builder;

import java.util.function.Consumer;

public class Task {
	private final long id;
	private String summary = "";
	private String description = "";

	public Task(long id) {
		this.id = id;
	}

	public Task(TaskBuilder taskBuilder) {
		this.id = taskBuilder.id;
		this.summary = taskBuilder.summary;
		this.description = taskBuilder.description;
	}

	public long getId() {
		return id;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	static class TaskBuilder {

		private long id;
		private String summary = "";
		private String description = "";

		public TaskBuilder with(Consumer<TaskBuilder> function) {
			// Here we are passing this instance and setting values on this instance and
			// then returning this instance.
			function.accept(this);
			return this;
		}

		public Task build() {
			return new Task(this);
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getSummary() {
			return summary;
		}

		public void setSummary(String summary) {
			this.summary = summary;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

}
