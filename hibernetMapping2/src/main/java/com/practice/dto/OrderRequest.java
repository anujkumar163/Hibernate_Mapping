package com.practice.dto;

import com.practice.entiity.Custumer;

public class OrderRequest {
	private Custumer custumer;

	public Custumer getCustumer() {
		return custumer;
	}

	public void setCustumer(Custumer custumer) {
		this.custumer = custumer;
	}

	public OrderRequest(Custumer custumer) {
		super();
		this.custumer = custumer;
	}

	@Override
	public String toString() {
		return "OrderRequest [custumer=" + custumer + "]";
	}

	public OrderRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
