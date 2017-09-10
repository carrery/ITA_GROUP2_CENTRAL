package com.oocl.kb.svc.inf;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import com.oocl.kb.model.Shipment;
import com.oocl.kb.response.ServiceResponse;
import org.json.JSONObject;


public interface ShipmentSVC {
	public Long createShipment(String json);
	
	public ServiceResponse getCreateShipmentResponse(String json);
	
	public void createShipmentContainer(JSONObject jsonShpCntr);
	
	public int removeShpContainersCargoes(String shpNum);
	
	public void createShipmentCargo(JSONObject jsonShpCgo);

	public List<Shipment> getAllShipments(String username, String json);

	public ServiceResponse updateShipment(String shpNum, String fromCity);
}
