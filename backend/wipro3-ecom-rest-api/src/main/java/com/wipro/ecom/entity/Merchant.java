package com.wipro.ecom.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Merchant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String gstin;
	private String email;
	private String contact;
	private String password;
	
	public Merchant() {}

	public Merchant(Integer id, String name, String gstin, String email, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.gstin = gstin;
		this.email = email;
		this.contact = contact;
	}
	
	public Merchant(Integer id, String name, String gstin, String email, String contact, String password) {
		super();
		this.id = id;
		this.name = name;
		this.gstin = gstin;
		this.email = email;
		this.contact = contact;
		this.password=password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGstin() {
		return gstin;
	}

	public void setGstin(String gstin) {
		this.gstin = gstin;
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

	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Merchant [id=" + id + ", name=" + name + ", gstin=" + gstin + ", email=" + email + ", contact="
				+ contact + "]";
	}
	
}
