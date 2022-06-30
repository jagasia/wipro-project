package com.wipro.ecom.entity;

public class MyToken {
	private String jwt;
	public MyToken() {}

	public MyToken(String jwt) {
		super();
		this.jwt = jwt;
	}

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}	
}
