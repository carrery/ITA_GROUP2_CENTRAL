package com.oocl.kb.svc.inf;

import java.sql.Date;
import java.sql.Timestamp;

import com.oocl.kb.response.CreateShipmentResponse;
import com.oocl.kb.response.UserLoginResponse;

public interface ShipmentSVC {
	public Long createShipment(String fromCity, String tocity, Date fromDate, Date toDate, String shipper, String consignee,
			int approveDoc, int validWeight, int goodCustomer, String shipmentStatus);
	
	public CreateShipmentResponse getCreateShipmentResponse(String fromCity, String toCity, Date fromDate, Date toDate, String shipper,
			String consignee, int approveDoc, int validWeight, int goodCustomer, String shipmentStatus);
}
