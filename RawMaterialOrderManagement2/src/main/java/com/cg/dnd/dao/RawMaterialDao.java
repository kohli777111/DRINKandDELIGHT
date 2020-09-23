package com.cg.dnd.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.dnd.entity.RawMaterialOrderEntity;

@Repository
public interface RawMaterialDao extends JpaRepository<RawMaterialOrderEntity, Long> {
	
	
	
}
