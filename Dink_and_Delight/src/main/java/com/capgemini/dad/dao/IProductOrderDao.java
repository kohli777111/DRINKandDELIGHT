package com.capgemini.dad.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.dad.entity.ProductOrder;

@Repository
public interface IProductOrderDao extends JpaRepository<ProductOrder, Long> {

}
