package com.minango.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minango.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

	
}
