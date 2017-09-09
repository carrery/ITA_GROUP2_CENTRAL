package com.oocl.kb.model;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "SHP_SHIPMENT")
public class Shipment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="shpNumSeq")
	@SequenceGenerator(name="shpNumSeq", sequenceName="SHP_NUM_SEQ")
	@Column(name="SHIPMENT_NUM")
	private Long shipmentNum;
	
	/* @OneToMany(fetch = FetchType.LAZY, mappedBy = "shipment")
	private List<ShipmentContainer> movementSpecifications = new ArrayList<ShipmentContainer>(); */
	
	@Column(name="FROM_CITY")
	private String fromCity;
	
	@Column(name="TO_CITY")
	private String toCity;
	
	@Column(name="FROM_DATE")
	private Date fromDate;
	
	@Column(name="DATE_TO")
	private Date toDate;
	
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
	
	@Column(name="SHIPMENT_STATUS")
	private String shipmentStatus;
	
	@Column(name="CREATE_BY")
	private String createBy;
	
	@Column(name="CREATE_DATE")
	private Timestamp createDate;
	
	@Column(name="UPDATE_BY")
	private String updateby;
	
	@Column(name="UPDATE_DATE")
	private Timestamp updateDate;
	
	

	public Shipment(String fromCity, String toCity, Date fromDate, Date toDate, String shipper,
			String consignee, int approveDoc, int validWt, int goodCustomer, String shipmentStatus) {
		super();
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.shipper = shipper;
		this.consignee = consignee;
		this.approveDoc = approveDoc;
		this.validWt = validWt;
		this.goodCustomer = goodCustomer;
		this.shipmentStatus = shipmentStatus;
	}
	
	public Shipment() {
		
	}

	public Long getShipmentNum() {
		return shipmentNum;
	}

	public void setShipmentNum(Long shipmentNum) {
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

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
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
