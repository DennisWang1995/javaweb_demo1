package com.haha.domain;

public class Condition {
	private String name;
	private int status;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Condition(String name, int status) {
		this.name = name;
		this.status = status;
	}
	public Condition() {}
	
}
