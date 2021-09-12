package com.minango.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minango.dsvendas.entities.Sales;

public interface SaleRepository extends JpaRepository<Sales, Long>{

	
}
