package com.capgemini.dad.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.dad.entity.RawMaterialOrder;

@Repository
public interface IRawMaterialOrderDao extends JpaRepository<RawMaterialOrder, Long>{
	
	@Query(value="SELECT rm from RawMaterialOrder rm where rm.supplierId=?1 and rm.status=?2 and rm.delDate>=?3 and rm.delDate=?4 ",nativeQuery = true)
	public List<RawMaterialOrder> getRawMaterialOrder(Long supplierId,String deliveryStatus,LocalDate startDate,LocalDate endDate);

}
