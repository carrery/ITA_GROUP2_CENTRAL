package com.oocl.kb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SHP_CGO")
public class ShipmentCargo {
	
	@Id
	@Column(name = "CGO_ID")
	public Long cargoId;
	@Column(name = "CGO_DESC")
	public String cargoDesc;
	@Column(name = "CGO_NATURE")
	public String cargoNature;
	@Column(name = "REF_NUM")
	public Long refNum;
	
	
	public Long getCargoId() {
		return cargoId;
	}
	public void setCargoId(Long cargoId) {
		this.cargoId = cargoId;
	}
	public String getCargoDesc() {
		return cargoDesc;
	}
	public void setCargoDesc(String cargoDesc) {
		this.cargoDesc = cargoDesc;
	}
	public String getCargoNature() {
		return cargoNature;
	}
	public void setCargoNature(String cargoNature) {
		this.cargoNature = cargoNature;
	}
	public Long getRefNum() {
		return refNum;
	}
	public void setRefNum(Long refNum) {
		this.refNum = refNum;
	}
	
	
	
}
