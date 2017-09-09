package com.oocl.kb.svc.impl;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.oocl.kb.dao.inf.ShipmentDAO;
import com.oocl.kb.dao.inf.UserDAO;
import com.oocl.kb.model.Shipment;
import com.oocl.kb.model.ShipmentCargo;
import com.oocl.kb.model.ShipmentContainer;
import com.oocl.kb.response.ServiceResponse;
import com.oocl.kb.svc.inf.ShipmentSVC;

public class ShipmentSVCImpl implements ShipmentSVC {
	
	@Autowired
	private ShipmentDAO shpDAO;
	
	
	
	public void setShpDAO(ShipmentDAO shpDAO) {
		this.shpDAO = shpDAO;
	}

	@Override
	public Long createShipment(String fromCity, String toCity, Date fromDate, Date toDate, String shipper,
			String consignee, int approveDoc, int validWeight, int goodCustomer, String shipmentStatus) {
		// TODO Auto-generated method stub
		return shpDAO.createBooking(fromCity, toCity, fromDate, toDate, shipper, consignee, approveDoc, validWeight, goodCustomer, shipmentStatus);
	}

	@Override
	public ServiceResponse getCreateShipmentResponse(String fromCity, String toCity, Date fromDate, Date toDate, String shipper,
			String consignee, int approveDoc, int validWeight, int goodCustomer, String shipmentStatus) {
		// TODO Auto-generated method stub
		ServiceResponse createShipmentResponse = new ServiceResponse();
		if (fromCity.isEmpty() || toCity.isEmpty()) {
			createShipmentResponse.setErrorMessage("Required fields must be filled");
		} else {
			shpDAO.createBooking(fromCity, toCity, fromDate, toDate, shipper, consignee, approveDoc, validWeight, goodCustomer, shipmentStatus);
		}
		
		return createShipmentResponse;
	}

	@Override
	public void createShipmentContainer(JSONObject jsonShpCntr) {
		// TODO Auto-generated method stub
		ArrayList<ShipmentContainer> cntrList = new ArrayList<ShipmentContainer>();
		JSONArray array = jsonShpCntr.getJSONArray("shp_container");
		for(int i = 0 ; i < array.length() ; i++){
			ShipmentContainer sc = new ShipmentContainer(null, array.getJSONObject(i).getString("cntr_num"), null, null, null);
			//sc.setRefNum(array.getJSONObject(i).getString("ref_num"));
			cntrList.add(sc);
		}
		this.shpDAO.createShpContainer(cntrList);
	}
	
	@Override
	public List<Shipment> getAllShipments(){
		return this.shpDAO.getAllShipments();
	}

	@Override
	public void createShipmentCargo(JSONObject jsonShpCgo) {
		// TODO Auto-generated method stub
		ArrayList<ShipmentCargo> cgoList = new ArrayList<ShipmentCargo>();
		JSONArray array = jsonShpCgo.getJSONArray("shp_cargo");
		for(int i = 0 ; i < array.length() ; i++){
			//ShipmentCargo sc = new ShipmentCargo(null, array.getJSONObject(i).getString("cntr_num"), null, null, null);
			//sc.setRefNum(array.getJSONObject(i).getString("ref_num"));
			//cgoList.add(sc);
		}
		this.shpDAO.createShpCargo(cgoList);
		
	}
	
	

}
