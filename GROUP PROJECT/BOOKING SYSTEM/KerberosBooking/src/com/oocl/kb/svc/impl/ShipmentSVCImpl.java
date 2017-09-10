package com.oocl.kb.svc.impl;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.oocl.kb.dao.inf.ShipmentDAO;
import com.oocl.kb.dao.inf.UserDAO;
import com.oocl.kb.model.Shipment;
import com.oocl.kb.model.ShipmentCargo;
import com.oocl.kb.model.ShipmentContainer;
import com.oocl.kb.response.ServiceResponse;
import com.oocl.kb.svc.inf.ShipmentSVC;
import com.oocl.kb.util.SearchShipmentCriteria;

public class ShipmentSVCImpl implements ShipmentSVC {

	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
	
	@Autowired
	private ShipmentDAO shipmentDAO;

	@Autowired 
	private UserDAO userDAO;
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	public void setShipmentDAO(ShipmentDAO shipmentDAO) {
		this.shipmentDAO = shipmentDAO;
	}

	@Override
	public Long createShipment(String json) {
		// TODO Auto-generated method stub
		Shipment shp = gson.fromJson(json, Shipment.class);
		return shipmentDAO.createBooking(shp);
	}

	@Override
	public ServiceResponse getCreateShipmentResponse(String json) {
		// TODO Auto-generated method stub
		ServiceResponse createShipmentResponse = new ServiceResponse();
		Shipment shp = gson.fromJson(json, Shipment.class);
		String shpStatus = shp.getApproveDoc() != 1 && shp.getGoodCustomer() != 1 
				&& shp.getValidWt() != 1 ? "Pending" :  "Confirmed";
		shp.setShipmentStatus(shpStatus);
		shp.setCreateDate(new Timestamp(System.currentTimeMillis()));
		shp.setUpdateDate(new Timestamp(System.currentTimeMillis()));
		shipmentDAO.createBooking(shp);
		createShipmentResponse.setServiceResult("1");
		
//		JsonObject jsonObj = gson.fromJson(json, JsonObject.class);
//		JsonArray array = jsonObj.get("container").getAsJsonArray();
//		
//		ArrayList<ShipmentContainer> cntrList = (ArrayList<ShipmentContainer>) gson.fromJson(array,
//                new TypeToken<ArrayList<ShipmentContainer>>() {
//                }.getType());
//		
//		shipmentDAO.createShpContainer(cntrList, shp.getFromDate());
		
		return createShipmentResponse;
	}

	@Override
	public int removeShpContainersCargoes(String shpNum) {
		// TODO Auto-generated method stub
		for (ShipmentContainer container : shipmentDAO.getAllContainersByShipment(shpNum)) {
			for (ShipmentCargo cargo : shipmentDAO.getAllCargoByContainer(container.getRefNum())) {
				shipmentDAO.deleteCargo(cargo);
			}
			shipmentDAO.deleteContainer(container);
		}
		return 0;
	}

	@Override
	public void createShipmentContainer(JSONObject jsonShpCntr) {
		ArrayList<ShipmentContainer> cntrList = new ArrayList<ShipmentContainer>();
		JSONArray array = jsonShpCntr.getJSONArray("shp_container");
		for (int i = 0; i < array.length(); i++) {
			ShipmentContainer sc = new ShipmentContainer(null, array.getJSONObject(i).getString("cntr_num"), null, null,
					null, null);
			// sc.setRefNum(array.getJSONObject(i).getString("ref_num"));
			cntrList.add(sc);
		}
		//this.shipmentDAO.createShpContainer(cntrList);
	}

	@Override
	public List<Shipment> getAllShipments(String username, String json){
		SearchShipmentCriteria shpCriteria = new Gson().fromJson(json, SearchShipmentCriteria.class);
		return this.shipmentDAO.getAllShipments(username, this.userDAO.getUser(username).getRole(), shpCriteria);
	}

	@Override
	public ServiceResponse updateShipment(String json, String shpNum) {
		// TODO Auto-generated method stub
		ServiceResponse response = new ServiceResponse();
		Shipment shp = gson.fromJson(json, Shipment.class);
		this.shipmentDAO.updateShipment(shp);
		removeShpContainersCargoes(shpNum);
//		shipmentDAO.createBooking(shp);
//		Shipment newShp = new Shipment(fromCity, toCity, fromDate, toDate, shipper, consignee, approveDoc, validWeight, goodCustomer, shipmentStatus);
//		response.setServiceResult("Update Shipment Details: " + this.shipmentDAO.updateShipment(newShp, shpNum));
//		removeShpContainersCargoes(shpNum);
		//create containers and cargoes again

		return response;
	}

	@Override
	public void createShipmentCargo(JSONObject jsonShpCgo) {
		// TODO Auto-generated method stub
		ArrayList<ShipmentCargo> cgoList = new ArrayList<ShipmentCargo>();
		JSONArray array = jsonShpCgo.getJSONArray("shp_cargo");
		for (int i = 0; i < array.length(); i++) {
			// ShipmentCargo sc = new ShipmentCargo(null,
			// array.getJSONObject(i).getString("cntr_num"), null, null, null);
			// sc.setRefNum(array.getJSONObject(i).getString("ref_num"));
			// cgoList.add(sc);
		}
		this.shipmentDAO.createShpCargo(cgoList);

	}

}
