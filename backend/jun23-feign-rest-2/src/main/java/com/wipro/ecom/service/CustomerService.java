package com.wipro.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.ecom.entity.Customer;
import com.wipro.ecom.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository cr;
	
	public Customer create(Customer customer) {
		return cr.save(customer);
	}
	public List<Customer> read() {
		return cr.findAll();
	}
	public Customer read(Integer id) {
		Optional<Customer> temp = cr.findById(id);
		Customer c=null;
		if(temp.isPresent())
		{
			c=temp.get();
		}
		return c;
	}
	public Customer update(Customer customer) {
		Customer c=read(customer.getId());
		if(c!=null)
		{
			cr.save(customer);
			c=customer;
		}
		return c;
	}
	public Customer delete(Integer id) {
		Customer c=read(id);
		if(c!=null)
		{
			cr.delete(c);			
		}
		return c;
	}
	
}
