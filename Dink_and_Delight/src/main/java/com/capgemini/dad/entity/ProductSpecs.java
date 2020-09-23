package com.capgemini.dad.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProductSpecs")	
public class ProductSpecs {
	
	@Id  
	@Column(length=6) 
	private Long psId;
	@Column(length=15) 
	private String productName;
	@Column(length=5) 
	private Double pricePerUnit;
	@Column(length=20) 
	private String description;
	public Long getPsId() {
		return psId;
	}
	public void setPsId(Long psId) {
		this.psId = psId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(Double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}