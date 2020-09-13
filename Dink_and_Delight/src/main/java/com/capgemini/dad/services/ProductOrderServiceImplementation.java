package com.capgemini.dad.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.dad.dao.IProductOrderDao;
import com.capgemini.dad.entity.ProductOrder;
import com.capgemini.dad.exceptions.ProductNotFoundException;

public class ProductOrderServiceImplementation implements IProductOrderService{

	@Autowired
	private IProductOrderDao pdao;
	
	@Override
	public ProductOrder findById(Long orderId) {
		
		Optional<ProductOrder> optional=pdao.findById(orderId);
		if(optional.isPresent())
		{
			ProductOrder productOrder=optional.get();
			return productOrder;
		}
		// TODO Auto-generated method stub
		throw  new ProductNotFoundException("No such order exists");
	}

	@Override
	public ProductOrder save(ProductOrder productOrder) {
		
		productOrder=pdao.save(productOrder);
		return productOrder;
	
	}

	
}
