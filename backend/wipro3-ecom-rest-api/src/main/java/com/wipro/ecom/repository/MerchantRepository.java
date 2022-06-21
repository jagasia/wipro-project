package com.wipro.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.ecom.entity.Merchant;

@Repository
public interface MerchantRepository extends JpaRepository<Merchant, Integer>
{

}
