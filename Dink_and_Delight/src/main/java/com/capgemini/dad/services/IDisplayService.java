package com.capgemini.dad.services;

import com.capgemini.dad.entity.Distributor;
import com.capgemini.dad.entity.Supplier;

public interface IDisplayService {
	
	Supplier displaySupplierById(Long supplierId);
	
	Supplier findSupplierById(Long supplierId);
	
	Distributor displayDistributorById(Long distributorId);
	
	Distributor findDistributorById(Long distributorId);

}
