package com.wipro.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.ecom.api.ProductApi;
import com.wipro.ecom.entity.Customer;
import com.wipro.ecom.entity.Product;
import com.wipro.ecom.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService cs;
	
	@Autowired
	private ProductApi pa;
	
	@GetMapping
	public List<Customer> getAllCustomers()
	{
		return cs.read();
	}
	
	@GetMapping("/{id}")
	public Customer findCustomerById(@PathVariable("id")Integer id)
	{
		return cs.read(id);
	}
	
	@PostMapping
	public Customer addCustomer(@RequestBody Customer customer)
	{
		return cs.create(customer);
	}
	
	@PutMapping
	public Customer updateCustomer(@RequestBody Customer customer)
	{
		return cs.update(customer);
	}
	
	@DeleteMapping("/{id}")
	public Customer deleteCustomer(@PathVariable("id")Integer id)
	{
		return cs.delete(id);
	}
	
	@GetMapping("/products")
	public List<Product> getAllProducts()
	{
		return pa.getAllProducts();
	}
}
