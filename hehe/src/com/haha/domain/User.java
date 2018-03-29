package com.haha.domain;

public class User {
	private int operatorId;
	private String name;
	private String password;
	private int status;
	public int getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(int operatorId) {
		this.operatorId = operatorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public User(int operatorId, String name, String password, int status) {
		this.operatorId = operatorId;
		this.name = name;
		this.password = password;
		this.status = status;
	}
	public User() {}
	
	public String toString() {
		return "User [operatorId=" + operatorId + ", name=" + name
				+ ", password=" + password + ", status=" + status + "]";
	}
}
