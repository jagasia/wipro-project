package com.wipro.ecom.api;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.wipro.ecom.entity.Product;

@FeignClient(name = "product-api", url = "http://localhost:8081/product")
public interface ProductApi {
	@PostMapping
	public Product addProduct(@RequestBody Product product);	

	@GetMapping
	public List<Product> getAllProducts();

	@GetMapping("/{id}")
	public Product findProductById(@PathVariable("id") Integer id);
	
	@PutMapping
	public Product updateProduct(@RequestBody Product product);
	
	@DeleteMapping
	public Product deleteProduct(@PathVariable("id")Integer id);
}
