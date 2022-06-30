package com.wipro.ecom.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private Float price;
	private byte[] picture;
	
	public Product() {}

	public Product(Integer id, String name, Float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Product(Integer id, String name, Float price, byte[] picture) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.picture=picture;
	}
	
	public Product(String name, Float price, byte[] picture) {
		super();
		this.name = name;
		this.price = price;
		this.picture=picture;
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

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	
}
