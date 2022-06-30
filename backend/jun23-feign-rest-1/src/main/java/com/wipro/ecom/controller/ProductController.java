package com.wipro.ecom.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.wipro.ecom.entity.Product;
import com.wipro.ecom.service.ProductService;

@RestController
@RequestMapping("product")
@CrossOrigin(origins = {"http://localhost:4200"})
public class ProductController {
	@Autowired
	private ProductService ps;
	
	@PostMapping
	public Product addProduct(@RequestBody Product product)
	{
		return ps.create(product);
	}
	
	@PostMapping("/add")
	public Product addProduct1(@RequestParam("name") String name, @RequestParam("price")Float price, @RequestParam("picture")MultipartFile file) throws IOException
	{
		byte [] picture=file.getBytes();
		Product product=new Product(name, price, picture);
		return ps.create(product);
	}
	
	@GetMapping
	public List<Product> getAllProducts()
	{
		return ps.read();
	}
	
	@GetMapping("/{id}")
	public Product findProductById(@PathVariable("id") Integer id)
	{
		return ps.read(id);
	}
	
	@PutMapping
	public Product updateProduct(@RequestBody Product product)
	{
		return ps.update(product);
	}
	
	@DeleteMapping
	public Product deleteProduct(@PathVariable("id")Integer id)
	{
		return ps.delete(id);
	}
}
