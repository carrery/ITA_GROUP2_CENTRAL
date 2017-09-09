package com.oocl.kb.svc.impl;

import java.sql.Date;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;

import com.oocl.kb.dao.inf.ShipmentDAO;
import com.oocl.kb.dao.inf.UserDAO;
import com.oocl.kb.svc.inf.ShipmentSVC;

public class ShipmentSVCImpl implements ShipmentSVC {
	
	@Autowired
	private ShipmentDAO shpDAO;
	
	
	
	public void setShipmentDAO(ShipmentDAO shpDAO) {
		this.shpDAO = shpDAO;
	}

	@Override
	public Long createShipment(String fromCity, String tocity, Date fromDate, Date toDate, String shipper,
			String consignee, int approveDoc, int validWeight, int goodCustomer, String shipmentStatus) {
		// TODO Auto-generated method stub
		return shpDAO.createBooking(fromCity, tocity, fromDate, toDate, shipper, consignee, approveDoc, validWeight, goodCustomer, shipmentStatus);
	}

}
