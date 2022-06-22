package com.wipro.ecom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.ecom.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>
{
	List<Product> findByName(String name);
	List<Product> findByCategory(String category);
	List<Product> findByMerchantId(Integer id);
}
