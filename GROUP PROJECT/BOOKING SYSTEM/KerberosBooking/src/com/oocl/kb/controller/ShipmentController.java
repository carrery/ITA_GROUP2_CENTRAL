package com.oocl.kb.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.oocl.kb.response.UserLoginResponse;
import com.oocl.kb.svc.inf.ShipmentSVC;
import com.oocl.kb.svc.inf.UserSVC;

@RestController
public class ShipmentController {
	@Autowired(required = true)
	private ShipmentSVC shpSVC;

//	@RequestMapping(value = "/createBooking", method = RequestMethod.POST)
//	public @ResponseBody UserLoginResponse loginUser(@RequestParam("fromCity") String fromCity, @RequestParam("password") String password ,
//			HttpServletRequest request) {		
//		return shpSVC.createShipment(fromCity, tocity, fromDate, toDate, shipper, consignee, approveDoc, validWeight, goodCustomer, shipmentStatus)
//	}
}
