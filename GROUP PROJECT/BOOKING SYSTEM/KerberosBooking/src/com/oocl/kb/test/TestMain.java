package com.oocl.kb.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.gson.Gson;
import com.oocl.kb.dao.impl.ShipmentDAOImpl;
import com.oocl.kb.dao.impl.UserDAOImpl;
import com.oocl.kb.model.Role;
import com.oocl.kb.model.Shipment;
import com.oocl.kb.model.User;
import com.oocl.kb.svc.impl.ShipmentSVCImpl;
import com.oocl.kb.svc.inf.ShipmentSVC;

public class TestMain {

	static ApplicationContext ctx = new ClassPathXmlApplicationContext("test-servlet-context.xml");

	public static void main(String[] args) {
		// TODO this is to test java side logic without UI
		// added local copy of servlet-context.xml and ojdb6 jar in build

		// create separate test units here and comment unused tests

		// test_validateUser();
		// test_getUserRole();
		 test_getAllUsersByUsername();
//		test_createShipment();
//		test_updateShp();

	}

	static void test_validateUser() {
		UserDAOImpl userDAO = (UserDAOImpl) ctx.getBean("userDAO");
		User user = userDAO.getUserDetails("jag123", "admin");
		System.out.println(userDAO.validateUser("jag123", "admin"));
	}

	static void test_getUserRole() {
		UserDAOImpl userDAO = (UserDAOImpl) ctx.getBean("userDAO");
		User user = userDAO.getUserDetails("jag123", "admin");
		Role role = userDAO.getUserRole(user.getRole());
		System.out.println(role.getRole());
	}

	static void test_getAllUsersByUsername() {
		 UserDAOImpl userDAO = (UserDAOImpl) ctx.getBean("userDAO");
		 List<User> testList = userDAO.getAllUsers("","","","");
		 for(User us : testList ) {
		 System.out.println(us.getFirstName() + " " + us.getLastName());
		 }
	}

	static void test_createShipment() {
		ShipmentDAOImpl shpDAO = (ShipmentDAOImpl) ctx.getBean("shpDAO");
		// System.out.println(shpDAO.createBooking("MNL", "SIN", null, null, "Jag",
		// "Caloi", 0, 0, 0, "Pending"));
	}

	static void test_updateShp() {
		ShipmentSVC svc = new ShipmentSVCImpl();
		Gson gson = new Gson();
		ShipmentDAOImpl shpDAO = (ShipmentDAOImpl) ctx.getBean("shpDAO");
		
		String json = "{\"shipmentNum\":\"4000000210\",\"bookingOffice\":\"HKG\",\"shipper\":\"dfsdfd\",\"consignee\":\"fdsfdsf\",\"fromCity\":\"HKG\",\"cargoNature\":\"GP\",\"cargoDesc\":\"sdfdsfdsf\",\"toCity\":\"ZHA\",\"conQuatity\":\"2\",\"conHS\":\"HKG\",\"validWeight\":\"0\",\"validDocument\":\"1\",\"goodCustomer\":\"0\"}";
		
		Shipment shp = gson.fromJson(json, Shipment.class);
		 
//		svc.updateShipment(json, "4000000210");
		System.out.println(shpDAO.updateShipment(shp));
		
		
		
	}

}
