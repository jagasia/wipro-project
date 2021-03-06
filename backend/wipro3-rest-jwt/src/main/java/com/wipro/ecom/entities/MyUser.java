package com.wipro.ecom.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

@Entity
public class MyUser extends User
{
	@Id
	private String username;
	private String password;
	private String fullName;
	private String role;
	private String email;
	private String contact;
	
	
	public MyUser()
	{
		super("jag", "jag", new ArrayList<>());
	}
	public MyUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		this();
	}
	public MyUser(String username, String password, Collection<? extends GrantedAuthority> authorities,
			String username2, String password2, String fullName, String role, String email, String contact) {
		super(username, password, authorities);
		username = username2;
		password = password2;
		this.fullName = fullName;
		this.role = role;
		this.email = email;
		this.contact = contact;
	}
	public String getUsername() {
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
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}

	
}
