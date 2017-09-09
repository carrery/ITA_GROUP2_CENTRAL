package com.oocl.kb.controller;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.oocl.kb.response.CreateShipmentResponse;
import com.oocl.kb.response.UserLoginResponse;
import com.oocl.kb.svc.inf.ShipmentSVC;
import com.oocl.kb.svc.inf.UserSVC;

@RestController
public class ShipmentController {
	@Autowired(required = true)
	private ShipmentSVC shpSVC;

	@RequestMapping(value = "/createBooking", method = RequestMethod.POST)
	public @ResponseBody CreateShipmentResponse createShp(@RequestParam("fromCity") String fromCity, @RequestParam("toCity") String toCity ,
			@RequestParam("fromDate") Date fromDate, @RequestParam("toDate") Date toDate, @RequestParam("shipper") String shipper,
			@RequestParam("consignee") String consignee, @RequestParam("approveDoc") int approveDoc, @RequestParam("validWeight") int validWeight,
			@RequestParam("goodCustomer") int goodCustomer, @RequestParam("shipmentStatus") String shipmentStatus, HttpServletRequest request) {
		
		return null;
		//return shpSVC.createShipment(fromCity, toCity, fromDate, toDate, shipper, consignee, approveDoc, validWeight, goodCustomer, shipmentStatus)
	}
}
