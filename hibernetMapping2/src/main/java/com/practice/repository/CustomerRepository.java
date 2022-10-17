package com.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.practice.dto.OrderRequest;
import com.practice.dto.OrderResponce;
import com.practice.entiity.Custumer;

public interface CustomerRepository extends JpaRepository<Custumer, Integer> {

	void save(OrderRequest request);
	
	@Query("selet new com.practice.dto.OrderResponce (c.name, p.productName) from Custumer c JOIN c.products p")
	public List<OrderResponce> getJoinInformation();

}
