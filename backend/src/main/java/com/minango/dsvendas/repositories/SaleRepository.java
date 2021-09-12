package com.minango.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.minango.dsvendas.dto.SaleSuccessDTO;
import com.minango.dsvendas.dto.SaleSumDTO;
import com.minango.dsvendas.entities.Sales;

public interface SaleRepository extends JpaRepository<Sales, Long>{

	@Query("SELECT new com.minango.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ "FROM Sales AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.minango.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ "FROM Sales AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> sucessGroupedBySeller();
	
	
	
}
