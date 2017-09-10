package com.oocl.kb.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "SHP_CONTAINER")
public class ShipmentContainer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="refNumSeq")
	@SequenceGenerator(name="refNumSeq", sequenceName="REF_NUM_SEQ",allocationSize=1)
	@Column(name = "REF_NUM")
	private Long refNum;
	
	@Column(name = "SHIPMENT_NUM")
	private String shipmentNum;
	
	@Column(name = "CNTR_NUM")
	private String cntrNum;
	
	@Column(name = "GROSS_WT")
	private BigDecimal grossWt;
	
	@Column(name = "NET_WT")
	private BigDecimal netWt;
	
	@Column(name = "WT_UNIT")
	private String wtUnit;
	
	@Column(name = "CNTR_TYPE")
	private String cntrType;
	
	public ShipmentContainer(String shipmentNum, String cntrNum, BigDecimal grossWt, BigDecimal netWt, String wtUnit, String cntrType) {
		this.shipmentNum = shipmentNum;
		this.cntrNum = cntrNum;
		this.grossWt = grossWt;
		this.netWt = netWt;
		this.wtUnit = wtUnit;
		this.cntrType  = cntrType;
	}

	public Long getRefNum() {
		return refNum;
	}
	public void setRefNum(Long refNum) {
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

	public String getCntrType() {
		return cntrType;
	}

	public void setCntrType(String cntrType) {
		this.cntrType = cntrType;
	}
	
	
	

}
