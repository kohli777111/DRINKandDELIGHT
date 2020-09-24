package com.capgemini.dad.entity;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity(name="RawMaterialOrder")
@Table(name="RawMaterialOrder")
public class RawMaterialOrder {

	@Id
	@Column(name="orderId")
	private Long rmorderId;
	
	@Column(name="name", nullable=false)
	private String rmName;
	
	@Column(name="supplierId")
	private Long supplierId;
	
	@Column(name="quantityValue",nullable=false)
	private double quantityValue;
	
	@Column(name="quantityUnit")
	private String quantityUnit;
	
	@DateTimeFormat(iso=ISO.DATE)
	@Column(name="order_date")
	private LocalDate dateOfOrder;
	
	@DateTimeFormat(iso=ISO.DATE)
	@Column(name="delDate")
	private LocalDate dateOfDelivery;
	
	@Column(name="price",nullable=false)
	private double totalPrice;
	
	@Column(name="price_per_unit",nullable=false)
	private double pricePerUnit = 0;
	
	@Enumerated(EnumType.STRING)
    @Column(name="status")
    private DeliveryStatus deliveryStatus;
	
	@Column(name="warehouseId", nullable=false)
	private Long warehouseID;
	
}