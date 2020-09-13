package com.capgemini.dad.services;

import com.capgemini.dad.entity.ProductOrder;
import com.capgemini.dad.entity.RawMaterialOrder;

public interface IRawMaterialService {

	RawMaterialOrder findById(Long orderId);
	RawMaterialOrder save(RawMaterialOrder rawMaterialOrder);
	
}
