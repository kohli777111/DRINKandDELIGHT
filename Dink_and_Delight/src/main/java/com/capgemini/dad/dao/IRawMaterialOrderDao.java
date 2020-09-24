package com.capgemini.dad.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.dad.entity.RawMaterialOrder;

@Repository
public interface IRawMaterialOrderDao extends JpaRepository<RawMaterialOrder, Long>{
	
	//@Query("select rm from RawMaterialOrder rm where supplierId=?1 and deliveryStatus=?2 or")
	//public List<RawMaterialOrder> getRawMaterialOrder(String supplierId,String deliveryStatus,LocalDate startDate,LocalDate endDate)

}
