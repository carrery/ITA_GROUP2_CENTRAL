package com.oocl.kb.controller;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.oocl.kb.model.Shipment;
import com.oocl.kb.response.ServiceResponse;
import com.oocl.kb.svc.inf.ShipmentSVC;

@RestController
public class ShipmentController {

	@Autowired(required = true)
	private ShipmentSVC shpSVC;

	@RequestMapping(value = "/createBooking", method = RequestMethod.POST)
	public @ResponseBody ServiceResponse createShp(@RequestParam("jsonString") String json, HttpServletRequest request) {
		return shpSVC.getCreateShipmentResponse(json);
	}

	@RequestMapping(value = "/getAllShipments", method = RequestMethod.POST)
	public @ResponseBody List<Shipment> getAllShipments(@RequestParam("username") String username, 
			@RequestParam("jsonString") String json, HttpServletRequest request) {
		return shpSVC.getAllShipments(username, json);
	}
	
	@RequestMapping(value = "/updateShipment", method = RequestMethod.POST)
	public @ResponseBody ServiceResponse updateShipment(@RequestParam("jsonString") String json,  HttpServletRequest request) {
		return shpSVC.updateShipment(json);
	}
	
}
