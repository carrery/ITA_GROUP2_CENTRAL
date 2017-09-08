package com.oocl.kb.dao.impl;

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
	public void createBooking() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tx = null;

		tx = session.beginTransaction();
		Shipment newShp = new Shipment("MNL", null, null, null, null, null, 0, 0, 0, null);
		session.save(newShp);
		tx.commit();

		session.close();
		System.out.println("Booking Created");

	}
	
}
