package com.oocl.kb.dao.impl;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.oocl.kb.dao.inf.ShipmentDAO;
import com.oocl.kb.model.Shipment;

public class ShipmentDAOImpl implements ShipmentDAO {

	@Autowired
	SessionFactory sessionFactory;
	Session session;
	Transaction tx;

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Long createBooking(String fromCity, String toCity, Date fromDate, Date toDate, String shipper,
			String consignee, int approveDoc, int validWt, int goodCustomer, String shipmentStatus) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tx = null;

		tx = session.beginTransaction();
		Shipment newShp = new Shipment(fromCity, toCity, null, null, shipper, consignee, 0, 0, 0, shipmentStatus);
		Long shpNum = (Long) session.save(newShp);
		tx.commit();

		session.close();
		System.out.println("Booking Created");
		return shpNum;

	}
	
}
