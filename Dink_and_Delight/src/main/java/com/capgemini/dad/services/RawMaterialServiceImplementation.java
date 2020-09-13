package com.capgemini.dad.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.dad.dao.IProductOrderDao;
import com.capgemini.dad.dao.IRawMaterialOrderDao;
import com.capgemini.dad.entity.ProductOrder;
import com.capgemini.dad.entity.RawMaterialOrder;
import com.capgemini.dad.exceptions.ProductNotFoundException;

public class RawMaterialServiceImplementation implements IRawMaterialService{

	
	@Autowired
	private IRawMaterialOrderDao rdao;
	
	@Override
	public RawMaterialOrder findById(Long orderId) {
		
		Optional<RawMaterialOrder> optional=rdao.findById(orderId);
		if(optional.isPresent())
		{
			RawMaterialOrder rawMaterialOrder=optional.get();
			return rawMaterialOrder;
		}
		// TODO Auto-generated method stub
		throw  new ProductNotFoundException("No such order exists");
	}

	@Override
	public RawMaterialOrder save(RawMaterialOrder rawMaterialOrder) {
		
		rawMaterialOrder=rdao.save(rawMaterialOrder);
		return rawMaterialOrder;
	
	}
	
}
