package com.oocl.kb.model;

import java.math.BigDecimal;

public class Container {
	private String cntrNumber;
	private String cntrType;
	private BigDecimal cntrWt;
	private String wtUnit;

	public String getCntrNumber() {
		return cntrNumber;
	}

	public void setCntrNumber(String cntrNumber) {
		this.cntrNumber = cntrNumber;
	}

	public String getCntrType() {
		return cntrType;
	}

	public void setCntrType(String cntrType) {
		this.cntrType = cntrType;
	}

	public BigDecimal getCntrWt() {
		return cntrWt;
	}

	public void setCntrWt(BigDecimal cntrWt) {
		this.cntrWt = cntrWt;
	}

	public String getWtUnit() {
		return wtUnit;
	}

	public void setWtUnit(String wtUnit) {
		this.wtUnit = wtUnit;
	}
	
	public Container() {
		
	}

}
