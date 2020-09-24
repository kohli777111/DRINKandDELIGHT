package com.capgemini.dad.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="ProductOrder")
@Table(name="ProductOrder")	
public class ProductOrder {
	
	@Id
	@Column(length=6)
	private Long orderId;
	@Column(length=15)
	private String name;
	@Column(length=6)
	private Long distributorId;
	@Column(length=8)
	private Double quantityValue;
	@Column(length=20)
	private Date dateOfOrder;
	@Column(length=20)
	private Date dateOfDelivery;
	@Column(length=8)
	private Double pricePerUnit;
	@Column(length=8)
	private Double totalPrice;
	@Column(length=6)
	private Long warehouseId;
	
	@Column(length=15)
	private String deliveryStatus;
	
	@Column(length=8)
	private String quantityUnit;
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getDistributorId() {
		return distributorId;
	}
	public void setDistributorId(Long distributorId) {
		this.distributorId = distributorId;
	}
	public Double getQuantityValue() {
		return quantityValue;
	}
	public void setQuantityValue(Double quantityValue) {
		this.quantityValue = quantityValue;
	}
	public Date getDateOfOrder() {
		return dateOfOrder;
	}
	public void setDateOfOrder(Date dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}
	public Date getDateOfDelivery() {
		return dateOfDelivery;
	}
	public void setDateOfDelivery(Date dateOfDelivery) {
		this.dateOfDelivery = dateOfDelivery;
	}
	public Double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(Double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Long getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(Long warehouseId) {
		this.warehouseId = warehouseId;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public String getQuantityUnit() {
		return quantityUnit;
	}
	public void setQuantityUnit(String quantityUnit) {
		this.quantityUnit = quantityUnit;
	}
}