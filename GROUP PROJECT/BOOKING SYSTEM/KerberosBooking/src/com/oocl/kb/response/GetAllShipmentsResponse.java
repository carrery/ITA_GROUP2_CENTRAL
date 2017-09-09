package com.oocl.kb.response;

import java.util.List;

import com.oocl.kb.model.Shipment;

public class GetAllShipmentsResponse {
	private List<Shipment> shipments;
	
	public GetAllShipmentsResponse(List<Shipment> shipments) {
		this.shipments = shipments;
	}
}
