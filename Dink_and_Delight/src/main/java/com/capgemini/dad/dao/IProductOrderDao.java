package com.capgemini.dad.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.dad.entity.ProductOrder;
import com.capgemini.dad.entity.RawMaterialOrder;

@Repository
public interface IProductOrderDao extends JpaRepository<ProductOrder, Long> {
	
	@Query(value="SELECT po from ProductOrder po where po.distributorId=?1 and po.status=?2 and po.delDate>=?3 and po.delDate<=?4 ",nativeQuery = true)
	public List<ProductOrder> getProductOrder(Long distributorId,String deliveryStatus,LocalDate startDate,LocalDate endDate);


}
