package com.wipro.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.ecom.entity.Merchant;
import com.wipro.ecom.repository.MerchantRepository;

@Service
public class MerchantService {
	@Autowired
	private MerchantRepository mr;
	
	public Merchant create(Merchant merchant) {
		return mr.save(merchant);
	}
	public List<Merchant> read() {
		return mr.findAll();
	}
	public Merchant read(Integer id) {
		Optional<Merchant> temp = mr.findById(id);
		Merchant m=null;
		if(temp.isPresent())
		{
			m=temp.get();
		}
		return m;
	}
	public Merchant update(Merchant merchant) {
		Optional<Merchant> temp = mr.findById(merchant.getId());
		Merchant m=null;
		if(temp.isPresent())
		{
			m=merchant;
			mr.save(merchant);
		}
		return m;
	}
	public Merchant delete(Integer id) {
		Optional<Merchant> temp = mr.findById(id);
		Merchant m=null;
		if(temp.isPresent())
		{
			m=temp.get();
			mr.delete(m);
		}
		return m;
	}
	
}
