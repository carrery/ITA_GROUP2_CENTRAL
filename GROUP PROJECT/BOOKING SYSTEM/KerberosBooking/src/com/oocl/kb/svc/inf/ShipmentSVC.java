package com.oocl.kb.svc.inf;

import java.sql.Timestamp;

public interface ShipmentSVC {
	public Long createShipment(String fromCity, String tocity, Timestamp fromDate, Timestamp toDate, String shipper, String consignee,
			int approveDoc, int validWeight, int goodCustomer, String shipmentStatus);
}
