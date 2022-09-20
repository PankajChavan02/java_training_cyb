package com.cybage.assignment.model;

import java.time.LocalDate;

public class User {
	private String name;
	private String password;
	private String mobile;
	private LocalDate date;
	public User(String name, String password, String mobile, LocalDate date) {
		super();
		this.name = name;
		this.password = password;
		this.mobile = mobile;
		this.date = date;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", mobile=" + mobile + ", date=" + date + "]";
	}
	
	

}
