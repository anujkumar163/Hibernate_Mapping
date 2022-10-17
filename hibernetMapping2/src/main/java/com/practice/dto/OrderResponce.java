package com.practice.dto;

public class OrderResponce {
	
	private String name;
	private String productName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "OrderResponce [name=" + name + ", productName=" + productName + "]";
	}
	public OrderResponce(String name, String productName) {
		super();
		this.name = name;
		this.productName = productName;
	}
	public OrderResponce() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
