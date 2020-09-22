package com.cg.dnd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RawMaterialSpecsEntity {

	@Id
	@Column(name="rmsId")
	private Long rmsId;
	
	@Column(name="materialName")
	private String materialName;
	
	@Column(name="price_per_unit")
	private double pricePerUnit;
	
	@Column(name="duration")
	private int duration;
	
	@Column(name="description")
	private String description;

	public Long getRmsId() {
		return rmsId;
	}

	public void setRmsId(Long rmsId) {
		this.rmsId = rmsId;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
