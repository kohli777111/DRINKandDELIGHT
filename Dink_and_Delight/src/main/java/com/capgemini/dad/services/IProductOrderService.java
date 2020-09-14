package com.capgemini.dad.services;

import com.capgemini.dad.entity.ProductOrder;

public interface IProductOrderService {
	
	ProductOrder findById(Long orderId);
	
	ProductOrder save(ProductOrder productOrder);
	
	String updateStatus(ProductOrder productOrder);

}
