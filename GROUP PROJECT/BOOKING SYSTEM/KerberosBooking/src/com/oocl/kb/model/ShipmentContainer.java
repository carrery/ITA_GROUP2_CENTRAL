package com.oocl.kb.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SHP_CONTAINER")
public class ShipmentContainer {
	
	@Id
	@Column(name = "REF_NUM")
	private String refNum;
	@Id
	@Column(name = "SHIPMENT_NUM")
	private String shipmentNum;
	@Id
	@Column(name = "CNTR_NUM")
	private String cntrNum;
	@Id
	@Column(name = "GROSS_WT")
	private BigDecimal grossWt;
	@Id
	@Column(name = "NET_WT")
	private BigDecimal netWt;
	@Id
	@Column(name = "WT_UNIT")
	private String wtUnit;
	
	public String getRefNum() {
		return refNum;
	}
	public void setRefNum(String refNum) {
		this.refNum = refNum;
	}
	public String getShipmentNum() {
		return shipmentNum;
	}
	public void setShipmentNum(String shipmentNum) {
		this.shipmentNum = shipmentNum;
	}
	public String getCntrNum() {
		return cntrNum;
	}
	public void setCntrNum(String cntrNum) {
		this.cntrNum = cntrNum;
	}
	public BigDecimal getGrossWt() {
		return grossWt;
	}
	public void setGrossWt(BigDecimal grossWt) {
		this.grossWt = grossWt;
	}
	public BigDecimal getNetWt() {
		return netWt;
	}
	public void setNetWt(BigDecimal netWt) {
		this.netWt = netWt;
	}
	public String getWtUnit() {
		return wtUnit;
	}
	public void setWtUnit(String wtUnit) {
		this.wtUnit = wtUnit;
	}
	

}
