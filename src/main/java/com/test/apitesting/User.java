package com.test.apitesting;

public class User {
	
	private String username;
	private String password;
	private Address address;
	private int[] mobile;
	private String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int[] getMobile() {
		return mobile;
	}
	public void setMobile(int[] mobile) {
		this.mobile = mobile;
	}

	
}
