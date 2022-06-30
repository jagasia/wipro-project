package com.wipro.ecom.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@OneToOne
	private Product product;
	@ManyToOne
	private Customer customer;
	private Integer quantity;
	
	public Cart() {}


	public Cart(Integer id, Product product, Customer customer, Integer quantity) {
		super();
		this.id = id;
		this.product = product;
		this.customer = customer;
		this.quantity = quantity;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Cart [id=" + id + ", product=" + product + ", customer=" + customer + ", quantity=" + quantity + "]";
	}

	
	
}
