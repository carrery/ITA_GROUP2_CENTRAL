package com.oocl.testlogin.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "SHP_SHIPMENT")
public class ShpShipment {
	
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SHP_NUM_SEQ")
	@Column(name="SHIPMENT_NUM")
	private String shipmentNum;
	
	@Column(name="FROM_CITY")
	private String fromCity;
	
	@Column(name="TO_CITY")
	private String toCity;
	
	@Column(name="FROM_DATE")
	private Timestamp fromDate;
	
	@Column(name="TO_DATE")
	private Timestamp toDate;
	
	@Column(name="SHIPPER")
	private String shipper;
	
	@Column(name="CONSIGNEE")
	private String consignee;
	
	@Column(name="APPROVE_DOC")
	private int approveDoc;
	
	@Column(name="VALID_WT")
	private int validWt;
	
	@Column(name="GOOD_CUSTOMER")
	private int goodCustomer;
	
	@Column(name="SHIPMENT_STATIS")
	private String shipmentStatus;
	
	@Column(name="CREATE_BY")
	private String createBy;
	
	@Column(name="CREATE_DATE")
	private Timestamp createDate;
	
	@Column(name="UPDATE_BY")
	private String updateby;
	
	@Column(name="UPDATE_DATE")
	private Timestamp updateDate;

	public String getShipmentNum() {
		return shipmentNum;
	}

	public void setShipmentNum(String shipmentNum) {
		this.shipmentNum = shipmentNum;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public Timestamp getFromDate() {
		return fromDate;
	}

	public void setFromDate(Timestamp fromDate) {
		this.fromDate = fromDate;
	}

	public Timestamp getToDate() {
		return toDate;
	}

	public void setToDate(Timestamp toDate) {
		this.toDate = toDate;
	}

	public String getShipper() {
		return shipper;
	}

	public void setShipper(String shipper) {
		this.shipper = shipper;
	}

	public String getConsignee() {
		return consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public int getApproveDoc() {
		return approveDoc;
	}

	public void setApproveDoc(int approveDoc) {
		this.approveDoc = approveDoc;
	}

	public int getValidWt() {
		return validWt;
	}

	public void setValidWt(int validWt) {
		this.validWt = validWt;
	}

	public int getGoodCustomer() {
		return goodCustomer;
	}

	public void setGoodCustomer(int goodCustomer) {
		this.goodCustomer = goodCustomer;
	}

	public String getShipmentStatus() {
		return shipmentStatus;
	}

	public void setShipmentStatus(String shipmentStatus) {
		this.shipmentStatus = shipmentStatus;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getUpdateby() {
		return updateby;
	}

	public void setUpdateby(String updateby) {
		this.updateby = updateby;
	}

	public Timestamp getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

}
