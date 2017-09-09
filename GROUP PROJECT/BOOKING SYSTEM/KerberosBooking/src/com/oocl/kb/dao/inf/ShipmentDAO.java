package com.oocl.kb.dao.inf;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;

import org.hibernate.SessionFactory;



public interface ShipmentDAO {
	public void setSessionFactory(SessionFactory sessionFactory);
	
	public Long createBooking(String fromCity, String toCity, Date fromDate, Date toDate, String shipper,
			String consignee, int approveDoc, int validWt, int goodCustomer, String shipmentStatus);
	
    public void createShpContainer(ArrayList<com.oocl.kb.model.ShipmentContainer> cntrList);

}
