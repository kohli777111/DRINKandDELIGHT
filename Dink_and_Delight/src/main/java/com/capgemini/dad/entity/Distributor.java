package com.capgemini.dad.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Distributor_Details")
public class Distributor {

	@Id
	@Column(name="Distributor_Id")
	private Long distributorId;
	
	@Column(name="DistributorName")
	private String distributorName;
	
	@Column(name="address")
	private String address;
	
	@Column(name="phone")
	private String phoneNumber;

	

	public Long getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(Long distributorId) {
		this.distributorId = distributorId;
	}

	public String getDistributorName() {
		return distributorName;
	}

	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Distributor [distributorId=" + distributorId + ", distributorName=" + distributorName + ", address="
				+ address + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
}
