package com.wipro.ecom.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.wipro.ecom.entity.Merchant;
import com.wipro.ecom.service.MerchantService;

@RestController
@RequestMapping("/merchant")
@CrossOrigin(origins = {"http://localhost:4200"})
public class MerchantController {
	@Autowired
	private MerchantService ms;
	
	@PostMapping
	public Merchant registerMerchant(@RequestBody Merchant merchant)
	{
		return ms.create(merchant);
	}
	
	@GetMapping
	public List<Merchant> findAllMerchants()
	{
		return ms.read();
	}
	
	@GetMapping("/{id}")
	public Merchant findMerchantById(@PathVariable("id") Integer id)
	{
		return ms.read(id);
	}
	
	@PutMapping
	public Merchant updateMerchant(@RequestBody Merchant merchant)
	{
		return ms.update(merchant);
	}

	@DeleteMapping("/{id}")
	public Merchant deleteMerchant(@PathVariable("id") Integer id)
	{
		return ms.delete(id);
	}
}
