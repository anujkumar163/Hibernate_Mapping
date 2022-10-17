package com.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.dto.OrderRequest;
import com.practice.dto.OrderResponce;
import com.practice.entiity.Custumer;
import com.practice.repository.CustomerRepository;
import com.practice.repository.ProductRepository;

@RestController

public class OrderController {
	
	@Autowired
	private CustomerRepository custrepo;
	
	@Autowired 
	private ProductRepository prorepo;
	
	@PostMapping("/placeorder")
	public void saveCustumer(@RequestBody OrderRequest request) {
		custrepo.save(request);
	}
	
	@GetMapping("findallorders")
	public List<Custumer> findAllOrder(){
		return custrepo.findAll();
	}
	
	@GetMapping("/getInfo")
	public List<OrderResponce> getJoinInformation(){
		
		return custrepo.getJoinInformation();
	}
	
	
	
}
