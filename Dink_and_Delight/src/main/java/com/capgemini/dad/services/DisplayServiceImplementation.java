package com.capgemini.dad.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.dad.dao.IDistributorDao;
import com.capgemini.dad.dao.IProductOrderDao;
import com.capgemini.dad.dao.IRawMaterialOrderDao;
import com.capgemini.dad.dao.ISupplierDao;
import com.capgemini.dad.dto.SupplierDetails;
import com.capgemini.dad.entity.Distributor;
import com.capgemini.dad.entity.ProductOrder;
import com.capgemini.dad.entity.RawMaterialOrder;
import com.capgemini.dad.entity.Supplier;
import com.capgemini.dad.exceptions.DistributorNotFoundException;
import com.capgemini.dad.exceptions.InvalidArgumentException;
import com.capgemini.dad.exceptions.NotFoundException;
import com.capgemini.dad.exceptions.SupplierNotFoundException;


@Service
@Transactional
public class DisplayServiceImplementation implements IDisplayService {
	

	@Autowired
	private IDistributorDao distributorDao;
	
	@Autowired
	private ISupplierDao supplierDao;
	
	@Autowired
	private IRawMaterialOrderDao rawMaterialOrderDao;
	
	@Autowired
	private IProductOrderDao productOrderDao;
	
	/**
	 * @param supplierId This method will show account details by supplier_Id
	 * @return Supplier
	 */
	@Override
	public Supplier displaySupplierById(Long supplierId) {
		Supplier supplier=findSupplierById(supplierId);
		return supplier;
	}
	
	/**
	 * @param supplierId This method will fetch the Supplier by Supplier id
	 * @return Supplier
	 */
	@Override
	public Supplier findSupplierById(Long supplierId) {
		Optional<Supplier> optional = supplierDao.findById(supplierId);
		System.out.println("optional --->>"+optional.isPresent());
		if (optional.isPresent()) {
			Supplier supplier = optional.get();
			return supplier;
		}
		throw new SupplierNotFoundException("Supplier not found for supplier_id=" + supplierId);
	}
	
	/**
	 * @param distributorId This method will show account details by distributor_Id
	 * @return Distributor
	 */
	@Override
	public Distributor displayDistributorById(Long distributorId) {
		Distributor distributor=findDistributorById(distributorId);
		return distributor;
	}
	
	/**
	 * @param distributorId This method will fetch the Distributor by Distributor_Id
	 * @return Distributor
	 */
	@Override
	public Distributor findDistributorById(Long distributorId) {
		Optional<Distributor> optional = distributorDao.findById(distributorId);
		if (optional.isPresent()) {
			Distributor distributor = optional.get();
			return distributor;
		}
		throw new DistributorNotFoundException("Distributor not found for distributor_Id=" + distributorId);
	}
	
	
	/**
	 * @param  supplierId,deliveryStatus,startDate&startDateThis method will fetch the RawMaterialOrder 
	 * by supplierId,deliveryStatus,startDate & startDate
	 * @return RawMaterialOrder
	 */
	@Override
	public List<RawMaterialOrder> getAllRawMaterialOrder(Long supplierId, String deliveryStatus, LocalDate startDate,
			LocalDate endDate) {
		List<RawMaterialOrder> listOfRawMaterialOrder =rawMaterialOrderDao.getRawMaterialOrder(supplierId, deliveryStatus, startDate, endDate);
		if(listOfRawMaterialOrder!=null) {
		 return listOfRawMaterialOrder;
		 }
		throw new NotFoundException("List Of RawMaterialOrder not found for supplier_Id=" + supplierId+"deliveryStatus"+
		 deliveryStatus+"startdate"+startDate+"endDate"+endDate);
	}

	@Override
	public List<ProductOrder> getAllProductOrder(Long distributorId, String deliveryStatus, LocalDate startDate,
			LocalDate endDate) {
		List<ProductOrder> listOfProductOrder =productOrderDao.getProductOrder(distributorId, deliveryStatus, startDate, endDate);
		if(listOfProductOrder!=null) {
		 return listOfProductOrder;
		 }
		throw new NotFoundException("List Of ProductOrder not found for distributorId=" + distributorId+"deliveryStatus"+
		 deliveryStatus+"startdate"+startDate+"endDate"+endDate);
	}

	@Override
	public String registerSupplier(Supplier supplier) {
		
		String msg;
		if(supplier==null) {
			throw new InvalidArgumentException("Please Enter Supplier Details");
		}
		supplier=supplierDao.save(supplier);
		msg="Supplier Details Enter Successfully .........";
		return msg;
	}

	@Override
	public String registerDistributor(Distributor distributor) {

		String msg;
		if(distributor==null) {
			throw new InvalidArgumentException("Please Enter Distributor Details");
		}
		distributor=distributorDao.save(distributor);
		msg="Distributor Details Enter Successfully .........";
		return msg;
	}
	
	
	
}
