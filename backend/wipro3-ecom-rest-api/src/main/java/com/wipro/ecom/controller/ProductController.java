package com.wipro.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.ecom.entity.Product;
import com.wipro.ecom.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {
	@Autowired
	private ProductService ps;
	
	@PostMapping
	public Product addProduct(@RequestBody Product product)
	{
		return ps.create(product);
	}
	
	@GetMapping
	public List<Product> getAllProducts()
	{
		return ps.read();
	}
	
	@GetMapping("/name/{name}")
	public List<Product> findByName(@PathVariable("name") String name)
	{
		return ps.findProductsByName(name);
	}
	
	@GetMapping("/category/{category}")
	public List<Product> findByCategory(@PathVariable("category") String category)
	{
		return ps.findProductsByCategory(category);
	}
	
	@GetMapping("/merchant/{id}")
	public List<Product> findByMerchant(@PathVariable("id") Integer id)
	{
		return ps.findProductsByMerchantId(id);
	}
	
}
