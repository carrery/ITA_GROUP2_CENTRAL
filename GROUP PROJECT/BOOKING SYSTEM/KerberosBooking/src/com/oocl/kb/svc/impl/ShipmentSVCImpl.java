package com.oocl.kb.svc.impl;

import java.sql.Date;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;

import com.oocl.kb.dao.inf.ShipmentDAO;
import com.oocl.kb.dao.inf.UserDAO;
import com.oocl.kb.response.CreateShipmentResponse;
import com.oocl.kb.svc.inf.ShipmentSVC;

public class ShipmentSVCImpl implements ShipmentSVC {
	
	@Autowired
	private ShipmentDAO shpDAO;
	
	
	
	public void setShipmentDAO(ShipmentDAO shpDAO) {
		this.shpDAO = shpDAO;
	}

	@Override
	public Long createShipment(String fromCity, String toCity, Date fromDate, Date toDate, String shipper,
			String consignee, int approveDoc, int validWeight, int goodCustomer, String shipmentStatus) {
		// TODO Auto-generated method stub
		return shpDAO.createBooking(fromCity, toCity, fromDate, toDate, shipper, consignee, approveDoc, validWeight, goodCustomer, shipmentStatus);
	}

	@Override
	public CreateShipmentResponse getCreateShipmentResponse(String fromCity, String toCity, Date fromDate, Date toDate, String shipper,
			String consignee, int approveDoc, int validWeight, int goodCustomer, String shipmentStatus) {
		// TODO Auto-generated method stub
		CreateShipmentResponse createShipmentResponse = new CreateShipmentResponse();
		if (fromCity.isEmpty() || toCity.isEmpty()) {
			createShipmentResponse.setErrorMessage("Required fields must be filled");
		} else {
			shpDAO.createBooking(fromCity, toCity, fromDate, toDate, shipper, consignee, approveDoc, validWeight, goodCustomer, shipmentStatus);
		}
		
		return createShipmentResponse;
	}
	
	

}
