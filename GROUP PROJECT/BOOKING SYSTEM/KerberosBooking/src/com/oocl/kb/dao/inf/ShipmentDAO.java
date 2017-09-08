package com.oocl.kb.dao.inf;

import java.sql.Timestamp;

import org.hibernate.SessionFactory;

public interface ShipmentDAO {
	public void setSessionFactory(SessionFactory sessionFactory);
	
	public Long createBooking(String fromCity, String toCity, Timestamp fromDate, Timestamp toDate, String shipper,
			String consignee, int approveDoc, int validWt, int goodCustomer, String shipmentStatus);

}
